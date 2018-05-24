/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio14;

/**
 *
 * @author gabriel
 */
public class Exercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<String> lista = new Lista();
        lista.inserir(new No("1"));
        lista.inserir(new No("2"));
        lista.inserir(new No("33"));
        lista.listar();
    }
    
}
