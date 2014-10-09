/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Deviceinsurancemodel;
import fr.adaming.awal.entity.Modele;
import java.util.List;

/**
 *
 * @author INTI0227
 */
public interface IDeviceInsuranceModeleDao extends IDao<Deviceinsurancemodel, Integer> {

    List<Deviceinsurancemodel> getDeviceInsuranceModelsByModel(Modele modele);
}
