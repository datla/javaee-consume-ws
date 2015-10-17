package com.kthree.jax.ws.consumer;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;

import com.kthree.ws.jax.client.CurrencyConvertionPortType;
import com.kthree.ws.jax.client.CurrencyConvertion_Service;
import com.kthree.ws.jax.client.SayHello;

public class ConsumeService {

	public static void main(String[] args) throws DatatypeConfigurationException {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		// TODO Auto-generated method stub
		SayHello hello = new SayHello();
		hello.setSayHello("hello there");
		CurrencyConvertion_Service service = new CurrencyConvertion_Service();
		CurrencyConvertionPortType  portTType  = service.getCurrencyConvertionPort();
		System.out.println("Converted output:>"+portTType.currencyConvertion("GBP","EUR", (double) 100,DatatypeFactory.newInstance().newXMLGregorianCalendarDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED)));
		System.out.println(""+portTType.sayHello("hello there"));
	}	

}
