import java.util.*;
class Calculator {
    Calculator() {
        Scanner sc = new Scanner(System.in);
        boolean value = true;
        print();
        int a,b;
        while(value == true){
            System.out.println("Enter your choice :-");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter value a");
                    a = sc.nextInt();
                    System.out.println("Enter value b");
                    b = sc.nextInt();
                    System.out.println(add(a,b));
                    break;
                case 2:
                    System.out.println("Enter value a");
                    a = sc.nextInt();
                    System.out.println("Enter value b");
                    b = sc.nextInt();
                    System.out.println(sub(a,b));
                    break;
                case 3:
                    System.out.println("Enter value a");
                    a = sc.nextInt();
                    System.out.println("Enter value b");
                    b = sc.nextInt();
                    System.out.println(mul(a,b));
                    break;
                case 4:
                    System.out.println("Enter value a");
                    float c = sc.nextInt();
                    System.out.println("Enter value b");
                    float d = sc.nextInt();
                    System.out.println(div(c,d));
                    break;
                case 5:
                    System.out.println("Enter value a");
                    a = sc.nextInt();
                    System.out.println(sqr(a));
                    break;
                case 6:
                    System.out.println("Enter value a");
                    a = sc.nextInt();
                    System.out.println(a*sqr(a));
                    break;
                case 7:
                    System.out.println("Thankyou for using my Calculator");
                    value = false;
                    break;
                default:
                    System.out.println("Invalid choice please re-enter");
                    ch = sc.nextInt();
            }
        }
    }
    void print(){
        System.out.println("Options for calculations:-");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square");
        System.out.println("6.Cube");
        System.out.println("7.Exit");
    }
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
    int mul(int a, int b){
        return a*b;
    }
    float div(float a, float b){
        return a/b;
    }
    int sqr(int a){
        return a*a;
    }
}
