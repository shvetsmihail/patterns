package design_patterns.behavioral.momento;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Project project = new Project("1.0", "", repository);

        System.out.println("Create new project");
        System.out.println(project);

        System.out.println("Make some changes");
        project.addChanges("code...");
        System.out.println(project);

        System.out.println("Commit changes");
        project.commit("1.1");
        System.out.println(project);

        System.out.println("Make some bad changes");
        project.addChanges("bad code...");
        System.out.println(project);

        System.out.println("Commit changes");
        project.commit("1.2");
        System.out.println(project);

        System.out.println("RollBack project");
        project.rollBack("1.1");
        System.out.println(project);

    }
}
