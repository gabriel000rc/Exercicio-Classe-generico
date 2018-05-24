
package exercicio14;

public class Lista<U> {
    public No<U> inicio;

    public Lista(){
        inicio = null;
    }
    
    public void listar(){
        
      No pos = inicio;
      while(pos != null){
          System.out.println(pos.elemento);
          pos = pos.proximo;
      }
    }
   
    public void inserir(No novo){
        novo.proximo = inicio;
        inicio = novo;
    }
}
