insert into artists(name) values ('Blink-182');
insert into artists(name) values ('Foo Fighters');

insert into albums(name, release_date, artist_id) values ('Blink-182', '2003-11-18', (SELECT id FROM artists WHERE name = 'Blink-182'));
insert into albums(name, release_date, artist_id) values ('In You Honor', '2005-06-14', (SELECT id FROM artists WHERE name = 'Foo Fighters'));
