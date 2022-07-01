package br.com.dio.collection.list;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner resul =new Scanner(System.in);
        int i=0;
        int count=0;


        System.out.println("Porfavor responder as seguintes perguntas, responda (S ou N): ");
        System.out.println();

            System.out.println("Telefonou para a vítima? ");
            String ler= resul.next();
            if (ler.equals("s")||ler.equals("S")){
                respostas.add(ler);
                i++;
                count=count+1;
            }

            System.out.println("Esteve no local do crime? ");
            ler= resul.next();
            if (ler.equals("s")||ler.equals("S")){
                respostas.add(i,ler);
                i++;
                count=count+1;
            }
            System.out.println("Mora perto da vítima?");
            ler= resul.next();
            if (ler.equals("s")||ler.equals("S")){
                respostas.add(i,ler);
                i++;
                count=count+1;
            }

            System.out.println("Já trabalho com a vítima? ");
            ler= resul.next();
            if (ler.equals("s")||ler.equals("S")){
                respostas.add(i,ler);
                i++;
                count=count+1;
            }

            System.out.println("Devia para a vítima? ");
            ler= resul.next();
            if (ler.equals("s")||ler.equals("S")){
                respostas.add(i,ler);
                i++;
                count=count+1;
            }


        switch (count) {
             case 1:
                 System.out.println("xxxx");
                 break;
             case 2:

                 System.out.println("Suspeita ");
                 break;
             case 3:
                 System.out.println("Cúmplice ");
                 break;
             case 4:
                 System.out.println("Cúmplice ");
                 break;
             case 5:
                 System.out.println("Assassina");
                 break;

             default:
                 System.out.println("inocente ");
                 break;
         }






    }

}
