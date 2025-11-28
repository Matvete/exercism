class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation)
    {
        String calculation = operand1 +  " operation " + operand2 + " = result";
        switch (operation)
        {
            case "+":
            {
                int result = operand1 + operand2;
                calculation = calculation.replace("operation","+")
                        .replace("result",result + "");
                break;
            }
            case "*":
            {
                int result = operand1 * operand2;
                calculation = calculation.replace("operation","*")
                        .replace("result",result + "");
                break;
            }
            case "/":
            {
                try
                {
                    int result = operand1 / operand2;
                    calculation = calculation.replace("operation","/")
                            .replace("result",result + "");
                    break;
                } catch (ArithmeticException error)
                {
                    throw new IllegalOperationException("Division by zero is not allowed",error);
                }

            }
            case null:
            {
                throw new IllegalArgumentException("Operation cannot be null");
            }
            case "":
            {
                throw new IllegalArgumentException("Operation cannot be empty");
            }
            default:
            {
                throw new IllegalOperationException("Operation '"+ operation +"' does not exist");
            }
        }
        return calculation;
    }

}
