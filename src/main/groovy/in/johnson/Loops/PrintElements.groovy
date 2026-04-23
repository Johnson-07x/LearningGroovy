package in.johnson.Loops

class PrintElements {
    static void main(String[] args) {
        def numbers = [10,20,30,40,50];
        for (int i = 0; i < numbers.size(); i++) {
            println("value of item : " + numbers[i]);
        }
    }
}