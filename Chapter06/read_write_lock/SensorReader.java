class SensorReader implements Runnable {

    private final String type;
    private final Sensor sensor;
    private final int cycles;

    SensorReader(String type, Sensor sensor, int cycles) {
        this.type = type;
        this.sensor = sensor;
        this.cycles = cycles;
    }

    @Override
    public void run() {
        for(int i=0; i < cycles; i++){
            var value =  sensor.getValue();
            System.out.printf("""
                SensorReader read, type:'%s', value:'%d, thread:'%s'%n""", type, value, Thread.currentThread().getName());
        }
    }
}
