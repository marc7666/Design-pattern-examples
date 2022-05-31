package Class_exercises.Recu16_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 31/05/2022.
 */
public class LinesIterator implements Iterator<String> {

    private BufferedReader bufferedReader;
    private String peek;

    public LinesIterator(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    @Override
    public boolean hasNext() {
        if (peek != null) {
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        if (peek != null) {
            String next = peek;
            peek = null;
            return next;
        } else {
            try {
                String next = bufferedReader.readLine();
                if (next == null) {
                    throw new NoSuchElementException("No more lines");
                } else {
                    return next;
                }
            } catch (IOException e) {
                throw new NoSuchElementException("No more lines");
            }
        }
    }
}
