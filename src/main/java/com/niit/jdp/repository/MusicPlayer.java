/*
 * Author Name:
 * Date: 9/20/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer {
    import java.sql .*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class PlayList {
        Scanner sc = new Scanner(System.in);
        PlaySongs playSongObj = new PlaySongs();
        MainOperations jukeBoxOperation = new MainOperations();

        public void createAPlayList() throws Exception {

            Connection connection = databaseConnection.getConnection();
            System.out.println("Enter the name of playlist");
            String playlistName = sc.nextLine();
            String sql = "Insert into playlist(playlist_name) values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, playlistName);
            int count = preparedStatement.executeUpdate();
            if (count != 0) {
                System.out.println("New PlayList Created");

            }
            System.out.println("1: DO YOU WANT TO ADD SONGS TO PLAY LIST");
            System.out.println("2: GO BACK TO MAIN MENU");
            int choice = sc.nextInt();
            do {
                switch (choice) {
                    case (1):
                        addSongsIntoPlayList();
                        break;
                    case (2):
                        String[] arg = new String[0];
                        JukeBoxImpl.main(arg);
                }
            } while (choice < 3);

        }

        public void addSongsIntoPlayList() throws Exception {

            Connection connection = DbConnection.getConnection();
            String sql = "SELECT playlist_id,playlist_name from playlist_details;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.format("%-10s %-20s\n", "PlayListID", "PlayListName");
            System.out.println();
            while (resultSet.next()) {
                System.out.format("%-10s %-20s\n", resultSet.getInt(1), resultSet.getString(2));
            }

            System.out.println("Please enter the playListID to add songs");
            int playListID = sc.nextInt();

            System.out.println("Search song based on following option");
            System.out.println("1 : Display all Songs\n2 : Artist Name\n3 : Genre\n4 : Song Name\n5 : Go back to main menu");
            int option = sc.nextInt();
            switch (option) {

                case 1:
                    List<Song> allSongs = jukeBoxOperation.getAllSongs();
                    System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", "SongID", "SongName", "Duration", "Album", "Artist", "GenreType");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    for (Song songs : allSongs) {
                        System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", songs.getId(), songs.getSongName(), songs.getDuration(), songs.getAlbum(), songs.getArtist(), songs.getGenre());
                    }

                    break;
                case 2:
                    System.out.println("PLEASE ENTER THE ARTIST NAME YOU WANT TO SEARCH");
                    sc.nextLine();
                    String artistName = sc.nextLine();
                    List<Song> songsListOfArtist = jukeBoxOperation.searchByArtist(artistName);
                    System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", "SongID", "SongName", "Duration", "Album", "Artist", "GenreType");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    for (Song songs : songsListOfArtist) {
                        System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", songs.getSongId(), songs.getSongName(), songs.getDuration(), songs.getAlbum(), songs.getArtist(), songs.getGenre());
                    }
                    break;
                case 3:
                    System.out.println("PLEASE ENTER THE GENRE TYPE YOU WANT TO SEARCH");
                    String genreType = sc.nextLine();
                    List<Song> songsList = jukeBoxOperation.searchByGenre(genreType);
                    System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", "SongID", "SongName", "Duration", "Album", "Artist", "GenreType");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    for (Song songs : songsList) {
                        System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", songs.getSongId(), songs.getSongName(), songs.getDuration(), songs.getAlbum(), songs.getArtist(), songs.getGenre());
                    }
                    break;
                case 4:
                    System.out.println("PLEASE ENTER THE SONG NAME YOU WANT TO SEARCH");
                    sc.nextLine();
                    String songName = sc.nextLine();
                    List<Song> songsListBasedOnName = jukeBoxOperation.searchBySongName(songName);
                    System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", "SongID", "SongName", "Duration", "Album", "Artist", "GenreType");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    for (Song songs : songsListBasedOnName) {
                        System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", songs.getSongId(), songs.getSongName(), songs.getDuration(), songs.getAlbum(), songs.getArtist(), songs.getGenre());
                    }
                    break;
                case 5:
                    String[] arg = new String[0];
                    JukeBoxImpl.main(arg);
                    break;

                default:
                    System.err.println("PLEASE SELECT THE RIGHT OPTION");
                    option = sc.nextInt();
            }

            System.out.println("Please enter the songID you want to add to the playlist");
            int songID = sc.nextInt();

            String sqlUpdate = "insert into playlist(playlistId,songId) values(?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate);
            preparedStatement.setInt(1, playListID);
            preparedStatement.setInt(2, songID);
            int row = preparedStatement.executeUpdate();
            if (row != 0) {
                System.out.println(" Song Added to the playlist ");
            }
            System.out.println("1 Do you Want To Add Some more songs\n2 Do you Want To play the songs from existing playlist\n3 Go back to main menu");
            int choice = sc.nextInt();
            do {
                switch (choice) {
                    case (1):
                        addSongsIntoPlayList();
                        break;
                    case (2):
                        List<Song> playList = existingPlaylist();
                        System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", "SongID", "SongName", "Duration", "Album", "Artist", "GenreType");
                        System.out.println("-----------------------------------------------------------------------------------------");
                        for (Song songs : playList) {
                            System.out.format("%-10s %-30s %-30s %-30s %-30s %-30s \n", songs.getSongId(), songs.getSongName(), songs.getDuration(), songs.getAlbum(), songs.getArtist(), songs.getGenre());
                        }
                        System.out.println("-----------------------------------------------------------------------------------------");
                        System.out.println("\t\t1: DO YOU WANT TO PLAY THE PLAYLIST");
                        System.out.println("\t\t2: GO BACK TO MAIN MENU");
                        int select = sc.nextInt();
                        switch (select) {
                            case (1):
                                playSongObj.playSong(playList);
                                break;
                            case (2):
                                String[] arg = new String[0];
                                JukeBoxImpl.main(arg);
                                break;
                            default:
                                System.err.println("PLEASE SELECT THE CORRECT OPTION");
                        }
                        break;
                    case (3):
                        String[] arg = new String[0];
                        JukeBoxImpl.main(arg);
                        break;
                    default:
                        System.err.println("PLEASE SELECT THE RIGHT OPTION");
                        choice = sc.nextInt();
                        break;
                }
            } while (choice < 4);

        }

        public List<Song> existingPlaylist() throws SQLException, ClassNotFoundException {
            List<Song> playListSongs = new ArrayList<>();
            Connection connection = DbConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT playlist_id,playlist_name from playlist_details;");
            System.out.format("%-10s %-20s\n", "PlayListID", "PlayListName");
            System.out.println();
            while (resultSet.next()) {
                System.out.format("%-10s %-20s\n", resultSet.getInt(1), resultSet.getString(2));
                System.out.println();
            }
            System.out.println(" Please enter the playListID you want to open");

            int playListID = sc.nextInt();
            String sql = "Select songId from playlist where playlistId = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, playListID);

            ResultSet resultSet1 = preparedStatement.executeQuery();
            String sql3 = "Select * from songs where songId = ?";
            while (resultSet1.next()) {
                int songId = resultSet1.getInt(1);
                PreparedStatement preparedStatement1 = connection.prepareStatement(sql3);
                preparedStatement1.setInt(1, songId);
                ResultSet resultSet2 = preparedStatement1.executeQuery();
                while (resultSet2.next()) {

                    playListSongs.add(new Song(resultSet2.getInt(1), resultSet2.getString(2), resultSet2.getString(3), resultSet2.getString(4), resultSet2.getString(5), resultSet2.getString(6), resultSet2.getString(7)));
                }
            }
            return playListSongs;
        }


    }
}
