package ru.tsystems.tchallenge.service.domain.event.series;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-27T17:06:25+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class EventSeriesConverterImpl implements EventSeriesConverter {

    @Override
    public EventSeries toDto(EventSeriesDocument eventSeriesDocument) {
        if ( eventSeriesDocument == null ) {
            return null;
        }

        EventSeries eventSeries = new EventSeries();

        eventSeries.setId( eventSeriesDocument.getId() );
        eventSeries.setCaption( eventSeriesDocument.getCaption() );
        eventSeries.setDescription( eventSeriesDocument.getDescription() );
        List<String> list = eventSeriesDocument.getEventIds();
        if ( list != null ) {
            eventSeries.setEventIds( new ArrayList<String>( list ) );
        }

        return eventSeries;
    }
}
