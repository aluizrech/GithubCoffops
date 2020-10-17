package br.com.coffops;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz Antonio Rech");


        JOptionPane.showMessageDialog(null,
                pessoa.getNome() + " \n " + pessoa.getDataNacimento());

    }
}
