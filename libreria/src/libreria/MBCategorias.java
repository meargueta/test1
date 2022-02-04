package libreria;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.libreria.model.Categoria;
import com.libreria.services.CategoriaSvrImp;
@ManagedBean(name="mBcat")
@ViewScoped
public class MBCategorias implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Categoria> catlist=null;
    List<Categoria> catlisf=null;
    Categoria catsel=null;
    CategoriaSvrImp catsvr = new CategoriaSvrImp();
    private boolean activov=true;
    @PostConstruct
	public void init(){
		listar();
	}
    public void onCreate(){
    	catsel = new Categoria();
    	
    }
    public void onEdit(){
    	if (catsel.getActivo().equals("Si")){
    		activov=true;
    	}else{
    		activov=false;
    	}
    	System.out.println("Activo "+activov+" bd "+catsel.getActivo());
    }
    public void guardar(){
    	catsvr.guardar(catsel);
    }
    public void actualizar(){
    	catsvr.actualizar(catsel);
    }
    
	private void listar(){
		catlist = catsvr.findAll();
	}
	public List<Categoria> getCatlist() {
		return catlist;
	}
	public void setCatlist(List<Categoria> catlist) {
		this.catlist = catlist;
	}
	public List<Categoria> getCatlisf() {
		return catlisf;
	}
	public void setCatlisf(List<Categoria> catlisf) {
		this.catlisf = catlisf;
	}
	public Categoria getCatsel() {
		return catsel;
	}
	public void setCatsel(Categoria catsel) {
		this.catsel = catsel;
	}
	public boolean isActivov() {
		return activov;
	}
	public void setActivov(boolean activov) {
		this.activov = activov;
	}
	
	
}
