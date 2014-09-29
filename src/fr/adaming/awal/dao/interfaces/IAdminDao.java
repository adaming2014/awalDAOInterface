/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Admin;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IAdminDao {
    List<Admin> getAll();
    
    boolean create(Admin address);
    
    boolean update(Admin address);
    
    boolean delete(Admin address);
    
    boolean delete(int id);
    
    Admin getById(int id);    
}
