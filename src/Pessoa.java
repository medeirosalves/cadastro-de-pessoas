import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;
    }

    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
