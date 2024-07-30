package calculator;

import java.util.ArrayList;
import java.util.Scanner;
//Queue 배열을 사용하기 위해 2개의 import 추가. 2주차 2-16 강의 참고했습니다.


public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // textString 이라는 문자를 사용하기 위한 선언. "exit" 라는 문자를 받기 위함입니다.
        String textString;
        String removeString;
        // removeString 이라는 문자를 사용하기 위한 선언. "remove" 라는 문자를 받기 위함입니다. 1-7
        // 위쪽에 선언을 지우고 밑에서 값을 입히면서
        // String removeString = sc.next(); 로 하려 했으나 textString 이 오류가 남.
        String inquiryString;
        Calculator Calc = new Calculator();





        // 10개짜리 배열 선언,생성 / 저장하는 변수 선언. count
        // int intArray[] = new int[10];
        // int count = 0; 정적 배열은 1-7 을 수행하기 위해 주석처리 했습니다.

        //1-7 무한이 저장될 수 있도록 동적 배열 생성했습니다.
        ArrayList<Integer> intList =new ArrayList<Integer>();



        // 반복문 do -while 을 사용했습니다.while 이 false 가 나오기 전까지 반복됩니다.
        // 반복 여부 상관없이 첫번째 계산값은 나타내고 싶어서 do -while 을 사용했습니다.



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
            int result = 0;

            //사칙연산 기호를 저장한 변수 = operator

                    // 위에 값 중 예상된 값이 입력되지 않을 경우. ex. 기호 자리에 숫자입력.




            System.out.println("결과: " + result);

            // 새로 생성된 동적 배열에 결과값 넣기.
            intList.add(result);

            //intArray[count]=result; 정적 배열 결과값 넣던 방식 주석처리.

            //count++; 어차피 값이 쭉쭉 들어간다.


            // if 10개가 꽉 찼을 때, for 문을 사용해서 앞으로 한 칸 씩 밀어줬습니다.
            // count 값을 9로 설정해서. 마지막 칸에 새로운 결과값이 입력되도록 했습니다.
//            if(count == intArray.length) {
//
//                for (int i = 0; i < intArray.length-1; i++) {
//                    intArray[i] = intArray[i + 1];
//                    System.out.println(" 저장 공간이 꽉 차서 앞으로 한칸씩 이동합니다.");
//                   count = 9;
//                }
//                // intArray[] 안에 9로 넣어도 결과는 같습니다!
//                intArray[intArray.length-1] = result;
//
//
//            }
            removeString = sc.nextLine(); // 안에 있던 enter 값 삭제를 위해. (버퍼)
            // remove 라는 값을 입력받으면 가장 먼저 입력된 결과가 삭제될 수 있도록 구현. 첫번째 인덱스 intList.remove(0);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
             removeString = sc.nextLine();
            if( removeString.equals("remove")) {
                intList.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            inquiryString = sc.nextLine();
            if(inquiryString.equals("inquiry")){
                for(int list: intList){
                    System.out.println(list);
                }
            }










            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");

            // 위에 있는 int num2 = sc.nextInt(); 참고했고,
            // 숫자가 아니라서 Int 는 지우고 적어봤습니다.
            textString = sc.nextLine();

            // 2주차 강의 2-6 if 에서 가위바위보 Objects.eqauls 를 참고해서 넣었습니다.
            // 해당 강의에서는 nextLine 을 사용했었는데
            //  sc.nextLine 으로 입력하니 더 계산하시겠습니까? 에 답을 입력 못해서 수정했습니다.
          }while(!  textString.equals("exit"));




        };

    }





