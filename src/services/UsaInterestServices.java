package services;

public class UsaInterestServices implements InterestService{

    public double interestRate;

    public UsaInterestServices(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
