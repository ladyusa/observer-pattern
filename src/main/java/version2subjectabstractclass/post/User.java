package version2subjectabstractclass.post;

import version2subjectabstractclass.util.Observer;
import version2subjectabstractclass.util.Subject;

import java.time.LocalDateTime;

public class User implements Observer {

    private String name;
    private DisplayFrame frame;

    public User(String name) {
        this.name = name;
        this.frame = new DisplayFrame(name);
    }

    public void follow(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(Object obj) {
        String data = (String) obj;
        frame.display(LocalDateTime.now() + " : " + data);
    }
}
