package ru.tsystems.tchallenge.service.domain.tag;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-27T17:06:25+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class TagConverterImpl implements TagConverter {

    @Override
    public Tag toDto(TagDocument tagDocument) {
        if ( tagDocument == null ) {
            return null;
        }

        Tag tag = new Tag();

        tag.setId( tagDocument.getId() );
        tag.setCaption( tagDocument.getCaption() );

        return tag;
    }
}
