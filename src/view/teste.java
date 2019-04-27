package view;

import javax.swing.JOptionPane;

import project.Projeto;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Projeto projeto = new Projeto ();
		
		projeto.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
		
		System.out.println("Nome: " + projeto.getNome());
		
		projeto.setEndereco(JOptionPane.showInputDialog("Digite o seu endereço"));
		
		System.out.println("\nEndereço: " + projeto.getEndereco());
		
		projeto.setBairro(JOptionPane.showInputDialog("Digite o seu bairro"));
		
		System.out.println("\nBairro: " + projeto.getBairro());
		
		projeto.setCidade(JOptionPane.showInputDialog("Digite o seu cidade"));
		
		System.out.println("\nCidade: " + projeto.getCidade());

		projeto.setEstado(JOptionPane.showInputDialog("Digite o seu estado"));
		
		System.out.println("\nEstado: " + projeto.getEstado());
		
		projeto.setCep(Long.parseLong(JOptionPane.showInputDialog("Digite o seu CEP")));
		
		System.out.println("\nCep: " + projeto.getCep());
		

	}

}
