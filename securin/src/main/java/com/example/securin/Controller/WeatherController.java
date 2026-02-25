package com.example.securin.Controller;

import com.example.securin.Entity.Weather;
import com.example.securin.Service.WeatherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService service;
    

    @PostMapping("/upload")
    public String uploadCSV(@RequestParam String path) {
        service.saveFromCSV(path);
        return "CSV Data Stored Successfully!";
    }

    @GetMapping("/page")
    public Page<Weather> getPage(
            @RequestParam int page,
            @RequestParam int size) {

        return service.getPage(page, size);   // ❌ REMOVE CAST
    }

    @GetMapping("/all")
    public List<Weather> getAll() {
        return service.getAll();
    }

    @GetMapping("/temperature")
    public List<Weather> filterTemp(@RequestParam Double value) {
        return service.filterByTempmGreaterThan(value);
    }

    @GetMapping("/sort")
    public List<Weather> sortData(
            @RequestParam String field,
            @RequestParam String direction) {

        Sort sort = direction.equalsIgnoreCase("desc") ?
                Sort.by(field).descending() :
                Sort.by(field).ascending();

        return service.sortData(sort);
    }
    @GetMapping("/filter-sort")
    public List<Weather> filterAndSort(
            @RequestParam Double temp,
            @RequestParam String field,
            @RequestParam String direction) {

        Sort sort = direction.equalsIgnoreCase("desc") ?
                Sort.by(field).descending() :
                Sort.by(field).ascending();

        return service.filterAndSort(temp, sort);
    }
    @GetMapping("/humidity")
    public List<Weather> filterHumidity(@RequestParam Double value) {
        return service.filterByHumLessThan(value);
    }
}