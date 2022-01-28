import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {

    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab){

        // loop method
//        ArrayList<T> tab2 = new ArrayList<>(tab.size());
//        int i = 0;
//        for(T t: tab){
//            tab2.add(i, tab.get(i));
//            i++;
//        }
        // copy method
        ArrayList<T> tab2 = new ArrayList<>(tab);
        Collections.sort(tab2);
        return tab2.equals(tab);
    }


    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T searchingObject){

        // available method in Collections can help too :
        // return Collections.binarySearch(tab, searchingObject);

        ArrayList<T> tab2 = new ArrayList<>(tab);
        Collections.sort(tab2);

        int left = 0;
        int right = tab2.size() - 1;
        int searchingIndex = 0;

        while(left <= right){
            int mid = left + ((right-left) / 2);
            if (tab.get(mid).equals(searchingObject)) {
                searchingIndex = mid;
            }
            // moving LEFT to the right
            if(tab.get(mid).compareTo(searchingObject)<0) {
                left = mid + 1;
            }
            // moving RIGHT to the left
            else{
                right = mid - 1;
            }
        }
        return searchingIndex;
    }


    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab) {

        int n = tab.size();

        // FINDING SMALLEST ELEMENT
        for (int i = 0; i < n - 1; i++) {
            int minimum_index = i;
            for (int j = i + 1; j < n; j++)
                if (tab.get(j).compareTo(tab.get(minimum_index)) < 0)
                    minimum_index = j;
            T temp = tab.get(minimum_index);
            // NOW SWAPPING POSITIONS
            // setting bigger element on position of minimum
            tab.set(minimum_index, tab.get(i));
            // setting minimum on correct position
            tab.set(i, temp);

            // instead of doin' it manually, there is available method in Collections
            // Collections.swap(tab, minimum_index, i);


        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> tab) {

        if(tab == null) {
            return ;
        }

        if(tab.size() > 1)
        {
            // initiating middle of tab
            int mid = tab.size() / 2;

            // filling left section of tab
            ArrayList<T> left = new ArrayList<>(tab.size() / 2);
            for(int i = 0; i < mid; i++)
            {
                left.add(i, tab.get(i));
            }

            // filling right section of tab
            ArrayList<T> right = new ArrayList<>(tab.size() - mid);
            for(int i = mid; i < tab.size(); i++)
            {
                right.add(i - mid, tab.get(i));
            }

            // executing the same functions on left and right section (recursion)
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.size() && j < right.size())
            {
                if(left.get(i).compareTo(right.get(j)) < 0)
                {
                    tab.set(k, left.get(i));
                    i++;
                }
                else
                {
                    tab.set(k, right.get(j));
                    j++;
                }
                k++;
            }

            while(i < left.size())
            {
                tab.set(k, left.get(i));
                i++;
                k++;
            }
            while(j < right.size())
            {
                tab.set(k, right.get(j));
                j++;
                k++;
            }
        }
    }

}
