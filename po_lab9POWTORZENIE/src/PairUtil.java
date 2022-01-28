public class PairUtil<T> extends Pair<T>{

    public PairUtil(T first, T second) {
        super(first, second);
    }

    public static <T> Pair<T> swap(Pair<T> p){
        p.swapper();
        return p;
    }
}
