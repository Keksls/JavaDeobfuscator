/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bhQ
 */
public final class bhq_1
implements rq_0 {
    private final int a;
    private final bhq_1 b;
    private final String c;
    private ArrayList<bhq_1> d;
    private ArrayList<bhj_1> e;

    bhq_1(int n, bhq_1 bhq_12, String string) {
        this.a = n;
        this.c = string != null ? string.intern() : null;
        this.b = bhq_12;
    }

    @Override
    public int a() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public bhq_1 f() {
        return this.b;
    }

    public ArrayList<bhq_1> c() {
        return this.d;
    }

    public ArrayList<bhj_1> d() {
        return this.e;
    }

    void a(bhq_1 bhq_12) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (!this.d.contains(bhq_12)) {
            this.d.add(bhq_12);
        }
    }

    void a(bhj_1 bhj_12) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (!this.e.contains(bhj_12)) {
            this.e.add(bhj_12);
        }
    }

    public boolean a(int n) {
        if (n == this.a) {
            return true;
        }
        return this.b != null && this.b.a(n);
    }

    @Override
    public /* synthetic */ rq_0 b() {
        return this.f();
    }
}

