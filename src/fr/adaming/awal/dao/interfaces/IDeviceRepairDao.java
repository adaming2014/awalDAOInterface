/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Client;
import fr.adaming.awal.entity.Device;
import fr.adaming.awal.entity.Devicerepair;
import fr.adaming.awal.entity.Modelpackage;
import fr.adaming.awal.entity.Repairer;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IDeviceRepairDao extends IDao<Devicerepair, Integer> {

    public List<Devicerepair> getDevicesRepairByClient(final Client client);

    public List<Devicerepair> getDevicesRepairByRepairer(final Repairer repairer);

    public Devicerepair getByDeviceAndPackage(final Device device, final Modelpackage modelPackage);
}
