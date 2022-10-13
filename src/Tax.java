import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PropertyPermission;

public class Tax extends Field{
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);

    }

    public int calculateAssets(Player p){
    int assets = p.getBalance();

        for (int i = 0; i < p.deeds.size()-1; i++) {

            ArrayList<Property> deeds = p.getDeeds();
            Property deed = deeds.get(i);
            assets = deed.getCost();

        }
    
    return assets;

    }


    @Override
    public String onLand(Player p) {
        String s = super.onLand(p);
        s += "\n Vil du betale fast beløb? Tast J for ja \n (Ellers trækker vi et beløb der svarer til 10 % af dine aktiver)";
        return s;
    }

    @Override
    protected String onAccept(Player p) {
        p.pay(this.cost);
        return p.getName()+" har nu betalt et fast beløb";
    }



    @Override
    protected String onReject(Player p) {

        float calcTax = calculateAssets(p)*0.1f;
        /*Todo: skriv metoden calculateAssets jvf. Task 1.a, så den kaldes fra linjen herunder, som du indkommenterer når metoden er skrevet*/
        p.pay((int) calcTax);

        return p.getName()+" Afviste at betale et fast beløb i skat. Vi har derfor trukket 10 % af "+p.getName()+"'s aktiver";
    }

}
