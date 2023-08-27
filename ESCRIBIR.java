import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ESCRIBIR extends JFrame implements ActionListener{
  private JLabel label1,label2,label3,label4,label5,label7,label8,label9;
  private JScrollPane DESPLAZAR;
  private JMenuBar BAR;
  private JMenu MENU1,MENU2,MENU3,MENU4;
  private JMenuItem item1,item2,item3,item4,item5,item6,item7;
  private JTextArea AREA;
  private JButton BOTON1,BOTON2,BOTON3,BOTON4,BOTON5;
  private JComboBox COMBO1,COMBO2,COMBO3,COMBO4,COMBO5,COMBO6,COMBO7,COMBO8;
	ImageIcon img=new ImageIcon("images/cursores/lapiz.png");
	Cursor c;
	Toolkit tk=Toolkit.getDefaultToolkit();
   public ESCRIBIR(){
    setLayout(null);
	c=tk.createCustomCursor(img.getImage(),new Point(1,1),"String");
	setCursor(c);


//        getContentPane().setBackground(new Color(40,80,255)); 

   //BAR
 
       BAR=new JMenuBar();
         setJMenuBar(BAR);
 
//MENU4 6 7

	MENU4=new JMenu("ARCHIVO");
	BAR.add(MENU4);

	item6=new JMenuItem("IMPRIMIR");
	item6.addActionListener(this);
	MENU4.add(item6);

	item7=new JMenuItem("GUARDAR");
	item7.addActionListener(this);
	MENU4.add(item7);



    //MENU1

        MENU1=new JMenu("OPCIONES");
         BAR.add(MENU1);

    //ITEM1

            item1=new JMenuItem("CERRAR");
           item1.addActionListener(this);
               MENU1.add(item1);

 //MENU3

                MENU3=new JMenu("TAMAÑO");
                  MENU1.add(MENU3);

//ITEM4 
          item4=new JMenuItem("800 X 615");
            MENU3.add(item4);
           item4.addActionListener(this);

//ITEM5
          item5=new JMenuItem("1366 X 731");
            MENU3.add(item5);
           item5.addActionListener(this);

    //MENU2

     MENU2=new JMenu("ACERCA DE");
         BAR.add(MENU2);

      //ITEM2,3

         item2=new JMenuItem("EL CREADOR");
          item2.addActionListener(this);
           MENU2.add(item2);
             
              item3=new JMenuItem("EL PROGRAMA");             
                  item3.addActionListener(this);
                   MENU2.add(item3);
//ICONO DE LA INTERFAZ

         setIconImage(new ImageIcon(getClass().getResource("images/ico.png")).getImage());

//BOTON

      BOTON1=new JButton("APA");
         BOTON1.setBounds(550,0,90,20);
          add(BOTON1);
            BOTON1.addActionListener(this);


                   BOTON2=new JButton("N");
                     BOTON2.setFont(new Font("Andale Mono",1,16));
                     BOTON2.setBounds(5,5,50,20);
                       add(BOTON2);
                             BOTON2.addActionListener(this);


                           BOTON3=new JButton("NO");
                     BOTON3.setFont(new Font("Andale Mono",0,16));
                              BOTON3.setBounds(70,5,60,20);
                                  add(BOTON3);             
                      BOTON3.addActionListener(this);

                      BOTON4=new JButton("F");
                     BOTON4.setFont(new Font("Andale Mono",2,16));
                   BOTON4.setBounds(140,5,60,20);
                       BOTON4.addActionListener(this);
                  add(BOTON4);

                  BOTON5=new JButton("NF");
                     BOTON5.setFont(new Font("Andale Mono",3,16));
                     BOTON5.setBounds(220,5,60,20);
                        add(BOTON5);
                      BOTON5.addActionListener(this);


                  COMBO5=new JComboBox();
                       COMBO5.setBounds(310,5,150,30);
                          COMBO5.addItem("Andale Mono");
                          COMBO5.addItem("Alef");
                          COMBO5.addItem("Amiri");
                          COMBO5.addItem("Amiri Quran");
                          COMBO5.addItem("Arial");
                          COMBO5.addItem("Bahnschrift");
                          COMBO5.addItem("Caladea");
                          COMBO5.addItem("Calibri");
                          COMBO5.addItem("Cambria");
                          COMBO5.addItem("Cambria Math");
                          COMBO5.addItem("Candara");
                          COMBO5.addItem("Carlito");
                          COMBO5.addItem("Comic Sans MS");
                          COMBO5.addItem("Consolas");
                          COMBO5.addItem("Constantia");
                          COMBO5.addItem("Corbel");
                          COMBO5.addItem("Courier");
                          COMBO5.addItem("Courier New");
                          COMBO5.addItem("David CLM");
                          COMBO5.addItem("David Libre");
                          COMBO5.addItem("DejaVu Math Text Gyre");
                          COMBO5.addItem("DejaVu Sans");
                          COMBO5.addItem("DejaVu Sans Mono");
                          COMBO5.addItem("DejaVu serif");
                          COMBO5.addItem("Ebrima");
                          COMBO5.addItem("EmojiOne Color");
                          COMBO5.addItem("Fixedsys");
                          COMBO5.addItem("Frank Ruehl CLM");
                          COMBO5.addItem("Frank Ruhl Hofshi");
                          COMBO5.addItem("Franklin Gothic");
                          COMBO5.addItem("Gabriola");
                          COMBO5.addItem("Gadugi");
                          COMBO5.addItem("Gentium Basic");
                          COMBO5.addItem("Gentium Book Basic");
                          COMBO5.addItem("Georgia");
                          COMBO5.addItem("HoloLens MDL2 Assets");
                          COMBO5.addItem("Impackt");
                          COMBO5.addItem("Ink Free");
                          COMBO5.addItem("Javanese Text");
                          COMBO5.addItem("KacstBook");
                          COMBO5.addItem("KacstBook");
                          COMBO5.addItem("KacstOffice");
                          COMBO5.addItem("Leelawadee UI");
                          COMBO5.addItem("Liberation Mono");
                          COMBO5.addItem("Liberation Sans");
                          COMBO5.addItem("Liberation Serif");
                          COMBO5.addItem("Lucida Console");
                          COMBO5.addItem("Lucida Sans Unicode");
                          COMBO5.addItem("Malgun Gothic");
                          COMBO5.addItem("Marlett");
                          COMBO5.addItem("Mongolian Baiti");
                          COMBO5.addItem("MS Gothic");
                          COMBO5.addItem("MS PGothic");
                          COMBO5.addItem("MS Sans Serif");
                          COMBO5.addItem("MS Serif");
                          COMBO5.addItem("MS UI Gothic");
                          COMBO5.addItem("MV Boli");
                          COMBO5.addItem("Myanmar Text");
                          COMBO5.addItem("Nachieli CLM");
                          COMBO5.addItem("Nirmala UI");
                          COMBO5.addItem("Noto Kufi Arabic");
                          COMBO5.addItem("Noto Mono");
                          COMBO5.addItem("Noto Naskh Arabic");
                          COMBO5.addItem("Noto Naskh Arabic UI");
                          COMBO5.addItem("Noto Sans");
                          COMBO5.addItem("Noto Sans Arabic");
                          COMBO5.addItem("Noto Sans Arabic UI");
                          COMBO5.addItem("Noto Sand Armenian");
                          COMBO5.addItem("Noto Sans Georgian");
                          COMBO5.addItem("Noto Sans Hebrew");
                          COMBO5.addItem("Noto Sans Lao");
                          COMBO5.addItem("Noto Sans Lisu");
                          COMBO5.addItem("Noto Serif");
                          COMBO5.addItem("NSimSun");
                          COMBO5.addItem("OpenSymbol");
                          COMBO5.addItem("Palatino Linotype");
                          COMBO5.addItem("PMingLiU-ExtB");
                          COMBO5.addItem("Reem Kufi");
                          COMBO5.addItem("Roman");
                          COMBO5.addItem("Rubik");
                          COMBO5.addItem("Scheherazade");
                          COMBO5.addItem("Script");
                          COMBO5.addItem("Segoe MDL2 Assets");
                          COMBO5.addItem("Segoe Print");
                          COMBO5.addItem("Segoe UI");
                          COMBO5.addItem("Segoe UI Emoji");
                          COMBO5.addItem("Segoe UI Historic");
                          COMBO5.addItem("Segoe UI Symbol");
                          COMBO5.addItem("SimSun");
                          COMBO5.addItem("SimSun-ExtB");
                          COMBO5.addItem("Sitka Banner");
                          COMBO5.addItem("Sitka Display");
                          COMBO5.addItem("Sitka Heading");
                          COMBO5.addItem("Sitka Small");
                          COMBO5.addItem("Sitka Subheading");
                          COMBO5.addItem("Sitka Text");
                          COMBO5.addItem("SmallFonts");
                          COMBO5.addItem("Source Code Pro");
                          COMBO5.addItem("Source Sans Pro");
                          COMBO5.addItem("Source Serif Pro");
                          COMBO5.addItem("Sylfaen");
                          COMBO5.addItem("Symbol");
                          COMBO5.addItem("System");
                          COMBO5.addItem("Tahoma");
                          COMBO5.addItem("Terminal");
                          COMBO5.addItem("Times New Roman");
                          COMBO5.addItem("Trebuchet MS");
                          COMBO5.addItem("Verdana");
                          COMBO5.addItem("Webdings");
                          COMBO5.addItem("Wingdings");
                          COMBO5.addItem("Yu Gothic");
                          COMBO5.addItem("Yu Gothic UI");
                          
                            add(COMBO5);



                      COMBO1=new JComboBox();
                       COMBO1.setBounds(480,5,50,30);
                            for(int i=0; i<=72; i++){
                               COMBO1.addItem(String.valueOf(i));
                                    }
                                 add(COMBO1);   




         //    TEXTO  

                               label4=new JLabel("TEXTO");
				label4.setFont(new Font("Andale Mono",1,20));
                                  label4.setBounds(10,15,100,60);
                                   add(label4);



                                                      label1=new JLabel("ROJO");
                                 label1.setBounds(10,80,100,60);
                                 add(label1);

                                COMBO2=new JComboBox();
                                COMBO2.setBounds(10,125,50,30);
                           for(int i=0; i<=255; i++){
                    COMBO2.addItem(String.valueOf(i));
                                 }
                              add(COMBO2);

                                label2=new JLabel("VERDE");
                                 label2.setBounds(10,150,100,60);
                                 add(label2);

                                COMBO3=new JComboBox();
                                COMBO3.setBounds(10,190,50,30);
                           for(int i=0; i<=255; i++){
                    COMBO3.addItem(String.valueOf(i));
                                 }
                              add(COMBO3);

                                label3=new JLabel("AZUL");
                                 label3.setBounds(10,210,100,60);
                                 add(label3);

                                COMBO4=new JComboBox();
                                COMBO4.setBounds(10,260,50,30);
                           for(int i=0; i<=255; i++){
                    COMBO4.addItem(String.valueOf(i));
                                 }
                              add(COMBO4);

                         


            


         //    FONDO  

                               label5=new JLabel("FONDO");
				label5.setFont(new Font("Andale Mono",1,20));
                                  label5.setBounds(1290,15,100,60);
                                   add(label5);



                                                      label7=new JLabel("ROJO");
                                 label7.setBounds(1300,80,100,60);
                                 add(label7);

                                COMBO6=new JComboBox();
                                COMBO6.setBounds(1300,125,50,30);
                           for(int i=0; i<=255; i++){
                    COMBO6.addItem(String.valueOf(i));
                                 }
                              add(COMBO6);

                                label8=new JLabel("VERDE");
                                 label8.setBounds(1300,150,100,60);
                                 add(label8);

                                COMBO7=new JComboBox();
                                COMBO7.setBounds(1300,190,50,30);
                           for(int i=0; i<=255; i++){
                    COMBO7.addItem(String.valueOf(i));
                                 }
                              add(COMBO7);

                                label9=new JLabel("AZUL");
                                 label9.setBounds(1300,210,100,60);
                                 add(label9);

                                COMBO8=new JComboBox();
                                COMBO8.setBounds(1300,260,50,30);
                           for(int i=0; i<=255; i++){
                    COMBO8.addItem(String.valueOf(i));
                                 }
                              add(COMBO8);




//AREA Y SCROLLPANE

   AREA=new JTextArea();
    AREA.setText("TOCA AQUI PARA COMENZAR A ESCRIBIR");
     DESPLAZAR=new JScrollPane(AREA);       
       DESPLAZAR.setBounds(200,60,1000,600);
         add(DESPLAZAR);
         
          setTitle("ESCRIBIR");


   } 
public void paint(Graphics G){
	super.paint(G);
	G.setColor(new Color(0,0,0));
	G.drawRect(10,85,100,280);
	G.drawRect(1270,85,100,280);
	}
@Override
   public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){
        APA E=new APA();
	E.setVisible(true);
	E.setBounds(0,0,1366,731);
	E.setResizable(false);
           }
          if(A.getSource()==item1){
            JOptionPane.showMessageDialog(null,"EL PROGRAMA SE CERRARA");
             System.exit(0);
                }
          if(A.getSource()==item2){

                   JOptionPane.showMessageDialog(null,"EL CREADOR ES EMMANUEL ACOLTZI BAUTISTA TEL:2462141581");
                }
          if(A.getSource()==item3){

                   JOptionPane.showMessageDialog(null,"ESCRIBIR VERSION 6.0"+
                       "\n "+
                       "\n         * * *"+
                       "\n       *ESOFT*"+
                       "\n         * * *"+
                       "\n "+
                       "\n TODOS LOS DERECHOS RESERVADOS");

                }
              if(A.getSource()==item4){
              setSize(800,615);
                   }
                if(A.getSource()==item5){
              setSize(1366,731);
                      }


         String CAD1=COMBO1.getSelectedItem().toString();
         String CAD2=COMBO2.getSelectedItem().toString();
         String CAD3=COMBO3.getSelectedItem().toString();
         String CAD4=COMBO4.getSelectedItem().toString();
         int ROJO=Integer.parseInt(CAD2);
         int VERDE=Integer.parseInt(CAD3);
         int AZUL=Integer.parseInt(CAD4);
         int NUMERO=Integer.parseInt(CAD1);
         Color COLOR1=new Color(ROJO,VERDE,AZUL);

       
           // FONDO
      
         String CAD5=COMBO6.getSelectedItem().toString();
         String CAD6=COMBO7.getSelectedItem().toString();
         String CAD7=COMBO8.getSelectedItem().toString();
         int ROJO1=Integer.parseInt(CAD5);
         int VERDE1=Integer.parseInt(CAD6);
         int AZUL1=Integer.parseInt(CAD7);
         Color COLOR2=new Color(ROJO1,VERDE1,AZUL1);

//COMBO5

                     String CAD8=COMBO5.getSelectedItem().toString();


       if(A.getSource()==BOTON2){
                AREA.setFont(new Font(CAD8,1,NUMERO));
                       AREA.setForeground(new Color(ROJO,VERDE,AZUL));
             AREA.setBackground(new Color(ROJO1,VERDE1,AZUL1));
             }
      if(A.getSource()==BOTON3){
                AREA.setFont(new Font(CAD8,0,NUMERO));
                       AREA.setForeground(new Color(ROJO,VERDE,AZUL));
             AREA.setBackground(new Color(ROJO1,VERDE1,AZUL1));
               }
        if(A.getSource()==BOTON4){
                AREA.setFont(new Font(CAD8,2,NUMERO));
                       AREA.setForeground(new Color(ROJO,VERDE,AZUL));
             AREA.setBackground(new Color(ROJO1,VERDE1,AZUL1));
             }
              if(A.getSource()==BOTON5){
                AREA.setFont(new Font(CAD8,3,NUMERO));
                           AREA.setBackground(new Color(ROJO1,VERDE1,AZUL1));  
                       AREA.setForeground(new Color(ROJO,VERDE,AZUL));
                   
                      }
	if(A.getSource()==item6){
	try{
	AREA.print();
	}catch(Exception E){
	}
	}
	if(A.getSource()==item7){
	String NOMBREARCHIVO=JOptionPane.showInputDialog(null,"Escribe el nombre de tu archivo").trim();
	File archivo;
	FileWriter es;
	PrintWriter linea;
	String TEXTO=AREA.getText();
	archivo=new File(NOMBREARCHIVO+".txt");
	try{
	archivo.createNewFile();
	es=new FileWriter(archivo,true);
	linea=new PrintWriter(es);
	linea.println(TEXTO);
	linea.close();
	es.close();
	}catch(Exception E){}
	}
   }
   public static void main(String args[]){
           
            ESCRIBIR Escribir1=new ESCRIBIR();
            Escribir1.setBounds(0,0,800,615);
            Escribir1.setVisible(true);
            
            Escribir1.setLocationRelativeTo(null);
  }
}