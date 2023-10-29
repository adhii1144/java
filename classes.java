class Calulator    //calulator class
{
    public int add(int a, int b, int c){   //add mrthod returns sum of arguments 
        int res = a + b + c;
        return res;
    }
    public int sub(int a ,int b ,int c){    //sub method to substrate the passed argumens and returns
        int res = a - b -c;
        return res;
    }
    public int mul(int a,int b,int c){
        int res = a * b * c;
        return res;
    }
    public float div(int a,int b,int c){
        return a/b;
    }
    public float modu(int a,int b,int c){
        return a%b; 
    }
    
}
public class classes{         //main  class 
    public static void main(String[] args){
        int a = 91;
        int b = 54;
        int c = 64;
        Calulator cal = new Calulator();  //object for the calulator class 
        int res = cal.add(a,b,c);
        int sub = cal.sub(a, b, c);
        int mul = cal.mul(a,b,c);
        float div = cal.div(a, b, c);
        float muld =  cal.modu(a, b, c);
        System.out.println("Addition : "+res);
        System.out.println("Substraction : "+sub);
        System.out.println("Multiplitation : "+mul);
        System.out.println("Division : "+div);
        System.out.println("Module : "+muld);
    }
}