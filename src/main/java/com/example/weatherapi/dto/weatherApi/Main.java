package com.example.weatherapi.dto.weatherApi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Main {
    private double temp;
    private int pressure;
    private int humidity;
}
