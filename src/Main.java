/**
 * Created by admin on 02.07.2015.
 */
public class Main {

    public int a = 5;
    public static int b = 4;

    public static void main(String[] arg) {

        TestClass testClassVar = new TestClass(); //Создание инстанса для класса
        testClassVar.name = "Andrew";
        String newName = testClassVar.name;
        System.out.println(newName);
        System.out.println(testClassVar.age);
        testClassVar.setAge();
        TestClass.statickMetod(); // Вызов статик метода из другого класса
        final Main main1 = new Main(); //Для вызова не статик переменной из текущего класса вне статик метода необходим инстанс
        System.out.println(main1.a);
        main1.a = 7;
        final Main main2 = new Main();
        System.out.println("New instance");
        System.out.println("main 2");
        System.out.println(main2.a);
        System.out.println("Call var from current class");
        System.out.println("Var b = " +Main.b); //Вызов статик переменной
        main1.abc();
        main1.def();


    }


    public void abc() {

        for (int i =1; i < 8; i +=1){
            System.out.println(i);
        }
    }

    public void def() {

        System.out.println("while");
        int myVar = 0;

        while (myVar < 3){
            System.out.println("myVar = " +myVar);
            myVar += 1;


        }
        System.out.println("myVar < 3");

    }

}
