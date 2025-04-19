package ShivaCorp;

import java.util.Scanner;

public class Coordenador extends Pessoas {
    private String[] nomes = new String[5];
    private String[] situacoes = new String[5];

    // 🔧 Scanner removido da classe
    public void registrarProfessores(Scanner input) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do professor " + (i + 1) + ": ");
            nomes[i] = input.nextLine();

            System.out.print("Situação (no prazo / fora do prazo): ");
            situacoes[i] = input.nextLine().toLowerCase();

            while (!situacoes[i].equals("no prazo") && !situacoes[i].equals("fora do prazo")) {
                System.out.println("Entrada inválida. Tente novamente.");
                situacoes[i] = input.nextLine().toLowerCase();
            }
        }
    }

    public void analisarSituacoes() {
        int noPrazo = 0;

        for (int i = 0; i < situacoes.length; i++) {
            if (situacoes[i].equals("no prazo")) {
                noPrazo++;
            }
        }

        System.out.println("\nResumo das situações:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + ": " + situacoes[i]);
        }

        System.out.println(); // linha em branco

        if (noPrazo > nomes.length / 2) {
            System.out.println("Tudo certo! A maioria dos professores está no prazo.");
        } else {
            System.out.println("Atenção: A maioria dos professores está fora do prazo.");
        }
    }

    public String[] getNomes() {
        return nomes;
    }

    public String[] getSituacoes() {
        return situacoes;
    }
}
