package Practice;

public class TryCatch {
    public static void main(String[] args) {
        int x=34;
        int arr[]={1,2,3,5};
        // try{
        //     int result = x/0;
        //     System.out.println(result);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("cannot divide by zero");
        // }
        // finally{
        //     System.out.println("execution is done");
        // }
        try{
            int index=arr[7];
            System.out.println(index);
        }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
        catch(Exception e){
            System.out.println(e);
        }
    
        finally{
            System.out.println("execution is done");
        }

    }
}
