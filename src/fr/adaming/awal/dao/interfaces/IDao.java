/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import java.util.List;

/**
 *
 * @author INTI0217
 * @param <T>
 */
public interface IDao<T> {

    List<T> getAll();

    boolean create(T address);

    boolean update(T address);

    boolean delete(T address);

    boolean delete(int id);

    T getById(int id);
}
