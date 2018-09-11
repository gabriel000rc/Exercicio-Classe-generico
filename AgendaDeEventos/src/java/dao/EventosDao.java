/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import util.JpaUtil;
import modelos.Evento;

/**
 *
 * @author gabriel
 */
public class EventosDao implements Serializable {
    public boolean inserir(Evento adm){
        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(adm);
        tx.commit();
        manager.close();
        return true;        
    }

}
