/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Client;
import fr.adaming.awal.entity.Device;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IDeviceDao extends IDao<Device, Integer> {

    List<Device> getDevicesByClient(final Client client);
}
