package com.mahindra.test.web.controller;

import com.mahindra.test.dto.CityResponseDto;
import com.mahindra.test.dto.CountryResponseDto;
import com.mahindra.test.service.CountryService;
import com.mahindra.test.web.api.CountryApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CountryController implements CountryApi {

    private final CountryService countryService;


    @Override
    public ResponseEntity<CountryResponseDto> findById(Long id) {
        return new ResponseEntity<>(countryService.findCountryById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<CountryResponseDto>> findAllCountries() {
        return new ResponseEntity<>(countryService.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<CityResponseDto>> findAllCities(Long id) {
        return new ResponseEntity<>(countryService.findAllCitiesByCountryId(id), HttpStatus.OK);
    }
}
