import java.util.Scanner;

public class cinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double ticketKid = 0d;
        double ticketStudent = 0d;
        double ticketStandard = 0d;
        int totalTicketSold = 0;
        while (!command.equals("Finish")) {
            int hallCapacity = Integer.parseInt(scanner.nextLine());

            int currentMovieTicket = 0;
            label:
            for (int number = 0; number < hallCapacity; number++) {
                String typeTicket = scanner.nextLine();
                switch (typeTicket) {
                    case "kid":

                        ticketKid += 1;
                        break;
                    case "student":
                        ticketStudent += 1;
                        break;
                    case "standard":
                        ticketStandard += 1;
                        break;
                    case "End":
                        break label;
                }
                totalTicketSold += 1;
                currentMovieTicket += 1;


            }
            double movieSeatPercentage = (double) currentMovieTicket / hallCapacity * 100;
            System.out.printf(command + " - %,.2f%% full.\n", movieSeatPercentage);

            command = scanner.nextLine();
        }
        ticketKid = ticketKid / totalTicketSold * 100;
        ticketStudent = ticketStudent / totalTicketSold * 100;
        ticketStandard = ticketStandard / totalTicketSold * 100;
        System.out.println("Total tickets: " + totalTicketSold);
        System.out.printf("%,.2f%% student tickets.\n", ticketStudent);
        System.out.printf("%,.2f%% standard tickets.\n", ticketStandard);
        System.out.printf("%,.2f%% kids tickets.", ticketKid);
    }
}
