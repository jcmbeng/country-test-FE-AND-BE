package com.mahindra.test.web.api;


import com.mahindra.test.dto.CityResponseDto;
import com.mahindra.test.dto.CountryResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/countries")
public interface CountryApi  {
    @GetMapping("/{id}")
    ResponseEntity<CountryResponseDto> findById(@PathVariable(name = "id") Long id);

    @GetMapping
    ResponseEntity<List<CountryResponseDto>> findAllCountries();

    @GetMapping("/{id}/cities")
    ResponseEntity<List<CityResponseDto>> findAllCities(@PathVariable(name = "id") Long id);
}
