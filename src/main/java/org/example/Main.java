package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while(true){
        String [] ppt = {"Pedra", "Papel", "Tesoura"};
        String jogadaComputador = ppt[new Random().nextInt(ppt.length)];
        String jogadaJogador;



            while(true) {
            System.out.println("Escolha sua jogada(Pedra, Papel ou Tesoura)");
            jogadaJogador = scanner.nextLine();
            if(jogadaJogador.equals("Pedra") || (jogadaJogador.equals("Papel") || (jogadaJogador.equals("Tesoura")))) {
                break;
            }
                System.out.println(jogadaJogador + " não é uma jogada válida");
        }

        System.out.println("Computador jogou:" + jogadaComputador);

        if (jogadaJogador.equals(jogadaComputador)){
            System.out.println("Jogada empatada!");

        } else if (jogadaJogador.equals("Pedra")) {
            if (jogadaComputador.equals("Tesoura")) {
                System.out.println(" Você Ganhou!");
            } else if (jogadaComputador.equals("Papel")) {
                System.out.println("Você Perdeu!");

            } else if (jogadaJogador.equals("Papel")) {
                if (jogadaComputador.equals("Pedra")) {
                    System.out.println(" Você Ganhou!");
                } else if (jogadaComputador.equals("Tesoura")) {
                    System.out.println("Você Perdeu!");

                } else if (jogadaJogador.equals("Tesoura")) {
                    if (jogadaComputador.equals("Papel")) {
                        System.out.println("Você Ganhou!");
                    } else if (jogadaComputador.equals("Pedra")) {
                        System.out.println("Você Perdeu!");
                    }
                }
            }
        }

        System.out.println("Jogar Novamente? (s/n)");
        String jogarNovamente = scanner.nextLine();

        if (!jogarNovamente.equals("s")){
            break;

        }
        scanner.close();

            }
    }
}