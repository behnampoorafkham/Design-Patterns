package SE.Behavioral.Observer;

import SE.Behavioral.Observer.Observer;
import SE.Behavioral.Observer.Subject;

class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}