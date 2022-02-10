package libreria;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.libreria.model.Autor;
import com.libreria.model.Categoria;
import com.libreria.model.Libro;
import com.libreria.services.AutorSvrImp;
import com.libreria.services.CategoriaSvrImp;
import com.libreria.services.LibroSvrImp;
@ManagedBean(name="mBLibro")
@ViewScoped
public class MBLibros implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Libro> liblis;
	private List<Libro> liblif;
	private Libro librosel;
	LibroSvrImp libsvr = new LibroSvrImp();
	AutorSvrImp autsvr = new AutorSvrImp();
	private Map<String,Integer> catmap = null;
	CategoriaSvrImp catsvr = new CategoriaSvrImp();
	
	private Map<String,Integer> autmap = null;
	@PostConstruct
	public void init(){
		listar();
		lautor();
		lcat();
	}
	
	private void listar() {
		liblis=libsvr.findAll();
	}
	
	public void onCreate() {
		librosel = new Libro();
	}
	public void guardar() {
		libsvr.guardar(librosel);
	}
	public void actualizar() {
		libsvr.actualizar(librosel);
	}
	public void lautor() {
		autmap= new HashMap<String,Integer>();
	List<Autor> autl = autsvr.findAll();
	for(Autor aut : autl){
		autmap.put(aut.getNombre(),aut.getIdautor());
	}
	}
	public void lcat() {
		catmap= new HashMap<String,Integer>();
	List<Categoria> catl = catsvr.findAll();
	for(Categoria cat : catl){
		catmap.put(cat.getNombre(),cat.getIdcategoria());
	}
	}
	public List<Libro> getLiblis() {
		return liblis;
	}
	public void setLiblis(List<Libro> liblis) {
		this.liblis = liblis;
	}
	public List<Libro> getLiblif() {
		return liblif;
	}
	public void setLiblif(List<Libro> liblif) {
		this.liblif = liblif;
	}
	public Libro getLibrosel() {
		return librosel;
	}
	public void setLibrosel(Libro librosel) {
		this.librosel = librosel;
	}

	public Map<String, Integer> getCatmap() {
		return catmap;
	}

	public void setCatmap(Map<String, Integer> catmap) {
		this.catmap = catmap;
	}

	public Map<String, Integer> getAutmap() {
		return autmap;
	}

	public void setAutmap(Map<String, Integer> autmap) {
		this.autmap = autmap;
	}
	

}
