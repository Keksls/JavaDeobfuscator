/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxv
 */
public class bxv_2
extends eqx_2 {
    private static final abm_1 j = new abm_1(new bxw_2());

    public static bxv_2 a() {
        try {
            return (bxv_2)j.borrowObject();
        }
        catch (Exception exception) {
            b.error((Object)("Erreur lors de la sortie d'un " + bxv_2.class.getName() + " du pool"), (Throwable)exception);
            return new bxv_2();
        }
    }

    protected bxv_2() {
    }

    @Override
    public void a(us_2 us_22) {
    }

    @Override
    public void b(us_2 us_22) {
        throw new UnsupportedOperationException("Le client ne s\u00e9rialise pas les brocantes");
    }

    public long b() {
        return this.d();
    }

    @Override
    public void release() {
        try {
            j.returnObject(this);
        }
        catch (Exception exception) {
            b.error((Object)("Erreur lors du retour d'un " + bxv_2.class.getName() + " au pool"), (Throwable)exception);
            this.onCheckIn();
        }
    }
}

