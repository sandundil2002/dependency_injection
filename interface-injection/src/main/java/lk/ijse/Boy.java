package lk.ijse;

public class Boy implements DI {
    Agrement agrement;

    public void chatWithGirl(){
        agrement.chat();
        System.out.println("Hi");
    }

    public void test(){
        agrement.chat();
    }

    @Override
    public void inject(Agrement a) {
        agrement = a;
    }
}
