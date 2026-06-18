import java.util.Scanner;

public class MovieTicketBooking1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] movies = {
                "Pushpa 2",
                "Kalki 2898 AD",
                "Devara",
                "Salaar"
        };

        int ticketPrice = 200;

        System.out.println("===== MOVIE TICKET BOOKING SYSTEM =====");

        System.out.println("\nAvailable Movies:");

        for (int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i]);
        }

        System.out.print("\nSelect Movie (1-4): ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > 4) {
            System.out.println("Invalid Movie Selection!");
            return;
        }

        String selectedMovie = movies[choice - 1];

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        int totalAmount = tickets * ticketPrice;

        System.out.println("\n===== BOOKING DETAILS =====");
        System.out.println("Movie Name      : " + selectedMovie);
        System.out.println("Ticket Price    : ₹" + ticketPrice);
        System.out.println("No. of Tickets  : " + tickets);
        System.out.println("Total Amount    : ₹" + totalAmount);

        System.out.print("\nConfirm Booking (Y/N): ");
        char confirm = sc.next().charAt(0);

        if (confirm == 'Y' || confirm == 'y') {
            System.out.println("\nBooking Successful!");
            System.out.println("Enjoy Your Movie!");
        } else {
            System.out.println("\nBooking Cancelled!");
        }

        sc.close();
    }
}