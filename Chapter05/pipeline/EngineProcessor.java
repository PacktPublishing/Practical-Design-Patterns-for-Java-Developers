class EngineProcessor implements Processor<SystemElement, SystemElement>{


    @Override
    public SystemElement process(SystemElement input) {
        input.addLog("engine-system");
        return input;
    }
}
