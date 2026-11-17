import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import module java.base;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jorginho quer um numero: ");
        String num = scanner.nextLine();
        System.out.println("Num: " + num);

        System.out.println("teste jorginho");
        System.out.println("jorginho2");

        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("#a1c", 5);

        System.out.println("funfou: "+ mapa.get("#a1c"));

    }
}