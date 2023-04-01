package com.dod.DodData.repository.Challenge;

import com.dod.DodData.model.Challenge.ChallengeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeTypeRepository extends JpaRepository<ChallengeType, Long>, CrudRepository<ChallengeType, Long> {

    ChallengeType findByChallengeTypeId(Long challengeTypeId);

    List<ChallengeType> findByChallengeEntityType_ChallengeEntityTypeId(Long challengeEntityTypeId);

    List<ChallengeType> findAll();
}
