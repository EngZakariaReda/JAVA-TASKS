public class Calulator {
    public String equation ;
    public char operator;
    public int index = -1 ;

    public void getOperatorIndex(){
        for (int i = 1 ; i < equation.length() ; i++ ){
            char character = equation.charAt(i);
            if (character == '+' || character == '-' || character == '*' || character == '/') {
                index = i;
                operator = equation.charAt(i);
                break;
            }
        }
    }

    public double getValue(){
        getOperatorIndex();
        double result ;

        double num1 = Double.parseDouble(equation.substring(0 , index));
        int num2 = Integer.parseInt(equation.substring(index + 1  ));

        switch (operator){
            case '*':
                result = num1 * num2 ;
                break;

            case '+':
                result = num1 + num2 ;
                break;

            case '-':
                result = num1 - num2 ;
                break;

            default:
                result = num1 / num2 ;
        }
        return result;
    }
}
