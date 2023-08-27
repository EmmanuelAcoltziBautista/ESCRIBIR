import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ENCICLOPEDIA extends JFrame implements ActionListener{
	private JButton BOTON1,BOTON2;
	private JScrollPane DESPLAZAR;
	private JLabel label1,label2,label3,label4,label5,label6,label7;
	private JTextField TEXTO1,TEXTO2,TEXTO3,TEXTO4,TEXTO5,TEXTO6;
	private JTextArea AREA1;
	public ENCICLOPEDIA(){
	setLayout(null);


	setIconImage(new ImageIcon(getClass().getResource("images/ico.png")).getImage());

	setTitle("FORMATO APA ENCICLOPEDIA");
	label1=new JLabel("ENCICLOPEDIA");
	label1.setFont(new Font("Ink Free",3,50));
	label1.setBounds(50,0,500,60);
	add(label1);

	BOTON2=new JButton("REGRESAR");
	BOTON2.setFont(new Font("Ink Free",3,20));
	BOTON2.setBounds(1030,330,200,60);
	BOTON2.addActionListener(this);
	add(BOTON2);

/*
AUTOR
AÑO DE PUBLICACION
TITULO DEL ARTICULO
FEACHA DE RECUPERACION DEL DOCUMENTO
ASOCIACION QUE PUBLICA EL ARTICULO
URL
*/

	//AUTOR

	label2=new JLabel("INGRESA EL AUTOR");
	label2.setBounds(10,130,200,60);
	add(label2);
	
	TEXTO1=new JTextField();
	TEXTO1.setBounds(250,130,200,80);
	add(TEXTO1);

//AÑO DE PUBLICACION

	label3=new JLabel("INGRESA EL ANO DE PUBLICACION");
	label3.setBounds(10,230,200,60);
	add(label3);
	
	TEXTO2=new JTextField();
	TEXTO2.setBounds(250,230,200,80);
	add(TEXTO2);


//TITULO DEL ARTICULO

	label4=new JLabel("INGRESA EL TITULO DEL ARTICULO");
	label4.setBounds(10,330,200,60);
	add(label4);
	
	TEXTO3=new JTextField();
	TEXTO3.setBounds(250,330,200,80);
	add(TEXTO3);


//NOMBRE DE LA ENCICLOPEDIA

	label5=new JLabel("NOMBRE DE LA ENCICLOPEDIA");
	label5.setBounds(10,430,200,60);
	add(label5);
	
	TEXTO4=new JTextField();
	TEXTO4.setBounds(250,430,200,80);
	add(TEXTO4);

//VOLUMEN

	label6=new JLabel("INGRESA EL VOLUMEN");
	label6.setBounds(10,530,200,60);
	add(label6);
	
	TEXTO5=new JTextField();
	TEXTO5.setBounds(250,530,200,80);
	add(TEXTO5);

//LUGAR DE PUBLICACION DE LA ENCICLOPEDIA

	label7=new JLabel("LUGAR DE PUBLICACION");
	label7.setBounds(10,630,200,60);
	add(label7);
	
	TEXTO6=new JTextField();
	TEXTO6.setBounds(250,630,200,60);
	add(TEXTO6);


//RESTO


	BOTON1=new JButton("OBTENER");
	BOTON1.setFont(new Font("Ink Free",3,20));
	BOTON1.setBounds(800,330,200,60);
	BOTON1.addActionListener(this);
	add(BOTON1);

	AREA1=new JTextArea();
	AREA1.setFont(new Font("Times New Roman",1,12));
	AREA1.setEditable(false);
	DESPLAZAR=new JScrollPane(AREA1);
	DESPLAZAR.setBounds(800,450,300,100);
	add(DESPLAZAR);
	}
public void actionPerformed(ActionEvent A){
	if(A.getSource()==BOTON1){
	String AUTOR=TEXTO1.getText();
	String TITULO=TEXTO3.getText();
	String NOM=TEXTO4.getText();
	String LUGAR=TEXTO6.getText();
	int VOL=Integer.parseInt(TEXTO5.getText());
	int ANO=Integer.parseInt(TEXTO2.getText());
	AREA1.setText(AUTOR+"."+" ("+ANO+"). "+TITULO+", EN "+" "+NOM+": "+" ("+VOL+" )"+LUGAR+".");
	}
	if(A.getSource()==BOTON2){
	APA E=new APA();
	E.setVisible(true);
	E.setBounds(0,0,1366,731);
	E.setResizable(false);
	this.setVisible(false);
	}
	}
public static void main(String args[]){
	ENCICLOPEDIA W=new ENCICLOPEDIA();
	W.setVisible(true);
	W.setBounds(0,0,1366,731);
	W.setResizable(false);
	}
}