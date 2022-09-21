create DATABASE IF NOT EXISTS jukeboxdb;
USE jukeboxdb;
create TABLE songs(song_id int primary key,
song_name varchar(30),
 song_artist varchar(30),
 song_duration varchar(30),
 song_album varchar(30),
 song_genre varchar(30),
 filepath varchar(30)
 );