package Escola01;
public class Aluno extends Pessoa{
    private boolean matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("MAtricula será cancelada");
    }
    /*public Aluno(boolean matricula, String curso){
        super();
        this.matricula=matricula;
        this.curso=curso;

    }*/
    public void setMatricula(boolean matricula){
        this.matricula=matricula;
    }
    public boolean getMatricula(){
        return matricula;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    public String getCurso(){
        return curso;
    }
}