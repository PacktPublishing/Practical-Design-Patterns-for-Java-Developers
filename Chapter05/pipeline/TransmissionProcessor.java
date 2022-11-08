class TransmissionProcessor implements Processor<SystemElement, SystemElement>{

    @Override
    public SystemElement process(SystemElement input) {
        input.addLog("transmission-system");
        return input;
    }
}
