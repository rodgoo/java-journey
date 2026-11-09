package advanced_oop.interfaces.CarRental.services;

import advanced_oop.interfaces.CarRental.CarRental;
import advanced_oop.interfaces.CarRental.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner ask = new Scanner(System.in);

        // Created an pattern for dateTime
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = ask.nextLine();

        System.out.print("Pickup date (dd/mm/yyyy hh:ss): ");
        LocalDateTime pickupDate = LocalDateTime.parse(ask.nextLine(), fmt);

        System.out.print("Finish date (dd/mm/yyyy hh:ss): ");
        LocalDateTime finishDate = LocalDateTime.parse(ask.nextLine(), fmt);

        CarRental carRental = new CarRental(pickupDate, finishDate, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = ask.nextDouble();

        System.out.print("Enter price per day: ");
        double pricePerDay = ask.nextDouble();

        //Break the line
        System.out.println();

        // Put all the data and dependecies
        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("-- Invoice -- ");
        System.out.println("Basic Payment: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Tax: " + carRental.getInvoice().getTax());
        System.out.println("Total payment: " + carRental.getInvoice().getTotalPayment());

    }
}
