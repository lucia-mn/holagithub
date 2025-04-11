package act5und7.predicate;

import java.util.function.Predicate;

public class ej3 {

    Predicate<String> m = m -> m.length() > 100 || m.length() < 50;
}
