package org.dominandoJava;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //intput
        int numeroConta = lerNumeroConta(sc);
        double saldoConta = lerSaldoConta(sc);
        String agenciaConta = lerAgenciaConta(sc);
        String nomeCliente = lerNomeCliente(sc);

        //output
        output(numeroConta, saldoConta, agenciaConta, nomeCliente);

        sc.close();
    }

        private static String lerNomeCliente (Scanner sc){
            String nomeCliente;
            while (true) {
                try {
                    System.out.println("Por favor, digite o seu nome:");
                    nomeCliente = sc.nextLine();

                    if (!nomeCliente.isEmpty()) {
                        break;
                    } else {
                        System.out.println("Você precisa se identificar. Por favor, digite novamente.");
                    }
                } catch(Exception e) {
                    System.out.println("Valor invalido!");
                }
            }

            return nomeCliente;
        }

        private static String lerAgenciaConta (Scanner sc){
            String agenciaConta;
            while (true) {
                try {
                    System.out.println("Por favor, digite sua agencia:");
                    agenciaConta = sc.nextLine();

                    if (!agenciaConta.isEmpty()) {
                        break;
                    } else {
                        System.out.println("É necessário digitar a agencia. Por favor, digite novamente.");
                    }
                } catch(Exception e) {
                    System.out.println("Valor invalido!");
                }
            }

            return agenciaConta;
        }

        private static double lerSaldoConta (Scanner sc){
            double saldo;
            while (true) {
                try {
                    System.out.println("Por favor, digite o saldo da conta:");
                    saldo = sc.nextDouble();
                    sc.nextLine(); // Limpar o buffer de entrada

                    //verificacao do saldo
                    if (saldo >= 0) {
                        break;
                    } else {
                        System.out.println("O saldo da conta não pode ser negativo. Por favor, digite novamente.");
                    }

                } catch (Exception e) {
                    System.out.println("Valor invalido!");
                }
            }

            return saldo;
        }

        private static int lerNumeroConta (Scanner sc) {
            int numeroConta;
            while(true) {
                System.out.println("Por favor, digite o numero da conta:");
                try {
                    numeroConta = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer de entrada

                    //verificacao do numero da conta
                    if (numeroConta > 0) {
                        break;
                    } else {
                        System.out.println("O numero da conta deve ser um valor positivo e maior que zero. Por favor, digite novamente.");
                    }
                } catch (Exception e) {
                    System.out.println("Valor invalido!");

                }

            }
            return numeroConta;
        }

        private static void output (int numeroConta, double saldoConta, String agenciaConta, String nomeCliente) {
           System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
        }
}
