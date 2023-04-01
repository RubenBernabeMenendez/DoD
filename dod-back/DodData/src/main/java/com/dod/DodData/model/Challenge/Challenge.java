package com.dod.DodData.model.Challenge;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "CHALLENGE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SequenceGenerator(name = "CHALLENGE_SEQ", sequenceName = "CHALLENGE_SEQ",allocationSize=1)
public class Challenge implements Serializable {

  @Id
  @GeneratedValue(generator = "CHALLENGE_SEQ", strategy = GenerationType.SEQUENCE)
  @Column(name = "CHALLENGE_ID")
  private Long challengeId;

  @OneToOne
  @JoinColumn(name = "CHALLENGE_TYPE_ID")
  private ChallengeType challengeType;

  @Column(name = "NAME")
  private String name; 

  @Column(name = "DESCRIPTION")
  private String description; 

  @Column(name = "LEVEL")
  private Long level;

  @Column(name = "ACTIVE")
  private String active;

  @Column(name = "VISIBLE")
  private String visible;

}
