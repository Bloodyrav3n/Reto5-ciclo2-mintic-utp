package retos.Modelo.Dao;
import java.sql.*;
import retos.Utilidades.*;
public class Consulta2Dao {
    public static ResultSet consulta2() {
        ResultSet rs=null;
        Statement stmt=null;
        Connection conn=null;
        String csql="SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad  FROM Proyecto WHERE Clasificacion == 'Casa Campestre' and Ciudad in ('Santa Marta', 'Cartagena', 'Barranquilla');";
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