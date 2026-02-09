import { Routes } from '@angular/router';
import {CountryListComponent} from './country/country-list/country-list.component';
import {CountryDetailComponent} from './country/country-detail/country-detail.component';

export const routes: Routes = [
  // 1. Make the list show up on the very first page
  { path: '', component: CountryListComponent },

  // 2. Add this so that "/countries" also works
  { path: 'countries', component: CountryListComponent },

  // 3. The detail page
  { path: 'countries/:id', component: CountryDetailComponent },

  // 4. Wildcard: If the user types a wrong URL, send them home
  { path: '**', redirectTo: '' }
];
