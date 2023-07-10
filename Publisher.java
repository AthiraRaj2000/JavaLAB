import java.util.Scanner;

class Publish {
    private String name;

    public Publishers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    protected String title;
    protected Publishers publishers;

    public Book(String title, Publishers publishers) {
        this.title = title;
        this.publishers = publishers;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Publishers: " + publishers.getName());
    }
}

class Literature extends Book {
    private String genre;

    public Literature(String title, Publisher publishers, String genre) {
        super(title, publishers);
        this.genre = genre;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class Fiction extends Book {
    private String author;

    public Fiction(String title, Publisher publishers, String author) {
        super(title, publishers);
        this.author = author;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

class Publisher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of books: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Publishers: ");
            String publishersName = scanner.nextLine();
            Publisher publishers = new Publisher(publishersName);

            System.out.print("Category (1 - Literature, 2 - Fiction): ");
            int category = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (category == 1) {
                System.out.print("Genre: ");
                String genre = scanner.nextLine();
                books[i] = new Literature(title, publisher, genre);
            } else if (category == 2) {
                System.out.print("Author: ");
                String author = scanner.nextLine();
                books[i] = new Fiction(title, publisher, author);
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Details for Book " + (i + 1) + ":");
            books[i].displayDetails();
            System.out.println("------------------------");
        }
    }
}

