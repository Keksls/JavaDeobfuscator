/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Cq
implements Collector<String, StringBuilder, String> {
    public static final String a = "%n * %s";
    private final String c;
    protected static final Map<String, Cq> b = new HashMap<String, Cq>();

    public static Cq a() {
        return Cq.a(a);
    }

    public static Cq a(String string) {
        if (b.containsKey(string)) {
            return b.get(string);
        }
        Cq cq = new Cq(string);
        b.put(string, cq);
        return cq;
    }

    protected Cq(String string) {
        this.c = string;
    }

    @Override
    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuilder, String> accumulator() {
        return (stringBuilder, string) -> stringBuilder.append(String.format(this.c, string));
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return (stringBuilder, stringBuilder2) -> {
            stringBuilder.append(stringBuilder2.toString());
            return stringBuilder;
        };
    }

    @Override
    public Function<StringBuilder, String> finisher() {
        return StringBuilder::toString;
    }

    @Override
    public Set<Collector.Characteristics> characteristics() {
        return Collections.emptySet();
    }
}

