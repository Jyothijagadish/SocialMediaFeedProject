import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../../../core/auth/auth.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  userData = { name: '', email: '', password: '' };
  errorMessage = '';

  constructor(private authService: AuthService, private router: Router) {}

  signup() {
    this.authService.signup(this.userData).subscribe({
      next: () => {
        this.router.navigate(['/login']);
      },
      error: () => {
        this.errorMessage = 'Signup failed. Please try again.';
      }
    });
  }
}
