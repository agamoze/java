import java.util.Vector;

class vector{
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<>();

        num.add(01);
        num.add(02);
        num.add(03);
        num.add(04);
        System.out.println("the vector is " + num);
        num.remove(3);
        System.out.println("the vector is " + num);
        System.out.println("the vector size is " + num.size());
        System.out.println("the vector elements which is at index 0 is " + num.get(0));
    }
}