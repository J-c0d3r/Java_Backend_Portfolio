package Exceptions.naoverificada;

import Exceptions.ConflictException;

import java.util.Scanner;

public class VerificaCPF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu cpf");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);

    }

    public static String verificaCPF(String cpf) {
        try {
//            int t = 10 / 0;
            if (cpf.equals("000111222333444")) {
//                throw new RuntimeException();
                throw new ConflictException("CPF ja cadastrado " + cpf);
            } else {
                return "CPF valido, usuario cadastrado";
            }
//        } catch (RuntimeException e) {
        } catch (ConflictException e) {
            //throw new ConflictException("CPF2 ja cadastrado " + cpf + " " + e.getMessage());
            throw new ConflictException(e.getMessage());
//            System.out.println(e.getMessage());
        }
//        return cpf;
    }
}
