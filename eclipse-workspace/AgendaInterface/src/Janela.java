import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela {
	
	//Atributoas
	//private ArrayList<Pessoa> contatos;
	private Controle cont;

	//Metodo construtor	
	public Janela() {
		
		this.cont = new Controle();	 
		
		//Titulos
		JLabel nome = new JLabel("Nome:          "); 
		JLabel fone = new JLabel("Nº telefone: ");
		
		//Botões
		Icon addCont = new ImageIcon("C:\\Users\\alberto\\eclipse-workspace\\AgendaInterface\\bin\\Imagem\\addContato.jpg");
		JButton botaocad = new JButton(addCont); 
		Icon Agenda = new ImageIcon("C:\\Users\\alberto\\eclipse-workspace\\AgendaInterface\\bin\\Imagem\\Agenda.jpg");
		JButton botaolista = new JButton(Agenda); 
		
		//Caixa de texto
		JTextField textoNome = new JTextField(13); 
		JTextField textoNumero = new JTextField(13);
			 
		//Janela
		JFrame janela = new JFrame ("Agenda"); 
		janela.setSize(300,150);
		
		//Painel
		JPanel painel = new JPanel();
			 
			 //Adiciona componentes ao painel	
			 painel.setBackground(new Color(255,255,255));
			 painel.add(nome);
			 painel.add(textoNome);
			 
			 painel.add(fone);
			 painel.add(textoNumero);
			 
			 painel.add(botaocad);
			 painel.add(botaolista);
			 janela.getContentPane().add(painel);
			 
			 
		 //Ação no botão que adiciona pessoa a agenda
			 botaocad.addActionListener (new ActionListener() {
				 public void actionPerformed (ActionEvent e) {
					 
					 String nome = textoNome.getText();
					 String numero = textoNumero.getText();
					 
					 Pessoa p1 = cont.criarPessoa(nome, numero);
					 cont.addContatos(p1);
					 
					 textoNome.setText("");
					 textoNumero.setText("");
				 }
			 }); 
			 
		// Ação no botão que informa a lista de contatos da agenda
		botaolista.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
			
			String lista = cont.lista();
			JOptionPane.showMessageDialog(null,lista);
			}
		});
			 
			 
			 janela.setVisible(true);
	}
} 

