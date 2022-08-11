package retos.Vista;
import javax.swing.*;
import java.awt.event.*;

public class Interfazgene extends JFrame implements ActionListener{
    JPanel  panel101;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    public Interfazgene(){
        setTitle("interface general");
        setSize(400,100);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn1=new JButton("Consulta 1");
        btn1.setBounds(30, 10, 100, 40);
        btn1.addActionListener(this);
        add(btn1);

        btn2=new JButton("Consulta 2");
        btn2.setBounds(145, 10, 100, 40);
        btn2.addActionListener(this);
        add(btn2);

        btn3=new JButton("Consulta 3");
        btn3.setBounds(260, 10, 100, 40);
        btn3.addActionListener(this);
        add(btn3);

        panel101=new JPanel();
        add(panel101);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1){
            new Interfaz1();
        }
        else if(e.getSource()==btn2){
            new Interfaz2();
        }
        else if(e.getSource()==btn3){
            new Interfaz3();
        }
    } 
      
}
