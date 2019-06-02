import java.util.*;

public class Main {
    public static void main(String[] args) {
        Widget widget1 = new Widget(3,2);
        Widget widget2 = new Widget(2,4);
        Widget widget3 = new Widget(3,6);
        Widget widget4 = new Widget(1,8);
        Widget widget5 = new Widget(5,10);
        Widget widget6 = new Widget(1,12);

        List<Widget> list = new ArrayList<>();
        list.add(widget1);
        list.add(widget2);
        list.add(widget3);
        list.add(widget4);
        list.add(widget5);
        list.add(widget6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
