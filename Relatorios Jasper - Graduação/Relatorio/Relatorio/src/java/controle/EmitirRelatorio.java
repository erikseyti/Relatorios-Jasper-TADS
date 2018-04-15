/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.sql.SQLException;
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

public void chamarRelatorio(){ 
    try {
    
    ChamarRelatorio ch = new ChamarRelatorio();
        ch.imprimeRelatorio("Meu_Relatorio.jasper", null, "alunos");
        
        
    } 
catch (IOException ex) {
        ex.printStackTrace();
    } 
    catch (SQLException ex) {
       ex.printStackTrace();
    }


}
    
    
    
}
