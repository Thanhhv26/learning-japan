import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import {UserService} from '../_services/user.service';

import { AuthenticationService } from '../_services';

@Component({templateUrl: 'login.component.html'})
export class LoginComponent implements OnInit {
    loginForm: FormGroup;
    loading = false;
    submitted = false;
    redirectUrl: string;
    error = '';

    constructor(
        private formBuilder: FormBuilder,
        private route: ActivatedRoute,
        private router: Router,
        private authenticationService: AuthenticationService,
        private userService: UserService) {
        
    }

    ngOnInit() {
        this.loginForm = this.formBuilder.group({
            username: ['', Validators.required],
            password: ['', Validators.required]
        });

        // reset login status
        this.userService.logout();

        // get return url from route parameters or default to '/'
        this.redirectUrl = this.route.snapshot.queryParams['redirectTo'] || '/';
    }

    // convenience getter for easy access to form fields
    get f() { return this.loginForm.controls; }

    onSubmit() {
        this.submitted = true;

        // stop here if form is invalid
        if (this.loginForm.invalid) {
            return;
        }

        this.loading = true;
        this.authenticationService.login(this.f.username.value, this.f.password.value)
        .subscribe(
            result => {
              this.loading = false;

              if (result) {
                this.userService.login(result);
                this.navigateAfterSuccess();
              } else {
                this.error = 'Username or password is incorrect 0';
              }
            },
            error => {
              this.error = 'Username or password is incorrect 1';
              this.loading = false;
            }
        );
    }
    
    private navigateAfterSuccess() {
        if (this.redirectUrl) {
          this.router.navigateByUrl(this.redirectUrl);
        } else {
          this.router.navigate(['/']);
        }
    }
    
}
