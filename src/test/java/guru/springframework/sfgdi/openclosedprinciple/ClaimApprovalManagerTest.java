package guru.springframework.sfgdi.openclosedprinciple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaimApprovalManagerTest {

    @Test
    void processClaim() {
        InsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claim1 = new ClaimApprovalManager();
        claim1.processClaim(healthInsuranceSurveyor);

        InsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        ClaimApprovalManager claim2 = new ClaimApprovalManager();
        claim2.processClaim(vehicleInsuranceSurveyor);
    }
}