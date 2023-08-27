import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class LICENCIA2 extends JFrame implements ActionListener,ChangeListener{
  private JScrollPane DESPLAZAR;
  private JTextArea AREA1;
  private JCheckBox CHECK;
  private JButton BOTON1,BOTON2;
  private JLabel label1,label2;
   public LICENCIA2(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
    label1=new JLabel("TERMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono",1,14));
     label1.setForeground(new Color(0,0,0));
        add(label1);
         setTitle("LICENCIA DE USO");
    getContentPane().setBackground(new Color(0,0,255));

         
//ICONO DE LA INTERFAZ

         setIconImage(new ImageIcon(getClass().getResource("images/ico.png")).getImage());
         

          //LABEL2
             
    ImageIcon IMAGEN=new ImageIcon("images/ico.png");   
          label2=new JLabel(IMAGEN);
            label2.setBounds(5,300,600,300);
               add(label2);

      //AREA1

       AREA1=new JTextArea();
       AREA1.setEditable(false);
      AREA1.setFont(new Font("Andale Mono",0,9));
       AREA1.setText("\n\n          TERMINOS Y CONDICIONES"+
        "\n "+
         "\n          ****GENERAL****"+
         "\n "+
         "\n NO MOFICARE EL CODIGO "+
         "\n"+
         "\n NO COMPARTIRE NI DISTRIBUIRE EL CODIGO SIN LA AUTORIZACION DE EMMANUEL ACOLTZI BAUTISTA"+
         "\n "+
         "\n ESTE SISTEMA ES SOLO PARA FINES RECREATIVOS Y NO SE BUSCA OFENDER AL USUARIO O A ALGUNA EMPRESA"+
         "\n "+
         "\n          ****AVISO DE DE PRIVACIDAD****"+
         "\n "+
         "\n TUS DATOS ESTAN SEGUROS"+
         "\n "+
         "\n NO SE VENDERAN NI MOSTRARAN A TERCEROS"+
         "\n "+
         "\n          ****PUBLICIDAD****"+
         "\n "+
         "\n NO HAY PUBLICIDAD"+
         "\n"+
         "\n          ****EMPRESA****"+
         "\n "+
         "\n LA EMPRESA RESPETA ESTOS TERMINOS Y CONDICIONES"+
         "\n EL NOMBRE DE LA EMPRESA ES ESOFT");
       DESPLAZAR=new JScrollPane(AREA1);
         DESPLAZAR.setBounds(10,40,575,200);
         add(DESPLAZAR);

   //CHECK

   CHECK=new JCheckBox("YO ACEPTO LOS TERMINOS Y CONDICIONES");
     CHECK.setBounds(10,250,300,30);
    CHECK.addChangeListener(this);
       add(CHECK);

   //BOTON1

      BOTON1=new JButton("CONTINUAR");
       BOTON1.setBounds(10,290,110,30);
         add(BOTON1);
         BOTON1.addActionListener(this);
          BOTON1.setEnabled(false);

  //BOTON2

      BOTON2=new JButton("NO ACEPTO");
       BOTON2.setBounds(130,290,110,30);
         add(BOTON2);
         BOTON2.addActionListener(this);
          BOTON2.setEnabled(true);
  }
 public void stateChanged(ChangeEvent A){
   if(CHECK.isSelected()==true){
          BOTON1.setEnabled(true);
          BOTON2.setEnabled(false);
        }else{
              BOTON1.setEnabled(false);
          BOTON2.setEnabled(true);
               }
   }
  public void actionPerformed(ActionEvent A){
   if(A.getSource()==BOTON1){
            ESCRIBIR Escribir1=new ESCRIBIR();
            Escribir1.setBounds(0,0,800,615);
            Escribir1.setVisible(true);
     
            Escribir1.setLocationRelativeTo(null);
      this.setVisible(false); 
        }
   if(A.getSource()==BOTON2){
      System.exit(0);
        }
    }
  public static void main(String args[]){
   LICENCIA2 Licencia1=new LICENCIA2();
    Licencia1.setBounds(0,0,600,600);
       Licencia1.setVisible(true);
        Licencia1.setResizable(false);
        Licencia1.setLocationRelativeTo(null); 
    }
}