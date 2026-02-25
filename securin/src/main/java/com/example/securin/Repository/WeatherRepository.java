package com.example.securin.Repository;

import com.example.securin.Entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface WeatherRepository extends JpaRepository<Weather, Long> {

    List<Weather> findByTempmGreaterThan(Double tempm);

    List<Weather> findByHumLessThan(Double hum);

    List<Weather> findByTempmGreaterThan(Double tempm, Sort sort);
}