package Class_exercises.Exercise_1;

import java.util.Enumeration;
import java.util.StringTokenizer;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 28/05/2022.
 */
public class AdapterB implements Enumeration<Object> {

    private StringTokenizer strTok;
    private String str;

    public AdapterB(String str) {
        this.str = str;
        strTok = new StringTokenizer(str);
    }

    @Override
    public boolean hasMoreElements() {
        return strTok.hasMoreTokens();
    }

    @Override
    public Object nextElement() {
        return strTok.nextToken();
    }
}
