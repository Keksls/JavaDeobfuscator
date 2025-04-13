/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class eZv {
    public static final eZv a = new eZv();
    private final Map<Integer, eZu> b = new HashMap<Integer, eZu>();

    private eZv() {
    }

    public void a(int n, eZu eZu2) {
        this.b.put(n, eZu2);
    }

    public eZu a(int n) {
        return this.b.get(n);
    }

    public Stream<Map.Entry<Integer, eZu>> a() {
        return this.b.entrySet().stream();
    }
}

