package strategy.sortV1;

public class SortMainTester {

    public static void main(String[] args) {
        SortStrategy merge = new MergeSort();
        SortStrategy quick = new QuickSort();
        SortStrategy heap = new HeapSort();

        Context context = new Context();


        context.setSortStrategy(merge);
        context.sort(null);


        context.setSortStrategy(heap);
        context.sort(null);

        context.setSortStrategy(quick);
        context.sort(null);

    }


}
