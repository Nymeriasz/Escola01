package Escola01;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade ++;

    }

    /*public void Pessoa(String nome, int idade, String sexo){
        this.nome=nome;
        this.idade=idade;
        this.sexo=sexo;
    }*/
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public String getSexo(){
        return sexo;
    }

    @Override public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}