/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.dao.interfaces;
import fr.adaming.awal.entity.Modele;
import java.util.List;
/**
 *
 * @author INTI0217
 */
public interface IModelDao {

    List<Modele> getAll();

    boolean create(Modele address);

    boolean update(Modele address);

    boolean delete(Modele address);

    boolean delete(int id);

    Modele getById(int id);
}
