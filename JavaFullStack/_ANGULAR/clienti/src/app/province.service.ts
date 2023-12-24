import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Provincia } from '../entities';

@Injectable({
  providedIn: 'root'
})
export class ProvinceService {

  constructor(private http: HttpClient) {}

  private url = 'http://localhost:8080/province';

  findAll(): Observable<Provincia[]> {
    return this.http.get<Provincia[]>(this.url);
  }
}
