package lk.ijse;

public class Boy {
    Agrement agrement;

    public void setter(Agrement a){
        this.agrement = a;
    }

    public void chatWithGirl(){
        agrement.chat();
        System.out.println("Hi");
    }

    public void test(){
        agrement.chat();
    }
}
