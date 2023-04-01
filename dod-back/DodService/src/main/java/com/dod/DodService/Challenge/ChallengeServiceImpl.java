package com.dod.DodService.Challenge;

import com.dod.DodData.model.Challenge.Challenge;
import com.dod.DodData.repository.Challenge.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeServiceImpl implements ChallengeService {

    @Autowired
    ChallengeRepository challengeRepository;

    @Override
    public Challenge getById(Long challengeId) {
        return this.challengeRepository.findByChallengeId(challengeId);
    }

    @Override
    public List<Challenge> getByChallengeTypeId(Long challengeTypeId) {
        return this.challengeRepository.findAllByChallengeType_ChallengeTypeId(challengeTypeId);
    }

    @Override
    public List<Challenge> getAll() {
        return this.challengeRepository.findAll();
    }
}
