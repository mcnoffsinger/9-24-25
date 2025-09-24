public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:

    // 1. Two integers
    public static int multiply(int in1, int in2){
        return in1 * in2;
    }
    // 2. Three integers 
    public static int multiply(int in1, int in2, int in3){
        return in1 * in2 * in3;
    } 
    // 3. Two double values
    public static double multiply(double dub1, double dub2){
        return dub1 * dub2;
    }
    // 4. An integer and a string (repeat the string that many times)
    public static String multiply( int iNt, String str){
        String result = "";
        for (int i = iNt;i!=0;i-- ){
            result += str;

        }
        return result;
    }
    public static void main(String[] args) {
        // Test all your overloaded methods
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}
