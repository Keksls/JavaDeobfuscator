/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from ePH
 */
public class eph_0 {
    public static final eph_0 a = new eph_0();
    private final Map<String, Object> b = new HashMap<String, Object>();
    private final Set<epf_0> c = new HashSet<epf_0>();

    private eph_0() {
    }

    public void a(String string, Object object) {
        this.b.put(string, object);
        for (epf_0 epf_02 : this.c) {
            epf_02.a(string, object);
        }
    }

    public void b(String string, Object object) {
        this.b.put(string, object);
    }

    public Map<String, Object> a() {
        return this.b;
    }

    public boolean a(String string) {
        return (Boolean)this.b.getOrDefault(string, false);
    }

    public byte b(String string) {
        return Byte.valueOf(String.valueOf(this.b.getOrDefault(string, 0)));
    }

    public short c(String string) {
        return Short.valueOf(String.valueOf(this.b.getOrDefault(string, 0)));
    }

    public int d(String string) {
        return Integer.valueOf(String.valueOf(this.b.getOrDefault(string, 0)));
    }

    public long e(String string) {
        return Long.valueOf(String.valueOf(this.b.getOrDefault(string, 0)));
    }

    public void a(epf_0 epf_02) {
        this.c.add(epf_02);
    }
}

