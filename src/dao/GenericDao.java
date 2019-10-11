package dao;

public interface GenericDao<T> {
    public void create(T model);

    public void read(T model);

    public void update(T model);

    public void delete(T model);
}
