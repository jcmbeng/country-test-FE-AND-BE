import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Country} from '../models/country.model';
import {City} from '../models/city.model';

@Injectable({ providedIn: 'root' })
export class CountryService {
  private readonly apiUrl = 'http://localhost:8080/api/v1/countries';

  constructor(private readonly http: HttpClient) {}

  getCountries(): Observable<Country[]> {
    return this.http.get<Country[]>(this.apiUrl);
  }

  getCitiesByCountryId(id: number): Observable<City[]> {
    return this.http.get<City[]>(`${this.apiUrl}/${id}/cities`);
  }
}
