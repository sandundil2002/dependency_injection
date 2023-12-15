package lk.ijse;

public class Boy {
    Agrement agrement;

    public Boy(){}
    public Boy(Agrement a){
        this.agrement = a;
    }
    public void chatWithGirl(){
        agrement.chat();
    }

    public void test(){
        agrement.chat();
    }

    public static void main(String[] args) {

    }
}
