
import java.util.Arrays;
import java.util.Scanner;

public class ejerciciouno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int [] numeros = {0, 1, 2, 3, 4, 5, 6, 7 , 8, 9};


        System.out.println("Introduce la cadena de texto:");
        cadena = sc.nextLine();

        String invertida = "";
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            invertida += cadena.charAt(indice);
        }
        if (cadena.equals(Arrays.toString(numeros)))
        for (int i=9;i>=0;i--)
            System.out.print("" + Arrays.toString(numeros));

        System.out.print(" " + invertida);
}
}