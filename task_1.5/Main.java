/* Программа запрашивает у пользователя значение в градусах Цельсия. Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

/* Ответ */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Введите значение температуры в градусах ТС = ");
        float tc = scanner.nextFloat();
        System.out.println ("Вы ввели "+tc+" градусов по ТС");
        float ft = (9*tc/5 + 32);
        System.out.println ("Вывод это " + ft + " градусов по Фаренгейту FT");
    }
}
