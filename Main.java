import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("BMIの計算をします。");
        System.out.println("体重と身長を入力してください。");
        Scanner sc = new Scanner(System.in);
        System.out.println("体重(kg)");
        double weight = sc.nextDouble();
        System.out.println("身長(m)");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI:" + String.format("%.2f", bmi));

        if(bmi < 18.5) {
            System.out.println("評価：低体重");

        }else if(bmi < 25) {
            System.out.println("評価：普通体重");

        }else {
            System.out.println("評価：肥満");
        }


    }
}