package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Exercicio1 {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        //  Declaracion de dois ArrayList
        List<String> meses = new ArrayList<String>();
        List<Double> temperatura = new ArrayList<Double>();
        List<Double> mayormedia=new ArrayList<Double>();

        //Copiamos el ArrayList (arrayof...)

        int i = 0;
        System.out.println("**************************************");
        System.out.println("Digitar os primeiros 6 meses do Ano: ");
        System.out.println("**************************************");
        while (i < 6) {
            //Ingresamos los meses y temperaturas en las listas

            System.out.println("Digitar MES: "+(i+1));
            String mes = ler.next();
            meses.add(i, mes);
            //con matches podemos validar que sea solo letras
            //los datos ingresados en mes
            boolean mescorrecto = mes.matches("[A-Z,a-z]*");

            if (mescorrecto == true) {
                System.out.println("Digitar TEMPERATURA do MES de " + mes);
                Double temp = ler.nextDouble();
                temperatura.add(i, temp);
                i++;

            } else {
                System.out.println("Tiene que ingresar solo letras");
            }


        }
        //Mostrar los elementos del ArrayList
        System.out.println("Mostrar los primeros 6 meses con sus respectivas temperaturas: ");
        //mesTemperatura.forEach(t -> System.out.println(t + ""));
        i = 0;
        while (i < 6) {
            System.out.println("El mes de " + meses.get(i) +
                    "  tiene una temperatura de " + temperatura.get(i) + " ºC");
            i++;
        }
        System.out.println("**************************************");

        //Calcular la media de temperaturas
        double media = temperatura.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
        System.out.println("La media de Temperaturas es: "+media);

        //Mostrar las medias de temperaturas mayores a la media
        i=0;
        while (i<6){
            if (temperatura.get(i)>media){
                mayormedia.add(temperatura.get(i));
            }
            i++;
        }
        System.out.println("As temperaturas encima da media são: "+mayormedia);

    }

    class mesTemperatura {
        private String mes;
        private Double temp;


        public mesTemperatura(String mes, Double temp) {
            this.mes = mes;
            this.temp = temp;
        }

        public String getMes() {
            return mes;
        }

        public Double getTemp() {
            return temp;
        }

        @Override
        public String toString() {
            return "mesTemperatura{" +
                    "mes='" + mes + '\'' +
                    ", temp=" + temp +
                    '}';
        }


    }}
