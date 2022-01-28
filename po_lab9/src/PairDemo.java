public class PairDemo {

    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> para1 = new Pair<>(words[0], words[1]);
        System.out.println("pierwszy element = " + para1.getFirst());
        System.out.println("drugi element = " + para1.getSecond());
        para1.swap();
        System.out.println("pierwszy element pary po swapie = " + para1.getFirst());
        System.out.println("drugi element pary po swapie = " + para1.getSecond());

        System.out.println("\n");
        PairUtil<String> parautil1 = new PairUtil<>(para1.getFirst(), para1.getSecond());
        System.out.println("pierwszy element paryutil przed swapem = " + parautil1.getFirst());
        System.out.println("drugi element paryutil przed swapem = " + parautil1.getSecond());
        Pair<String> parautil2 = PairUtil.swap(para1);
        System.out.println("pierwszy element paryutil po swapie = " + parautil2.getFirst());
        System.out.println("drugi element paryutil po swapie = " + parautil2.getSecond());

    }
}

