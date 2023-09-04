import java.util.Scanner;

//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Main4 {
    public static void main(String[] args) throws Exception {
        boolean eErorr = true;
        Scanner scnner = new Scanner(System.in);
        do {
        System.out.println("Введите строку");
        String res = scnner.nextLine();
        if (res.equals("")){
            System.out.println("Пустые строки вводить нельзя");
            throw new Exception("Пустые строки вводить нельзя");
        }else {System.out.println(res);
        eErorr = false;}
        }while (eErorr);
    }
}
