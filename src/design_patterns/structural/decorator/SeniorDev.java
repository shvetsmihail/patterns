package design_patterns.structural.decorator;

public class SeniorDev extends DeveloperDecorator {
    public SeniorDev(Developer developer) {
        super(developer);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        makeCodeReview();
    }

    public void makeCodeReview() {
        System.out.println("Make code review");
    }
}
