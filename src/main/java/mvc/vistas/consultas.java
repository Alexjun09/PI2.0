package mvc.vistas;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import mvc.control.altasHome;
import mvc.control.consultasAltas;
import mvc.control.consultasAlumnosB;
import mvc.control.consultasAreasB;
import mvc.control.consultasHome;
import mvc.control.consultasPIB;

public class consultas {
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton buttonadd1;
	private JButton buttonadd2;
	private JButton buttonadd3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	private home h;
	private altas a;
	
	public consultas() {
		//this.h = home;
		///////////////////// MENÚ Y FONDO/////////////////////////////77
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();

		frame = new JFrame("Consultar");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1350, 820);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {

				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/fondo.png");
				Image image = imageIcon.getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				setVisible(true);
				super.paintComponent(g);
			}
		};

		ImageIcon imagenHome = new ImageIcon("Imagenes/home.png");
		Image resizedImage = imagenHome.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon imagenAdd = new ImageIcon("Imagenes/mas.png");
		Image resizedAdd = imagenAdd.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon imagenConsultar = new ImageIcon("Imagenes/buscar.png");
		Image resizedConsultar = imagenConsultar.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

		button1 = new JButton("");
		button1.setBorderPainted(false);
		button1.setBounds(115, 677, 90, 78);
		button1.setIcon(new ImageIcon(resizedImage));
		button1.setContentAreaFilled(false);
		button1.setFocusPainted(false);
		button1.setOpaque(false);
		

		button2 = new JButton("");
		button2.setBorderPainted(false);
		button2.setBounds(600, 677, 90, 78);
		button2.setIcon(new ImageIcon(resizedAdd));
		button2.setContentAreaFilled(false);
		button2.setFocusPainted(false);
		button2.setOpaque(false);
		

		button3 = new JButton("");
		button3.setBorderPainted(false);
		button3.setBounds(1085, 677, 90, 78);
		button3.setIcon(new ImageIcon(resizedConsultar));
		button3.setContentAreaFilled(false);
		button3.setFocusPainted(false);
		button3.setOpaque(false);

		frame.setContentPane(panel);
		panel.setLayout(null);

		// BOTONES DE BUSCAR
		ImageIcon imagenAnadir = new ImageIcon("Imagenes/lupa.png");
		Image resizedAnadir = imagenAnadir.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);

		buttonadd1 = new JButton("");
		buttonadd1.setBorderPainted(false);
		buttonadd1.setBounds(426, 185, 90, 78);
		buttonadd1.setIcon(new ImageIcon(resizedAnadir));
		buttonadd1.setContentAreaFilled(false);
		buttonadd1.setFocusPainted(false);
		buttonadd1.setOpaque(false);

		panel.add(buttonadd1);

		buttonadd2 = new JButton("");
		buttonadd2.setBorderPainted(false);
		buttonadd2.setBounds(426, 315, 90, 78);
		buttonadd2.setIcon(new ImageIcon(resizedAnadir));
		buttonadd2.setContentAreaFilled(false);
		buttonadd2.setFocusPainted(false);
		buttonadd2.setOpaque(false);
		panel.add(buttonadd2);

		buttonadd3 = new JButton("");
		buttonadd3.setBorderPainted(false);
		buttonadd3.setBounds(426, 452, 90, 78);
		buttonadd3.setIcon(new ImageIcon(resizedAnadir));
		buttonadd3.setContentAreaFilled(false);
		buttonadd3.setFocusPainted(false);
		buttonadd3.setOpaque(false);
		panel.add(buttonadd3);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		///////////////////////////// LABELS//////////////////////////////////

		JLabel lblNewLabel = new JLabel("¿Qué desea consultar?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(247, 254, 255));
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 63));
		lblNewLabel.setBounds(260, 6, 917, 119);
		panel.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Alumnos");
		lblNewLabel_1.setFont(new Font("Academy Engraved LET", Font.PLAIN, 38));
		lblNewLabel_1.setBounds(528, 188, 285, 89);
		panel.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Áreas");
		lblNewLabel_2.setFont(new Font("Academy Engraved LET", Font.PLAIN, 38));
		lblNewLabel_2.setBounds(527, 304, 179, 89);
		panel.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("Proyectos Integradores");
		lblNewLabel_3.setFont(new Font("Academy Engraved LET", Font.PLAIN, 38));
		lblNewLabel_3.setBounds(526, 441, 859, 89);
		panel.add(lblNewLabel_3);
		frame.setVisible(true);

	}
	public void hacerVisible() {
    	frame.setVisible(true);
	}
	public void dispose() {
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador(home x) {
		consultasHome escuchador = new consultasHome();
		escuchador.setVentanaUsuario(x, this);
		button1.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador2(altas x) {
		consultasAltas escuchador = new consultasAltas();
		escuchador.setVentanaUsuario(x, this);
		button2.addActionListener(escuchador);
	}
	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}
	public void setAltas(altas altas) {
		a=altas;
		//boton que va a altas
		setControlador2(a);
	}
	public void setHome(home home) {
		h=home;
		//boton que vuelve a home
	    setControlador(h);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador3(buscarAlumnos x) {
		consultasAlumnosB escuchador = new consultasAlumnosB();
		escuchador.setVentanaUsuario(this, x);
		buttonadd1.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador4(buscarArea x) {
		consultasAreasB escuchador = new consultasAreasB();
		escuchador.setVentanaUsuario(this, x);
		buttonadd2.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador5(buscarPI x) {
		consultasPIB escuchador = new consultasPIB();
		escuchador.setVentanaUsuario(this, x);
		buttonadd3.addActionListener(escuchador);
	}
	
	public void setBuscarAreas(buscarArea x) {
		//boton que vuelve a home
	    setControlador4(x);
	}
	public void setBuscarAlumnos(buscarAlumnos x) {
		//boton que vuelve a home
	    setControlador3(x);
	}
	public void setBuscarPI(buscarPI x) {
		//boton que vuelve a home
	    setControlador5(x);
	}
	
}
