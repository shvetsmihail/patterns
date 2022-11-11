package design_patterns.behavioral.iterator;

public class SkillsCollection implements Collection {
    public SkillsCollection(String[] skills) {
        this.skills = skills;
    }

    private final String[] skills;

    @Override
    public Iterator getIterator() {
        return new SkillsIterator();
    }


    private class SkillsIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
