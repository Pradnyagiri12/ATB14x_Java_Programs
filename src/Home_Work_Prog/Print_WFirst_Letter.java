package Home_Work_Prog;

class Print_WFirst_Letter {
    public static void main(String[] args) {
        System.out.println("Program to print first letter of the word in a string");
        String a="Java is a fun Learning ";
        System.out.println(a.charAt(0));
        for(int i=0;i < a.length()-1;i++)
        {
            if (a.charAt(i)==' ')
            {
                System.out.println(a.charAt(i+1));
            }

        }
    }}