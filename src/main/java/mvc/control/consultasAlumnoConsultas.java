package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.altasPI;
import mvc.vistas.consultaAlumnos;
import mvc.vistas.consultas;

public class consultasAlumnoConsultas implements ActionListener {

	consultaAlumnos ca;
	consultas c;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultaAlumnos consultasA, consultas consultas) {
		ca=consultasA;
		c=consultas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ca.dispose();
		c.hacerVisible();

	}

}
