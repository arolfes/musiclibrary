package com.github.arolfes.music.musiclibrary.entitites;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="albums")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album {

  @Id
  private Long id;
  
  @Column
  private String name;

  @Column(name = "release_date")
  private Date releaseDate;
  
  @ManyToOne
  @JoinColumn(name = "artist_id")
  private Artist artist;
}
