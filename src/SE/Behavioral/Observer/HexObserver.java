package SE.Behavioral.Observer;

import SE.Behavioral.Observer.Observer;
import SE.Behavioral.Observer.Subject;

class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}