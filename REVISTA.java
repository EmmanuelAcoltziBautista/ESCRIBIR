import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class REVISTA extends JFrame implements ActionListener{
	private JButton BOTON1,BOTON2;
	private JScrollPane DESPLAZAR;
	private JLabel label1,label2,label3,label4,label5,label6,label7;
	private JTextField TEXTO1,TEXTO2,TEXTO3,TEXTO4,TEXTO5,TEXTO6;
	private JTextArea AREA1;
	public REVISTA(){
	setLayout(null);

	setIconImage(new ImageIcon(getClass().getResource("images/ico.png")).getImage());

	setTitle("FORMATO APA REVISTA");
	label1=new JLabel("REVISTA");
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

//FECHA

	label3=new JLabel("INGRESA LA FECHA");
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


//NOMBRE DE LA REVISTA

	label5=new JLabel(" NOMBRE DE LA REVISTA");
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

//PAGINAS

	label7=new JLabel("INGRESA LAS PAGINAS");
	label7.setBounds(10,630,200,60);
	add(label7);
	
	TEXTO6=new JTextField();
	TEXTO6.setBounds(250,630,200,60);
	add(TEXTO6);

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
	String NOMBRE=TEXTO4.getText();
	int VOL=Integer.parseInt(TEXTO5.getText());
	int PAG=Integer.parseInt(TEXTO6.getText());
	int ANO=Integer.parseInt(TEXTO2.getText());
	AREA1.setText(AUTOR+"."+" ("+ANO+"). "+TITULO+"."+" "+NOMBRE+": "+VOL+","+PAG+".");
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
	REVISTA W=new REVISTA();
	W.setVisible(true);
	W.setBounds(0,0,1366,731);
	W.setResizable(false);
	}
}