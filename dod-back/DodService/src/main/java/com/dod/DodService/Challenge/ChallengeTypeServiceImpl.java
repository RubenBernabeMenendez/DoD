package com.dod.DodService.Challenge;

import com.dod.DodData.model.Challenge.ChallengeType;
import com.dod.DodData.repository.Challenge.ChallengeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeTypeServiceImpl implements ChallengeTypeService {

    @Autowired
    ChallengeTypeRepository challengeTypeRepository;

    @Override
    public ChallengeType getById(Long challengeTypeId) {
        return this.challengeTypeRepository.findByChallengeTypeId(challengeTypeId);
    }

    @Override
    public List<ChallengeType> getByChallengeEntityTypeId(Long challengeEntityTypeId) {
        return this.challengeTypeRepository.findByChallengeEntityType_ChallengeEntityTypeId(challengeEntityTypeId);
    }

    @Override
    public List<ChallengeType> getAll() {
        return this.challengeTypeRepository.findAll();
    }
}
