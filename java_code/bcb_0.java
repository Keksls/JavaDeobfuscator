/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bcb
 */
public class bcb_0
extends alc_1
implements abq_1 {
    private long e;
    private static final abm_1 f = new abm_1(new bcc_0());

    public static bcb_0 a(int n, int n2, int n3, long l) {
        try {
            bcb_0 bcb_02 = (bcb_0)f.borrowObject();
            bcb_02.a(n);
            bcb_02.b(n2);
            bcb_02.c(n3);
            bcb_02.e = l;
            return bcb_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut sur un UpdateWalletAction : ", exception);
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
        this.e = 0L;
    }

    @Override
    public void onCheckIn() {
    }

    bcb_0() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        bai_0.e().b(this.e);
        return 0L;
    }

    @Override
    protected void l() {
        this.release();
    }
}

