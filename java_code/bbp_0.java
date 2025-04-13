/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbp
 */
public class bbp_0
extends alc_1
implements abq_1 {
    private long e;
    private byte[] f;
    private static final abm_1 g = new abm_1(new bbq_0());

    public static bbp_0 a(int n, int n2, int n3, long l, byte[] byArray) {
        try {
            bbp_0 bbp_02 = (bbp_0)g.borrowObject();
            bbp_02.a(n);
            bbp_02.b(n2);
            bbp_02.c(n3);
            bbp_02.f = byArray;
            bbp_02.e = l;
            return bbp_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut sur un InteractiveElementUpdateAction : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            g.returnObject(this);
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
        this.e = 0L;
        this.f = null;
    }

    bbp_0() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        if (this.f != null) {
            bFZ bFZ2 = (bFZ)ccm_1.g().a(this.e);
            if (bFZ2 != null) {
                bFZ2.a_(this.f);
                bFZ2.aI_();
            } else {
                a.error((Object)"L'\u00e9l\u00e9ment interactif \u00e0 mettre \u00e0 jour n'est pas/plus dans les partitions g\u00e9r\u00e9es par le client.");
            }
        } else {
            a.warn((Object)"Message de mise \u00e0 jour d'\u00e9l\u00e9ment interactif re\u00e7u sans aucune donn\u00e9e \u00e0 mettre \u00e0 jour.");
        }
        return 0L;
    }

    @Override
    protected void l() {
        this.release();
    }
}

