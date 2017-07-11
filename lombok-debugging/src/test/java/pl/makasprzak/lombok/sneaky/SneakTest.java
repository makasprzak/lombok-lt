package pl.makasprzak.lombok.sneaky;

import org.junit.Test;

public class SneakTest {

    @Test(expected = Exception.class)
    public void noThrowsInSignatureYetStillCompiles() {
        Sneak.sneakyThrow(new Exception());
    }

}