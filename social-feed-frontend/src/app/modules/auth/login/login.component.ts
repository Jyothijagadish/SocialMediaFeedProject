import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../../../core/auth/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  credentials = { email: '', password: '' };
  errorMessage = '';

  constructor(private authService: AuthService, private router: Router) {}

  login() {
    this.authService.login(this.credentials).subscribe({
      next: (response) => {
        localStorage.setItem('token', response.token);
        this.router.navigate(['/feed']);
      },
      error: () => {
        this.errorMessage = 'Invalid email or password';
      }
    });
  }
}
