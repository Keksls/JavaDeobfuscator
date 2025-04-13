/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arv
 */
public class arv_2
implements ard_1 {
    private String a = null;
    private arf_2 b = null;
    private int c = -1;

    public String toString() {
        return "[IgnoreTagValue:" + this.b.f() + "]" + this.a;
    }

    void a(arf_2 arf_22) {
        this.b = arf_22;
    }

    @Override
    public arf_2 f() {
        return this.b;
    }

    void a(String string) {
        this.a = string;
    }

    @Override
    public String g() {
        return this.a;
    }

    @Override
    public int d() {
        return 0;
    }

    void a(int n) {
        this.c = n;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public arh_2 e() {
        return null;
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public String a() {
        return null;
    }
}

