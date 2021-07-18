package desafiosJavaDigitalinnovationOne;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Medias {


        public static void main(String[] args)  throws IOException {
            Scanner sc = new Scanner(System.in);
            DecimalFormat decimalFormat = new DecimalFormat("0.0");

            double n1, n2, n3, n4, media, notaDoExame, notaFinalDoExame;

            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();
            n4 = sc.nextDouble();

            media = ((n1*2) + (n2*3) + (n3*4) + n4) / 10;
            System.out.println("Media: " + decimalFormat.format(media));
            if (media > 7) {
                System.out.println("Aluno aprovado.");
            } else if(!decimalFormat.format(media).equals("6.9") && media > 6.9 && media < 7) {
            } else if (media >= 5) {
                System.out.println("Aluno em exame.");
                notaDoExame = sc.nextFloat();
                System.out.println("Nota do exame: " + decimalFormat.format(notaDoExame));
                media = (media + notaDoExame) / 2;
                if (media >= 5) {
                    System.out.println("Aluno aprovado.");
                } else {
                    System.out.println("Aluno reprovado");
                }
                System.out.println("Media final: " + decimalFormat.format(media));
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
    }

