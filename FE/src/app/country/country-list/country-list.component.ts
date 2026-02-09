import {Component, OnInit} from '@angular/core';
import {CountryService} from '../../services/country.service';
import {Country} from '../../models/country.model';
import {MatActionList, MatDivider, MatListItem, MatNavList} from '@angular/material/list';
import {MatIcon} from '@angular/material/icon';
import {MatCard, MatCardHeader, MatCardModule} from '@angular/material/card';
import {MatToolbar} from '@angular/material/toolbar';
import {RouterLink} from '@angular/router';
import {DecimalPipe, NgForOf, NgIf} from '@angular/common';
import {MatButton} from '@angular/material/button';
import {
  MatCell,
  MatCellDef,
  MatColumnDef,
  MatHeaderCell, MatHeaderCellDef,
  MatHeaderRow,
  MatHeaderRowDef,
  MatRow, MatRowDef, MatTable
} from '@angular/material/table';

@Component({
  selector: 'app-country-list',
  imports: [
    MatActionList,
    MatIcon,
    MatListItem,
    MatCard,
    MatToolbar,
    RouterLink,
    NgForOf,
    MatNavList,
    MatDivider,
    MatCardHeader,
    MatCardModule,
    DecimalPipe,
    MatButton,
    MatCell,
    MatCellDef,
    MatColumnDef,
    MatHeaderCell,
    MatHeaderRow,
    MatHeaderRowDef,
    MatRow,
    MatRowDef,
    MatTable,
    NgIf,
    MatHeaderCellDef
  ],
  templateUrl: './country-list.component.html',
  styleUrl: './country-list.component.css'
})
export class CountryListComponent implements OnInit {
  countries: Country[] = [];

  constructor(private readonly countryService: CountryService) {}

  ngOnInit() {
    this.countryService.getCountries().subscribe(data => {
      this.countries = data;
    });
  }
}
