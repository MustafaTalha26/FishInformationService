package com.mtmert.item_service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FishAndSeaRepository extends JpaRepository<FishAndSeaEntity, Long> {
    @Query(value = "SELECT * FROM denizbalik WHERE denizbalik.specie_name = ?1", nativeQuery = true)
    List<FishAndSeaEntity> findBySpecieName(String specieName);

    @Query(value = "SELECT * FROM denizbalik WHERE denizbalik.season = 'Winter'", nativeQuery = true)
    List<FishAndSeaEntity> findBySeason(String season);

    @Query(value = "SELECT * FROM denizbalik WHERE denizbalik.region= ?1", nativeQuery = true)
    List<FishAndSeaEntity> findByRegion(String region);
}
