public class Driver {

    public static void main(String[] args){

        StringComparison sc = new StringComparison();

        long start = System.nanoTime();
        System.out.println("ConcatString = " + sc.concatString('A', 10));
        System.out.println("Concat String took " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        System.out.println("ConcatString = " + sc.concatStringBuilder('A', 10));
        System.out.println("ConcatStringBuilder took " + (System.nanoTime() - start) + " ns");

    }

}
