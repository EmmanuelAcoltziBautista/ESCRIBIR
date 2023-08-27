import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class INICIO extends JFrame implements ActionListener{
  private JLabel label1;
  private JButton BOTON1,BOTON2;
  public INICIO(){
   setLayout(null);
      setTitle("INCIO");
    ImageIcon IMAGEN=new ImageIcon("images/ico.png");
          label1=new JLabel(IMAGEN);
              label1.setBounds(0,0,500,300);
                add(label1);
        getContentPane().setBackground(new Color(0,0,255));             
               //BOTON1
                 
                BOTON1=new JButton("INSTALAR");
                      BOTON1.setBounds(50,400,180,50);
                        BOTON1.addActionListener(this);
                           add(BOTON1);

               //BOTON2
                 
                BOTON2=new JButton("NO INSTALAR");
                      BOTON2.setBounds(290,400,180,50);
                        BOTON2.addActionListener(this);
                           add(BOTON2);
         setIconImage(new ImageIcon(getClass().getResource("images/ico.png")).getImage());
  }
 public void actionPerformed(ActionEvent A){
  if(A.getSource()==BOTON1){

   LICENCIA2 Licencia1=new LICENCIA2();
    Licencia1.setBounds(0,0,600,600);
       Licencia1.setVisible(true);
        Licencia1.setResizable(false);
        Licencia1.setLocationRelativeTo(null); 
          this.setVisible(false);

       }
  if(A.getSource()==BOTON2){
        System.exit(0);
       }
     }
 public static void main(String args[]){
   INICIO Inicio1=new INICIO();
   Inicio1.setBounds(0,0,500,500);
    Inicio1.setVisible(true);
     Inicio1.setResizable(false);
       Inicio1.setLocationRelativeTo(null);
  }
}