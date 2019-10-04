package com.github.arolfes.music.musiclibrary.endpoints;

import java.util.Arrays;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.github.arolfes.music.musiclibrary.dto.AlbumDto;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/album")
@Slf4j
public class AlbumController {

  @GetMapping("/{id}")
  public ResponseEntity<AlbumDto> getById(@Valid @PathVariable String id) {
      log.info("Fetching album information by id {}", id);
      AlbumDto a = new AlbumDto(1, "Blink-182", "2003-11-18");
      return ResponseEntity.ok(a);
  }
  
  @GetMapping("/search")
  public ResponseEntity<List<AlbumDto>> searchByName(@RequestParam String name) {
      log.info("Search the album information by name {}", name);
      List<AlbumDto> result = Arrays.asList(
          new AlbumDto(1, "Blink-182", "2003-11-18"),
          new AlbumDto(2, "In You Honor", "2005-06-14")
      );
      return ResponseEntity.ok(result);
  }
}
