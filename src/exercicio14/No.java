
package exercicio14;

public class No<T>{
    public T elemento;
    public No<T> proximo;
    

    
    public No(T elem){
        elemento = elem;
        proximo = null;
    }
}
