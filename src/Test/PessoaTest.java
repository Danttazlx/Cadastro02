package Test;

import Dominio.Pessoa;
import Service.PessoaService;

public class PessoaTest {
    public static void main(String[] args) {

        PessoaService pessoaService = new PessoaService();
        Pessoa pessoa = pessoaService.criarPessoaScanner();

        pessoa.exibir();


    }

}