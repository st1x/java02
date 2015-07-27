package interface_java;

import interface_java.printer.ConsolePrinter;
import interface_java.printer.IPrinter;
import interface_java.reader.IReader;
import interface_java.reader.PredefinedReader;

public class Replacer {

    private final IReader reader;
    private final IPrinter printer;

    public Replacer(final IReader reader, final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void replace() {

        String text = reader.read();
        if (text == null) {text = "no text";}
        final String replacetext = text.replace(":)", "=)");
        printer.print(replacetext);

    }

    public static void main(String[] args) {
        final IReader reader = new PredefinedReader("asdasd:) sdsdsd:):) dfdfgdfgdfsg:)");
        final IPrinter printer = new ConsolePrinter();
        final Replacer replacer = new Replacer(reader, printer);
        replacer.replace();
    }
}
