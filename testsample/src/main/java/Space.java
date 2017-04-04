/**
 * Created by latashawatson on 3/7/17.
 */
public class Space {
    private String state;
    private String superState;

    public Space(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSuperState() {
        return superState;
    }

    public void setSuperState(String superState) {
        this.superState = superState;
    }
}
