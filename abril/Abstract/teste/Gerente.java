package abril.Abstract.teste;

public class Gerente  extends Funcionario {
    public Gerente(double salario){
        super(salario);
    }
    @Override
    public double getSalario(){
        return super.getSalario() * 1.2;
    }
}
