package com.example.tp4Spring.servicios;

import java.util.List;

public interface BaseServicio <E> {
    //a
    public List<E> findAll()throws Exception;
    //b
    public E findById(Long id)throws Exception;
    //c falto
    //d
    public E save(E entity)throws Exception;
    //e
    public E update(Long id, E entity)throws Exception;
    //f
    public boolean delete(Long id)throws Exception;


}
