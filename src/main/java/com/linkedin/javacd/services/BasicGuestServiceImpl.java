package com.linkedin.javacd.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkedin.javacd.entities.Guest;
import com.linkedin.javacd.repositories.GuestRepository;

@Service
public class BasicGuestServiceImpl implements GuestService {

	private GuestRepository repository;
	
	@Autowired
	public BasicGuestServiceImpl(GuestRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Guest create(Guest guest) {
		return this.repository.save(guest); 
	}

	@Override
	public Optional<Guest> findById(Long guestId) {
		return this.repository.findById(guestId); 
	}

	@Override
	public List<Guest> findByPartialFirstName(String firstName) {
		return this.repository.findByFirstNameLike(firstName); 
	}

	@Override
	public void delete(Long guestId) {
		this.repository.deleteById(guestId);
	}

	@Override
	public List<Guest> list() {
		return this.repository.findAll(); 
	}

	@Override
	public List<Guest> list(List<Long> ids) {
		return this.repository.findAllById(ids); 
	}
	
}
