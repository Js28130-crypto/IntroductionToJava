package Exercise;

import java.util.Scanner;

public class FindTheHighestScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max=0;
        int numOfStudents=in.nextInt();
        in.nextLine();
        for (int i=1;i<=numOfStudents;i++){
            in.nextLine();
            System.out.println("Enter a name: ");
            String name=in.nextLine();
            System.out.println("Enter a score: ");
            int score= in.nextInt();


            if (score>=max){
                max=score;
            }
        }
        System.out.println(max);
    }
}
