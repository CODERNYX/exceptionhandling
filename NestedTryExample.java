public class NestedTryExample {

    public static void main(String[] args) {
        //Example1
        try{
            try{
                System.out.println("Going to Divide by zero");
//                String s = null;
//                System.out.println(s.length());
                // The above 2 commented lines exception will be handled by the outer catch block
                //As it does not have any specified inner catch block for null pointer exception
                int b = 39/0;
            }catch(ArithmeticException e){
                System.out.println("Inside inner catch block 1");
                System.out.println(e);
            }
            try{
                int a[] = new int[5];
                a[5] = 4;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inside inner catch block 2");
                System.out.println(e);
            }
            System.out.println("Still inside nested try catch block");
        }catch(Exception e){
            System.out.println("Outer Catch Block");
        }
        System.out.println("End of the program");
    }
}
