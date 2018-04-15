/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.sql.SQLException;
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
    
}
