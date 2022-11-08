enum SystemType {
    DRIVER(2),
    TRANSMISSION(1),
    ENGINE(0),
    UNKNOWN(-1);

    private final int order;

    SystemType(int order) {
        this.order = order;
    }

    int order() {
        return order;
    }
}
