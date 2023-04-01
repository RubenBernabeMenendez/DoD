package com.dod.DodService.Challenge;

import com.dod.DodData.model.Challenge.ChallengeType;

import java.util.List;

public interface ChallengeTypeService {

    ChallengeType getById(Long challengeTypeId);

    List<ChallengeType> getByChallengeEntityTypeId(Long challengeEntityTypeId);

    List<ChallengeType> getAll();
}
