package ua.Lviv.iot.persistance.dao;

public interface IDao<T> {
    T findById(Integer id);

    T persist(T object);

    void deleteById(Integer id);

//    boolean updatePlane(Integer id, T object);

    T update(T object);
}
