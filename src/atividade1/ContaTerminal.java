package atividade1;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		Conta novaConta = new Conta();
		
		System.out.println("Por favor, digite o número da Agência!");
		novaConta.numeroAgencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o número da conta!");
		novaConta.numeroDaConta = scanner.nextInt();
		
		System.out.println("Por favor, digite o Saldo!");
		novaConta.saldo = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Por favor, digite seu nome!");
		novaConta.nomeCliente = scanner.nextLine();
		
		String msg = "\n\nOlá "+novaConta.nomeCliente+", obrigado por criar uma conta em nosso \nbanco, sua agência é "+novaConta.numeroAgencia+", conta "+novaConta.numeroDaConta+" e seu saldo R$ "+novaConta.saldo+"\ne já está disponivel para saque!";
		
		System.out.println(msg);
		
		
	}

}
