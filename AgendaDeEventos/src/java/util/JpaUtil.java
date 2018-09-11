/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




/**
 *
 * @author gabriel
 */
public class JpaUtil implements Serializable{
    private static final EntityManagerFactory factory;
    
    static {
        factory = Persistence.createEntityManagerFactory("AgendaDeEventos");
    }
    
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
    public static void close() {
        factory.close();
    }
}
