/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fieb.senai.app;

import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Estado;
import com.fieb.senai.entidades.Pessoa;
import com.fieb.senai.entidades.Telefone;
import java.util.ArrayList;
import java.util.List;

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
        Telefone tel1 = new Telefone("54654");
        
        //Ceclarando a associação
        p1.setEndereco(end1);
       
       
        
        Pessoa p2 = new Pessoa("José",  6464, 45);
        Endereco end2 = new Endereco("Rua B", "95", "Itaigara");
        Telefone tel2 = new Telefone ("624564");
               
        //Ceclarando a associação
        p2.setEndereco(end2);
      
        
        
       Pessoa p3 = new Pessoa("Calos", 6254, 52);
       Endereco end3 = new Endereco("Rua C", "88", "Mussurunga");
       Telefone tel3 = new Telefone ("546.54");
     
       p3.setEndereco(end3);
       
       
       List<Telefone> listatelefone = new ArrayList<>();
       
        for(Telefone telefone : listatelefone) {
        System.out.println(" Telefone" + telefone.getNumero());
            
        }
        List<Estado> listaestado = new ArrayList<>();
        for (Estado estado : listaestado) {
            
            System.out.println(" Estado" + estado.getNome());
            
        }
            
        }
    }
   

