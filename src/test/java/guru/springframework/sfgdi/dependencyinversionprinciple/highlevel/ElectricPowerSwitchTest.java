package guru.springframework.sfgdi.dependencyinversionprinciple.highlevel;

import guru.springframework.sfgdi.dependencyinversionprinciple.lowlevel.Fan;
import guru.springframework.sfgdi.dependencyinversionprinciple.lowlevel.LightBulb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}