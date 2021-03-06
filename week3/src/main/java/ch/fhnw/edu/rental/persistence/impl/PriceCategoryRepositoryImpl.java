package ch.fhnw.edu.rental.persistence.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import ch.fhnw.edu.rental.model.PriceCategory;
import ch.fhnw.edu.rental.model.PriceCategoryChildren;
import ch.fhnw.edu.rental.model.PriceCategoryNewRelease;
import ch.fhnw.edu.rental.model.PriceCategoryRegular;
import ch.fhnw.edu.rental.persistence.PriceCategoryRepository;

//@Component - we use JDBC beans
public class PriceCategoryRepositoryImpl implements PriceCategoryRepository {
	private Map<Long, PriceCategory> data = new HashMap<Long, PriceCategory>();
	private long nextId = 1;

	@SuppressWarnings("unused")
	private void initData () {
		data.clear();
		nextId = 1;
		save(new PriceCategoryRegular());
		save(new PriceCategoryChildren());
		save(new PriceCategoryNewRelease());
	}
	
	@Override
	public PriceCategory findOne(Long id) {
		if(id == null) throw new IllegalArgumentException();
		return data.get(id);
	}

	@Override
	public List<PriceCategory> findAll() {
		return new ArrayList<PriceCategory>(data.values());
	}

	@Override
	public PriceCategory save(PriceCategory category) {
		if (category.getId() == null)
			category.setId(nextId++);
		data.put(category.getId(), category);
		return category;
	}

	@Override
	public void delete(PriceCategory priceCategory) {
		if(priceCategory == null) throw new IllegalArgumentException();
		data.remove(priceCategory.getId());
		priceCategory.setId(null);
	}

	@Override
	public void delete(Long id) {
		if(id == null) throw new IllegalArgumentException();
		delete(findOne(id));
	}

	@Override
	public boolean exists(Long id) {
		if(id == null) throw new IllegalArgumentException();
		return data.get(id) != null;
	}

	@Override
	public long count() {
		return data.size();
	}

}
