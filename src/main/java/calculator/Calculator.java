package calculator;
import Operator.*; // Operator 에 있는 건 전부 다 임포트. 포함관계.
import java.util.ArrayList;
// 힌트를 보고 static 을 넣어볼지 고민.
public class Calculator {
    // 사칙연산 클래스 선언. 사용하기 위해 임포트.
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    ModOperator    modOperator; // 선언

    //연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    // private 추가 = App 클래스의 main 메서드에서
    // Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정합니다. (캡슐화)
    // private -> protected 로 수정. 상속받은 애들도 사용 가능.
    protected ArrayList<Double> doubleList;

    protected ArrayList<Double> circleList;

    //받을 숫자 2개 생성 num1 첫번째, num2 두번째
    int num1 =0;
    int num2 =0;
    double result =0;
    char operator;
    int radius;
    double circlearea;

    public static final double Pi = 3.14; // static 이라 어디서든 쓰이는데 final 로 해야 값을 수정하거나 삭제를 할 수 없기때문에.

    public double calculateCircleArea(int radius){
        circlearea = radius * radius * Pi;
        return circlearea;

    }


    //생성자 구현. circleList 도 초기화 되도록 수정.2-7
    public Calculator() {
        doubleList =new ArrayList<>();
        circleList =new ArrayList<>();
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
        modOperator = new ModOperator();
        // 생성하면서 초기화!
    }

    // 삭제 기능 추가.
    public void removeResult(){
        doubleList.remove(0);
    }
    public void inquiryResult(){
        for(double list: doubleList){
            System.out.println(list);
        }
    }
    // 원의 넓이 조회하는 기능.
    public void inquirycircleResult(){
        for(double list: circleList){
            System.out.println(list);
        }
    }

    public ArrayList<Double> getDoubleList(){ //가져온다.
        return doubleList;
    }

    public void setDoubleList(ArrayList<Double> doubleList){ // 정한다.
        this.doubleList =doubleList;
    }
    // get, set 그대로 원의 넓이에 적용.

    public ArrayList<Double> getCircleList(){ //가져온다.
        return circleList;
    }

    public void setCircleList(ArrayList<Double> circleList){ // 정한다.
        this.circleList =circleList;
    }


    //반환 타입,결과값 double 로 변경.
    // 결과값 변수 초기화.

    // 연산 기호를 매개변수로 받아 사칙연산(+,-,*,/) 기능을 수행한 후 결과 값을 반환하는 메서드 4개 add , sub, mul , div

    public double addCalculate(int num1,char operator, int num2){
        result = num1 + num2;
        return result;
    }

    public double subCalculate(int num1,char operator, int num2){
        result = num1 - num2;
        return result;
    }

    public double mulCalculate(int num1,char operator, int num2){
        result = num1 * num2;
        return result;
    }

    public double divCalculate(int num1,char operator, int num2){
        if (num2 != 0){
        result = num1 / num2;
        return result;
        } else {
        throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }



    }
    public void addList(double result){
        doubleList.add(result);
    }
    //결과값 저장하는 곳 추가. 산술이랑 같음.
    public void addCircleList(){
        circleList.add(circlearea);
    }


                    //예외처리. 구글링 참고








}



//        switch (operator) {
//            // case 뒤에는 조건!! 변수에 따라 뒤에 result 값이 이렇게 계산되고, break 되도록 설정했습니다.
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                    //결과값을 아예 텍스트로 표현하고 싶지만 result 는 int result 로 선언했기 때문에 숫자로 입력했습니다.
//                    result = 999999999;
//                    break;
//                }
//                intList.add(result);
//                // 위에 값 중 예상된 값이 입력되지 않을 경우. ex. 기호 자리에 숫자입력.
//            default:
//                System.out.println("잘못 입력하셨습니다.");
//        switch ()
//        result = num1 +num2;


