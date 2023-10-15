package ru.petrov;

public class Calculate {

    public <K extends Number, V extends Number> double sum(K a1, V a2) {
        return a1.doubleValue() + a2.doubleValue();
    }

    public <K extends Number, V extends Number> double sub(K a1, V a2) {
        return a1.doubleValue() - a2.doubleValue();
    }

    public <K extends Number, V extends Number> double mult(K a1, V a2) {
        return a1.doubleValue() * a2.doubleValue();
    }

    public <K extends Number, V extends Number> double div(K a1, V a2) {
        if (a2.equals(0)){
            throw new ArithmeticException("div by zerro");
        }
        return a1.doubleValue() / a2.doubleValue();
    }

}
