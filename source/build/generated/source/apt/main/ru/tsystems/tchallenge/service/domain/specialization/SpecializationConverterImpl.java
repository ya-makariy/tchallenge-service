package ru.tsystems.tchallenge.service.domain.specialization;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ru.tsystems.tchallenge.service.domain.problem.ProblemCategory;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-27T17:06:25+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class SpecializationConverterImpl implements SpecializationConverter {

    @Override
    public Specialization toDto(SpecializationDocument specializationDocument) {
        if ( specializationDocument == null ) {
            return null;
        }

        Specialization specialization = new Specialization();

        specialization.setId( specializationDocument.getId() );
        specialization.setCaption( specializationDocument.getCaption() );
        specialization.setPermalink( specializationDocument.getPermalink() );
        List<ProblemCategory> list = specializationDocument.getProblemCategories();
        if ( list != null ) {
            specialization.setProblemCategories( new ArrayList<ProblemCategory>( list ) );
        }

        return specialization;
    }
}
