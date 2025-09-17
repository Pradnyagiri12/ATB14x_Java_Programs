package ex_01_My_Java_Programs;

public class TableOfNine {
    public static void main(String[] args) {
        System.out.println("Table of Nine");
        int table=9;
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d*%d=%d%n",table,i,table*i);

        }
    }
}
