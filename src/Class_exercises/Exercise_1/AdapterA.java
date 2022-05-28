package Class_exercises.Exercise_1;

import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class AdapterA implements Iterator<Object> {

    private StringTokenizer strTok;
    private String str;

    public AdapterA(String str) {
        this.str = str;
        strTok = new StringTokenizer(str);
    }

    @Override
    public boolean hasNext() {
        return strTok.hasMoreTokens();
    }

    @Override
    public Object next() {
        return strTok.nextToken();
    }

}
