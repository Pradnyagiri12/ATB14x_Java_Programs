package Test_Java_Prog;

import java.util.*;

class AgeCategory_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        if(age >= 0 && age <= 12){
            System.out.println("Child");
        }
        else if(age >= 13 && age <= 19){
            System.out.println("Teenager");
        }
        else if(age >= 20 && age <= 64){
            System.out.println("Adult");
        }
        else if(age >= 65){
            System.out.println("Senior Citizen");
        }
        else {
            System.out.println("Invalid Age");
        }
    }
}

