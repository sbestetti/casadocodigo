package br.com.casadocodigo.loja.converter;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=Calendar.class)
public class CalendarConverter implements Converter {

	private DateTimeConverter converter = new DateTimeConverter();
	
	public CalendarConverter() {
		converter.setTimeZone(TimeZone.getTimeZone("Europe/Dublin"));
		converter.setPattern("dd/MM/yyyy");		
	}
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Date date = (Date) converter.getAsObject(context, component, value);
		Calendar dataFinal = Calendar.getInstance();
		dataFinal.setTime(date);
		return dataFinal;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Calendar calendar = (Calendar) value;
		return converter.getAsString(context, component, calendar.getTime());
	}

}
