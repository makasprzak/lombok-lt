package pl.makasprzak.lombok.debugging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MysteriousPojo {
    private String whoUsesMe;
}
