import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private int idade;
    private ArrayList<String> pessoa = new ArrayList<>();

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
