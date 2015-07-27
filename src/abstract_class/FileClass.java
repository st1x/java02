package abstract_class;

public class FileClass extends AbstractClass {


    @Override
    public String readString() {
        return "text from :) file:) :)";
    }

    public static void main(String[] args) {
        final FileClass fileClass = new FileClass();
        fileClass.process();
    }
}
