import java.util.Scanner;
class Input
{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter an intrger" );
        int number=input.nextInt();
        System.out.println("you Entered"+number);
        input.close();
    }
}