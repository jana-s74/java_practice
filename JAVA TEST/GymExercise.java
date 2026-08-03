import java.util.Arrays;
import java.util.Scanner;

public class GymExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();   
        int N = sc.nextInt();   

        int[] A = new int[N];

        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        
        Arrays.sort(A);

        int totalDrain = 0;
        int exerciseCount = 0;

       
        for (int i = N - 1; i >= 0; i--) {
            
            for (int j = 0; j < 2; j++) {

                totalDrain += A[i];
                exerciseCount++;

                if (totalDrain >= E) {
                    System.out.println(exerciseCount);
                    return;
                }
            }
        }

        
        System.out.println(-1);
    }
}