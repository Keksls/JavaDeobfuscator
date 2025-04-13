/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAh
 */
public final class bah_2 {
    private final apl_1 a;
    private final boolean b;
    private boolean c;

    public bah_2(apl_1 apl_12, boolean bl) {
        this.a = apl_12;
        this.b = bl;
    }

    public apl_1 a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public int d() {
        if (this.a == null) {
            return 0;
        }
        return this.a.a();
    }
}

