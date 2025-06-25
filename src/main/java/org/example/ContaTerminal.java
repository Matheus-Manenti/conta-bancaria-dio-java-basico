package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da Conta: ");
        saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }

}