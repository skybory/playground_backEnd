package com.skybory.seoulArt.domain.ticket;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skybory.seoulArt.domain.ticket.entity.Ticket;


public interface TicketRepository extends JpaRepository<Ticket, Long>{

	
}
