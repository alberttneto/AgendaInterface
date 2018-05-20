import java.util.ArrayList;

public class Controle {
	
	//Atributo
	private ArrayList<Pessoa> contatos;
	
	//Metodo construtor
	public Controle() {
		this.contatos = new ArrayList<Pessoa>();
	}
	
	//Metodo que adiciona pessoa aos contatos
	public void addContatos(Pessoa p) {
		this.contatos.add(p);
	}
	
	//Metodo que cria pessoa
	public Pessoa criarPessoa(String n1, String n2) {
		
		Pessoa p1 = new Pessoa(n1, n2);
		
		return p1;
	}
	
	//Metodo que lista todos os contatos da agenda
	public String lista() {
		String retorna = "";
		
		for (int i = 0; i < contatos.size(); i++) {
			int num = i+1;
			retorna += num + "º contato" + "\n" +
					 	"Nome: " + contatos.get(i).getNome() + "\n" +
						"Fone: " + contatos.get(i).getFone() + "\n" +
						"-------------------------------------------" + "\n";
		}
			 return retorna;
	}
}
