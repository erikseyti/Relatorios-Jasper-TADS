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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DAOGenerico dao = new DAOGenerico();
        EntidadeAluno al = new  EntidadeAluno();
        
        
          
            al.setNome("Pedro");
            al.setCurso("Agronomia com PAtos");
            al.setAnoIngresso(2004);
            al.setSerie(5);
            dao.salvar(al);
            al = new EntidadeAluno();
            
            al.setAnoIngresso(2007);
        al.setCurso("Dança do Ventre eXtrema");
        al.setNome("José Rosa");
        al.setSerie(4);
        dao.salvar(al);
        
        al = new EntidadeAluno();
        
       al.setNome("João");
        al.setCurso("Engenharia de Pontes Suspensas em Marte");
        al.setAnoIngresso(3008);
        al.setSerie(8);
    }
    
}
