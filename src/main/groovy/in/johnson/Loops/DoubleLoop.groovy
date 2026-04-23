package in.johnson.Loops

class DoubleLoop {
    static void main(String[] args) {
        for (i in 0..<5) {
            for (j in 0..<5) {
                print("[" + i + "," + j + "]");
            }
            println();
        }
    }
}
