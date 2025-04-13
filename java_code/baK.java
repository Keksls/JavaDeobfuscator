/*
 * Decompiled with CFR 0.152.
 */
public class baK
extends alc_1
implements abq_1 {
    private String e;
    private static final abm_1 f = new abm_1(new baL());

    public static baK a(int n, int n2, int n3, String string) {
        try {
            baK baK2 = (baK)f.borrowObject();
            baK2.a(n);
            baK2.b(n2);
            baK2.c(n3);
            baK2.a(string);
            return baK2;
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

    baK() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        dlx.a().a(new dlw(dly.f, bae.h().a(this.e, new Object[0]), 3000));
        return 200L;
    }

    @Override
    protected void l() {
        this.release();
    }

    public String n() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }
}

