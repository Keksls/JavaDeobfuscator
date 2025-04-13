/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from avK
 */
public abstract class avk_1 {
    private ArrayList<avh_1> a;
    private ArrayList<avh_1> b;

    public final boolean a() {
        return this.b != null;
    }

    public final int b() {
        return this.b.size();
    }

    public final avh_1 a(int n) {
        return this.b.get(n);
    }

    public final boolean c() {
        return this.a != null;
    }

    public final int d() {
        return this.a.size();
    }

    public final avh_1 b(int n) {
        return this.a.get(n);
    }

    public final void a(avh_1 avh_12) {
        if (this.a == null) {
            this.a = new ArrayList(1);
        }
        this.a.add(avh_12);
    }

    public final void b(avh_1 avh_12) {
        if (this.a == null) {
            return;
        }
        this.a.remove(avh_12);
    }

    public final void c(avh_1 avh_12) {
        if (this.b == null) {
            this.b = new ArrayList(1);
        }
        this.b.add(avh_12);
    }

    public final void d(avh_1 avh_12) {
        if (this.b == null) {
            return;
        }
        this.b.remove(avh_12);
    }

    protected final void e() {
        if (this.a != null) {
            this.a.clear();
            this.a = null;
        }
        if (this.b != null) {
            this.b.clear();
            this.b = null;
        }
    }
}

