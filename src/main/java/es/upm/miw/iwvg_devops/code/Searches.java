package es.upm.miw.iwvg_devops.code;

import org.apache.logging.log4j.LogManager;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Searches {

    public Fraction findHighestFraction() {
        return new UsersDatabase().findAll()
                .map(User::getFractions)
                .flatMap(Collection::stream)
                .max((f1, f2) -> Double.compare(f1.decimal(), f2.decimal()))
                .orElse(null);
    }

    public Stream<String> findUserIdByAnyProperFraction() {
        return Stream.empty();
    }

    public Stream<String> findUserNameByAnyImproperFraction() {
        return Stream.empty();
    }

    public Stream<String> findUserFamilyNameByImproperFraction() {
        return Stream.empty();
    }

}
