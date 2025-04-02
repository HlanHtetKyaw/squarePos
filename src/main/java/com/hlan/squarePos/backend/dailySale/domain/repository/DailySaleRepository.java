package com.hlan.squarePos.backend.dailySale.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hlan.squarePos.backend.dailySale.domain.model.DailySale;

public interface DailySaleRepository extends JpaRepository<DailySale,Long> {

}
