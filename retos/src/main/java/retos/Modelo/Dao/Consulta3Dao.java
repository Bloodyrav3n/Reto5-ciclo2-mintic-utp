package retos.Modelo.Dao;
import java.sql.*;
import retos.Utilidades.*;
public class Consulta3Dao {
    public static ResultSet consulta3() {
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        String csql="SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra join Proyecto using(ID_Proyecto) where Ciudad =='Salento' and Proveedor =='Homecenter';";
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