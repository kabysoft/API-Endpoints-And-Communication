package com.co.airline.ticket.airlineticket.service;

import java.util.List;

import com.co.airline.ticket.airlineticket.dto.FlightDTO;
import com.co.airline.ticket.airlineticket.exception.DuplicateRecordException;

public interface FlightServiceInt {

	public long add(FlightDTO dto) throws DuplicateRecordException;

	public void delete(FlightDTO dto);

	public FlightDTO findBypk(long pk);

	public FlightDTO findByName(String name);

	public void update(FlightDTO dto) throws DuplicateRecordException;

	public List<FlightDTO> list();

	public List<FlightDTO> list(int pageNo, int pageSize);

	public List<FlightDTO> search(FlightDTO dto);

	public List<FlightDTO> search(FlightDTO dto, int pageNo, int pageSize);
	
}
