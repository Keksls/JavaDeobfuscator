/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFK
 */
public class afk_1
implements afg_1 {
    private final afr_2 c;
    protected final long a;
    protected long b;

    public afk_1(afr_2 afr_22, long l, long l2) {
        this.c = afr_22;
        this.a = l;
        this.b = l2;
    }

    @Override
    public afr_2 a(long l) {
        return this.c;
    }

    @Override
    public afr_2 a(long l, aej_2 aej_22, apl_1 apl_12) {
        return this.c;
    }

    @Override
    public void c(long l) {
        this.b += l;
    }

    @Override
    public afr_2 a() {
        return this.c;
    }

    @Override
    public afr_2 b() {
        return this.c;
    }

    @Override
    public long c() {
        return this.b + this.a;
    }

    @Override
    public long d() {
        return this.b;
    }

    @Override
    public boolean b_(long l) {
        return true;
    }
}

