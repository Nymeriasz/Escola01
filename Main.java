package Escola01;
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 =  new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pamella");
        p2.setNome("Maria");
        p3.setNome("Maia");
        p4.setNome("Pamps");

        p1.setSexo("F");
        p2.setSexo("F");
        p1.setIdade(19);
        p2.setIdade(20);

        p2.setCurso("Informatica");
        p3.setSalario(2550.50f);
        p4.setSetor("Estoque");

        p3.receberAumento(500.20f);
        p4.mudarTrabalho();
        p2.cancelarMatricula();
        p1.fazerAniversario();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}