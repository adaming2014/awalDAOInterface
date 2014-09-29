/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Repairer;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IRepairerDao {
    List<Repairer> getAll();
    
    boolean create(Repairer address);
    
    boolean update(Repairer address);
    
    boolean delete(Repairer address);
    
    boolean delete(int id);
    
    Repairer getById(int id);    
}
