package pl.makasprzak.lombok.sneaky;

import org.junit.Test;

public class NastyThrowerTest {

    @Test(expected = Exception.class)
    public void guessWhatWillBeTheExceptionType() {
        new NastyThrower().thisOneThrowsChecked();
    }

    @Test(expected = Exception.class)
    public void howAboutWithTheLambdaCase() {
        new NastyThrower().thisOneWouldLikeToTrySomeLambda();
    }

    @Test
    public void catchingIt() throws Exception {
        new NastyThrower().tryToCatch();
    }

}