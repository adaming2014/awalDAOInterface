/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Device;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IDeviceDao {
    List<Device> getAll();
    
    boolean create(Device address);
    
    boolean update(Device address);
    
    boolean delete(Device address);
    
    boolean delete(int id);
    
    Device getById(int id);       
}
