package Home_Work_Prog;

public class StrRev {

           public static void main(String[] args) {
            System.out.println("This is a reverse string programme without using function");
            String str1="Pradnya";
            String str2="";

            for(int i=str1.length()-1;i>=0;i--){
                str2=str2+str1.charAt(i);}
            System.out.println("string 1 is"+"  "+str1);
            System.out.println("Reverse string 2 is"+" "+str2);
        }
    }


