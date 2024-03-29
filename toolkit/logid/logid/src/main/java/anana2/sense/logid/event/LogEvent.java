package anana2.sense.logid.event;

import java.util.Collection;
import java.util.Optional;

import anana2.sense.logid.Variable;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.path.CtPath;

public interface LogEvent {

    public enum Level {
        FATAL, ERROR, WARN, INFO, DEBUG, TRACE, LOG
    }

    Optional<LogEvent> dominator();

    int id();

    CtElement element();

    Optional<CtPath> path();

    Level level();

    String template();

    Collection<Variable> variables();
}
