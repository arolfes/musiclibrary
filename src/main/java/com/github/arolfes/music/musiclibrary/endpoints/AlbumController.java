package com.github.arolfes.music.musiclibrary.endpoints;

import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.github.arolfes.music.musiclibrary.dto.AlbumDto;
import com.github.arolfes.music.musiclibrary.services.MusicLibService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/album")
@Slf4j
public class AlbumController {

  private MusicLibService musicLibService;

  public AlbumController(MusicLibService musicLibService) {
    this.musicLibService = musicLibService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<AlbumDto> getById(@Valid @PathVariable String id) {
    log.info("Fetching album information by id {}", id);
    return ResponseEntity.ok(musicLibService.findAlbumById(id));
  }

  @GetMapping("/search")
  public ResponseEntity<List<AlbumDto>> searchByName(@RequestParam String name) {
    log.info("Search the album information by name {}", name);
    return ResponseEntity.ok(musicLibService.findAllAlbumsByName(name));
  }
}
