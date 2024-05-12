package com.skybory.seoulArt.domain.seat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skybory.seoulArt.domain.seat.entity.Seat;
import com.skybory.seoulArt.domain.user.entity.User;


public interface SeatRepository extends JpaRepository<Seat, Long>{

}
