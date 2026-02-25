package com.example.securin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "weather_data")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String datetimeUtc;
    private String conds;

    private Double dewptm;
    private Double fog;
    private Double hail;
    private Double heatindexm;
    private Double hum;
    private Double precipm;
    private Double pressurem;
    private Double rain;
    private Double snow;
    private Double tempm;
    private Double thunder;
    private Double tornado;
    private Double vism;
    private Double wdird;
    private String wdire;
    private Double wgustm;
    private Double windchillm;
    private Double wspdm;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDatetimeUtc() {
		return datetimeUtc;
	}
	public void setDatetimeUtc(String datetimeUtc) {
		this.datetimeUtc = datetimeUtc;
	}
	public String getConds() {
		return conds;
	}
	public void setConds(String conds) {
		this.conds = conds;
	}
	public Double getDewptm() {
		return dewptm;
	}
	public void setDewptm(Double dewptm) {
		this.dewptm = dewptm;
	}
	public Double getFog() {
		return fog;
	}
	public void setFog(Double fog) {
		this.fog = fog;
	}
	public Double getHail() {
		return hail;
	}
	public void setHail(Double hail) {
		this.hail = hail;
	}
	public Double getHeatindexm() {
		return heatindexm;
	}
	public void setHeatindexm(Double heatindexm) {
		this.heatindexm = heatindexm;
	}
	public Double getHum() {
		return hum;
	}
	public void setHum(Double hum) {
		this.hum = hum;
	}
	public Double getPrecipm() {
		return precipm;
	}
	public void setPrecipm(Double precipm) {
		this.precipm = precipm;
	}
	public Double getPressurem() {
		return pressurem;
	}
	public void setPressurem(Double pressurem) {
		this.pressurem = pressurem;
	}
	public Double getRain() {
		return rain;
	}
	public void setRain(Double rain) {
		this.rain = rain;
	}
	public Double getSnow() {
		return snow;
	}
	public void setSnow(Double snow) {
		this.snow = snow;
	}
	public Double getTempm() {
		return tempm;
	}
	public void setTempm(Double tempm) {
		this.tempm = tempm;
	}
	public Double getThunder() {
		return thunder;
	}
	public void setThunder(Double thunder) {
		this.thunder = thunder;
	}
	public Double getTornado() {
		return tornado;
	}
	public void setTornado(Double tornado) {
		this.tornado = tornado;
	}
	public Double getVism() {
		return vism;
	}
	public void setVism(Double vism) {
		this.vism = vism;
	}
	public Double getWdird() {
		return wdird;
	}
	public void setWdird(Double wdird) {
		this.wdird = wdird;
	}
	public String getWdire() {
		return wdire;
	}
	public void setWdire(String wdire) {
		this.wdire = wdire;
	}
	public Double getWgustm() {
		return wgustm;
	}
	public void setWgustm(Double wgustm) {
		this.wgustm = wgustm;
	}
	public Double getWindchillm() {
		return windchillm;
	}
	public void setWindchillm(Double windchillm) {
		this.windchillm = windchillm;
	}
	public Double getWspdm() {
		return wspdm;
	}
	public void setWspdm(Double wspdm) {
		this.wspdm = wspdm;
	}
}