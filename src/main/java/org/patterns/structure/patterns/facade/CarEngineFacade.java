package org.patterns.structure.patterns.facade;

import org.patterns.structure.patterns.facade.engine.AirFlowController;
import org.patterns.structure.patterns.facade.engine.CoolingEngine;
import org.patterns.structure.patterns.facade.engine.FuelInjector;

public class CarEngineFacade {
    private final FuelInjector fuelInjector = new FuelInjector();
    private final CoolingEngine coolingEngine = new CoolingEngine();
    private final AirFlowController airFlowController = new AirFlowController();

    public void startEngine() {
        fuelInjector.turnOn();
        airFlowController.turnOn();
        coolingEngine.turnOn();
    }

    public void stopEngine() {
        fuelInjector.turnOff();
        airFlowController.turnOff();
        coolingEngine.turnOff();
    }
}
