public class PairUtil<T> {

    private T first;
    private T second;

    public PairUtil() {
        first = null;
        second = null;
    }

    public PairUtil (T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }

    public static <T>Pair<T> swap(Pair<T> pair1){
        pair1.swap();
        Pair<T> new_pair1 = new Pair<>(pair1.getFirst(), pair1.getSecond());
        return new_pair1;
    }
}
