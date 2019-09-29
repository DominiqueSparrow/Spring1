package app.dao;

import java.util.List;

public interface IDataAccessObject<T> {
	
	List<T> getAll();

}
