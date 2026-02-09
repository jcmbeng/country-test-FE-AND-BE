package com.mahindra.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CityResponseDto {

    private CountryResponseDto country;

    private Long id;
    private String name;
    private Long population;
}
