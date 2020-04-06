import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;

public class T {
    String a = "123456";
    public static void main(String[] args) {
        T t = new T();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
        //System.out.println(GraphLayout.parseInstance(t).totalSize());

        //查看对象外部信息
        System.out.println(GraphLayout.parseInstance(t).toPrintable());

        synchronized (t){
            System.out.println(ClassLayout.parseInstance(t).toPrintable());
        }

    }
}
