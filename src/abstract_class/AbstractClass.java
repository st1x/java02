package abstract_class;


public abstract class AbstractClass {

    public void process() {
        final String text = this.readString();
        final String result = text.replace("^)", "=)");
        System.out.println(result);
    }

    public abstract String readString();



}
