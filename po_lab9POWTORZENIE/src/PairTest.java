public class PairTest {

    public static void main(String[] args) {

        Pair<Integer> para1 = new Pair<>(1, 4);
        System.out.println(para1.getFirst());
        System.out.println(para1.getSecond());

        para1.swapper();

        System.out.println("\n" + para1.getFirst());
        System.out.println(para1.getSecond());

        Pair<Integer> para3 = PairUtil.swap(para1);
        System.out.println("\n" + para3.getFirst());
        System.out.println(para3.getSecond());

    }
}
