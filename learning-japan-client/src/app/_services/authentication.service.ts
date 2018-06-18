import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { JwtHelperService } from '@auth0/angular-jwt';

import {TOKEN_AUTH_PASSWORD, TOKEN_AUTH_USERNAME, TOKEN_NAME} from '../_services/auth.constant';

@Injectable()
export class AuthenticationService {
    
    static AUTH_TOKEN = '/oauth/token';
    
    constructor(private http: HttpClient) { }

    login(username: string, password: string) {
        
        const body = `username=${encodeURIComponent(username)}&password=${encodeURIComponent(password)}&grant_type=password`;

        const headers = new HttpHeaders();
        headers.append('Content-Type', 'application/x-www-form-urlencoded');
        headers.append('Authorization', 'Basic ' + btoa(TOKEN_AUTH_USERNAME + ':' + TOKEN_AUTH_PASSWORD));
        console.log(btoa(TOKEN_AUTH_USERNAME + ':' + TOKEN_AUTH_PASSWORD));

        return this.http.post(AuthenticationService.AUTH_TOKEN, body, {headers})
          .pipe(map((res:any) => {
            // login successful if there's a jwt token in the response
            if (res && res.access_token) {
                // store username and jwt token in local storage to keep user logged in between page refreshes
                return res.access_token;
            }
            return null;
        }));
      
    }

}