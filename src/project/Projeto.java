package project;

public class Projeto {
	
	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private long cep;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
		
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setEstado (String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setCep (long cep) {
		this.cep = cep;
	}
	
	public long getCep () {
		return cep;
	}

}