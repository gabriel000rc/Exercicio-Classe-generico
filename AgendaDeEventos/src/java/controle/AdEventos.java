package controle;
import java.io.Serializable;
import modelos.Evento;
import dao.Dao;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean (name="adEventos")
@ViewScoped
public class AdEventos implements Serializable {
    private Evento evento;
    private Dao<Evento> dao;
    
    public AdEventos(){
        evento = new Evento();
        dao = new Dao(Evento.class);
        
        /*        
        FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Evento Cadastrado", null));
        
        dao = new Dao(Evento.class);*/
    }
    public void inserirEvento(){
        dao.inserir(evento);
    }

    
    
    //////////////
    public Evento getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    /**
     * @return the dao
     */
    public Dao<Evento> getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(Dao<Evento> dao) {
        this.dao = dao;
    }
}
