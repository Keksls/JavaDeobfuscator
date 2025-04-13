/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class fiy {
    private final Map<Byte, Integer> a = new HashMap<Byte, Integer>();
    private boolean b = false;
    private boolean c = false;

    public fiy() {
    }

    public fiy(byte by, byte by2, byte by3) {
        this.a(eps_0.c.a(), by);
        this.a(eps_0.d.a(), by2);
        this.a(eps_0.e.a(), by3);
    }

    public void a(byte by, int n) {
        if (n <= 0) {
            return;
        }
        this.a.put(by, n);
    }

    public void b(byte by, int n) {
        this.a.put(by, n);
    }

    public int a(eps_0 eps_02) {
        if (eps_02 == null) {
            return 0;
        }
        if (!this.a.containsKey(eps_02.a())) {
            return 0;
        }
        return this.a.get(eps_02.a());
    }

    public boolean a() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public boolean b() {
        return this.c;
    }

    public void b(boolean bl) {
        this.c = bl;
    }
}

