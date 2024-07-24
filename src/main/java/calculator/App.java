package calculator;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num1 = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
        /* charAt(idx) : charAt 메서드는 메개변수로 char 타입으로 변환 하고자하는 문자열의 위치(index)를 받는다*/
        char operator = sc.next().charAt(0);
        //switch 문을 통해 기호에 맞는 연산이 되도록 설정.

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.



        int result =0;


        switch (operator){
        case '+':
            result = num1 + num2;

            break;

        case '-':
            result = num1 - num2;

            break;

        case '*':
            result = num1 * num2;

            break;

        case '/':
            result = num1 / num2;

            break;

        default:
}


        System.out.println("= " + result);

        }



    }

