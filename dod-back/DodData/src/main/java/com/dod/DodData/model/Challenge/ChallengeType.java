package com.dod.DodData.model.Challenge;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "CHALLENGE_TYPE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SequenceGenerator(name = "CHALLENGE_TYPE_SEQ", sequenceName = "CHALLENGE_TYPE_SEQ",allocationSize=1)
public class ChallengeType implements Serializable {

  @Id
  @GeneratedValue(generator = "CHALLENGE_TYPE_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name = "CHALLENGE_TYPE_ID")
  private Long challengeTypeId; 

  @OneToOne
  @JoinColumn(name = "CHALLENGE_ENTITY_TYPE_ID")
  private ChallengeEntityType challengeEntityType;

  @Column(name = "NAME")
  private String name; 

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "ACTIVE")
  private String active;

  @Column(name = "VISIBLE")
  private String visible;

}
