import {Component, OnInit} from '@angular/core';
import {CountryService} from '../../services/country.service';
import {ActivatedRoute, RouterLink, RouterModule} from '@angular/router';
import {Country} from '../../models/country.model';
import {MatCard, MatCardContent, MatCardHeader, MatCardModule} from '@angular/material/card';
import {
  MatCell, MatCellDef,
  MatColumnDef,
  MatHeaderCell,
  MatHeaderCellDef,
  MatHeaderRow, MatHeaderRowDef,
  MatRow, MatRowDef,
  MatTable
} from '@angular/material/table';
import {MatIcon} from '@angular/material/icon';
import {DecimalPipe, NgIf} from '@angular/common';
import {MatButton} from '@angular/material/button';
import {City} from '../../models/city.model';

@Component({
  selector: 'app-country-detail',
  imports: [
    MatCardModule,
    MatCardHeader,
    MatCardContent,
    MatTable,
    MatCard,
    MatIcon,
    DecimalPipe,
    MatButton,
    MatHeaderCell,
    MatCell,
    MatColumnDef,
    MatHeaderRow,
    MatRow,
    RouterLink,
    NgIf,
    RouterModule,
    MatHeaderRowDef,
    MatHeaderCellDef,
    MatCellDef,
    MatRowDef
  ],
  templateUrl: './country-detail.component.html',
  styleUrl: './country-detail.component.css'
})
export class CountryDetailComponent implements OnInit {
  country?: Country;
  cities?: City[];

  constructor(
    private readonly route: ActivatedRoute,
    private readonly countryService: CountryService
  ) {}

  ngOnInit() {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.countryService.getCitiesByCountryId(id).subscribe(data => this.cities = data);

    console.log(this.cities);
  }
}
