

public class main {
    public static void main(String[] args) {

        Calculator.printCalc();
        Calculator calc = new Calculator();
//a.calc(5,0,'+');
        calc.a = 4;
        calc.b = 2;
        calc.action = '/';
        calc.calc();

    }
}
