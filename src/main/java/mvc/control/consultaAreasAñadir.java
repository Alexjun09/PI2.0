package mvc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vistas.altas;
import mvc.vistas.consultaAreas;
import mvc.vistas.home;

public class consultaAreasAñadir implements ActionListener {

	consultaAreas ca;
	altas a;

	/**
	 * Método que nos permite trabajar con una vista principal V
	 * @param vista, Clase Vista Principal
	 */
	public void setVentanaUsuario (consultaAreas consulArea, altas altas) {
		ca=consulArea;
		a=altas;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ca.dispose();
		a.hacerVisible();

	}

}
