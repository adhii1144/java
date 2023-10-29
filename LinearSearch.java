class Search
{
    int pos = -1;
    public int search(int arr[],int se){
         for(int i=0;i<arr.length;i++){
            if (arr[i] == se){
                pos = i;
                return pos;
            }
         }
        return pos;
        }     
}

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Search pos = new Search();
        System.out.print("Enter the size of the arry : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter teh elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the searxh element in the array : ");
        int se = sc.nextInt();
        System.out.println("Given elements Are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        pos.search(arr[n], se);
    }
}
