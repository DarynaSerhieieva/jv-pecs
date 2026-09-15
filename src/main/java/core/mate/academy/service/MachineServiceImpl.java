package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final Class<? extends Machine> BULLDOZER_CLASS = Bulldozer.class;
    private static final Class<? extends Machine> EXCAVATOR_CLASS = Excavator.class;
    private static final Class<? extends Machine> TRUCK_CLASS = Truck.class;

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (BULLDOZER_CLASS.equals(type)) {
            machines = new BulldozerProducer().get();
        } else if (EXCAVATOR_CLASS.equals(type)) {
            machines = new ExcavatorProducer().get();
        } else if (TRUCK_CLASS.equals(type)) {
            machines = new TruckProducer().get();
        } else {
            return new ArrayList<Machine>();
        }
        return new ArrayList<Machine>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
