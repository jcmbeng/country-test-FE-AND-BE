package com.mahindra.test.service;

import com.mahindra.test.dto.CityResponseDto;
import com.mahindra.test.dto.CountryRequestDto;
import com.mahindra.test.dto.CountryResponseDto;
import com.mahindra.test.entity.City;
import com.mahindra.test.entity.Country;
import com.mahindra.test.mapper.CityMapper;
import com.mahindra.test.mapper.CountryMapper;
import com.mahindra.test.repository.CountryRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CountryService {


    private final CountryRepository countryRepository;

    public CountryResponseDto findCountryById(Long id) {
        if(id == null) {
            throw new RuntimeException("Country Entity should not be null");
        }

        return  CountryMapper.map(
                countryRepository.findById(id).orElseThrow(
                        () -> {
                            log.error("Country with id {} not found", id);
                            return new EntityNotFoundException("Task with id [ " + id + " ] not found");
                        }
                )
        );
    }

    public List<CountryResponseDto> findAll() {
        return countryRepository.findAll().stream().map(CountryMapper::map).toList();
    }

    public List<CityResponseDto> findAllCitiesByCountryId(Long country) {
        List<City> cities = new ArrayList<>();
        if(country != null) {
           Optional<Country> countryOptional =  countryRepository.findById(country);
           if(countryOptional.isPresent()) {
          cities = countryOptional.get().getCities();
           }

            return cities.stream().map(CityMapper::map).toList();
        }
        throw new EntityNotFoundException("Country not found");
    }

}
