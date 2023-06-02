public class nestedifelse {
    
        public static void main(String[] args) {
            int age =21;
            if(age>=18&&age<=60){
                System.out.println("u can drive");
                if(age>=20&&age<=30){
                    System.out.println("wohoo u r in your 20s"); //nested if ke andar if
                }
            }
            else{
              
                    System.out.println("u cant drive");
                }
            }
        }
            
        

