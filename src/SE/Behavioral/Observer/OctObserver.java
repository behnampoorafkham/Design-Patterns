package SE.Behavioral.Observer;

import SE.Behavioral.Observer.Observer;
import SE.Behavioral.Observer.Subject;

class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }
    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}