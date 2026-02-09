package com.mahindra.test.mapper;


import com.mahindra.test.dto.CityRequestDto;
import com.mahindra.test.dto.CityResponseDto;
import com.mahindra.test.entity.City;
import com.mahindra.test.entity.City;
import lombok.Builder;


@Builder
public class CityMapper {

    private CityMapper(){}

    public static City map(CityRequestDto dto){
        if(dto != null){
            return City.builder()
                    .name(dto.getName())
                    .population(dto.getPopulation())
                    .build();
        }

        // TODO implement a csutom deicated exception
        throw new RuntimeException("City Request should not be null");
    }

    public static CityResponseDto map(City entity){
        if(entity != null){
            return CityResponseDto.builder()
                    .country(CountryMapper.map(entity.getCountry()))
                    .id(entity.getId())
                    .name(entity.getName())
                    .population(entity.getPopulation())
                    .build();
        }

        // TODO implement a csutom deicated exception
        throw new RuntimeException("City Entity should not be null");
    }

}
