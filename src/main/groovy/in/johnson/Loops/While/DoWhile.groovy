package in.johnson.Loops.While

class DoWhile {
    static void main(String[] args) {
        int[] numbers = [10, 20, 30, 40, 50];
        int index = 0;

        do {
            println("value of item : " + numbers[index] );
            index++;
        } while( index < 5 );
    }
}
