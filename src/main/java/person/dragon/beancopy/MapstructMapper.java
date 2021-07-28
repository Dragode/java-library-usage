package person.dragon.beancopy;

import org.mapstruct.factory.Mappers;

public interface MapstructMapper {

    MapstructMapper INSTANCE = Mappers.getMapper(MapstructMapper.class);

    DestinationBean copy(SourceBean sourceBean);
}
