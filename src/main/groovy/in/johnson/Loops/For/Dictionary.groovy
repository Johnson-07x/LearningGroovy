package in.johnson.Loops.For

class Dictionary {
    static void main(String[] args) {
        def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];

        for(emp in employee) {
            println(emp);
        }
    }
}
