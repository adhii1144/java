import java.util.*;
public class binary_Seaarch {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int pos = -1;
    System.out.print("Enter the size of the array : ");
    int n = sc.nextInt(); 
    int arr[] = new int[n];
    System.out.print("Enter the elements of the array :");
    for(int i =0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the Search element in the array : ");
    int se = sc.nextInt();
    System.out.print("Given elements Are :");
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    for(int i=0;i<arr.length;i++){
        int l = 0,h=arr.length;
        int mid = (l+h)/2;
        if(arr[mid] == se){
            pos = mid;
            
            if(se<arr[mid]){
                l = mid-1;
            }
            else {
                h = mid+1;
            }
        }
       
    }
     System.out.print("Element found at index : "+pos); 
    }
}
