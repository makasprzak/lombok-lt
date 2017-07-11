package pl.makasprzak.lombok.sneaky;

/**
 * http://www.mail-archive.com/javaposse@googlegroups.com/msg05984.html
 * http://www.philandstuff.com/2012/04/28/sneakily-throwing-checked-exceptions.html
 * http://docs.oracle.com/javase/specs/jls/se8/html/jls-18.html
 */
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
