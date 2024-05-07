package org.dominandoJava;

import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite a agencia da conta:");
        String agenciaConta = sc.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldoConta = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo de R$" + saldoConta + " já está disponível para saque");


    }
}
