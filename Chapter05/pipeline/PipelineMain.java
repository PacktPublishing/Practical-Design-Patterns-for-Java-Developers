class PipelineMain {
    public static void main(String[] args) {
        System.out.println("Pipeline Pattern, vehicle turn on states");
        var pipeline = new PipeElement<>(new EngineProcessor())
                .addProcessor(new BreakProcessor())
                .addProcessor(new TransmissionProcessor());

        var systemState = pipeline.process(new SystemElement());
        System.out.println(systemState.logSummary());
    }
}
