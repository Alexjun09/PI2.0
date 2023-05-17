package mvc.vistas;

import java.awt.*;
import javax.swing.*;

import mvc.control.*;

public class VistaPrincipal extends JFrame {
	
	private JButton botonLogIn;
	private JButton botonSignUp;

	VistaLogin login;
	VistaSignUp sign;
	public VistaPrincipal() {
		inicializar();
	}

	public void inicializar() {
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// Carga y dibuja la imagen de fondo
				ImageIcon imageIcon = new ImageIcon("Imagenes/fondo.png");
				Image image = imageIcon.getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		setContentPane(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1350, 820);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setBounds(623, 240, 74, 16);
		getContentPane().add(lblNewLabel);

		ImageIcon imgLogIn = new ImageIcon("Imagenes/4.png");
		Image resizedImage = imgLogIn.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH);
		botonLogIn = new JButton("");
		botonLogIn.setBorderPainted(false);
		botonLogIn.setBounds(455, 365, 169, 73);
		botonLogIn.setIcon(new ImageIcon(resizedImage));
		botonLogIn.setContentAreaFilled(false);
		botonLogIn.setFocusPainted(false);
		botonLogIn.setOpaque(false);
		EscuchadorPrincipalLogIn escuchador = new EscuchadorPrincipalLogIn(this);
		escuchador.actionPerformed(null);
		botonLogIn.addActionListener(escuchador);

		ImageIcon imgSignUp = new ImageIcon("Imagenes/3.png");
		Image resizedImage2 = imgSignUp.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH);
		botonSignUp = new JButton("");
		botonSignUp.setBorderPainted(false);
		botonSignUp.setBounds(686, 365, 193, 73);
		botonSignUp.setIcon(new ImageIcon(resizedImage2));
		botonSignUp.setContentAreaFilled(false);
		botonSignUp.setFocusPainted(false);
		botonSignUp.setOpaque(false);
		EscuchadorPrincipalSignUp escuchador2 = new EscuchadorPrincipalSignUp(this);
		escuchador2.actionPerformed(null);
		botonSignUp.addActionListener(escuchador2);

		panel.add(botonSignUp);
		panel.add(botonLogIn);
	}
	public void setVistaLogin(VistaLogin x) {
		login=x;
		setControlador1(x);
	}
	public void setVistaSignUp(VistaSignUp x) {
		sign=x;
		setControlador2(x);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador1(VistaLogin x) {
		EscuchadorPrincipalLogIn escuchador = new EscuchadorPrincipalLogIn();
		escuchador.setEscuchadorPrincipalLogIn(this, x);
		botonLogIn.addActionListener(escuchador);
	}
	//Metodo que crea un nuevo controlador
	public void setControlador2(VistaSignUp x) {
		EscuchadorPrincipalSignUp escuchador2 = new EscuchadorPrincipalSignUp();
		escuchador2.setEscuchadorPrincipalSignUp(this, x);
		botonSignUp.addActionListener(escuchador2);
	}
	public void hacerVisible() {
		setVisible(true);
	}

	public void hacerInvisible() {
		setVisible(false);
	}
}