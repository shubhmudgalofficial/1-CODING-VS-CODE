public class logical_operators {
    public static void main(String[] args) {
        int a,b,c;
        a=10;b=20;c=30;
        System.out.println(a<b&&a<c&&b<c); //&& --> logical and --> all true--> true
        System.out.println(a<b&&a<c&&b>c); //&& --> logical and --> if even one false--> false
        //  logical or
       System.out.println(a>b||a>c||b>c); //&& --> logical and --> all false ---> false
        System.out.println(a<=b||a>c||b>c); //&& --> logical and --> if even one true--> true
    //    license 18<=age<=60
        // System.out.println(10 == 10|| 10 < 20||10<30); // all true --->true
        System.out.println(!true);
        System.out.println(!false);


        


       
    }
}