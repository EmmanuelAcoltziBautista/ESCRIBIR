import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class APA extends JFrame implements ActionListener{
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8;
	private JButton BOTON1,BOTON2,BOTON3,BOTON4,BOTON5;
	private JMenuBar BAR;
	private JMenu MENU1,MENU2;
	private JMenuItem item1,item2,item3;
	public APA(){
	setLayout(null);

	setIconImage(new ImageIcon(getClass().getResource("images/ico.png")).getImage());

	BAR=new JMenuBar();
	setJMenuBar(BAR);

	MENU1=new JMenu("OPCIONES");
	BAR.add(MENU1);

	MENU2=new JMenu("ACERCA DE");
	BAR.add(MENU2);

	item1=new JMenuItem("EL CREADOR");
	MENU2.add(item1);
	item1.addActionListener(this);

	item2=new JMenuItem("EL PROGRAMA");
	MENU2.add(item2);
	item2.addActionListener(this);

	item3=new JMenuItem("OCULTAR");
	MENU1.add(item3);
	item3.addActionListener(this);

	setTitle("FORMATO APA");
//label1

	label1=new JLabel("FORMATO APA");
	label1.setFont(new Font("Ink Free",3,50));
	label1.setBounds(50,10,500,60);
	add(label1);


//PAGIAS WEB
/*
AUTOR
AÑO DE PUBLICACION
TITULO DEL ARTICULO
FEACHA DE RECUPERACION DEL DOCUMENTO
ASOCIACION QUE PUBLICA EL ARTICULO
URL
*/
	label2=new JLabel("SI TU ARTICLULO ES UNA PAGINAS WEB");
	label2.setBounds(10,90,300,60);
	add(label2);


	BOTON1=new JButton("CONSULTAR");
	BOTON1.setFont(new Font("Ink Free",3,20));
	BOTON1.setBounds(420,90,200,60);
	BOTON1.addActionListener(this);
	add(BOTON1);



//LIBROS

	/*
	AUTOR
	AÑO DE PUBLICACION
	TITULO DEL LIBRO
	LUGAR DE PUBLICACION
	EDITORIAL
	
	*/

	label3=new JLabel("SI TU ARTICLULO ES UN LIBRO");
	label3.setBounds(10,130,300,60);
	add(label3);


	BOTON2=new JButton("CONSULTAR");
	BOTON2.setFont(new Font("Ink Free",3,20));
	BOTON2.setBounds(680,130,200,60);
	BOTON2.addActionListener(this);
	add(BOTON2);





//REVISTA

/*
AUTOR
FECHA
TITULO DEL ARTICULO
NOMBRE DE LA REVISTA
VOLUMEN
PAGINAS
*/


	label4=new JLabel("SI TU ARTICLULO ES UNA REVISTA");
	label4.setBounds(10,230,300,60);
	add(label4);

	BOTON3=new JButton("CONSULTAR");
	BOTON3.setFont(new Font("Ink Free",3,20));
	BOTON3.setBounds(420,230,200,60);
	BOTON3.addActionListener(this);
	add(BOTON3);








//PERIODICO

/*
AUTOR
AÑO DE PUBLICACION
TITULO DEL ARTICULO
TITULO DEL PERIODICO
PAGINAS
*/


	label5=new JLabel("SI TU ARTICLULO ES UN PERIODICO");
	label5.setBounds(10,330,300,60);
	add(label5);


	BOTON4=new JButton("CONSULTAR");
	BOTON4.setFont(new Font("Ink Free",3,20));
	BOTON4.setBounds(420,330,200,60);
	BOTON4.addActionListener(this);
	add(BOTON4);







//ENCICLOPEDIA

/*
AUTOR
AÑO DE PUBLICACION
TITULO DEL ARTICULO
NOMBRE DE LA ENCICLOPEDIA
VOLUMEN
PAGINAS
LUGAR DE PUBLICACION
PAGINAS
LUGAR DE PUBLICACION DE LA ENCICLOPEDIA
EDITORIAL
*/


	label6=new JLabel("SI TU ARTICLULO ES UNA ENCICLOPEDIA");
	label6.setBounds(10,430,300,60);
	add(label6);


	BOTON5=new JButton("CONSULTAR");
	BOTON5.setFont(new Font("Ink Free",3,20));
	BOTON5.setBounds(420,430,200,60);
	BOTON5.addActionListener(this);
	add(BOTON5);








//
}
public void actionPerformed(ActionEvent A){
	if(A.getSource()==BOTON1){
	WEB W=new WEB();
	W.setVisible(true);
	W.setBounds(0,0,1366,731);
	W.setResizable(false);
	this.setVisible(false);
	}
	if(A.getSource()==BOTON2){
	LIBRO W=new LIBRO();
	W.setVisible(true);
	W.setBounds(0,0,1366,731);
	W.setResizable(false);
	this.setVisible(false);
	}
	if(A.getSource()==BOTON3){
	REVISTA W=new REVISTA();
	W.setVisible(true);
	W.setBounds(0,0,1366,731);
	W.setResizable(false);
	this.setVisible(false);
	}
	if(A.getSource()==BOTON4){
	PERIODICO W=new PERIODICO();
	W.setVisible(true);
	W.setBounds(0,0,1366,731);
	W.setResizable(false);
	this.setVisible(false);
	}
	if(A.getSource()==BOTON5){
	ENCICLOPEDIA W=new ENCICLOPEDIA();
	W.setVisible(true);
	W.setBounds(0,0,1366,731);
	W.setResizable(false);
	this.setVisible(false);
	}
	if(A.getSource()==item1){
	JOptionPane.showMessageDialog(null,"EL CREADOR DEL PROGRAMA ES EMMANUEL ACOLTZI BAUTISTA TEL:2462141581");
	}
	if(A.getSource()==item2){
	JOptionPane.showMessageDialog(null,"\n APA VERSION 1.0"+
						"\n "+
						"\n   * * *"+
						"\n  *ESOFT*"+
						"\n   * * *"+
						"\n TODOS LOS DERECHOS RESERVADOS");
	}
	if(A.getSource()==item3){
	this.setVisible(false);
	}
	}
public static void main(String args[]){
	APA E=new APA();
	E.setVisible(true);
	E.setBounds(0,0,1366,731);
	E.setResizable(false);
 }
}