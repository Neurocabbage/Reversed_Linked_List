public class Programm {
    public static void main(String[] args) {

        List list = new List();

        for (int i = 0; i < 6; i++) {
            int r = (int) (Math.random() * 100);
            Node node = new Node(r);
            if (i == 0) {
                list.head = node;
            } else {
                list.head.append(node);
            }
            list.tail = node;
        }
        System.out.println("Начальный список");
        System.out.println(list);
        System.out.println("Разворот списка");
        System.out.println(list.revert());

    }


}
