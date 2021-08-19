package lab0;

import javax.swing.JOptionPane;

public class Sistema {
    static Facade facade = new Facade();

	
	public static void main(String []args) {
		
		
		JOptionPane.showMessageDialog(null, "SEJA BEM-VINDO(A)!");
		
		
		boolean sair = false;
		while(!sair) {
			
			int op = Integer.parseInt(JOptionPane.showInputDialog ("==========================\n" + "MENU \n" + "==========================\n"
				
					+ "1.Login\n"
					+ "2.Cadastro\n"
					+ "3.Sair"));
			
			if(op == 1) {
				
				String _email = JOptionPane.showInputDialog("Digite o seu email");
				String _senha = JOptionPane.showInputDialog("Digite sua senha");
				
				facade.login(_email, _senha);
					
			}
			if(op == 2) {
				
				String _nome = JOptionPane.showInputDialog("Digite seu nome");
                int _matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite sua matrícula"));;
				String _email = JOptionPane.showInputDialog("Digite seu email");;
				String _senha = JOptionPane.showInputDialog("Digite sua senha");
				
				facade.relizaCadastro(_nome, _email, _matricula, _senha);
					
			}
			
			if(op == 3) {
				JOptionPane.showMessageDialog(null, "Saiu do sistema!");
				sair = true;
			}
		
		}
		
	}
}
