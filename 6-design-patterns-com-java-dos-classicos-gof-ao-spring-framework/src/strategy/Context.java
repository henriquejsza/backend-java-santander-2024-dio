public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public void performAction() {
        strategy.execute();
    }
}
