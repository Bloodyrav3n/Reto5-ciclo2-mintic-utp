package retos.Vista;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import retos.Modelo.Vo.Consulta1Vo;
public class Interfaz1 extends JFrame {
    JPanel panelg;
    JTable tabla;
    JScrollPane scPane101;
    DefaultTableModel modelo;
    public Interfaz1(){
        setTitle("Consulta");
        setSize(500,500);
        setResizable(false);
        panelg= new JPanel();
        panelg.setBackground(new ColorUIResource(20, 31, 69));
        String[] columnas={"ID","Nombre","Apellido","Ciudad_Residencia"};
        ArrayList<String[]>d=Consulta1Vo.valores();
        String[][] datos= new String[d.size()][4];
        for (int index = 0; index <d.size(); index++) {
            int j=0;
            for (String s : d.get(index)) {
                datos[index][j]=s;
                j++;
            }   
            }
        //String[][] datos={{"","","",""},{"","","",""}};
        modelo=new DefaultTableModel(datos,columnas);
        tabla=new JTable(modelo);
        scPane101=new JScrollPane(tabla);
        scPane101.setBounds(20,20,440,420);
        add(scPane101);
        add(panelg);
        setVisible(true);
    }
}
    

