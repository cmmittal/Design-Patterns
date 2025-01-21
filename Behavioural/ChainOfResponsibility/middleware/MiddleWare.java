package Behavioural.ChainOfResponsibility.middleware;

public abstract class MiddleWare {

    public MiddleWare next;

    public static MiddleWare link(MiddleWare start, MiddleWare... list){
        MiddleWare head = start;

        for (MiddleWare middleWare : list) {
            head.next = middleWare;
            head = head.next;
        }

        return start;
    }

    public abstract boolean execute();

    public boolean execNext(){
        if (next == null) {
            return true;
        }

        return next.execute();
    }
}
