package strategy.sort;

public class Context {

    private SortStrategy sortStrategy;

     void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

     void sort(int[] numbers){
        sortStrategy.sort(numbers);
    }
}
