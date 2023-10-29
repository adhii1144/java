

class Even
{
    int r =1;
    public String even(int a){
        if (a%2==0){
            return "Even Number";
        }
        else{
            return "Odd Number";
            }
        }
     public String prime(int a){
        
        for(int i = 2;i<=a;i++){
            if (a%i==0){
                r = r+1;
                System.out.println(r);
            }
        }
        if (r==2){
            return " Not Prime";
        }
        else{
            return "Prime";
        }
    
    }

}
public class prectice_class {
    public static void main(String args[]){
        int a = 15 ;
        Even e = new Even();
        
        System.out.println(e.even(a));
        System.out.println(e.prime(a));
    }
}
