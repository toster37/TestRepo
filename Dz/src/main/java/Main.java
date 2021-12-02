public class Main {

    public static void main(String[] args){
        Object a = new Object();
        Box box = new Box(15, 20);
        Integer s = (Integer) box.objects[0];
        Integer s1 = (Integer) box.objects[1];
        System.out.println(s);
    }

}
