/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Optional;

public class eED {
    public static final eED a = new eED();
    private final HashMap<Cm<Integer, Short>, Cm<Integer, Integer>> e = new HashMap();
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;

    private eED() {
    }

    public void a(int n, short s2, int n2, int n3) {
        Cm<Integer, Short> cm = new Cm<Integer, Short>(n, s2);
        Cm<Integer, Integer> cm2 = new Cm<Integer, Integer>(n2, n3);
        this.e.put(cm, cm2);
    }

    public Optional<Cm<Integer, Integer>> a(int n, short s2) {
        return Optional.ofNullable(this.e.get(new Cm<Integer, Short>(n, s2)));
    }
}

