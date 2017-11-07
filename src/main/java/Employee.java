/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * name of employee.
     */
    private String name;
    /**
     * name of manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param n final.
     * @param m final.
     */
    public Employee(final String n, final String m) {
        this.name = n;
        this.manager = m;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param n final
     */
    public void setName(final String n) {
        this.name = n;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param m final
     */
    public void setManager(final String m) {
        this.manager = m;
    }
}
