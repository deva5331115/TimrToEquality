import java.util.Scanner;

public class Time_to_equality {

        public static int minimumTime (int array[]){
            int maxElement = Integer.MIN_VALUE;
            for (int elements : array){
                maxElement = Math.max(maxElement, elements);
            }
            int time = 0;
            for (int elements : array){
                time += (maxElement - elements);
            }
            return time;
        }

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n= scan.nextInt();
            int array[]=new int[n];
            for (int i=0;i<n;i++) {
                array[i] = scan.nextInt();
            }

            System.out.println(minimumTime(array));
        }
    }

