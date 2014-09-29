/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Firm;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IFirmDao {
    
    List<Firm> getAll();

    boolean create(Firm address);

    boolean update(Firm address);

    boolean delete(Firm address);

    boolean delete(int id);

    Firm getById(int id);    
}
