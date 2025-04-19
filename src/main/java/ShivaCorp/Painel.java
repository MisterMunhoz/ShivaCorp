package ShivaCorp;

import java.util.*;

public class Painel {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        byte op;

        do {
            // 🛑 BREAKPOINT 1: Verificar se o menu está sendo exibido corretamente
            System.out.println("______________");
            System.out.println("Menu principal");
            System.out.println("______________");
            System.out.println("escolha uma opção:");
            System.out.println("1 - para aluno");
            System.out.println("2 - para professor");
            System.out.println("3 - para coordenador");
            System.out.println("4 - para sair");

            System.out.println("Qual opção deseja?");
            // 🛑 BREAKPOINT 2: Verificar se o usuário digitou corretamente uma opção numérica
            // ⚠️ Corrigido para evitar InputMismatchException
            op = Byte.parseByte(input.nextLine());

            if(op == 4)
                break;

            switch (op){

                case 1 : {
                    System.out.println("Você selecionou aluno");

                    Aluno aluno = new Aluno(); // 🛑 BREAKPOINT 3: Confirmar instanciamento

                    System.out.println("Digite seu nome: ");
                    aluno.setNome(input.nextLine());

                    System.out.println("Digite sua matricula: ");
                    aluno.setMatricula(input.nextLine());

                    if (aluno.getMatricula().length() != 5){
                        // 🛑 BREAKPOINT 4: Validar tamanho da matrícula
                        System.out.println("matricula incorreta, tente novamente");
                        break;
                    }

                    System.out.print("Digite a nota do teste: ");
                    // 🛑 BREAKPOINT 5: Corrigido para evitar InputMismatchException
                    aluno.setTeste(Double.parseDouble(input.nextLine().replace(",", ".")));

                    System.out.print("Digite a nota da sua prova: ");
                    // 🛑 BREAKPOINT 6: Corrigido para evitar InputMismatchException
                    aluno.setProva(Double.parseDouble(input.nextLine().replace(",", ".")));

                    // 🛑 BREAKPOINT 7: Verificar se a média está sendo calculada corretamente
                    aluno.calcularMedia();

                    // 🛑 BREAKPOINT 8: Validar lógica de aprovação
                    if (aluno.getMedia() >= 7.5){
                        System.out.println("Você está aprovado. Sua media é: " + aluno.getMedia());
                    } else {
                        if (aluno.getMedia() < 4.5){
                            System.out.println("Você esta reprovado. Sua media é: " + aluno.getMedia());
                        } else {
                            System.out.println("Você esta de recuperação. Sua media é: " + aluno.getMedia());
                        }
                        System.out.println("Pressione Enter para voltar ao menu...");
                        input.nextLine(); // espera a tecla Enter
                        break;
                    }

                    break;
                }

                case 2 : {
                    System.out.println("Você selecionou professor");

                    Professor professor = new Professor(); // 🛑 BREAKPOINT 9

                    System.out.println("Digite seu nome: ");
                    professor.setNome(input.nextLine());

                    System.out.println("Digite sua matricula: ");
                    professor.setMatricula(input.nextLine());

                    if (professor.getMatricula().length() != 8){
                        // 🛑 BREAKPOINT 10: Validação de matrícula
                        System.out.println("matricula incorreta, tente novamente");
                        break;
                    }

                    System.out.print("Digite o valor do seu salario: ");
                    // 🛑 BREAKPOINT 11: Corrigido para evitar InputMismatchException
                    professor.setSalario(Double.parseDouble(input.nextLine().replace(",", ".")));

                    // 🛑 BREAKPOINT 12: Verificar cálculo de salário
                    professor.obterSalarioLiquido();
                    System.out.println("Seu salario é: " + professor.getSalarioLiquido());
                    
                    System.out.println("Pressione Enter para voltar ao menu...");
                    input.nextLine(); // espera a tecla Enter
                    break;
                }

                case 3 : {
                    System.out.println("Você selecionou coordenador");

                    Coordenador coordenador = new Coordenador();

                    System.out.println("Digite seu nome: ");
                    coordenador.setNome(input.nextLine());

                    System.out.println("Digite sua matricula: ");
                    coordenador.setMatricula(input.nextLine());

                    if (coordenador.getMatricula().length() != 10){
                        System.out.println("matricula incorreta, tente novamente");
                        break;
                    }

                    // 🔧 Scanner passado como argumento
                    coordenador.registrarProfessores(input);   
                    coordenador.analisarSituacoes();
                    
                    System.out.println("Pressione Enter para voltar ao menu...");
                    input.nextLine(); // espera a tecla Enter
                    break;
                }


                default : {
                    // 🛑 BREAKPOINT 16: Testar opções inválidas (letras ou números fora do intervalo)
                    System.out.println("OPÇÃO INVALIDA");
                    System.out.println("Escolha outra opção");
                } break;
            }

        } while(true);

        // 🛑 BREAKPOINT 17: Ponto final do programa
        System.out.println("Fim");

        input.close();
    }
}
