import com.designpatterns.singleton.MyLogger;
import com.designpatterns.singleton.ThreadBar;
import com.designpatterns.singleton.ThreadFoo;

public class Main {

    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
}