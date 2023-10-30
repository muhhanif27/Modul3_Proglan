package Tugas_1234;
import  java.util.Scanner;

class Calculator{
    double a,b;
    int pilih;
    Scanner sc = new Scanner(System.in);
    void show(){
        System.out.print("Input a: ");
        a = sc.nextDouble();
        System.out.print("Input b: ");
        b = sc.nextDouble();

        System.out.println("Pilih 1 tambah 2 kurang");
        switch (pilih){
            case 1 :
                double tambah = a+b;
                System.out.println(tambah);
                break;
                case 2:
                    double minus = a-b;
                    System.out.println(minus);
                    break;
                    case 3:
                        double bagi = a/b;
                        System.out.println(bagi);
                        break;
            default:
                System.out.println("salah");
        }
    }
}

public class AutoCompleteandTemplates {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.show();
    }
}