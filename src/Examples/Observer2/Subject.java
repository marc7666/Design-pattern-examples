package Examples.Observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class Subject implements SubjectInterface {
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notify(flag);
    }

    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void register(Observer anObserver) {
        observerList.add(anObserver);
    }

    @Override
    public void unregister(Observer anObserver) {
        observerList.remove(anObserver);
    }

    @Override
    public void notify(int notifiedValue) {
        for (Observer o : observerList){
            o.update(notifiedValue);
        }
    }
}
