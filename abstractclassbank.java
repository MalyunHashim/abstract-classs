package abstractclassbank;

abstract class bank {
    abstract int getrateofintrest();

}

class KCB extends bank{
    int getrateofintrest(){

        return 7;

    }


        }

class Taaj extends bank {
    @Override
    int getrateofintrest() {

        return 8;
    }
}