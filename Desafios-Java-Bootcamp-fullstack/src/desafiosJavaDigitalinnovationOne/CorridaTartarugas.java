package desafiosJavaDigitalinnovationOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorridaTartarugas {



        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int quantidade;

            do {
                quantidade = Integer.parseInt(br.readLine());

                String tartarugas[] = br.readLine().split(" ");

                int maiorSpeed = Integer.parseInt(tartarugas[0]);

                for (int i = 1; i < quantidade; i++) {
                    int lista = Integer.parseInt(tartarugas[i]);

                    if (lista > maiorSpeed) {
                        maiorSpeed = lista;
                    }
                }

                if (maiorSpeed < 10) {
                    System.out.println("1");
                } else if (maiorSpeed > 10 && maiorSpeed < 20) {
                    System.out.println("2");
                } else {
                    System.out.println("3");
                }


            } while (br.ready());
        }


}
