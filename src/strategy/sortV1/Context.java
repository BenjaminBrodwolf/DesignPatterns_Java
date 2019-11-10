package strategy.sortV1;

public class Context {

    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] numbers){
        sortStrategy.sort(numbers);
    }
}
