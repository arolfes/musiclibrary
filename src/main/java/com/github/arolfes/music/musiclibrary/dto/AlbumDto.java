package com.github.arolfes.music.musiclibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlbumDto {

  private long id;
  
  private String name;
  
  private String releaseDate;
}
