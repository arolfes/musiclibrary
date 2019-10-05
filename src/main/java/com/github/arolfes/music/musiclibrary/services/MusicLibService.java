package com.github.arolfes.music.musiclibrary.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import com.github.arolfes.music.musiclibrary.data.AlbumRepository;
import com.github.arolfes.music.musiclibrary.dto.AlbumDto;
import com.github.arolfes.music.musiclibrary.entitites.Album;
import com.github.arolfes.music.musiclibrary.mappers.AlbumDtoMapper;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MusicLibService {

  private AlbumRepository albumRepository;
  private AlbumDtoMapper albumMapper;

  public MusicLibService(AlbumRepository albumRepo, AlbumDtoMapper albumMapper) {
    this.albumRepository = albumRepo;
    this.albumMapper = albumMapper;
  }
  
  public AlbumDto findAlbumById(String id) {
    log.debug("search album by id {}", id);
    Optional<Album> album = albumRepository.findById(Long.valueOf(id));
    AlbumDto result = null;
    if (album.isPresent()) {
      result = albumMapper.toAlbumDto(album.get());
    }
    log.debug("search album by id {}, result {}", id, result);
    return result;
  }

  public List<AlbumDto> findAllAlbumsByName(String name) {
    log.debug("search all albums by name {}", name);
    List<Album> albums = albumRepository.findByNameContaining(name);
    List<AlbumDto> result = Lists.newArrayList();
    if (!CollectionUtils.isEmpty(albums)) {
      for (Album album : albums) {
        result.add(albumMapper.toAlbumDto(album));
      }
    }
    log.debug("search all albums by name {}, result {}", name, result);
    return result;
  }
}
