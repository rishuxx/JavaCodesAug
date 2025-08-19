
import java.util.Scanner;

public class IdCard {

    public static void main(String[] args) {

//calling scanner function to  use
        Scanner sc = new Scanner(System.in);

        //taking idcard inputs 
        System.out.print("SCHOOL :");
        String school = sc.nextLine();
        System.out.print("NAME :");
        String name = sc.nextLine();
        System.out.print("SID :");
        String sid = sc.nextLine();
        System.out.print("COURSE :");
        String course = sc.nextLine();

        //prinitng id cards
        System.out.println(" ");
        System.out.println("-----------CARD---------------");
        System.out.println("SCHOOL : " + school);
        System.out.println("NAME : " + name);
        System.out.println("SID : " + sid);
        System.out.println("COURSE : " + course);
        System.out.println("------------------------------");
        System.out.println(" ");

        sc.close();

    }

}
