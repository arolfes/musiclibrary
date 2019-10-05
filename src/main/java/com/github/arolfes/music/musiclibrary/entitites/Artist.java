package com.github.arolfes.music.musiclibrary.entitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="artists")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artist {

  @Id
  private Long id;
  
  @Column
  private String name;
}
