import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task0();
        task1();
    }

    private static void task0() {
        int[] weights = new int[12];
        /*
        - Создали ОБЪЕКТ вида [МАССИВ] с целочисленными элементами
        с помощью ключевого слова "new";
        - Записали его значение в переменную типа int с именем weights;
        - Задали размерность - 12 ячеек.
         */
        weights[0] = 90;
        //- Нулевому элементу присвоили значение 90.
        int januaryWeight = weights[0];
            /*- Чтобы оперировать элементом внутри блока
            создаем переменную, в которую помещаем значение нулевого элемента
             */
        System.out.println(januaryWeight);
            /*Обращаемся к значению массива через созданную переменную
            => januaryWeight.sout + ENTER
            */
        System.out.println(weights[0]);//выведет 90
        System.out.println(weights[4]);//выведет 0 по дефолту
        // Обращение через имя массива с указанием нужного индекса
        //System.out.println(weights[14]);//Exception - ошибка. Обращение к несуществующей ячейке
        int january = 0;
        System.out.println(weights[january]);//=>weights[january].sout
        //Задаем номер элемента для вывода через инициализацию новой переменной
        for (int i = 0; i < 12; i++) { //=> 12.fori
            //создаем цик с 12-ю итерациями
            System.out.println(weights[i]);//=> weights[i].sout
        }
        /*Также можно иницииализировать каждый элемент массива:
        int[] weights = new int[12]
        int[] weights = {90, 91, 88, 87, 85, 86, 83, 79, 0, 0, 0, 0};
        в условиях цикла обратиться через свойство "длина массива" через точку
         for (int i = 0; i < weights.length; i++)
         */
    }

    /*  ЗАПУСК: => Cntrl+Shift+F10;
    ПЕРЕЗАПУСК: => Shift+F10
    */
    private static void task1() {
        int[] integArr = new int[3];
        integArr[0] = 1;
        integArr[1] = 2;
        integArr[2] = 3;
        System.out.println(integArr[0]);
        double[] doubleArr = {1.57, 7.654, 9.986};
        System.out.println(doubleArr[2]);
        boolean[] booleanArr = {true, false, false, true};
        int bArrF = 1;
        int bArrT = 3;
        int bArrT2 = 0;
        System.out.println(booleanArr[bArrF]);
        System.out.println("I love you, and it's " + booleanArr[bArrT] + "!!!");
        System.out.println("I wont to stay a Java Developer. I know, my dreams come " + booleanArr[bArrT2] + "!");

        for (int i = 0; i < integArr.length; i++) {
            System.out.print(integArr[i]);
            if (i < integArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.print(doubleArr[i]);
            if (i < doubleArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < booleanArr.length; i++) {
            System.out.print(booleanArr[i]);
            if (i < booleanArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = integArr.length - 1; i >= 0; i--) {
            System.out.print(integArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleArr.length - 1; i >= 0; i--) {
            System.out.print(doubleArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = booleanArr.length - 1; i >= 0; i--) {
            System.out.print(booleanArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < integArr.length; i++) {
            if (integArr[i] % 2 != 0) {
                System.out.print(integArr[i] + 1);
            } else { System.out.print(integArr[i]);

            }
        }
    }
}
