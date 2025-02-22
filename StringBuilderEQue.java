public class StringBuilderEQue{

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ayush");
        System.out.println(sb); 

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'P');
        System.out.println(sb); 

        sb.insert(1, 'i');
        System.out.println(sb);

        sb.delete(0, 4);
        System.out.println(sb);

        sb.append("i");
        sb.append("v");
        sb.append("a");
        sb.append("m");
        System.out.println(sb);
        System.out.println(sb.length());

        sb.reverse();
        System.out.println(sb);
    }
}
