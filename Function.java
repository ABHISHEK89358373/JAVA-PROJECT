import java.util.Scanner;
/*Q.6)Declare an interface called Function that has a method named evaluate that
takes an int parameter and returns an int value.Create a class Half that implements
Function. Make the implementation of the method evaluate() return the value
obtained by dividing the int argument by 2.In a client, create a method that takes an
arbitrary array of int values as parameter and returns an array that has the same
length, but the value of an element in the new array is half that of the value in the
corresponding element in the array passed as parameter. Let the implementation of
this method create an instance of Half and use this instance to calculate the values in
the array to be returned.*/
interface Function{
    int evaluate(int p);// method
    class Half implements Function{
        @Override
        public int evaluate(int p){
            return p/2;
        }
    }
    public class Client {
        public static int[] applyFunction(int[] values) {
            Function halfFunction = new Half();
            int[] result = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                result[i] = halfFunction.evaluate(values[i]);
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elements:");
        int[] values = new int[]{sc.nextInt()};
        int[] result = Client.applyFunction(values);

        // Print the result array
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}