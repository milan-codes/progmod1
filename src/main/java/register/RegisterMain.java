package register;

import java.util.Scanner;

public class RegisterMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        Song song = new Song();
        Note note = new Note();
        Book book = new Book();

        System.out.print("Enter your name: ");
        user.setName(scanner.nextLine());
        System.out.print("Enter your birth year: ");
        user.setBirthYear(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter your address: ");
        user.setAddress(scanner.nextLine());

        System.out.println("----------------------------------");

        System.out.println("Enter the details of your favorite song!");
        System.out.print("Band: ");
        song.setBand(scanner.nextLine());
        System.out.print("Title: ");
        song.setTitle(scanner.nextLine());
        System.out.print("Length: ");
        song.setLengthInMinutes(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("----------------------------------");

        System.out.println("Enter a note!");
        System.out.print("Name on note: ");
        note.setName(scanner.nextLine());
        System.out.print("Topic: ");
        note.setTopic(scanner.nextLine());
        System.out.print("Text: ");
        note.setText(scanner.nextLine());

        System.out.println("----------------------------------");

        System.out.println("Enter the details of your favorite book!");
        System.out.print("Author: ");
        book.setAuthor(scanner.nextLine());
        System.out.print("Title: ");
        book.setTitle(scanner.nextLine());
        System.out.print("ISBN: ");
        book.register(scanner.nextLine());

        System.out.println("\n*** INFORMATION ON USER ***\n");
        System.out.println(user);
        System.out.println(song);
        System.out.println(note);
        System.out.println(book);

    }
}
