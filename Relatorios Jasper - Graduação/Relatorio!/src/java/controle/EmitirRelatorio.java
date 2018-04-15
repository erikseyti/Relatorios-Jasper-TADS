/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import util.ChamarRelatorio;

/**
 *
 * @author Alunos
 */
@ManagedBean
@SessionScoped
public class EmitirRelatorio {
    private Integer anoIngresso;
    
        
    
    public void emitirRelatorioPeriodo(){
        try {
            //Para chamar um relatorio sempre vamos utilizar
            //esta classe ChamarRelatorio
            ChamarRelatorio ch=new ChamarRelatorio();            
            
            HashMap map = new HashMap();
            //Primeiro é o nome do parâmetro que foi utilizado Jasper
            map.put("ANO_INGRESSO",anoIngresso);
            ch.imprimeRelatorio("relatorioAlunoPeriodo.jasper", map, "relatorioAlunosPorPeriodo");
        } catch (IOException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        
        
    }
    public void emitirRelatorioTeste()
    {
    try {
            //Para chamar um relatorio sempre vamos utilizar
            //esta classe ChamarRelatorio
            ChamarRelatorio ch=new ChamarRelatorio();            
            ch.imprimeRelatorio("teste.jasper", null, "relatorioTeste");
            
        } catch (IOException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
          ex.printStackTrace();
        } 
    
    }
    
    public void chamarRelatorio(){       
        try {
            //Para chamar um relatorio sempre vamos utilizar
            //esta classe ChamarRelatorio
            ChamarRelatorio ch=new ChamarRelatorio();            
            ch.imprimeRelatorio("alunoTodos.jasper", null, "relatorioAlunos");
            
        } catch (IOException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }   
        
        
    }

    public Integer getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(Integer anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
}
