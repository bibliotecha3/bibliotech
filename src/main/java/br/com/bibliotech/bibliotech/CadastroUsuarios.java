/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bibliotech.bibliotech;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author unity
 */
public class CadastroUsuarios {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> usuario = new HashMap<>();

        while (true) {
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do teclado

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome de usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String senha = scanner.nextLine();

                    usuario.put(nomeUsuario, senha);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Saindo do programa. Até logo!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
