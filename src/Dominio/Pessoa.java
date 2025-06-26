package Dominio;

public class Pessoa {
   private String nome;
    private String cpf;
    protected int idade;
    private String cep;


    public Pessoa(){}



   public void setNome(String nome){
       this.nome = nome;

   }

    public String getNome() {
        return nome;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCep(){
        return cep;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public int getIdade() {
        return idade;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }


    public void exibir() {
        System.out.println("=== Exercicio de modificadores de acesso === \n ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cep:" + getCep());
        System.out.println("Cpf: " + getCpf());
    }
}

