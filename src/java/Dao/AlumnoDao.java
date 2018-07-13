
package Dao;

import Model.AlumnoModel;
import java.sql.PreparedStatement;


public class AlumnoDao extends dao{

     public  void ingresar(AlumnoModel ml) throws Exception {
        try {
            this.Conectar();
            String sql = "INSERT INTO alumno (cod_alum,nom_alum,ape_alum,fch_nac_alum,correo_alum,telf1_alum)  VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, ml.getDni());
            ps.setString(2, ml.getNombre());
            ps.setString(3, ml.getApellido());
            ps.setString(4, ml.getNacAlum());
            ps.setString(5, ml.getEmail());
            ps.setString(6, ml.getTeléfono());
            
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        finally {
            this.Cerrar();
        }
     }
}
