public class Calculator {
    int a;
    int b;
    char action;
    String res;

    public static void printCalc() {
        System.out.println("This is a calculator");
    }

//       public void calc(int a, int b, char action){
//        switch (action){
//            case '+': res = String.valueOf(a + b); break;
//            case '-': res = String.valueOf(a - b); break;
//            case '*': res = String.valueOf(a * b); break;
//            case '/':
//                if(b==0) {
//                    System.out.println("divideByZero");
//                    break;
//                }else {
//
//                    res = String.valueOf(a / b);
//                    break;
//                }
//
//            default:
//                System.out.println("WRONG ACTION!");
//                return;
//        }
//       System.out.println(res);
//    }
    public void calc() {
        switch (this.action) {
            case '+':
                res = String.valueOf(this.a + this.b);
                break;
            case '-':
                res = String.valueOf(this.a - this.b);
                break;
            case '*':
                res = String.valueOf(this.a * this.b);
                break;
            case '/':
                if (this.b == 0) {
                    System.out.println("divideByZero");
                    break;
                } else {

                    res = String.valueOf(this.a / this.b);
                    break;
                }

            default:
                System.out.println("WRONG ACTION!");
                return;
        }
        System.out.println(res);
    }
}
