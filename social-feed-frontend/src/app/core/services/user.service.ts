import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  private apiUrl = 'http://localhost:8080/api/users';

  constructor(private http: HttpClient) {}

  // Fetch user profile data
  getProfile(): Observable<any> {
    return this.http.get(`${this.apiUrl}/profile`);
  }

  // Fetch user details by ID
  getUserById(userId: number): Observable<any> {
    return this.http.get(`${this.apiUrl}/${userId}`);
  }

  // Update user profile
  updateProfile(userData: any): Observable<any> {
    return this.http.put(`${this.apiUrl}/profile`, userData);
  }
}
