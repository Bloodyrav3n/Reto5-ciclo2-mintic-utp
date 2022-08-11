package retos.Modelo.Vo;
import java.sql.*;
import java.util.ArrayList;
import retos.Modelo.Dao.*;
public class Consulta1Vo {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]>salida_Vo=new ArrayList<String[]>();
        try {
            ResultSet rs=Consulta1Dao.consulta();
            while (rs.next()) {
                int ID=rs.getInt("ID_Lider");
                String nombre=rs.getString("Nombre");
                String apellido=rs.getString("Primer_Apellido");
                String ciudad=rs.getString("Ciudad_Residencia");
                //System.out.println(String.format("%5d %15s %15s %15s", ID, nombre, apellido, ciudad));
                salida_Vo.add(new String[]{ID+"",nombre,apellido,ciudad});

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida_Vo;
    }
    
}
