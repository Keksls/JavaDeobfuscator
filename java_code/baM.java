/*
 * Decompiled with CFR 0.152.
 */
public class baM
extends alc_1
implements abq_1 {
    private aei_0 e;
    private static final abm_1 f = new abm_1(new ban_0());

    public static baM a(int n, int n2, int n3, aei_0 aei_02) {
        try {
            baM baM2 = (baM)f.borrowObject();
            baM2.a(n);
            baM2.b(n2);
            baM2.c(n3);
            baM2.e = aei_02;
            return baM2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            f.returnObject(this);
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
    }

    baM() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        if (this.e != null) {
            aed.a.a(this.e);
        }
        return 100L;
    }

    @Override
    protected void l() {
        this.release();
    }
}

