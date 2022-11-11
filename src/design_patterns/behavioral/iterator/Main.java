package design_patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Collection skills = new SkillsCollection(new String[]{"java", "c++"});

        Iterator skillsIterator = skills.getIterator();
        while (skillsIterator.hasNext()) {
            System.out.println(skillsIterator.next());
        }

    }
}
