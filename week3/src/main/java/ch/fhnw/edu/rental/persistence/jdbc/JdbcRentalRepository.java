package ch.fhnw.edu.rental.persistence.jdbc;

import java.util.List;

import org.springframework.stereotype.Component;

import ch.fhnw.edu.rental.model.Rental;
import ch.fhnw.edu.rental.model.User;
import ch.fhnw.edu.rental.persistence.RentalRepository;

@Component
public class JdbcRentalRepository implements RentalRepository {

	@Override
	public Rental findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rental> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rental save(Rental t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Rental entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Rental> findByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}