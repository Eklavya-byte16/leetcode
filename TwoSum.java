// import java.util.Scanner;

// public class TwoSum {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("the target?");
//         int target = scanner.nextInt();
//         int Size = (int)(Math.random() * 10)+1;
//         System.out.println(Size);
//         int [] arr = new int[Size];
//         for (int i = 0; i< arr.length ; i++) {
//             arr[i] = (int)(Math.random() * 10);
//             System.out.printf("% d", arr[i] );
//         }

// int[ ] RealoutPut = new int[2];

//         for (int i : arr) {
//             for (int j : arr) {
//                 if (i+j == target) {
//                    RealoutPut[0] = i;
//                    RealoutPut[1] = j;
//                 }
//             }
//         }
// System.out.println();
//         for (int i : RealoutPut) {
//             System.out.println("*************");
//             System.out.println(i);
//         }

//         scanner.close();
//     }

// }

/*
the problem is the tiem complexity its o(n²) => o(n)
HAshmaps need to use
*/



import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = (int) (Math.random() * 10) + 3;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.printf("% d", arr[i]);
        }
        System.out.println("Target?");
        int target = scanner.nextInt();

        

        HashMap<Integer, Integer> map = new HashMap<>();
        // Logic :-
        /*
         * So we will store the subraction of the target with the index ofcorse the
         * modulus one valve
         * lets name it comp, if the comp of two num is equla then v got the number
         * 
         * so one loop to cal the comp and stor it in the hashmap anf the fide the term
         * with the equal comp
         */
        int[] Target = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];

            if (map.containsKey(comp)) {
                Target[0] = arr[map.get(comp)];
                Target[1] = arr[i];
                break;
            }

            map.put(arr[i], i);

        }

        for (int i : Target) {
            System.out.println(i);
        }

        scanner.close();
    }
}

/**
  * The time complexity is drop by from O(n²) => O(n) in the avg case
  * yet the worst case is the o(n^2)
 */
