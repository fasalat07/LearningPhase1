package Constructor;

public class ParameterizedConstructors {


        // Instance variables
        String name;
        int age;
        String course;

        //  Constructor 1: Only name
        ParameterizedConstructors(String name) {
            this.name = name;
            this.age = 18; // default
            this.course = "Not Assigned";
        }

        //  Constructor 2: Name + Age
        ParameterizedConstructors(String name, int age) {
            this.name = name;
            this.age = age;
            this.course = "Not Assigned";
        }

        //  Constructor 3: Name + Age + Course
        ParameterizedConstructors(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        // Method to display details
        void display() {
            System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        }

        // main method to test
        public static void main(String[] args) {
            // Using constructor 1
            ParameterizedConstructors s1 = new ParameterizedConstructors("Alice");
            s1.display();

            // Using constructor 2
            ParameterizedConstructors s2 = new ParameterizedConstructors("Bob", 20);
            s2.display();

            // Using constructor 3
            ParameterizedConstructors s3 = new ParameterizedConstructors("Charlie", 22, "Computer Science");
            s3.display();
        }
    }


