/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.interfaces.IEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author INTI0217
 * @param <T>
 * @param <I>
 */
public interface IDao<T extends IEntity<I>, I extends Serializable> {

    List<T> getAll();

    T getById(final I id);

    List<T> getByExample(final T example);

    T makePersistent(final T entity);

    void makeTransient(final T entity);
}
