package Escola01;
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    /*public Funcionario(String setor, boolean trabalhando){
        super();
        this.setor=setor;
        this.trabalhando=trabalhando;
    }*/
    public void setSetor(String setor){
        this.setor=setor;
    }
    public String getSetor(){
        return setor;
    }
    public void setTrabalhando(boolean trabalhando){
        this.trabalhando=trabalhando;
    }
    public boolean getTrabalhando(){
        return trabalhando;
    }
}