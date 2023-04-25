import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

//     public static int  sockMerchant(int n ,int[] arr) {
//     // Write your code here
//         int pairs =0;
//         int temp =-1;
//         int arr2[] = new int [n];
//         for(int i=0; i<n; i++){
//             int count = 1;
//             for(int j=i+1; j<n; j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                     arr2[j] = temp;
//                 }
//             }
//             if(arr2[i] != temp){
//                 arr2[i] = count;
//             }
            
//         } 
        
//         for(int i =0; i<n; i++){
//             if(arr2[i] != temp){
//                 int res = arr2[i]/2;
//                 pairs = pairs + res;
//             }
//         }
        
//         return pairs;
//     }

// }

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int n  = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       // System.out.println(sockMerchant(n, arr));
        int pairs =0;
        int temp =-1;
        int arr2[] = new int [n];
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr2[j] = temp;
                }
            }
            if(arr2[i] != temp){
                arr2[i] = count;
            }
            
        } 
        
        for(int i =0; i<n; i++){
            if(arr2[i] != temp){
                int res = arr2[i]/2;
                pairs = pairs + res;
            }
        }
        System.out.println(pairs);
    }
}

