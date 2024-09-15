package dio; 

import java.lang.IllegalArgumentException; 

public class TransacaoException extends IllegalArgumentException {

    private static final long serialVersionUID = 1L;

    public TransacaoException(String msg) {
        super(msg);
    }

}
