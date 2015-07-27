package interface_java.reader;

public class PredefinedReader implements IReader {

    private final String str;

    public PredefinedReader(final String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return null;

    }

}
