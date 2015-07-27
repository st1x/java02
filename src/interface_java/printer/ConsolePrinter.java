package interface_java.printer;

public class ConsolePrinter implements IPrinter {


    @Override
    public void print(final String text) {
        System.out.println(text);
    }

}
