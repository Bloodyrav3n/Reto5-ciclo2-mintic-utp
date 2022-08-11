package retos.Modelo.Vo;
import java.sql.*;
import java.util.ArrayList;
import retos.Modelo.Dao.*;
public class Consulta2Vo {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]>salida_Vo=new ArrayList<String[]>();
        try {
            ResultSet rs=Consulta2Dao.consulta2();
            while (rs.next()) {
                //SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad  FROM Proyecto WHERE Clasificacion == 'Casa Campestre' and Ciudad in ('Santa Marta', 'Cartagena', 'Barranquilla');
                int ID=rs.getInt("ID_Proyecto");
                String constructora=rs.getString("Constructora");
                int habitaciones=rs.getInt("Numero_Habitaciones");
                String ciudad=rs.getString("Ciudad");
                //System.out.println(String.format("%5d %15s %15s %15s", ID, nombre, apellido, ciudad));
                salida_Vo.add(new String[]{ID+"",constructora,habitaciones+"",ciudad});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida_Vo;
    }
    
}
    

