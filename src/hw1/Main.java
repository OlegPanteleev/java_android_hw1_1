package hw1;

public class Main {
    public static <string> void main(String[] args) {
        byte a = 5;
        short b = 78;
        int c = 999;
        long d = 1909L;
        float e = 1212.1f;
        double f = 122212.56;
        char g = '$';
        boolean h = true;

        System.out.println("Все мои переменные: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g + ", " + h);

        System.out.println(computation (2.1f , 8.5f , 100.1f, 2.7f)); // инициализируем переменные a, b, c и d в методе computation и выводим на консоль

        System.out.println(bool (55, 10)); // инициализируем переменные a и b в методе bool и выводим на консоль

        methodNum(0); // инициализируем переменную number в методе methodNum

        System.out.println(nameMethod (0)); // инициализируем переменную numNumber в методе nameMethod и выводим на консоль

        methodHello ("Олег"); // инициализируем переменную myName в методе methodHello

        leapYear(800);



    }
    public static float computation(float a, float b, float c, float d){ // создаем метод computation и объявлем в нем переменные a, b, c и d
        return a * (b + (c / d)); // возвращаем арифмитические действия с переменными a, b, c и d
    }

    public static boolean bool (int a, int b){ // создаем метод bool и объявляем в нем переменные a и b
        int sum = a + b; // создаем переменную sum и присваиваем ей значение a + b
        return ((sum >= 10) && (sum <= 20)); // возвращаем проверку переменной sum

    }

    public static void methodNum (int number){ // создаем метод methodNum и объявляем в нем переменную number
        if (number >= 0) { // если переменная number больше или равна нулю
            System.out.println("Число положительное"); // выводим в консоль "Число положительное"
        }
        else { // иначе
            System.out.println("Число отрицательное"); // выводим в консоль "Число отрицательное"
        }

    }
    public static boolean nameMethod (int numNumber){ // создаем метод nameMethod и объявляем в нем переменную numNumber
        if (numNumber >= 1){ // если переменная number больше или равна единице
            return true; // возвращаем true
        }
        else { // иначе
            return false; // возвращаем false
        }
    }
    public static void methodHello (String myName){ // создаем метод methodHello и объявляем в нем переменную myName
        System.out.println("Привет, " + myName + "!"); // выводим в консоль "Привет, значение переменной myName !"
    }

    public static void leapYear (int year){ // создаем метод leapYear и объявляем в нем переменную year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){ // если остаток от деления равен 0 и остаток от деления на 100 равен нулю или остаток деления на 400 равен нулю
            System.out.println("Год високосный");  // выводим в консоль "Год високосный"
        } else { // иначе
            System.out.println("Год не високосный"); // выводим в консоль "Год не високосный"
        }

    }

}