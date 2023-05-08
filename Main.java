import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int inpIndeksArray=inp.nextInt();
        int [] arr1=new int [inpIndeksArray];

            System.out.println("Lütfen dizinin elamanlarını giriniz... ");
        for (int i = 0 ;i < inpIndeksArray ;i++){
            System.out.print("Lütfen dizinin "+(i+1)+"." +"Elamanını giriniz :");
            int eleman=inp.nextInt();

            arr1[i]=eleman;

        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


    }
}