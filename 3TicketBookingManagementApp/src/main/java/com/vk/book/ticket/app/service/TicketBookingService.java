package com.vk.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.book.ticket.app.dao.TicketBookingDao;
import com.vk.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId).get();
	}
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDb = ticketBookingDao.findById(ticketId).get();
		ticketFromDb.setEmail(newEmail);
		Ticket upadedTicket = ticketBookingDao.save(ticketFromDb);
		return upadedTicket;
	}
}
