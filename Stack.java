
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 * The Stack Class.
 *
 * @author  Michael Clermont
 * @version 1.0
 * @since   2020-10-4
 */

public class Stack {
    /**
     * List for stack values.
     */
    private List<Integer> stackAsList = new ArrayList<Integer>();

    /**
     * The getStack() getter.
     *
     * @return - current stack
     */
    public List<Integer> getStack() {
        return this.stackAsList;
    }

    /**
     * The push() function.
     *
     * @param pushedNumber -  how much to slow down
     */
    public void push(final int pushedNumber) {
        this.stackAsList.add(pushedNumber);
    }

    /**
     * The pop() function.
     *
     * @throws InputMismatchException For try catch
     */
    public void pop() throws InputMismatchException {
        if (this.stackAsList.size() > 0) {
            this.stackAsList.remove(stackAsList.size() - 1);
        } else {
            throw new InputMismatchException();
        }
    }

    /**
     * The peek() function.
     *
     * @return firstElement This returns the first element.
     *
     * @throws InputMismatchException For try catch
     */
    public int peek() throws InputMismatchException {
        if (this.stackAsList.size() > 0) {
            final int firstElement = this.stackAsList.get(
                            stackAsList.size() - 1);

            return firstElement;
        } else {
            throw new InputMismatchException();
        }
    }

    /**
     * The clear() function.
     *
     */
    public void empty() {
        this.stackAsList.clear();
    }
}

