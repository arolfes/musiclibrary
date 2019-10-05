package com.github.arolfes.music.musiclibrary.data;

import org.springframework.data.repository.CrudRepository;
import com.github.arolfes.music.musiclibrary.entitites.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

}
