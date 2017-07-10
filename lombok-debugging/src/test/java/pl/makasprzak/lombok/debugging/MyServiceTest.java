package pl.makasprzak.lombok.debugging;

import org.junit.Test;

public class MyServiceTest {
    @Test
    public void debugMe() throws Exception {
        MysteriousPojo mysteriousPojo = new MysteriousPojo();
        mysteriousPojo.setWhoUsesMe("Maciek");
        System.out.println(new MyService().doSomething(mysteriousPojo));
    }

    @Test
    public void howAboutAConstructor() throws Exception {
        new MysteriousPojo("Gotcha");
    }
}