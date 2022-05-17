public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int a, int b) {
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int a, int b) {
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }

    @Override
    public int sub(int a, int b) {
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result();
    }

    @Override
    public double div(int a, int b) {
        if (b == 0) throw new ArithmeticException("Деление на ноль запрещено");
        return target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result();
    }
}