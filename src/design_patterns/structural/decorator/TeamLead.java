package design_patterns.structural.decorator;

public class TeamLead extends DeveloperDecorator {
    public TeamLead(Developer developer) {
        super(developer);
    }

    public void sendWeeklyReport() {
        System.out.println("Sent report");
    }

    @Override
    public void writeCode() {
        super.writeCode();
        sendWeeklyReport();
    }
}
