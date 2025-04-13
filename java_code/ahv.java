/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public abstract class ahv
extends abz_0
implements ph_0,
abb_0 {
    public static final short ac = Short.MIN_VALUE;
    private boolean af = false;
    private static final String ag = "AnimTrans_";
    private static final String ah = "AnimStatique_";
    private static final String ai = "Func_";
    private static final String aj = "End";
    private abm_1 ak;
    protected pj_0 ad;
    private int al;
    private int am;
    protected short ae = (short)Short.MIN_VALUE;
    private boolean an;

    protected void a(abm_1 abm_12) {
        this.ak = abm_12;
    }

    @Override
    public long a() {
        return this.ad.a_();
    }

    @Override
    public int b() {
        return this.al;
    }

    @Override
    public void a(int n) {
        this.al = n;
    }

    public int aG() {
        return this.am;
    }

    @Override
    public void b(int n) {
        this.am = n;
    }

    @Override
    public void c(int n) {
        azf_2 azf_22 = new azf_2(n);
        this.Q[0] = azf_22.s();
        this.Q[1] = azf_22.r();
        this.Q[2] = azf_22.q();
        this.R = this.Q[3] = azf_22.p();
        this.S = this.Q[3];
    }

    @Override
    public byte c() {
        return (byte)this.af();
    }

    @Override
    public void a(byte by) {
        this.a((short)by);
    }

    @Override
    public void a(boolean bl) {
        ahi_0 ahi_02 = bl ? ahi_0.c : ahi_0.c;
        this.g(ahi_02.a());
    }

    @Override
    public void onCheckIn() {
        this.al = 0;
        this.am = 0;
        this.ad = null;
        this.ak = null;
        this.ae = (short)Short.MIN_VALUE;
        this.af = false;
        this.R();
    }

    @Override
    public void onCheckOut() {
        this.an = true;
    }

    @Override
    public void release() {
        if (this.ak != null) {
            try {
                this.ak.returnObject(this);
            }
            catch (Exception exception) {
                Y.error((Object)"Exception lev\u00e9e du retour d'un objet dans son pool : ", (Throwable)exception);
            }
        } else {
            Y.error((Object)"L'objet ne peut retourner dans un pool, il n'a pas \u00e9t\u00e9 initialis\u00e9");
        }
    }

    @Override
    public pj_0 d() {
        return this.ad;
    }

    @Override
    public void a(@NotNull pj_0 pj_02) {
        this.ad = pj_02;
    }

    protected void a(byte by, boolean bl, TI tI, aej_2 aej_22) {
        String string;
        boolean bl2;
        boolean bl3 = this.ae != by;
        boolean bl4 = bl2 = this.W != aej_22;
        if (!(bl3 || bl2 || tI == TI.b || (string = this.F()) == null || string.equals("AnimStatique"))) {
            return;
        }
        this.a(aej_22);
        string = !bl3 && bl2 || tI == TI.c ? ah : this.a(bl, bl3);
        if (string != null) {
            this.e(string + by);
        }
        this.g(ah + by);
        this.E();
    }

    private String a(boolean bl, boolean bl2) {
        if (this.ae == Short.MIN_VALUE) {
            return ah;
        }
        if (!bl) {
            return ag;
        }
        if (!bl2) {
            return null;
        }
        return ag + this.ae + "_";
    }

    public boolean aH() {
        return this.af;
    }

    public void o(boolean bl) {
        this.af = bl;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.ad.c(this);
    }

    public boolean aI() {
        return this.an;
    }

    public void p(boolean bl) {
        this.an = bl;
    }

    public abstract akr_1[] aJ();
}

