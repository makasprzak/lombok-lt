package pl.makasprzak.lombok.sneaky;

import lombok.SneakyThrows;

import java.util.Arrays;

public class NastyThrower {

    public void tryToCatch() {
        try {
            thisOneThrowsChecked();
        } catch (Exception e) {
            System.out.println("Voila");
        }
    }

    public void thisOneWouldLikeToTrySomeLambda() {
        Arrays.asList(1,2,3).forEach(any -> thisOneThrowsChecked());
    }

    @SneakyThrows
    public void thisOneThrowsChecked() {
        throw new Exception("Surprize!");
    }
}
