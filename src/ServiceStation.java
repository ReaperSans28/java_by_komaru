public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }

            if (transport instanceof Car) {
                ((Car) transport).checkEngine();
            } else if (transport instanceof Truck) {
                ((Truck) transport).checkEngine();
                ((Truck) transport).checkTrailer();
            }
        }
    }
}