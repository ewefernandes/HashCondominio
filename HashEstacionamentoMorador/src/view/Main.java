package view;
import model.Morador;

import javax.swing.JOptionPane;

import controller.ControllerMorador;
import controller.IControllerMorador;

public class Main {

	public static void main(String[] args) {
		
		IControllerMorador cont = new ControllerMorador();
		Morador m1 = new Morador();
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1-Adiciona morador; 2- Consulta morador; 3- Exclui morador; 4- Lista moradores; 9- Sair."));
			switch (opc) {
			case 1: 
				Morador m = new Morador();
				m.nome = JOptionPane.showInputDialog("Nome do morador:");
				m.numApto = Integer.parseInt(JOptionPane.showInputDialog("Num Apto: "));
				m.modeloCar = JOptionPane.showInputDialog("Modelo do carro:");
				m.corCar = JOptionPane.showInputDialog("Cor do carro:");
				m.placaCar = JOptionPane.showInputDialog("Placa do carro:");
				
				try {
					cont.Cadastro(m);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2: 
				String nome = JOptionPane.showInputDialog("Nome do morador:");
				try {
					cont.Consulta(m1, nome);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3: 
				String nome1 = JOptionPane.showInputDialog("Nome do morador:");
				try {
					cont.Deleta(m1, nome1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				int apto = Integer.parseInt(JOptionPane.showInputDialog("Num Apto: "));
				try {
					cont.ListaAndar(apto);
				} catch (Exception e) {
					e.printStackTrace();
				} 
				break;
			case 9:
				break;
			}
		} while (opc != 9);
	}

}
