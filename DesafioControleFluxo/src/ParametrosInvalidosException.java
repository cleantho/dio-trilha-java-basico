import java.lang.IllegalArgumentException;

public class ParametrosInvalidosException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;

    public ParametrosInvalidosException(String msg) {
        super(msg);
    }

}
