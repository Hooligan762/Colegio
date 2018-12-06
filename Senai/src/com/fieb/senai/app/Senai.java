/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieb.senai.app;

import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Pessoa;

/**
 *
 * @author Aluno
 */
public class Senai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa p1 =  new Pessoa("Maria", 5463246, 42);
        Endereco end1 = new Endereco("Rua A", "77", "Cajazeiras");
        
        Pessoa p2 = new Pessoa("José",  6464, 45);
        Endereco end2 = new Endereco("Rua B", "95", "Itaigara");
        
        p2.setEndereco(end2);
    }
    
}
