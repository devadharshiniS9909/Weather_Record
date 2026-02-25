package com.example.securin.ServiceImplementation;
import com.example.securin.Entity.Weather;
import com.example.securin.Repository.WeatherRepository;
import com.example.securin.Service.WeatherService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

@Service
public class WeatherServiceImplementation implements WeatherService {

    @Autowired
    private WeatherRepository repository;

    @Override
    public void saveFromCSV(String path) {

        try (Reader reader = new FileReader(path);
             CSVParser csvParser = new CSVParser(reader,
                     CSVFormat.DEFAULT
                             .withFirstRecordAsHeader()
                             .withIgnoreHeaderCase()
                             .withTrim())) {

            for (CSVRecord record : csvParser) {

                Weather weather = new Weather();

                weather.setDatetimeUtc(record.get("datetime_utc"));
                weather.setConds(record.get("_conds"));

                weather.setDewptm(parseDouble(record.get("_dewptm")));
                weather.setFog(parseDouble(record.get("_fog")));
                weather.setHail(parseDouble(record.get("_hail")));
                weather.setHeatindexm(parseDouble(record.get("_heatindexm")));
                weather.setHum(parseDouble(record.get("_hum")));
                weather.setPrecipm(parseDouble(record.get("_precipm")));
                weather.setPressurem(parseDouble(record.get("_pressurem")));
                weather.setRain(parseDouble(record.get("_rain")));
                weather.setSnow(parseDouble(record.get("_snow")));
                weather.setTempm(parseDouble(record.get("_tempm")));
                weather.setThunder(parseDouble(record.get("_thunder")));
                weather.setTornado(parseDouble(record.get("_tornado")));
                weather.setVism(parseDouble(record.get("_vism")));
                weather.setWdird(parseDouble(record.get("_wdird")));
                weather.setWdire((record.get("_wdire")));
                weather.setWgustm(parseDouble(record.get("_wgustm")));
                weather.setWindchillm(parseDouble(record.get("_windchillm")));
                weather.setWspdm(parseDouble(record.get("_wspdm")));

                repository.save(weather);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private Double parseDouble(String value) {
        try {
            if (value == null 
                || value.trim().isEmpty() 
                || value.equalsIgnoreCase("NA") 
                || value.equalsIgnoreCase("N/A")) {
                return null;
            }
            return Double.parseDouble(value.trim());
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public Page<Weather> getPage(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    @Override
    public List<Weather> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Weather> filterByTempmGreaterThan(Double temp) {
        return repository.findByTempmGreaterThan(temp);
    }

    @Override
    public List<Weather> filterByHumLessThan(Double humidity) {
        return repository.findByHumLessThan(humidity);
    }
	@Override
	public List<Weather> sortData(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Weather> filterAndSort(Double temp, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
}