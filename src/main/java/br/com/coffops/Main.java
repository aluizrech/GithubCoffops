package br.com.coffops;

import javax.swing.*;
import javax.xml.datatype.DatatypeConfigurationException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws DatatypeConfigurationException {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz Antonio Rech");


        JOptionPane.showMessageDialog(null,
                pessoa.getNome() + " \n " + pessoa.getDataNacimento());


        System.out.println(DateUtils.getXMLGregorianCalendar(LocalDate.now()).toString());

        System.out.println(DateUtils.getXMLGregorianCalendar(LocalDateTime.now()).toString());

    }
}
