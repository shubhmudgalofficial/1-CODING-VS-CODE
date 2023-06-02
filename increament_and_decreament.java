public class increament_and_decreament {
    public static void main(String[] args) {
        // very crucial for understanding increament and decreament operators
        
        int a=5,b,c=10,d,e=2,f;
        b=a++;
        System.out.println(a);
        System.out.println(b);
        d=++c;
        System.out.println(c);
        System.out.println(d);
        f=e++ + ++e- --e + ++e;
        System.out.println(f);
        System.out.println(e);
    
    }  
    
}
