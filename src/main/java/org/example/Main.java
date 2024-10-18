package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//Создаётся новый фрейм main в стеке
        int i = 1;                      // 1 инициализируется переменная i и присваивается значение 1
        Object o = new Object();        // 2 создаётся объект "Object" в куче и ссылка на него с именем "о" в стеке
        Integer ii = 2;                 // 3 создаётся объект типа Integer в куче со значением 2 и ссылка на него с именем "ii" в стеке
        printAll(o, i, ii);             // 4 создаётся новый фрейм "printAll" в стеке
        System.out.println("finished"); // 7 создаётся фрейм "println" в который передаётся ссылка на объект типа String в куче со значением "finished"
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 создаётся Integer-объект в куче со значением 700 и ссылка на него с именем "uselessVar" в стеке
        System.out.println(o.toString() + i + ii);  // 6 создаётся новый фрейм "printAll" в стеке, в фрейм
                                                    // передаются ссылки на новый фрейм "toString" объекта "о" ссылка на примитив "i" и ссылка на объект "ii"
    }
    }
}