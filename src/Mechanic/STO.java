package Mechanic;

import Transport.Transport;
import Transport.Bus;
import java.util.ArrayDeque;
import java.util.Queue;

public class STO {
    private final Queue<Transport<?>> transportQueue = new ArrayDeque<>();

    public void addTransport(Transport<?> transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются ТО");
        }
        transportQueue.add(transport);
    }

    public void runTo() {
        Transport<?> transport = transportQueue.poll();
        if (transport != null) {
            transport.getMechanics().get(0).performMaintenance(transport);
        }
    }


}
