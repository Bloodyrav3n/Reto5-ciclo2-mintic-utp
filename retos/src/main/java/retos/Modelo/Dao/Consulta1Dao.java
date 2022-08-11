package retos.Modelo.Dao;
import java.sql.*;
import retos.Utilidades.*;
public class Consulta1Dao {
    public static ResultSet consulta() {
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        String csql="SELECT ID_Lider,Nombre,Primer_Apellido,Ciudad_Residencia from Lider order by Ciudad_Residencia;";
        try {
            conn=JDBCUtilities.conexion();
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);
        } catch (Exception e) {
            System.out.println();
        }
        return rs;
    }
}
