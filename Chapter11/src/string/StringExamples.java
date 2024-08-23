package string;

public class StringExamples {
    public static void main(String[] args) {
        Human max = new Human("Max");
        String out = "java object: " + max;
        System.out.println(out);
        // Output: Java object: Person named Max
    }

    static class Human {
        private String name;

        public Human(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "The Man with the Name" + name;
        }
    }
}