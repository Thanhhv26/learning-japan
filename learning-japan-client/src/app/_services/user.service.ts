﻿import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { JwtHelperService } from '@auth0/angular-jwt';
import {TOKEN_NAME} from '../_services/auth.constant';

import { User } from '../_models';

@Injectable()
export class UserService {
    
    jwtHelper: JwtHelperService = new JwtHelperService();
    accessToken: string;
    isAdmin: boolean;
    
    constructor(private http: HttpClient) { }
    
    login(accessToken: string) {
        const decodedToken = this.jwtHelper.decodeToken(accessToken);
        console.log(decodedToken);

        this.isAdmin = decodedToken.authorities.some(el => el === 'ADMIN_USER');
        this.accessToken = accessToken;

        localStorage.setItem(TOKEN_NAME, accessToken);
    }
    
    logout() {
        this.accessToken = null;
        this.isAdmin = false;
        localStorage.removeItem(TOKEN_NAME);
    }
    
    isAdminUser(): boolean {
        return this.isAdmin;
    }

    isUser(): boolean {
        return this.accessToken && !this.isAdmin;
    }

    getAll() {
        return this.http.get<User[]>('/api/cities');
    }
    
}