package ru.tsystems.tchallenge.service.domain.workbook;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ru.tsystems.tchallenge.service.domain.workbook.assignment.Assignment;
import ru.tsystems.tchallenge.service.domain.workbook.assignment.AssignmentDocument;
import ru.tsystems.tchallenge.service.domain.workbook.assignment.code.CodeSolution;
import ru.tsystems.tchallenge.service.domain.workbook.assignment.code.CodeSolutionDocument;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-27T17:06:25+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class WorkbookConverterImpl extends WorkbookConverter {

    @Override
    public Workbook toDto(WorkbookDocument workbookDocument) {
        if ( workbookDocument == null ) {
            return null;
        }

        Workbook workbook = new Workbook();

        workbook.setAssignments( assignmentDocumentListToAssignmentList( workbookDocument.getAssignments() ) );
        workbook.setId( workbookDocument.getId() );
        workbook.setTextcode( workbookDocument.getTextcode() );
        workbook.setEventId( workbookDocument.getEventId() );
        workbook.setSpecializationPermalink( workbookDocument.getSpecializationPermalink() );
        workbook.setOwnerId( workbookDocument.getOwnerId() );
        workbook.setMaturity( workbookDocument.getMaturity() );
        workbook.setCreatedAt( workbookDocument.getCreatedAt() );
        workbook.setSubmittableUntil( workbookDocument.getSubmittableUntil() );
        workbook.setAssessedAt( workbookDocument.getAssessedAt() );
        workbook.setStatus( workbookDocument.getStatus() );
        workbook.setReviewed( workbookDocument.getReviewed() );
        workbook.setAvgScore( workbookDocument.getAvgScore() );

        setAssignmentIndices( workbook );

        return workbook;
    }

    @Override
    public Workbook toDtoShort(WorkbookDocument workbookDocument) {
        if ( workbookDocument == null ) {
            return null;
        }

        Workbook workbook = new Workbook();

        workbook.setId( workbookDocument.getId() );
        workbook.setEventId( workbookDocument.getEventId() );
        workbook.setOwnerId( workbookDocument.getOwnerId() );
        workbook.setCreatedAt( workbookDocument.getCreatedAt() );
        workbook.setSubmittableUntil( workbookDocument.getSubmittableUntil() );
        workbook.setAssessedAt( workbookDocument.getAssessedAt() );
        workbook.setStatus( workbookDocument.getStatus() );
        workbook.setAvgScore( workbookDocument.getAvgScore() );

        setAssignmentIndices( workbook );

        return workbook;
    }

    @Override
    public Workbook toClassifiedDto(WorkbookDocument workbookDocument) {
        if ( workbookDocument == null ) {
            return null;
        }

        Workbook workbook = new Workbook();

        workbook.setAssignments( assignmentDocumentListToAssignmentList1( workbookDocument.getAssignments() ) );
        workbook.setId( workbookDocument.getId() );
        workbook.setTextcode( workbookDocument.getTextcode() );
        workbook.setEventId( workbookDocument.getEventId() );
        workbook.setSpecializationPermalink( workbookDocument.getSpecializationPermalink() );
        workbook.setOwnerId( workbookDocument.getOwnerId() );
        workbook.setMaturity( workbookDocument.getMaturity() );
        workbook.setCreatedAt( workbookDocument.getCreatedAt() );
        workbook.setSubmittableUntil( workbookDocument.getSubmittableUntil() );
        workbook.setAssessedAt( workbookDocument.getAssessedAt() );
        workbook.setStatus( workbookDocument.getStatus() );
        workbook.setReviewed( workbookDocument.getReviewed() );
        workbook.setAvgScore( workbookDocument.getAvgScore() );

        setAssignmentIndices( workbook );

        return workbook;
    }

    @Override
    Assignment toAssignment(AssignmentDocument assignmentDocument) {
        if ( assignmentDocument == null ) {
            return null;
        }

        Assignment assignment = new Assignment();

        assignment.setProblem( problemFromId( assignmentDocument.getProblemId() ) );
        if ( assignmentDocument.getScore() != null ) {
            assignment.setScore( assignmentDocument.getScore().intValue() );
        }
        assignment.setScoreMax( assignmentDocument.getScoreMax() );
        assignment.setSolution( assignmentDocument.getSolution() );
        assignment.setCodeSolution( codeSolutionDocumentToCodeSolution( assignmentDocument.getCodeSolution() ) );

        return assignment;
    }

    @Override
    Assignment toAssignmentClassified(AssignmentDocument assignmentDocument) {
        if ( assignmentDocument == null ) {
            return null;
        }

        Assignment assignment = new Assignment();

        assignment.setProblem( problemClassifiedFromId( assignmentDocument.getProblemId() ) );
        if ( assignmentDocument.getScore() != null ) {
            assignment.setScore( assignmentDocument.getScore().intValue() );
        }
        assignment.setScoreMax( assignmentDocument.getScoreMax() );
        assignment.setSolution( assignmentDocument.getSolution() );
        assignment.setCodeSolution( codeSolutionDocumentToCodeSolution( assignmentDocument.getCodeSolution() ) );

        return assignment;
    }

    protected List<Assignment> assignmentDocumentListToAssignmentList(List<AssignmentDocument> list) {
        if ( list == null ) {
            return null;
        }

        List<Assignment> list1 = new ArrayList<Assignment>( list.size() );
        for ( AssignmentDocument assignmentDocument : list ) {
            list1.add( toAssignment( assignmentDocument ) );
        }

        return list1;
    }

    protected List<Assignment> assignmentDocumentListToAssignmentList1(List<AssignmentDocument> list) {
        if ( list == null ) {
            return null;
        }

        List<Assignment> list1 = new ArrayList<Assignment>( list.size() );
        for ( AssignmentDocument assignmentDocument : list ) {
            list1.add( toAssignmentClassified( assignmentDocument ) );
        }

        return list1;
    }

    protected CodeSolution codeSolutionDocumentToCodeSolution(CodeSolutionDocument codeSolutionDocument) {
        if ( codeSolutionDocument == null ) {
            return null;
        }

        CodeSolution codeSolution = new CodeSolution();

        codeSolution.setCode( codeSolutionDocument.getCode() );
        codeSolution.setLanguage( codeSolutionDocument.getLanguage() );
        codeSolution.setSubmissionId( codeSolutionDocument.getSubmissionId() );
        codeSolution.setLastSuccessfulSubmissionId( codeSolutionDocument.getLastSuccessfulSubmissionId() );

        return codeSolution;
    }
}
