/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from epT
 */
public class ept_1 {
    public static final ept_1 a = new ept_1();
    final HashMap<Byte, eps_1> b = new HashMap();

    public static ept_1 a() {
        return a;
    }

    public final void a(eps_1 eps_12) {
        this.b.put(eps_12.a(), eps_12);
    }

    public Iterable<eps_1> b() {
        return this.b.values();
    }
}

