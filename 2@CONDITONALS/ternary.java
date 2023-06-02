public class ternary {
    public static void main(String[] args) {
        int a, b;
        a = 30;
        b = 20; int c=30;
        System.out.println((a < b) ? a : b);
        String result= (a<b)? "a is less " : " b is less";
        System.out.println(result);
        // program to find smallest of 3 numbers using if else and ternary operator
        // ternary operator
        String smallest = (a<b)? ((a<c)? "a is smallest": "c is smallest") :(b<c)?"b is smallest":"c is smallest";
        System.out.println(smallest);
        // using if else
        if(a<b){
            if(a<c){
                System.out.println("a is sabse chota");
            }
            else{
                System.out.println("c is sabse chota");
            }
        }
        else{
            if(b<c){
                System.out.println("b is sabse chota");
            }
            else{
                System.out.println("c is sabse chota");
            }
        }
    } 
} 
