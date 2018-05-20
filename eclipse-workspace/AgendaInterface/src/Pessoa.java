
public class Pessoa {
	
	//Atributos
	private String nome;
	private String fone;
	
	//Metodo construtor
	public Pessoa(String nome, String fone) {
		this.nome = nome;
		this.fone = fone;
	}
	
	//Metodos Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
}
