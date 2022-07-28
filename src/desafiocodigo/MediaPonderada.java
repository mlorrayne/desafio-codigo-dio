package desafiocodigo;

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        int cont = 0;
        double mediaPonderada;
        while (cont < casos){

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            mediaPonderada = ((a*2)+(b*3)+(c*5))/10;
            double media = (double) (Math.round(mediaPonderada*10.0)/10.0);
            System.out.println(media);

            cont++;
        }
        }


    }
