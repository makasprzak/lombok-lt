package pl.makasprzak.lombok.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface SourceTargetMapper {
    @Mapping(source = "sourceField", target = "targetField")
    Target toTarget(Source source);
}
