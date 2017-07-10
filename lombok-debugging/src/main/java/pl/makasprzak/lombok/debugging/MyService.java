package pl.makasprzak.lombok.debugging;

public class MyService {
    public String doSomething(MysteriousPojo mysteriousPojo) {
        return mysteriousPojo.getWhoUsesMe();
    }
}
