package com.github.arolfes.music.musiclibrary.data;

import static org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE;
import java.util.List;
import javax.persistence.QueryHint;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import com.github.arolfes.music.musiclibrary.entitites.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {

  @QueryHints(value = @QueryHint(name = HINT_FETCH_SIZE, value = "" + Integer.MIN_VALUE))
  List<Album> findByNameContaining(String name);
  
}
