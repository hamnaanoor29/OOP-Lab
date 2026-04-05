package LabAssignments.Assignment2;

class PremiumSavingsAccount extends SavingAccounts {

    private int rewardPoints;
    private double bonusRate;

    PremiumSavingsAccount(String accountNo, String holderName, double balance,
                          double interestRate, double minBalance,
                          int rewardPoints, double bonusRate) {

        super(accountNo, holderName, balance, interestRate, minBalance);
        this.rewardPoints = rewardPoints;
        this.bonusRate = bonusRate;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Reward Points: " + rewardPoints);
        System.out.println("Bonus Rate: " + bonusRate + "%");
    }

    @Override
    double calculateInterest() {
        double interest = super.calculateInterest();
        double bonus = getBalance() * bonusRate / 100;
        return interest + bonus;
    }
}
