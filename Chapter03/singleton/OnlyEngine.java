class OnlyEngine implements Engine{
    private static OnlyEngine INSTANCE;
    static OnlyEngine getInstance(){
        if(INSTANCE == null){
            INSTANCE = new OnlyEngine();
        }
        return INSTANCE;
    }
    private OnlyEngine(){}

}
