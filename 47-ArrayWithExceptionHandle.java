import java.util.Random;

public class Fourtyseven{
    public static void main(String[] args){
        Random r=new Random();
        int A[]=new int[20];
        for(int j=0;j<20;j++){
            A[j]=r.nextInt(20); 
        }
        for(int i : A ){
            System.out.print(i+" ");
        }
        System.out.println();
        try {
            System.out.println(A[52]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}