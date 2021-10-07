package version2subjectabstractclass.data;

import version2subjectabstractclass.util.Observer;
import version2subjectabstractclass.util.Subject;

public class NewsRoom implements Observer {

    private Subject subject;

    public NewsRoom(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Object obj) {
        //double data = ((Double) obj).doubleValue();
        double data = ((Rice)subject).getPrice();
        System.out.println("Current Rice Price : " + data);
    }
}
