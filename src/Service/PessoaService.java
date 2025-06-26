package Service;

import Dominio.Pessoa;

import java.util.Scanner;

public class PessoaService {


    public Pessoa criarPessoaScanner() {
        Scanner scanner = new Scanner(System.in);


        String nome;
        while (true) {
            System.out.println("Digite seu Nome completo : ");
            nome = scanner.nextLine();

            if (nome.matches("^[a-zA-Z ]{8,45}$")) {
                System.out.println("Valido");
                break;

            } else {
                System.out.println("tente novamente");
            }

        }

        int idade = -1;

        while (true) {
            System.out.println("digite sua idade: ");
            String linha = scanner.nextLine().trim();

            try {
                idade = Integer.parseInt(linha);

                if (idade >= 18) {
                    System.out.println("valido");
                    break;
                } else {
                    System.out.println("Apenas maior de +18");
                }

            } catch (NumberFormatException e) {
                System.out.println("idade invalida, tente Novamente");


            }

        }

        String cpf;
        while (true) {
            System.out.println("digite seu Cpf: ");
            cpf = scanner.nextLine();
            if (cpf.matches("^\\d{3}-\\d{3}-\\d{3}-\\d{2}$")) {
                System.out.println("Cpf Valido!");
                break;

            } else
                System.out.println("cpf invalido");

        }

        String cep;
        while (true) {
            System.out.println("digite seu Cep: ");
            cep = scanner.nextLine();
            if (cep.matches("^\\d{5}-\\d{3}$")) {
                System.out.println("Cep Valido!");

                break;
            } else
                System.out.println("Cep invalido, Formato Correto (12-345678) ");
        }


        Pessoa pessoa = new Pessoa();
        pessoa.setCpf(cpf);
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setCep(cep);

        return pessoa;
    }
}
