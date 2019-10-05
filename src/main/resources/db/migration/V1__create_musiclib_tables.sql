CREATE TABLE artists (
     id SERIAL,
     name CHAR(255) NOT NULL,
     PRIMARY KEY (id)
);

CREATE TABLE albums (
     id SERIAL,
     name CHAR(255) NOT NULL,
     release_date DATE,
     artist_id BIGINT UNSIGNED,
     CONSTRAINT fk_artist_id FOREIGN KEY (artist_id) REFERENCES artists(id),
     PRIMARY KEY (id)
);