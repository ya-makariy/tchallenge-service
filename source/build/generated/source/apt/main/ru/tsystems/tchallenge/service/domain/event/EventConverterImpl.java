package ru.tsystems.tchallenge.service.domain.event;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ru.tsystems.tchallenge.service.domain.maturity.Maturity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-27T17:06:24+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class EventConverterImpl implements EventConverter {

    @Override
    public Event toDto(EventDocument eventDocument) {
        if ( eventDocument == null ) {
            return null;
        }

        Event event = new Event();

        event.setId( eventDocument.getId() );
        event.setPermalink( eventDocument.getPermalink() );
        event.setCaption( eventDocument.getCaption() );
        event.setDescription( eventDocument.getDescription() );
        event.setGreeting( eventDocument.getGreeting() );
        event.setValidFrom( eventDocument.getValidFrom() );
        event.setValidUntil( eventDocument.getValidUntil() );
        List<String> list = eventDocument.getNotifications();
        if ( list != null ) {
            event.setNotifications( new ArrayList<String>( list ) );
        }
        List<EventCongratulationMessage> list1 = eventDocument.getCongratulations();
        if ( list1 != null ) {
            event.setCongratulations( new ArrayList<EventCongratulationMessage>( list1 ) );
        }
        event.setReviewThreshold( eventDocument.getReviewThreshold() );
        List<Maturity> list2 = eventDocument.getMaturities();
        if ( list2 != null ) {
            event.setMaturities( new ArrayList<Maturity>( list2 ) );
        }
        List<String> list3 = eventDocument.getSpecializationPermalinks();
        if ( list3 != null ) {
            event.setSpecializationPermalinks( new ArrayList<String>( list3 ) );
        }
        event.setStatus( eventDocument.getStatus() );
        event.setNumberOfAttempts( eventDocument.getNumberOfAttempts() );
        Set<String> set = eventDocument.getTagIds();
        if ( set != null ) {
            event.setTagIds( new HashSet<String>( set ) );
        }
        event.setWhiteListOnly( eventDocument.getWhiteListOnly() );
        List<String> list4 = eventDocument.getEmails();
        if ( list4 != null ) {
            event.setEmails( new ArrayList<String>( list4 ) );
        }
        event.setSeriesId( eventDocument.getSeriesId() );

        return event;
    }

    @Override
    public Event toDtoShort(EventDocument eventDocument) {
        if ( eventDocument == null ) {
            return null;
        }

        Event event = new Event();

        event.setId( eventDocument.getId() );
        event.setPermalink( eventDocument.getPermalink() );
        event.setCaption( eventDocument.getCaption() );
        event.setReviewThreshold( eventDocument.getReviewThreshold() );
        event.setStatus( eventDocument.getStatus() );
        Set<String> set = eventDocument.getTagIds();
        if ( set != null ) {
            event.setTagIds( new HashSet<String>( set ) );
        }
        event.setWhiteListOnly( eventDocument.getWhiteListOnly() );
        List<String> list = eventDocument.getEmails();
        if ( list != null ) {
            event.setEmails( new ArrayList<String>( list ) );
        }
        event.setSeriesId( eventDocument.getSeriesId() );

        return event;
    }

    @Override
    public Event toDtoClassified(EventDocument eventDocument) {
        if ( eventDocument == null ) {
            return null;
        }

        Event event = new Event();

        event.setId( eventDocument.getId() );
        List<EventCongratulationMessage> list = eventDocument.getCongratulations();
        if ( list != null ) {
            event.setCongratulations( new ArrayList<EventCongratulationMessage>( list ) );
        }
        event.setReviewThreshold( eventDocument.getReviewThreshold() );

        return event;
    }
}
