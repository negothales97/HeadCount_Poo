package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompanyWindow {

	public static void main(String[] args) {
		//Criando componentes
		JButton btnOk 			= new JButton("OK");
		JButton btnSair 		= new JButton("Sair");
		JLabel labelName 		= new JLabel("Nome Empresa");
		JTextField inputName 	= new JTextField(5);
		//Criando Tela
		JPanel panel 		= new JPanel();
		panel.add(labelName);
		panel.add(inputName);
		panel.add(btnOk);
		panel.add(btnSair);
		
		//Confgigurando Janela
		JFrame janela = new JFrame("Cadastrar Empresa");
		janela.add(panel);
		//Quando a janela for fechada, a aplica��o ser� parada
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Organiza componentes
		janela.pack();
		//Mostra a janela
		janela.setVisible(true);
		
	}

}
