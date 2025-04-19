package ShivaCorp;

// 🛑 Ponto crítico: Classe abstrata Pessoas
// Não deve ser instanciada diretamente. Deve ser estendida por outras classes, como Aluno, Professor, e Coordenador.
abstract class Pessoas {
    protected String nome;
    protected String matricula;

    // 🛑 Ponto crítico: Método para definir o nome, sem alterações
    public void setNome(String nome) {
        this.nome = nome;
    }

    // 🛑 Ponto crítico: Método para obter o nome
    public String getNome() {
        return nome;
    }

    // 🛑 Ponto crítico: Validação da matrícula deve ser feita nas classes filhas, onde as regras são específicas
    // Exemplo: matrícula de aluno = 5 dígitos, professor = 8, etc.
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // 🛑 Ponto crítico: Método para obter a matrícula
    public String getMatricula() {
        return matricula;
    }
}
