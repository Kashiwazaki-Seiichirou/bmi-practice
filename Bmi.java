import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        System.out.println("BMIの計算をします。");
        System.out.println("二人分の体重と身長を入力してください。");
        Scanner sc = new Scanner(System.in);
        System.out.println("一人目の体重(kg)");
        double weight = sc.nextDouble();
        System.out.println("一人目の身長(m)");
        double height = sc.nextDouble();
        System.out.println("二人目の体重(kg)");
        double weight2 = sc.nextDouble();
        System.out.println("二人目の身長(m)");
        double height2 = sc.nextDouble();


        double bmi = weight / (height * height);
        System.out.println("BMI(一人目):" + String.format("%.2f", bmi));
        double bmi2 = weight2 / (height2 * height2);
        System.out.println("BMI(二人目):" + String.format("%.2f", bmi2));

        if(bmi < 18.5) {
            System.out.println("一人目の評価：低体重");

        }else if(bmi < 25) {
            System.out.println("一人目の評価：普通体重");

        }else {
            System.out.println("一人目の評価：肥満");
        }

        if(bmi2 < 18.5) {
            System.out.println("二人目の評価：低体重");

        }else if(bmi2 < 25) {
            System.out.println("二人目の評価：普通体重");

        }else {
            System.out.println("二人目の評価：肥満");
        }


    }
}