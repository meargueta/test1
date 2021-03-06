package libreria;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.libreria.model.Autor;
import com.libreria.services.AutorSvrImp;

@ManagedBean(name="mBAutor")
@ViewScoped
public class MBAutor {
private List<Autor> autlist;
private List<Autor> autlisf;
private Autor autorsel;
AutorSvrImp ausvr = new AutorSvrImp();

@PostConstruct
public void init(){
	listar();
}
private void listar(){
	autlist = ausvr.findAll();
}
public void onCreate(){
	autorsel = new Autor();
}

public void guardar(){
	 ausvr.guardar(autorsel);
	 listar();
}
public void actualizar(Autor o){
	ausvr.actualizar(autorsel);
	listar();
}
public void eliminar(){
	ausvr.eliminar(autorsel);
}
public List<Autor> getAutlist() {
	return autlist;
}
public void setAutlist(List<Autor> autlist) {
	this.autlist = autlist;
}
public Autor getAutorsel() {
	return autorsel;
}
public void setAutorsel(Autor autorsel) {
	this.autorsel = autorsel;
}
public List<Autor> getAutlisf() {
	return autlisf;
}
public void setAutlisf(List<Autor> autlisf) {
	this.autlisf = autlisf;
}
}
