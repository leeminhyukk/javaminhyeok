package calculator;

import java.util.ArrayList;
import java.util.Scanner;
//Queue 배열을 사용하기 위해 2개의 import 추가. 2주차 2-16 강의 참고했습니다.


public class App {


    public static void main(String[] args) {
        double result =0;
        Scanner sc = new Scanner(System.in);
        // textString 이라는 문자를 사용하기 위한 선언. "exit" 라는 문자를 받기 위함입니다.
        String textString ="";
        String removeString;
        // removeString 이라는 문자를 사용하기 위한 선언. "remove" 라는 문자를 받기 위함입니다. 1-7

        String inquiryString;
        // 메서드 외 접근 호출.
        // 생성자 부분 수정 필요 x. 2-6
        // 생성자 두개 추가. 2-8 -> plus 중 산술은 arith 로 원의 넓이는 circle 로 수정
        Calculator plus = new Calculator();
        ArithmeticCalculator arith = new ArithmeticCalculator();
        CircleCalculator circle = new CircleCalculator();


        //1-7 무한이 저장될 수 있도록 동적 배열 생성했습니다.
        ArrayList<Double> List =new ArrayList<Double>();

        // 반복문 do -while 을 사용했습니다.while 이 false 가 나오기 전까지 반복됩니다.
        // 반복 여부 상관없이 첫번째 계산값은 나타내고 싶어서 do -while 을 사용했습니다.

        System.out.print("사칙연산을 진행할지, 원의 넓이를 구할지 선택해주세요. 1번은 사칙연산, 2번은 원의 넓이");
        int pick = sc.nextInt();
        //선택지..
        if (pick == 1) {


            do {


                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                int num1 = sc.nextInt();

                System.out.println("사칙연산 기호를 입력하세요: "); // +, -, *, /
                /* charAt(idx) : charAt 메서드는 메개변수로 char 타입으로 변환 하고자하는 문자열의 위치(index)를 받는다*/
                char operator = sc.next().charAt(0);
                //switch 문을 통해 기호에 맞는 연산이 되도록 설정.

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();
                // Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

                // 선언. 강의 2-7 int month= 8을 참고했습니다.


                //사칙연산 기호를 저장한 변수 = operator


                switch (operator) {
                    // case 뒤에는 조건!! 변수에 따라 뒤에 result 값이 이렇게 계산되고, break 되도록 설정했습니다.
                    case '+':
                        // 더한 값을 result 에 저장.
                        // operate 로 수정.
                         result = arith.addOperator.operate(num1,num2);

                        break;
                    case '-':
                        result = arith.subtractOperator.operate(num1,num2);
                        break;
                    case '*':
                        result = arith.multiplyOperator.operate(num1,num2);
                        break;
                    case '/':
                        result = arith.divideOperator.operate(num1,num2);
                        break;
                    case '%':
                        result = arith.modOperator.operate(num1,num2);
                        break;
                        // % 도 인터페이스 이용해서 만들고 추가.



                        // 위에 값 중 예상된 값이 입력되지 않을 경우. ex. 기호 자리에 숫자입력.
                    default: {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }
                }
                //리스트에 추가되는 값 변경.(Calculator)  + 출력값 변경. (App)
                arith.addList(result);
                System.out.println("결과: " + result);

                removeString = sc.nextLine(); // 안에 있던 enter 값 삭제를 위해. (버퍼)
                // remove 라는 값을 입력받으면 가장 먼저 입력된 결과가 삭제될 수 있도록 구현. 첫번째 인덱스 intList.remove(0);
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                removeString = sc.nextLine();
                if (removeString.equals("remove")) {
                    arith.removeResult(); // 앞에 get 추가. // 2-4 에서 Calculator 에서 처리하도록 수정.
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                inquiryString = sc.nextLine();
                if (inquiryString.equals("inquiry")) {
                    arith.inquiryResult();
                    // 2-5 조회기능 구현.
                }


                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

                // 위에 있는 int num2 = sc.nextInt(); 참고했고,
                // 숫자가 아니라서 Int 는 지우고 적어봤습니다.
                textString = sc.nextLine();

                // 2주차 강의 2-6 if 에서 가위바위보 Objects.eqauls 를 참고해서 넣었습니다.
                // 해당 강의에서는 nextLine 을 사용했었는데
                //  sc.nextLine 으로 입력하니 더 계산하시겠습니까? 에 답을 입력 못해서 수정했습니다.


            } while (!(textString.equals("exit")));
        } else if (pick == 2) {
            // 원의넓이 계산되는 코드
            System.out.println("반지름을 입력해주세요.");
            int radius = sc.nextInt();
            sc.nextLine();
            double circlearea = circle.calculateCircleArea(radius); // 원의 넓이 저장.
            circle.addCircleList();
            System.out.println("원의 넓이 : " + circlearea); // 원의 넓이 출력.

//            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
//            removeString = sc.nextLine();
//            if (removeString.equals("remove")) {
//                plus.removeResult(); // 앞에 get 추가. // 2-4 에서 Calculator 에서 처리하도록 수정.
//            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            inquiryString = sc.nextLine();
            if (inquiryString.equals("inquiry")) {
                circle.inquirycircleResult();
                // 2-7 원의 넓이 조회기능 구현.
            }






        }

    }
}





