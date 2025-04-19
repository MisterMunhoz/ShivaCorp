package ShivaCorp;

public class Professor extends Pessoas {
    
    double salario, salarioLiquido;
    
    public void setSalario(double salario){
    this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    public void setSalarioLiquido(double salarioLiquido){
        this.salarioLiquido = salarioLiquido;
    }
    
    public double getSalarioLiquido(){
        return salarioLiquido;
    }
    
    public void obterSalarioLiquido(){
        this.salarioLiquido = (salario - (salario*0.11));
    }
}

