package services;

public class BrazilInterestServices implements InterestService{

    public double interestRate;

    public BrazilInterestServices(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
