package cl.patrones.taller.u2.tienda.menu;

import java.util.List;

public interface ItemMenu {

	public String getTexto();
	public String getSlug();
	public String getEnlace();
	public boolean tieneHijos();
	public List<? extends ItemMenu> getHijos();
	
}
