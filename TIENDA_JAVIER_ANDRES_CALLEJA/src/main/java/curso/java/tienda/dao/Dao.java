package curso.java.tienda.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

	T get(int id);
	
	List<T> getAll();
	
	void insert(T t);
	
	void update(T t);
	
	void delete(int id);
}
