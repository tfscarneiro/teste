package br.com.amcom.principal;
import java.util.Scanner;

public class Principal extends Conta {
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		/** Cria objeto teste GIT **/
		Conta MinhaConta;
		MinhaConta = new Conta();

		/** Entrada Nome do Usuario teste para git **/
		Scanner s = new Scanner(System.in);
		System.out.println("Digite Nome Titular: ");
		String nome = s.nextLine();
		
		/** Entrada Endereco do Usuario teste para git **/
		System.out.println("Digite Endere�o Titular: ");
		String endereco = s.nextLine();
				
		/** Altera Valores teste para git**/
		MinhaConta.SetEndereco(endereco);
		MinhaConta.SetTitular(nome);
		MinhaConta.SetSaldo(1000);		
		
		/** Exibe Dados **/
		MinhaConta.MostraTitular();
		MinhaConta.MostraEndereco();
		MinhaConta.MostraCidade();
		MinhaConta.MostraSaldo();
		
		
	}
}
