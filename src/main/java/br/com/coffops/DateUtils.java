package br.com.coffops;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class DateUtils {

    public static XMLGregorianCalendar getXMLGregorianCalendar(LocalDate localDate) throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString());
    }

    public static XMLGregorianCalendar getXMLGregorianCalendar(LocalDateTime localDateTime) throws DatatypeConfigurationException {

        ZonedDateTime zoneDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());

        GregorianCalendar gregorianCalendar = GregorianCalendar.from(zoneDateTime);

        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);

    }


}
