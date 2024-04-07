package strings;

public class String01Creation {
    public static void main(String[] args) {
        String s1 = "Aditya Kalambe";// stored in string constant pool
        String s2 = new String("Aditya Kalambe");// Stored in heap memory
        System.out.println(s1);
        System.out.println(s2);
    }
}
