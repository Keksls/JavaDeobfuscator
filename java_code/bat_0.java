/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from baT
 */
public class bat_0
extends alc_1
implements abq_1 {
    private blx_1 e;
    private String f;
    private long g;
    private static final abm_1 h = new abm_1(new baU());

    public static bat_0 a(int n, int n2, int n3, blx_1 blx_12, String string, int n4) {
        try {
            bat_0 bat_02 = (bat_0)h.borrowObject();
            bat_02.a(n);
            bat_02.b(n2);
            bat_02.c(n3);
            bat_02.a(blx_12);
            bat_02.a(string);
            bat_02.d((long)n4);
            return bat_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            h.returnObject(this);
        }
        catch (Exception exception) {
            a.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    bat_0() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        this.e.bv().e(this.f);
        return this.g;
    }

    @Override
    protected void l() {
        this.release();
    }

    public blx_1 n() {
        return this.e;
    }

    public void a(blx_1 blx_12) {
        this.e = blx_12;
    }

    public String p() {
        return this.f;
    }

    public void a(String string) {
        this.f = string;
    }

    public long r() {
        return this.g;
    }

    public void d(long l) {
        this.g = l;
    }
}

