package com.dod.DodService.Challenge;

import com.dod.DodData.model.Challenge.Challenge;

import java.util.List;

public interface ChallengeService {

    Challenge getById(Long challengeId);

    List<Challenge> getByChallengeTypeId(Long challengeTypeId);

    List<Challenge> getAll();
}
