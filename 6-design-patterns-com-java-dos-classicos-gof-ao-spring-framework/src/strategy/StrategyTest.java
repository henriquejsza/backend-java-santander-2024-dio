public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.performAction();

        context.setStrategy(new ConcreteStrategyB());
        context.performAction();
    }
}
