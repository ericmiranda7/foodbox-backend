package com.foodbox.foodbox.DAO;

import java.util.List;

public interface DAO<T> {
    public T getOneById(int id);
    public List<T> getAll();
}
