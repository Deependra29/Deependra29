package multithreading.collableWithMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    ExecutorService executorService;

    public MergeSorter(List<Integer> list, ExecutorService executorService) {
        this.arrayToSort = list;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        List<Integer> sortedArray;
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        } else {
            int mid = arrayToSort.size() / 2;

            List<Integer> leftArray = new ArrayList<>();
            List<Integer> rightArray = new ArrayList<>();

            for (int i = 0; i < mid; i++) {
                leftArray.add(arrayToSort.get(i));
            }
            for (int j = mid; j < arrayToSort.size(); j++) {
                rightArray.add(arrayToSort.get(j));
            }
            MergeSorter leftSorter = new MergeSorter(leftArray, executorService);
            MergeSorter rightSorter = new MergeSorter(rightArray, executorService);

//            List<Integer> leftSorterArray = leftSorter.call();
//            List<Integer> rightSorterArray = rightSorter.call();

            Future<List<Integer>> leftSorterArray  = executorService.submit(leftSorter);
            Future<List<Integer>> rightSorterArray = executorService.submit(rightSorter);

            sortedArray = new ArrayList<>();

            int i = 0, j = 0;
            while (i < leftSorterArray.get().size() && j < rightSorterArray.get().size()) {
                if (leftSorterArray.get().get(i) <= rightSorterArray.get().get(j)) {
                    sortedArray.add(leftSorterArray.get().get(i));
                    i++;
                } else {
                    sortedArray.add(rightSorterArray.get().get(j));
                    j++;
                }
            }
            while (i < leftSorterArray.get().size()) {
                sortedArray.add(leftSorterArray.get().get(i));
                i++;
            }
            while (j < rightSorterArray.get().size()) {
                sortedArray.add(rightSorterArray.get().get(j));
                j++;
            }
        }
        return sortedArray;
    }
}
