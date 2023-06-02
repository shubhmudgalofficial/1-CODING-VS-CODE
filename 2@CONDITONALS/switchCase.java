public class switchCase {
    public static void main(String[] args) {
       /* */ // switch case use and example
        switch(300) // 300 match hoga andar walo se jo case match vo execute or niche wale bhi
        {
          case(200): System.out.println("case1");
          case(300):System.out.println("case 2");
          case(100): System.out.println("case 3");
          case (400): System.out.println((" case 4"));
          default:System.out.println("default case not above case matched");



        }
        // if u dont want to execute all below cases use break statement
        switch(500){
            case(500): System.out.println("case1");
            break; // iske bad k execute nhi honge break k vjh se
            case(600): System.out.println("case2");
            break;
            case(700): System.out.println("case3");
            break;
            case(800): System.out.println("case4");
            break;
            case(900): System.out.println("case5");
            break;
            default: System.out.println("if noone matched then this will execute");
            break;
        }
    }
}
