package pl.makasprzak.lombok.mapstruct;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

public class SourceTargetMapperTest {

    @Test
    public void testMapper() throws Exception {
        assertThat(Mappers.getMapper(SourceTargetMapper.class).toTarget(
                    Source.builder()
                        .sourceField("some-value")
                        .build()))
                .isEqualTo(
                    Target.builder()
                        .targetField("some-value")
                        .build());
    }
}