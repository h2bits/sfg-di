package guru.springframework.sfgdi.openclosedprinciple;

public class ClaimApprovalManager {

    public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid Claim. Currently processing claim for approval...");
        }
    }
}
