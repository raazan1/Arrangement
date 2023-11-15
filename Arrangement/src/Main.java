import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("1.Sayiyi Giriniz: ");
        int s1 = input.nextInt();

        System.out.printf("2.Sayiyi Giriniz: ");
        int s2 = input.nextInt();

        System.out.printf("3.Sayiyi Giriniz: ");
        int s3 = input.nextInt();


        if(s1>s2 && s1>s3){
            if (s2>s3){
                System.out.printf(s1+">"+s2+">"+s3);
            }
            else {
                System.out.printf(s1+">"+s3+">"+s2);
            }
        } else if (s2>s1 && s2>s3) {
            if (s1>s3){
                System.out.printf(s2+">"+s1+">"+s3);
            }
            else{
                System.out.printf(s2+">"+s3+">"+s1);
            }

        } else if (s3>s2 && s3>s1) {
            if(s2>s1){
                System.out.printf(s3+">"+s2+">"+s1);

            }
            else {
                System.out.printf(s3+">"+s1+">"+s2);

            }
        }


    }
}