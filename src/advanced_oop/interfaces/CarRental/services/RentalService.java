package advanced_oop.interfaces.CarRental.services;

import advanced_oop.interfaces.CarRental.CarRental;
import advanced_oop.interfaces.CarRental.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerDay;
    private double pricePerHour;

    // Put the Interface here (TaxService) -- Generical interface
    private TaxService taxService;

    // Constructors (put these when run)
    public RentalService(double pricePerDay, double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        // Get the time in minutes to round for 1 plus hour
        double minutes = Duration.between(carRental.getStartDate(), carRental.getFinishDate()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil( hours / 24.0 );
        }

        // The real fee
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}

