public class MultiCatchExample {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5] = 30/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Exception Occurs");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Parent Exception Occurs");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
