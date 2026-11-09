package advanced_oop.interfaces.CarRental.services;

// Allows that a service can be modified without need to change lines in the code
// Instead of having (BrazilianTaxService or CanadianTaxService we put the pattern)
// This is a General Interface
public interface TaxService {
    double tax(double amount);
}
