import java.util.Scanner;
public class medianumeros {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido, introduce a continuación los 3 números de los cuales desea conocer la media: ");
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        System.out.println("Primer número: ");
        Integer x1 = n1.nextInt();
        System.out.println("Segundo número: ");
        Integer x2 = n2.nextInt();
        System.out.println("Tercer número: ");
        Integer x3 = n3.nextInt();
        Integer med = (x1 + x2 + x3)/3;
        System.out.println("La media de los tres números es la siguiente: " + med);
    }
}
