package ru.tsystems.tchallenge.service.domain.account;

import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ru.tsystems.tchallenge.service.domain.account.AccountPersonalityDocument.AccountPersonalityDocumentBuilder;
import ru.tsystems.tchallenge.service.domain.account.ParticipantPersonalityDocument.ParticipantPersonalityDocumentBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-27T17:06:25+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class AccountConverterImpl implements AccountConverter {

    @Override
    public Account toDto(AccountDocument accountDocument) {
        if ( accountDocument == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( accountDocument.getId() );
        account.setEmail( accountDocument.getEmail() );
        account.setPasswordHash( accountDocument.getPasswordHash() );
        account.setCategory( accountDocument.getCategory() );
        Set<AccountRole> set = accountDocument.getRoles();
        if ( set != null ) {
            account.setRoles( new HashSet<AccountRole>( set ) );
        }
        account.setPersonality( toPersonality( accountDocument.getPersonality() ) );
        account.setParticipantPersonality( toParticipantPersonality( accountDocument.getParticipantPersonality() ) );
        account.setStatus( accountDocument.getStatus() );
        account.setRegisteredAt( accountDocument.getRegisteredAt() );
        account.setVkId( accountDocument.getVkId() );

        return account;
    }

    @Override
    public Account toDtoShort(AccountDocument accountDocument) {
        if ( accountDocument == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( accountDocument.getId() );
        account.setEmail( accountDocument.getEmail() );
        account.setCategory( accountDocument.getCategory() );
        Set<AccountRole> set = accountDocument.getRoles();
        if ( set != null ) {
            account.setRoles( new HashSet<AccountRole>( set ) );
        }
        account.setPersonality( toPersonality( accountDocument.getPersonality() ) );
        account.setStatus( accountDocument.getStatus() );
        account.setVkId( accountDocument.getVkId() );

        return account;
    }

    @Override
    public Account toMgmtDto(AccountDocument accountDocument) {
        if ( accountDocument == null ) {
            return null;
        }

        Account account = new Account();

        account.setId( accountDocument.getId() );
        account.setEmail( accountDocument.getEmail() );
        account.setCategory( accountDocument.getCategory() );
        Set<AccountRole> set = accountDocument.getRoles();
        if ( set != null ) {
            account.setRoles( new HashSet<AccountRole>( set ) );
        }
        account.setPersonality( toPersonality( accountDocument.getPersonality() ) );
        account.setParticipantPersonality( toParticipantPersonality( accountDocument.getParticipantPersonality() ) );
        account.setStatus( accountDocument.getStatus() );
        account.setRegisteredAt( accountDocument.getRegisteredAt() );
        account.setVkId( accountDocument.getVkId() );

        return account;
    }

    @Override
    public AccountPersonality toPersonality(AccountPersonalityDocument accountPersonalityDocument) {
        if ( accountPersonalityDocument == null ) {
            return null;
        }

        AccountPersonality accountPersonality = new AccountPersonality();

        accountPersonality.setFirstname( accountPersonalityDocument.getFirstname() );
        accountPersonality.setLastname( accountPersonalityDocument.getLastname() );
        accountPersonality.setMiddlename( accountPersonalityDocument.getMiddlename() );
        accountPersonality.setQuickname( accountPersonalityDocument.getQuickname() );

        return accountPersonality;
    }

    @Override
    public AccountPersonalityDocument fromPersonality(AccountPersonality accountPersonality) {
        if ( accountPersonality == null ) {
            return null;
        }

        AccountPersonalityDocumentBuilder accountPersonalityDocument = AccountPersonalityDocument.builder();

        accountPersonalityDocument.firstname( accountPersonality.getFirstname() );
        accountPersonalityDocument.lastname( accountPersonality.getLastname() );
        accountPersonalityDocument.middlename( accountPersonality.getMiddlename() );
        accountPersonalityDocument.quickname( accountPersonality.getQuickname() );

        return accountPersonalityDocument.build();
    }

    @Override
    public ParticipantPersonality toParticipantPersonality(ParticipantPersonalityDocument document) {
        if ( document == null ) {
            return null;
        }

        ParticipantPersonality participantPersonality = new ParticipantPersonality();

        participantPersonality.setEssay( document.getEssay() );
        participantPersonality.setLinkedin( document.getLinkedin() );
        participantPersonality.setHh( document.getHh() );
        participantPersonality.setGithub( document.getGithub() );
        participantPersonality.setBitbucket( document.getBitbucket() );
        participantPersonality.setWebsite( document.getWebsite() );

        return participantPersonality;
    }

    @Override
    public ParticipantPersonalityDocument fromParticipantPersonality(ParticipantPersonality invoice) {
        if ( invoice == null ) {
            return null;
        }

        ParticipantPersonalityDocumentBuilder participantPersonalityDocument = ParticipantPersonalityDocument.builder();

        participantPersonalityDocument.essay( invoice.getEssay() );
        participantPersonalityDocument.linkedin( invoice.getLinkedin() );
        participantPersonalityDocument.hh( invoice.getHh() );
        participantPersonalityDocument.github( invoice.getGithub() );
        participantPersonalityDocument.bitbucket( invoice.getBitbucket() );
        participantPersonalityDocument.website( invoice.getWebsite() );

        return participantPersonalityDocument.build();
    }
}
