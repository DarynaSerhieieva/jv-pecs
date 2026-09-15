package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<? extends Machine> get() {
        List<Excavator> excavators = new ArrayList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
