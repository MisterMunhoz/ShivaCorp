package ShivaCorp;

public class Aluno extends Pessoas {
    
    double media, teste, prova;
    
        
     public void setMedia(double media) {
            this.media = media;
    }
    
    public double getMedia(){
            return media;
    } 
    
 public void setTeste(double teste) {
            this.teste = teste;
    }
    
    public double getTeste(){
            return teste;
    }
    
 public void setProva(double prova) {
            this.prova = prova;
    }
    
    public double getProva(){
            return prova;
    } 

    public void calcularMedia(){
    this.media = (this.teste + this.prova)/2;
    }
}