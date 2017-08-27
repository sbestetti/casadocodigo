package br.com.casadocodigo.loja.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.casadocodigo.loja.models.Autor;

@FacesConverter("autorConverter")
public class AutorConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Autor autor = new Autor();
		autor.setId(Integer.valueOf(value));
		return autor;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Autor autor = (Autor) value;
		return autor.getId().toString();
	}

}
