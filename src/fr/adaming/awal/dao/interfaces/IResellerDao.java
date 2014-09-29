/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Reseller;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IResellerDao {
    List<Reseller> getAll();
    
    boolean create(Reseller address);
    
    boolean update(Reseller address);
    
    boolean delete(Reseller address);
    
    boolean delete(int id);
    
    Reseller getById(int id);        
}
