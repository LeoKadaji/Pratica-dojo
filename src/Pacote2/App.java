package Pacote2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pacote3.Aluno;
import Pacote3.ComparadorMatricula;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        List<Aluno> lista = new ArrayList<>();
        preencherLista(lista);
        int o = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            System.out.println("Organização de alunos");
            System.out.println("Digite 1 para listar alunos");
            System.out.println("Digite 2 para remover alunos");
            System.out.println("Digite 0 para sair");
            System.out.print("Opção: ");

            o = sc.nextInt();
            sc.nextLine(); 

            if (o == 1) {
                System.out.println("1 - Listar por nome");
                System.out.println("2 - Listar por matricula");
                System.out.print("Opção: ");

                o = sc.nextInt();
                sc.next();

                if (o == 1) {
                    lista.sort(null);
                    for (Aluno aluno : lista) {
                        System.out.println(aluno);
                    }
                } else if (o == 2) {
                    lista.sort(new ComparadorMatricula()); 
                    lista.forEach(a -> System.out.println(a)); 
                } else {
                    System.out.println("\nOpção inválida!");
                }

                voltarMenu(sc);
            } else if (o == 2) {
                System.out.println("Informe parte do nome do aluno que deseja remover");
                System.out.print("Nome: ");
                String nome = sc.next();
                sc.next(); 

                Boolean removeu = lista.removeIf(a -> a.getNome().contains(nome));
                if (removeu) {
                    System.out.println("Alunos removidos!");
                } else {
                    System.out.println("Nenhum aluno encontrado!");
                }

                voltarMenu(sc);
            }   
            else if (o != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (o != 0);

        System.out.println("Fim do programa!");

        sc.close();
    }

    public static void preencherLista(List<Aluno> lista) {
        lista.add(new Aluno("Gabriel Pontes Bruzzi Portella Santos", 22));
        lista.add(new Aluno("Guilherme Esteves da Silva Mota", 21));
        lista.add(new Aluno("João Fellipe da Costa Amorim", 20));
        lista.add(new Aluno("Andrey Albuquerque Leite", 19));
        lista.add(new Aluno("Camille Vitória Dos Reis Silva", 18));
        lista.add(new Aluno("Nathan Esteves Vieira", 17));
        lista.add(new Aluno("Pedro Henrique da Silva Nascimento", 16));
        lista.add(new Aluno("Sérgio de Souza Lima Sobrinho", 15));
        lista.add(new Aluno("Carlos Leonardo Carvalho Otoline", 14));
        lista.add(new Aluno("Cássia Vitória Vieira Palagi", 13));
        lista.add(new Aluno("Christian Clemente da Silva", 12));
        lista.add(new Aluno("Emanuel Leocadio Ramalho", 11));
        lista.add(new Aluno("Davi de Almeida Silva", 10));
        lista.add(new Aluno("Davi Maia Martins Bittencourt de Souza", 1));
        lista.add(new Aluno("Thomás da Cruz Pinhero", 2));
        lista.add(new Aluno("Vinícius Chagas Magro", 3));
        lista.add(new Aluno("Eduardo da Silva Lima", 4));
        lista.add(new Aluno("Jose Wanderson da Silva Pimentel", 5));
        lista.add(new Aluno("Kesia do Amaral Mendes", 6));
        lista.add(new Aluno("Leonardo de Oliveira Bianco de Figueiredo", 7));
        lista.add(new Aluno("Luiz Felipe Vieira de Oliveira Ribeiro", 8));
        lista.add(new Aluno("Vinícius Gabriel Neves Dutra", 9));
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();


        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");

        System.out.flush();
    }
}

    
