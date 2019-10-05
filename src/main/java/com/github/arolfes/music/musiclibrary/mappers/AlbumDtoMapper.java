package com.github.arolfes.music.musiclibrary.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.github.arolfes.music.musiclibrary.dto.AlbumDto;
import com.github.arolfes.music.musiclibrary.entitites.Album;

@Mapper(componentModel = "spring")
public interface AlbumDtoMapper {

  AlbumDtoMapper MAPPER = Mappers.getMapper(AlbumDtoMapper.class);    
  
  AlbumDto toAlbumDto(Album album) throws RuntimeException;
}
