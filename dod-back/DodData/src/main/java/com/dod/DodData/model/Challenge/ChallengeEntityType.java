package com.dod.DodData.model.Challenge;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "CHALLENGE_ENTITY_TYPE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChallengeEntityType implements Serializable {

  @Id
  @Column(name = "CHALLENGE_ENTITY_TYPE_ID")
  private Long challengeEntityTypeId; 

  @Column(name = "NAME")
  private String name; 

  @Column(name = "DESCRIPTION")
  private String description; 

}
