package pl.makasprzak.lombok.sonar;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    @Test
    public void testUser() throws Exception {
        User user = new User();
        user.setName("Maciej");
        user.setLastName("Kasprzak");
        user.setAge(18);

        assertThat(user.getName()).isEqualTo("Maciej");
        assertThat(user.getLastName()).isEqualTo("Kasprzak");
        assertThat(user.getAge()).isLessThan(40);
    }
}