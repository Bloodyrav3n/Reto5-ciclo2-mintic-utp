package retos.Modelo.Vo;
import java.sql.*;
import java.util.ArrayList;
import retos.Modelo.Dao.*;
public class Consulta3Vo {
    public static ArrayList<String[]> valores() {
        ArrayList<String[]>salida_Vo=new ArrayList<String[]>();
        try {
            ResultSet rs=Consulta3Dao.consulta3();
            //ID_Compra, Constructora, Banco_Vinculado
            while (rs.next()) {
                int ID=rs.getInt("ID_Compra");
                String constructora=rs.getString("Constructora");
                String bv=rs.getString("Banco_Vinculado");
                //System.out.println(String.format("%5d %15s %15s %15s", ID, nombre, apellido, ciudad));
                salida_Vo.add(new String[]{ID+"",constructora,bv});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return salida_Vo;
    }
    
}

