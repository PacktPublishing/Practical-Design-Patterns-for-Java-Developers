class PipeElement<E extends Element, R extends Element> {
    private final Processor<E, R> processor;

    PipeElement(Processor<E, R> processor) {
        this.processor = processor;
    }

    <O extends Element> PipeElement<E, O> addProcessor(Processor<R, O> p){
        return new PipeElement<>(input -> p.process(processor.process(input)));
    }

    R process(E inputElement){
        return processor.process(inputElement);
    }
}
