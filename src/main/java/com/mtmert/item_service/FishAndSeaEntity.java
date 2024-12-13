package com.mtmert.item_service;

import jakarta.persistence.*;

@Entity
@Table(name = "denizbalik")
public class FishAndSeaEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "specie_name", nullable = false)
    private String specieName;

    @Column(name = "region", nullable = false)
    private String region;

    @Column(name = "fishing_method", nullable = false)
    private String fishingMethod;

    @Column(name = "fish_population", nullable = false)
    private Long fishPopulation; // Use Long instead of BigInteger for database compatibility

    @Column(name = "average_size")
    private Float averageSize;

    @Column(name = "overfishing_risk", nullable = false)
    private String overfishingRisk;

    @Column(name = "water_temperature")
    private Float waterTemperature;

    @Column(name = "water_pollution_level", nullable = false)
    private String waterPollutionLevel;

    @Column(name = "season", nullable = false)
    private String season;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecieName() {
		return specieName;
	}

	public void setSpecieName(String specieName) {
		this.specieName = specieName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getFishingMethod() {
		return fishingMethod;
	}

	public void setFishingMethod(String fishingMethod) {
		this.fishingMethod = fishingMethod;
	}

	public Long getFishPopulation() {
		return fishPopulation;
	}

	public void setFishPopulation(Long fishPopulation) {
		this.fishPopulation = fishPopulation;
	}

	public Float getAverageSize() {
		return averageSize;
	}

	public void setAverageSize(Float averageSize) {
		this.averageSize = averageSize;
	}

	public String getOverfishingRisk() {
		return overfishingRisk;
	}

	public void setOverfishingRisk(String overfishingRisk) {
		this.overfishingRisk = overfishingRisk;
	}

	public Float getWaterTemperature() {
		return waterTemperature;
	}

	public void setWaterTemperature(Float waterTemperature) {
		this.waterTemperature = waterTemperature;
	}

	public String getWaterPollutionLevel() {
		return waterPollutionLevel;
	}

	public void setWaterPollutionLevel(String waterPollutionLevel) {
		this.waterPollutionLevel = waterPollutionLevel;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public FishAndSeaEntity(Float averageSize, String fishingMethod, Long fishPopulation, Long id, String overfishingRisk, String region, String season, String specieName, String waterPollutionLevel, Float waterTemperature) {
		this.averageSize = averageSize;
		this.fishingMethod = fishingMethod;
		this.fishPopulation = fishPopulation;
		this.id = id;
		this.overfishingRisk = overfishingRisk;
		this.region = region;
		this.season = season;
		this.specieName = specieName;
		this.waterPollutionLevel = waterPollutionLevel;
		this.waterTemperature = waterTemperature;
	}

	public FishAndSeaEntity() {
		super();
	}
    
}
