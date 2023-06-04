public class RewardValue {
   public double cashValue;
   public int milesValue;
   public static final double milesToCashRate =0.0035;
   public RewardValue(double cashValue){
    this.cashValue=cashValue;
   }
   public RewardValue(int milesValue){
    this.cashValue=convertMilesToCash(milesValue);
   }
   private int convertCashToMiles(double cashValue){
    return (int)(cashValue/milesToCashRate);
   }
   private double convertMilesToCash(int milesValue){
    return milesValue*milesToCashRate;
   }

   public double getCashValue(){
    return cashValue;
   }
   public double getMilesValue(){
    return convertCashToMiles(cashValue);
   }

}
