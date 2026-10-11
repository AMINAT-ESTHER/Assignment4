package BusinessService;
 import IdManagement.NationalIdService;
 import OnlineTax.TaxService;

public class RegisterCompany {
 public void register(String businessName, String citizenName, String NINNumber){
  System.out.println("    Business Registration module");
  NationalIdService idService = new NationalIdService();
  idService.issueNationalId("Anna Ruth", "CF2045973P67823");
  System.out.println(" Initiating registration for: "+ businessName + " whose owner is "+ citizenName);
  System.out.println(" Company has securely been mapped to owner's NIN: " + NINNumber);
  new TaxService().collectTax(5000);
 }
}
