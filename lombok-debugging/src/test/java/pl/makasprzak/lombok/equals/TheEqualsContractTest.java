package pl.makasprzak.lombok.equals;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TheEqualsContractTest {

    @Test
    public void shouldNotBeEqual_right() throws Exception {
        Person maciej = new Person();
        maciej.setName("Maciej");
        maciej.setLastName("Kasprzak");

        Person pawel = new Person();
        pawel.setName("Pawel");
        pawel.setLastName("Kasprzak");

        assertThat(maciej).isNotEqualTo(pawel);
    }
}