import java.util.Scanner;

public class hdt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n ,i;
        System.out.print("Nhập số người : ");
        n = sc.nextInt();
        person[] a = new person[n] ;
        for(i=0;i<n;i++){
            a[i] = new person();
            a[i].name = "Viet" +i ;
            a[i].age = 20+i ;
            a[i].height = 1.7f ;
        }
        for (i=0;i<n;i++){
            System.out.println("Thông tin của người thứ "+(i+1));
            System.out.println("Tên : "+a[i].name);
            System.out.println("Tuổi : "+a[i].age);
            System.out.println("Chiều cao : "+a[i].height);
        }

    }
}
