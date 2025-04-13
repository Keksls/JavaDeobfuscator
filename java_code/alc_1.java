/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLc
 */
public abstract class alc_1
extends aku_1
implements adv_1 {
    private static int e;
    protected static final int j = 30000;
    protected static final int k = -1;
    protected long l;

    public static int q() {
        e = e == Integer.MAX_VALUE ? 0 : ++e;
        return e;
    }

    public alc_1(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    public final void a() {
        long l = this.o();
        if (l > 30000L) {
            if (l != Integer.MAX_VALUE) {
                a.warn((Object)("Timed Action " + this.getClass().getSimpleName() + " has a long duration : " + l + " ms. This may be an error."));
            }
            l = 0L;
        }
        if (l == 0L) {
            this.j();
        } else if (l > 0L) {
            this.l = adi_2.a().a(this, l, -1, 1L);
        }
    }

    protected abstract long o();

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12.a() == Integer.MIN_VALUE) {
            this.j();
            return false;
        }
        return true;
    }

    @Override
    public long a_() {
        return -1L;
    }

    @Override
    public void a(long l) {
    }
}

