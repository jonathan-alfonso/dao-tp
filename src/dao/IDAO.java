package dao;

/**
 * 
 * @author ajonathan
 * @param <T>
 */

import java.util.List;

public interface IDAO<T> {
	public void create(T obj) throws Exception;
	public void delete(T obj);
	public void delete();
	public void update(T obj);
	public T find (int id);
	public List<T> findAll();

}
