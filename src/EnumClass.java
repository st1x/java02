/**
 * Created by admin on 07.07.2015.
 */
public enum EnumClass {
    X("X"), O("O");

    private final String figure;

    public String getFigure() {
        return figure;
    }

    EnumClass(final String figure) {
        this.figure = figure;

    }
}
