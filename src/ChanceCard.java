public class ChanceCard {

    String text;
    int outcome;
    int income;


    public ChanceCard(String text, int outcome, int income){

        this.text = text;
        this.outcome = outcome;
        this.income = income;

    }

    public String getText() {
        return text;
    }

    public int getOutcome() {
        return outcome;
    }

    public int getIncome() {
        return income;
    }
}
