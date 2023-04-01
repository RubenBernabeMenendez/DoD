package com.dod.DodData.repository.Challenge;

import com.dod.DodData.model.Challenge.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long>, CrudRepository<Challenge, Long> {

    Challenge findByChallengeId(Long challengeId);

    List<Challenge> findAllByChallengeType_ChallengeTypeId(Long challengeTypeId);

    List<Challenge> findAll();
}
