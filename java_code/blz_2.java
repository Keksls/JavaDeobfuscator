/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from blz
 */
public class blz_2
extends bil_2 {
    private final int k;

    public blz_2(int n) {
        this.k = n;
    }

    @Override
    protected String a() {
        blt_2 blt_22 = blc_2.a().c(this.k);
        return blz_2.a(blt_22);
    }

    @Override
    protected long b() {
        return 0L;
    }

    @Override
    protected boolean c() {
        return false;
    }

    @Override
    protected boolean f() {
        return false;
    }

    protected static String a(blt_2 blt_22) {
        String string = blt_22.d();
        if (string != null && string.length() == 0) {
            return null;
        }
        return string;
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected boolean g() {
        return false;
    }

    @Override
    protected boolean h() {
        return false;
    }
}

