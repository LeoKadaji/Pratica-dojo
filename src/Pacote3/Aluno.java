package Pacote3;
public class Aluno extends Pessoa {

protected int matricula;

    public Aluno(String Nome, String Cpf){
        this.Nome=Nome;
        this.Cpf=Cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
