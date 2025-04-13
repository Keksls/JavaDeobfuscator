/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from GR
 */
public final class gr_2 {
    private static final gr_2 a = new gr_2();
    private final Map<Long, byte[]> b = new HashMap<Long, byte[]>();

    public static gr_2 a() {
        return a;
    }

    private gr_2() {
    }

    public void a(long l, byte[] byArray) {
        this.b.put(l, byArray);
    }

    public byte[] a(long l) {
        return this.b.remove(l);
    }

    public byte[] b(long l) {
        return this.b.get(l);
    }
}

