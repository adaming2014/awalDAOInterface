/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.User;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IUserDao {
    List<User> getAll();
    
    boolean create(User address);
    
    boolean update(User address);
    
    boolean delete(User address);
    
    boolean delete(int id);
    
    User getById(int id);       
}
