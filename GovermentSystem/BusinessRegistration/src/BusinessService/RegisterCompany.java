package BusinessService;
 import IdManagement.NationalIdService;
 import OnlineTax.TaxService;
public class RegisterCompany {
 public void register( String businessName, String NINNumber, double amount){
  System.out.println(" Initiating registration for: "+ businessName);
  System.out.println(" Company securely mapped to owner's NIN: " + NINNumber);
  System.out.println(" Company is to pay a tax fee of " + amount + " yearly");
 }
}
