package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
