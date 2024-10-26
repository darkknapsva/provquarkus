package org.acme.repositories;

import java.util.List;

public interface CrudImpl<T> {


    List<T> findAll();
    T save(T t);
    T findOne(long id);
    T update(long id, T t);
    void delete(long id);


}
