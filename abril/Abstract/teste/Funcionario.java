package abril.Abstract.teste;

public class Funcionario extends Pessoa {
    private double salario;
    public Funcionario(double salario){
        this.salario = salario;
    }
    @Override
    public double getSalario() {
        return this.salario;
    }
    
}