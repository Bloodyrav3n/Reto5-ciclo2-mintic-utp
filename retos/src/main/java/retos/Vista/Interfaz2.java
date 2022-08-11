package retos.Vista;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import retos.Modelo.Vo.*;
public class Interfaz2 extends JFrame {
    JPanel panelg;
    JTable tabla;
    JScrollPane scPane101;
    DefaultTableModel modelo;
    public Interfaz2(){
        setTitle("Consulta 2");
        setSize(500,310);
        setResizable(false);
        panelg= new JPanel();
        panelg.setBackground(new ColorUIResource(20, 31, 69));
        String[] columnas={"ID_Proyecto","Constructora","Numero_Habitaciones","Ciudad"};
        ArrayList<String[]>d=Consulta2Vo.valores();
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
        scPane101.setBounds(20,20,440,230);
        add(scPane101);
        add(panelg);
        setVisible(true);
    }
}