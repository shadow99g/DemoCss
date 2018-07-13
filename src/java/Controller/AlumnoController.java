/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.AlumnoDao;
import Dao.dao;
import Model.AlumnoModel;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jordy
 */
@Named(value = "alumnoController")
@SessionScoped
public class AlumnoController implements Serializable {

    AlumnoModel ml;

    
    
    public  void insert() {
        AlumnoDao dd;
        try {
         dd = new AlumnoDao();
         dd.ingresar(ml);
            
        } catch (Exception ex) {
            Logger.getLogger(AlumnoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public AlumnoModel getMl() {
        return ml;
    }

    public void setMl(AlumnoModel ml) {
        this.ml = ml;
    }
}
