/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from faf
 */
public class faf_0 {
    public static final faf_0 a = new faf_0();
    private final Map<Long, eyu_1> b = new HashMap<Long, eyu_1>();

    public void a(long l, eyu_1 eyu_12) {
        this.b.put(l, eyu_12);
    }

    public eyu_1 a(long l) {
        return this.b.get(l);
    }

    public eyu_1 b(long l) {
        return this.b.remove(l);
    }
}

