/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelos.Evento;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class EventosDaoTest {
    
    public EventosDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class EventosDao.
     */
    @Test
    public void testInserir() {
        System.out.println("asdasd");
        Dao<Evento> dao = new Dao(Evento.class);
        Evento eve = new Evento("5","8");
        dao.inserir(eve);
        //dao.excluir(3);
        
    }
    
}
