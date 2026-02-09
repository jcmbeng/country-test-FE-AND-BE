package com.mahindra.test.mapper;


import com.mahindra.test.dto.CountryRequestDto;
import com.mahindra.test.dto.CountryResponseDto;
import com.mahindra.test.entity.Country;
import lombok.Builder;


@Builder
public class CountryMapper {

    private CountryMapper(){}

    public static Country map(CountryRequestDto dto){
        if(dto != null){
            return Country.builder()
                    .name(dto.getName())
                    .isoCode(dto.getIsoCode())
                    .build();
        }

        // TODO implement a csutom deicated exception
        throw new RuntimeException("Country Request should not be null");
    }

    public static CountryResponseDto map(Country entity){
        if(entity != null){
            return CountryResponseDto.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .isoCode(entity.getIsoCode())
                    .build();
        }

        // TODO implement a csutom deicated exception
        throw new RuntimeException("Country Entity should not be null");
    }

}
