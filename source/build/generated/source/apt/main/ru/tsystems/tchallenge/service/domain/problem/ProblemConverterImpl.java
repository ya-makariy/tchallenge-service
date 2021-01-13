package ru.tsystems.tchallenge.service.domain.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ru.tsystems.tchallenge.service.domain.problem.image.ProblemImage;
import ru.tsystems.tchallenge.service.domain.problem.image.ProblemImage.ProblemImageBuilder;
import ru.tsystems.tchallenge.service.domain.problem.image.ProblemImageDocument;
import ru.tsystems.tchallenge.service.domain.problem.option.ProblemOption;
import ru.tsystems.tchallenge.service.domain.problem.option.ProblemOptionDocument;
import ru.tsystems.tchallenge.service.domain.problem.snippet.ProblemSnippet;
import ru.tsystems.tchallenge.service.domain.problem.snippet.ProblemSnippetDocument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-27T17:06:26+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class ProblemConverterImpl implements ProblemConverter {

    @Override
    public Problem toDto(ProblemDocument problemDocument) {
        if ( problemDocument == null ) {
            return null;
        }

        Problem problem = new Problem();

        problem.setId( problemDocument.getId() );
        List<ProblemCategory> list = problemDocument.getCategories();
        if ( list != null ) {
            problem.setCategories( new ArrayList<ProblemCategory>( list ) );
        }
        problem.setComplexity( problemDocument.getComplexity() );
        problem.setDifficulty( problemDocument.getDifficulty() );
        problem.setExpectation( problemDocument.getExpectation() );
        problem.setImages( problemImageDocumentListToProblemImageList( problemDocument.getImages() ) );
        problem.setIntroduction( problemDocument.getIntroduction() );
        problem.setOptions( problemOptionDocumentListToProblemOptionList( problemDocument.getOptions() ) );
        problem.setCodeExpectationItems( problemDocument.getCodeExpectationItems() );
        problem.setQuestion( problemDocument.getQuestion() );
        problem.setCaption( problemDocument.getCaption() );
        problem.setSnippets( problemSnippetDocumentListToProblemSnippetList( problemDocument.getSnippets() ) );
        problem.setStatus( problemDocument.getStatus() );
        Set<String> set = problemDocument.getTagIds();
        if ( set != null ) {
            problem.setTagIds( new HashSet<String>( set ) );
        }

        return problem;
    }

    @Override
    public Problem toDtoClassified(ProblemDocument document) {
        if ( document == null ) {
            return null;
        }

        Problem problem = new Problem();

        problem.setId( document.getId() );
        List<ProblemCategory> list = document.getCategories();
        if ( list != null ) {
            problem.setCategories( new ArrayList<ProblemCategory>( list ) );
        }
        problem.setComplexity( document.getComplexity() );
        problem.setDifficulty( document.getDifficulty() );
        problem.setExpectation( document.getExpectation() );
        problem.setImages( problemImageDocumentListToProblemImageList( document.getImages() ) );
        problem.setIntroduction( document.getIntroduction() );
        problem.setOptions( problemOptionDocumentListToProblemOptionList( document.getOptions() ) );
        problem.setCodeExpectationItems( document.getCodeExpectationItems() );
        problem.setQuestion( document.getQuestion() );
        problem.setCaption( document.getCaption() );
        problem.setSnippets( problemSnippetDocumentListToProblemSnippetList( document.getSnippets() ) );
        problem.setStatus( document.getStatus() );
        Set<String> set = document.getTagIds();
        if ( set != null ) {
            problem.setTagIds( new HashSet<String>( set ) );
        }

        return problem;
    }

    @Override
    public ProblemImageDocument fromProblemImage(ProblemImage problemImage) {
        if ( problemImage == null ) {
            return null;
        }

        ProblemImageDocument problemImageDocument = new ProblemImageDocument();

        problemImageDocument.setUrl( problemImage.getUrl() );
        problemImageDocument.setName( problemImage.getName() );
        problemImageDocument.setFormat( problemImage.getFormat() );
        problemImageDocument.setHeight( problemImage.getHeight() );
        problemImageDocument.setWidth( problemImage.getWidth() );

        return problemImageDocument;
    }

    protected ProblemImage problemImageDocumentToProblemImage(ProblemImageDocument problemImageDocument) {
        if ( problemImageDocument == null ) {
            return null;
        }

        ProblemImageBuilder problemImage = ProblemImage.builder();

        problemImage.url( problemImageDocument.getUrl() );
        problemImage.name( problemImageDocument.getName() );
        problemImage.format( problemImageDocument.getFormat() );
        problemImage.height( problemImageDocument.getHeight() );
        problemImage.width( problemImageDocument.getWidth() );

        return problemImage.build();
    }

    protected List<ProblemImage> problemImageDocumentListToProblemImageList(List<ProblemImageDocument> list) {
        if ( list == null ) {
            return null;
        }

        List<ProblemImage> list1 = new ArrayList<ProblemImage>( list.size() );
        for ( ProblemImageDocument problemImageDocument : list ) {
            list1.add( problemImageDocumentToProblemImage( problemImageDocument ) );
        }

        return list1;
    }

    protected ProblemOption problemOptionDocumentToProblemOption(ProblemOptionDocument problemOptionDocument) {
        if ( problemOptionDocument == null ) {
            return null;
        }

        ProblemOption problemOption = new ProblemOption();

        problemOption.setIndex( problemOptionDocument.getIndex() );
        problemOption.setTextcode( problemOptionDocument.getTextcode() );
        problemOption.setContent( problemOptionDocument.getContent() );
        problemOption.setCorrect( problemOptionDocument.getCorrect() );

        return problemOption;
    }

    protected List<ProblemOption> problemOptionDocumentListToProblemOptionList(List<ProblemOptionDocument> list) {
        if ( list == null ) {
            return null;
        }

        List<ProblemOption> list1 = new ArrayList<ProblemOption>( list.size() );
        for ( ProblemOptionDocument problemOptionDocument : list ) {
            list1.add( problemOptionDocumentToProblemOption( problemOptionDocument ) );
        }

        return list1;
    }

    protected ProblemSnippet problemSnippetDocumentToProblemSnippet(ProblemSnippetDocument problemSnippetDocument) {
        if ( problemSnippetDocument == null ) {
            return null;
        }

        ProblemSnippet problemSnippet = new ProblemSnippet();

        problemSnippet.setContent( problemSnippetDocument.getContent() );
        problemSnippet.setStyle( problemSnippetDocument.getStyle() );

        return problemSnippet;
    }

    protected List<ProblemSnippet> problemSnippetDocumentListToProblemSnippetList(List<ProblemSnippetDocument> list) {
        if ( list == null ) {
            return null;
        }

        List<ProblemSnippet> list1 = new ArrayList<ProblemSnippet>( list.size() );
        for ( ProblemSnippetDocument problemSnippetDocument : list ) {
            list1.add( problemSnippetDocumentToProblemSnippet( problemSnippetDocument ) );
        }

        return list1;
    }
}
