package com.linkedin.javacd.services;

import java.util.List;
import java.util.Optional;

import com.linkedin.javacd.entities.Guest;

public interface GuestService {

	public Guest create(Guest guest);
	
	public List<Guest> list();
	
	public List<Guest> list(List<Long> ids);

	public Optional<Guest> findById(Long guestId);
	
	public List<Guest> findByPartialFirstName(String firstName);
	
	public void delete(Long guestId);
	
}
