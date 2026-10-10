package IdInformation;

public class IdDatabase {
   String sirName;
   String givenName;
   String NINNumber;
   String citizenName;

    {
        sirName = "Anna";
        givenName = "Ruth";
        NINNumber = "CF2045973P67823";
        citizenName = sirName + givenName;
    }

    public String getNINNumber() {
        return NINNumber;
    }

}
