package lecture5.register;

import lecture2.register.Book;
import lecture2.register.Note;
import lecture2.register.Song;
import lecture2.register.User;

import java.io.*;
import java.util.ArrayList;

@SuppressWarnings("SameParameterValue")
public class NewRegisterMain {
    private static ArrayList<User> userList = new ArrayList<>();
    private static ArrayList<Song> songList = new ArrayList<>();
    private static ArrayList<Note> noteList = new ArrayList<>();
    private static ArrayList<Book> bookList = new ArrayList<>();

    public static void main(String[] args) {
        userList = readUsersFromFile("src/main/resources/users.csv");
        writeUsersIntoFile("src/main/resources/users.csv");
        printList(userList);

        songList = readSongsFromFile("src/main/resources/songs.csv");
        writeSongsIntoFile("src/main/resources/songs.csv");
        printList(songList);

        noteList = readNotesFromFile("src/main/resources/notes.csv");
        writeNotesIntoFile("src/main/resources/notes.csv");
        printList(noteList);

        bookList = readBooksFromFile("src/main/resources/books.csv");
        writeBooksIntoFile("src/main/resources/books.csv");
        printList(bookList);
    }

    static void printList(ArrayList<?> list) {
        int i = 0;
        System.out.println("-------------------------------------");
        for (Object element : list) {
            System.out.printf("%d:\n%s\n", ++i, element.toString());
        }
        System.out.println("-------------------------------------");
    }

    /**
     * Read-write users
     **/
    static void writeUsersIntoFile(String path) {
        try {
            FileWriter myWriter = new FileWriter(path);
            BufferedWriter buffer = new BufferedWriter(myWriter);
            buffer.write("Name;BirthYear;Address\n");
            for (User user : userList) {
                buffer.write(user.getName() + ";" + user.getBirthYear() + ";" + user.getAddress() + "\n");
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static ArrayList<User> readUsersFromFile(String path) {
        try {
            ArrayList<User> list = new ArrayList<>();

            FileReader fileReader = new FileReader(path);
            BufferedReader buffer = new BufferedReader(fileReader);
            buffer.readLine(); // skips header

            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                String[] userInfo = line.split(";");
                list.add(new User(userInfo[0], Integer.parseInt(userInfo[1]), userInfo[2]));
            }
            buffer.close();

            return list;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Read-write songs
     */
    static void writeSongsIntoFile(String path) {
        try {
            FileWriter myWriter = new FileWriter(path);
            BufferedWriter buffer = new BufferedWriter(myWriter);
            buffer.write("Band;Title;LengthInMinutes\n");
            for (Song song : songList) {
                buffer.write(song.getBand() + ";" + song.getTitle() + ";" + song.getLengthInMinutes() + "\n");
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static ArrayList<Song> readSongsFromFile(String path) {
        try {
            ArrayList<Song> list = new ArrayList<>();

            FileReader fileReader = new FileReader(path);
            BufferedReader buffer = new BufferedReader(fileReader);
            buffer.readLine(); // skips header

            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                String[] songInfo = line.split(";");
                list.add(new Song(songInfo[0], songInfo[1], Double.parseDouble(songInfo[2])));
            }
            buffer.close();

            return list;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Read-write notes
     */
    static void writeNotesIntoFile(String path) {
        try {
            FileWriter myWriter = new FileWriter(path);
            BufferedWriter buffer = new BufferedWriter(myWriter);
            buffer.write("Name;Topic;Text\n");
            for (Note note : noteList) {
                buffer.write(note.getName() + ";" + note.getTopic() + ";" + note.getText() + "\n");
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static ArrayList<Note> readNotesFromFile(String path) {
        try {
            ArrayList<Note> list = new ArrayList<>();

            FileReader fileReader = new FileReader(path);
            BufferedReader buffer = new BufferedReader(fileReader);
            buffer.readLine(); // skips header

            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                String[] noteInfo = line.split(";");
                list.add(new Note(noteInfo[0], noteInfo[1], noteInfo[2]));
            }
            buffer.close();

            return list;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return null;
    }


    /**
     * Read-write books
     */
    static void writeBooksIntoFile(String path) {
        try {
            FileWriter myWriter = new FileWriter(path);
            BufferedWriter buffer = new BufferedWriter(myWriter);
            buffer.write("Author;Title;Isbn\n");
            for (Book book : bookList) {
                buffer.write(book.getAuthor() + ";" + book.getTitle() + ";" + book.getIsbn() + "\n");
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static ArrayList<Book> readBooksFromFile(String path) {
        try {
            ArrayList<Book> list = new ArrayList<>();

            FileReader fileReader = new FileReader(path);
            BufferedReader buffer = new BufferedReader(fileReader);
            buffer.readLine(); // skips header

            String line;
            while ((line = buffer.readLine()) != null) {
                line = line.trim();
                String[] bookInfo = line.split(";");

                Book book = new Book(bookInfo[0], bookInfo[1]);
                book.register(bookInfo[2]);

                list.add(book);
            }
            buffer.close();

            return list;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return null;
    }
}
