/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;

import fr.adaming.awal.entity.User;

/**
 *
 * @author INTI0217
 */
public interface IUserDao extends IDao<User, Integer> {

    User getByEmail(final String email);
}
