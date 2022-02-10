package libreria;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
@ManagedBean(name="mBIndex")
@ViewScoped
public class MBIndex {
  
	public void categoria() {
		
		try
        {
          FacesContext.getCurrentInstance().getExternalContext().redirect("categoria.xhtml");
        }
        catch (IOException e)
        {
          e.printStackTrace();
        } 
	}
public void autor() {
	try
    {
      FacesContext.getCurrentInstance().getExternalContext().redirect("autor.xhtml");
    }
    catch (IOException e)
    {
      e.printStackTrace();
    } 
	}

public void libros() {
	try
    {
      FacesContext.getCurrentInstance().getExternalContext().redirect("libros.xhtml");
    }
    catch (IOException e)
    {
      e.printStackTrace();
    } 
}
	
}
