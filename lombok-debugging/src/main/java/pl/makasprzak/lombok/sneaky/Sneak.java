package pl.makasprzak.lombok.sneaky;

public class Sneak {
    public static void sneakyThrow(Throwable t) {
        if ( t == null ) throw new NullPointerException("t");
        Sneak.sneakyThrow0(t);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void sneakyThrow0(Throwable t)
            throws T {
        throw (T)t;
    }
}
