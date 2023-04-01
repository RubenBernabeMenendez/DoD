package com.dod.DodWeb.Challenge;

import com.dod.DodData.model.Challenge.ChallengeType;
import com.dod.DodService.Challenge.ChallengeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChallengeTypeController {

    @Autowired
    ChallengeTypeService challengeTypeService;

    @RequestMapping(value = "/challengeTypes", method = RequestMethod.GET)
    public ResponseEntity<List<ChallengeType>> getAllUser() {

        return new ResponseEntity<>(challengeTypeService.getAll(), HttpStatusCode.valueOf(200));
    }
}
