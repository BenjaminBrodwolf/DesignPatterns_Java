package strategy.sort;

public class SortMainTester {

    public static void main(String[] args) {
        SortStrategy merge = new MergeSort();
        SortStrategy quick = new QuickSort();
        SortStrategy heap = new HeapSort();

        Context context = new Context();

        context.setSortStrategy(new MergeSort());
        context.sort(null);

        context.setSortStrategy(new QuickSort());
        context.sort(null);

        context.setSortStrategy(new HeapSort());
        context.sort(null);

    }


}
