package libreria;

import java.util.List;

import javax.annotation.PostConstruct;

import com.libreria.model.Autor;
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

public void guardar(Autor o){
	 ausvr.guardar(o);
}
public void actualizar(Autor o){
	ausvr.actulizar(o);
}
public void eliminar(Autor o){
	ausvr.eliminar(o)
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
}