package design_patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        Developer developer = new TeamLead(new SeniorDev(new JavaDev()));

        developer.writeCode();
    }
}
