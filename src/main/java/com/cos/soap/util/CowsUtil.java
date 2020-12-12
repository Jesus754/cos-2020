package com.cos.soap.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class CowsUtil {
	
	public static XMLGregorianCalendar getXmlGregorianCalendarFromDate(final Date date) {
		try {
		if (date == null )
			return null;
			GregorianCalendar calendar = new GregorianCalendar();
		    calendar.setTime(date);
		    return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
		} catch (DatatypeConfigurationException e) {
			return null;
		}
	}
	
	public static Date getDateFromXmlGregorianCalendar(XMLGregorianCalendar calendar){
		try {
		 if (calendar == null )
			 return null;
		 GregorianCalendar cal = calendar.toGregorianCalendar();
		 return cal.getTime();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			return null;
			
		}
	}

}
