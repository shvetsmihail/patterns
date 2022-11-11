package design_patterns.structural.composition;

public class Main {
    public static void main(String[] args) {
        Developer javaDev = new JavaDev();
        Developer jsDev = new JSDev();

        PM pm = new PM();
        pm.addDev(javaDev);
        pm.addDev(jsDev);

        pm.writeCode();
    }
}
