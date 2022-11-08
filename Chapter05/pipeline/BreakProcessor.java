class BreakProcessor implements Processor<SystemElement, SystemElement>{
    @Override
    public SystemElement process(SystemElement input) {
        input.addLog("break-system");
        return input;
    }
}
