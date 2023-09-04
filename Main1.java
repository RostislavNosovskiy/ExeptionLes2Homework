import java.io.InputStream;
import java.util.Scanner;

public class Main1 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void main(String[] args) {
        System.out.println(stringToFloat());
    }
    public static float stringToFloat() {
        boolean bError = true;
        float res = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Введите дробное число");
                String floatNum = scanner.next();
                res = Float.parseFloat(floatNum);
                bError = false;
            } catch (NumberFormatException e) {
                System.out.println("Недопустимый формат стрки, введите значение ещё раз");
            }
        } while (bError);
        return res;
    }

}
