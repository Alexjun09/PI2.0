package mvc.vistas;

import java.awt.*;
import javax.swing.*;

import mvc.control.*;

public class VistaPrincipal extends JFrame {
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
		lblNewLabel.setBounds(610, 240, 163, 16);
		getContentPane().add(lblNewLabel);

		JButton botonLogIn = new JButton("Log In");
		botonLogIn.setBounds(482, 349, 117, 29);
		getContentPane().add(botonLogIn);
		EscuchadorPrincipalLogIn escuchador = new EscuchadorPrincipalLogIn();
		escuchador.setEscuchadorPrincipalLogIn(this, login);
		botonLogIn.addActionListener(escuchador);

		JButton botonSignUp = new JButton("Sign Up");
		botonSignUp.setBounds(686, 349, 117, 29);
		getContentPane().add(botonSignUp);
		EscuchadorPrincipalSignUp escuchador2 = new EscuchadorPrincipalSignUp();
		escuchador2.setEscuchadorPrincipalSignUp(this, sign);
		botonSignUp.addActionListener(escuchador2);
	}
	public void setVistaLogin(VistaLogin x) {
		login=x;
	}
	public void setVistaSignUp(VistaSignUp x) {
		sign=x;
	}
	public void hacerVisible() {
		setVisible(true);
	}

	public void hacerInisible() {
		setVisible(false);
	}
}