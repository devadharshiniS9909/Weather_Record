package com.example.securin.Service;

import com.example.securin.Entity.Weather;
import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.data.domain.Page;   // ✅ CORRECT IMPORT

public interface WeatherService {

    void saveFromCSV(String filePath);

    List<Weather> getAll();

    List<Weather> filterByTempmGreaterThan(Double temp);

    List<Weather> filterByHumLessThan(Double humidity);

    Page<Weather> getPage(int page, int size);   // ✅ Correct Page
   

    List<Weather> sortData(Sort sort);
    List<Weather> filterAndSort(Double temp, Sort sort);
}