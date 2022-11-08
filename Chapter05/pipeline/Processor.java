@FunctionalInterface
interface Processor<E extends Element, R extends Element> {
    R process (E input);
}
