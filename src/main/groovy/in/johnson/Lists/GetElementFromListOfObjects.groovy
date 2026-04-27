package in.johnson.Lists

class GetElementFromListOfObjects {
    static void main(String[] args) {
        // Groovy list initialization
        def lst = [
                new Student(1, "Julie"),
                new Student(2, "Robert"),
                new Student(3, "Adam")
        ]

        // Idiomatic Groovy property/element access
        println lst[0]
        println lst[2]
    }

    // Must be static to be instantiated inside the static main method
    static class Student {
        int rollNo
        String name

        Student(int rollNo, String name) {
            this.rollNo = rollNo
            this.name = name
        }

        @Override
        String toString() {
            // Using GString for cleaner concatenation
            return "[ ${rollNo}, ${name} ]"
        }
    }
}
