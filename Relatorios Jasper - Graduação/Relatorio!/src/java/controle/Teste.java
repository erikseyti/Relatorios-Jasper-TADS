/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import banco.DAOGenerico;
import modelo.EntidadeAluno;

/**
 *
 * @author Alunos
 */
public class Teste {
    
    public static void main(String[] args){
        DAOGenerico dao=new DAOGenerico();
        
       int x=0;
       while(x<20){
        EntidadeAluno al=new EntidadeAluno();
        al.setNome("Jose "+x);
        al.setAnoIngresso(2011);
        al.setCurso("TADS");
        dao.inserir(al);
        x++;
       }
    }
    
}
