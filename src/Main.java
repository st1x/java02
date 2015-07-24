import java.util.Scanner;

/**
 * Created by admin on 02.07.2015.
 */
public class Main {

    public int a = 5;
    public static int b = 4;
    static final String char1 = "abcdef";
    final String target = " Windows win ";

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
        System.out.println("Var b = " + Main.b); //Вызов статик переменной
        main1.abc();
        main1.def();
        main1.doWhile();
        main1.privTest();
        main1.protectedTest();
        main1.switchMetod();
        Second second = new Second();
        System.out.println(second.getQwe());
        second = null;
        //second.
        Second second2 = new Second("New string");
        System.out.println(second2.getQwe());

        final Contact contact = new ContactBuilder()
                .name("Ivan")
                .surname("Petrov")
                .mail("asd@asd.dsa")
                .address("aaaa 22")
                .phone("1234567")
                .build();
        System.out.print(contact.getName() +" ");
        System.out.print(contact.getSurname() +" ");
        System.out.print(contact.getAddress() +" ");
        System.out.print(contact.getMail() + " ");
        System.out.println(contact.getPhone());

        System.out.println("Print O from enum:   " +EnumClass.O);
        System.out.println("Print all enum values:");
        for (EnumClass f : EnumClass.values()) {
            System.out.println(f);
        }
        //String builder
        final StringBuilder messageBuilder = new StringBuilder("Messadge: ");
        messageBuilder.append("text1 ");
        System.out.println(messageBuilder);
        final StringBuilder messageBuilder2 = new StringBuilder("Messadge2: ") //Version 2
        .append("text1 ");
        System.out.println(messageBuilder2);
        //char
        System.out.println();
        System.out.println(char1);
        System.out.println(char1.charAt(2));
        System.out.println(char1.substring(2, 5));
        System.out.println(char1.substring(1, char1.length()));
        System.out.println();


        //target
        System.out.print("Normal string: \"");
        System.out.println(main1.target + "\"");
        System.out.println("Metod trim: \"" + main1.target.trim() + "\"");
        System.out.println("Metod lastIndexOf w : \"" + main1.target.lastIndexOf('w') + "\"");
        System.out.println("Metod lastIndexOf W : \"" + main1.target.lastIndexOf('W') + "\"");
        System.out.println("Metod indexOf w : \"" + main1.target.indexOf('w') + "\"");
        System.out.println("Metod indexOf w, 8 : \"" + main1.target.indexOf('w', 8) + "\"");
        System.out.println("Metod indexOf win : \"" + main1.target.indexOf("win") + "\"");
        System.out.println("Metod toLowerCase win : \"" + main1.target.toLowerCase() + "\"");
        System.out.println("Metod toLowerCase.trim win : \"" + main1.target.toLowerCase().trim() + "\"");
        System.out.println("Metod toLowerCase.trim.indexOf win : \"" + main1.target.toLowerCase().trim().indexOf("win") + "\"");


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

    public void doWhile() {
        int newWar = 0;
        do {
            System.out.println("newVar = " +newWar);
            newWar +=1;
        } while (newWar < 3);
        System.out.println("do while is close");
    }

    public void switchMetod () {

        System.out.println("Please input your choise:");
        System.out.println("1 - First choise");
        System.out.println("2 - Second choise");
        System.out.println("> ");
        final Scanner scaner = new Scanner(System.in);
        int myChoise = scaner.nextInt();
        switch (myChoise){
            case 1:
                System.out.println("Your choise is 1");
                break;
            case 2:
                System.out.println("Your choise is 2");
                break;
            default:
                System.out.println("Bad choise");
                break;

        }
    }

    private void privTest() {

        System.out.println("Test Private metod. OK");

    }

    protected void protectedTest() {

        System.out.println("Test Protected metod. OK");

    }


}
