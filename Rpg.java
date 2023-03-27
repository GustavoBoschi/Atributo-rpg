package rpg;

import java.util.Scanner;

public class Rpg {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int atributo, normal, bom, extremo = 1;

        System.out.print("Digite o numero do atributo: ");
        atributo = entrada.nextInt();

        normal = atributo / 2;
        bom = atributo / 4;

        System.out.printf("Normal: %d - %d\n", atributo, normal);
        System.out.printf("Bom: %d - %d\n", normal - 1, bom);
        System.out.printf("Extremo: %d - %d\n", bom - 1, extremo);

        entrada.close();

    }

}
