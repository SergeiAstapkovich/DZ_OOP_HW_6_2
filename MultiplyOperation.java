package OOP_HW_6_2;


public class MultiplyOperation implements OperationStrategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}