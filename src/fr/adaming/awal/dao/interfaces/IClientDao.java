/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.Client;

/**
 *
 * @author INTI0217
 */
public interface IClientDao extends IDao<Client, Integer> {

    Client getClientByMail(final String mail);
}
