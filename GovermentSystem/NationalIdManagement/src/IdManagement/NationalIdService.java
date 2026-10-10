package IdManagement;
  import IdInformation.*;
public class NationalIdService {
    public void issueNationalId(String citizenName){
        IdDatabase IdDatabase;
        IdDatabase = new IdDatabase();
        System.out.println(" Generating National ID for: "+ citizenName + " with a NIN Number of: " + IdDatabase.getNINNumber());
    }
}
