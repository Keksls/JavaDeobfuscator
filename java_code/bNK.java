/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class bNK
extends abz_0
implements abo_1,
fhi_0 {
    private static final int ag = 16;
    private static final Comparator<cSS> ah = (cSS2, cSS3) -> {
        if (cSS2 instanceof cTk && cSS3 instanceof cTk) {
            return ((cTk)cSS2).a() - ((cTk)cSS3).a();
        }
        if (!(cSS2 instanceof cTl)) {
            return 1;
        }
        if (!(cSS3 instanceof cTl)) {
            return -1;
        }
        return ((bqf_2)((Object)cSS2)).e().b() - ((bqf_2)((Object)cSS3)).e().b();
    };
    private static final abb_0 ai = new bNL();
    public static boolean ac = true;
    private static final ObjectPool aj = new abm_1(new bNM());
    protected bNI ad;
    private String ak;
    private byte al;
    protected boolean ae;
    protected boolean af;
    private long am;
    private int an;
    boolean ao;
    private boolean ap;
    private float aq = 1.0f;
    private adS ar;

    public static bNK b(int n, int n2, short s2, int n3, byte by, boolean bl, boolean bl2, long l, int n4) {
        bNK bNK2;
        try {
            bNK2 = (bNK)aj.borrowObject();
        }
        catch (Exception exception) {
            Y.error((Object)"Erreur lors de l'extraction d'une resource du pool", (Throwable)exception);
            bNK2 = new bNK();
        }
        if (!bNK2.c(n, n2, s2, n3, by, bl, bl2, l, n4)) {
            return null;
        }
        return bNK2;
    }

    protected boolean c(int n, int n2, short s2, int n3, byte by, boolean bl, boolean bl2, long l, int n4) {
        long l2 = Hw.c(n, n2);
        this.a(l2);
        this.C = n;
        this.D = n2;
        this.E = s2 - 1;
        this.ae = bl2;
        this.am = l;
        this.an = n4;
        this.af = false;
        this.ad = (bNI)bNJ.a().a(n3);
        if (this.ad == null) {
            Y.error((Object)("Error reference inexistante pour la ressource d'ID " + n3));
            return false;
        }
        this.g(bNO.a().a((byte)1, by));
        this.j = false;
        this.a(by, bl);
        this.g(ahi_0.d.a());
        aiI.a(this);
        return true;
    }

    protected bNK() {
        super(0L, 0.0f, 0.0f);
        this.a(new bNN(this));
    }

    public String a(bNK bNK2) {
        if (!bNK2.e()) {
            return null;
        }
        eAJ eAJ2 = eAJ.a(bNK2.aR().j());
        if (eAJ2 == null) {
            return null;
        }
        if (!eAJ2.c()) {
            return null;
        }
        brf_0 brf_02 = brh_0.a().g().a();
        if (brf_02 == null) {
            return null;
        }
        float f2 = brf_02.a();
        bNI bNI2 = bNK2.aR();
        String string = bnz_0.a(f2, bNI2.p(), bNI2.n(), bNI2.o(), bNI2.q()).name();
        return azs_0.a().a("temperatureInfluenceIconUrl", "defaultIconPath", string);
    }

    private void d() {
        if (this.ar != null) {
            aed.a.a(this.ar.d(), 500);
            this.ar = null;
        }
    }

    private void aT() {
        this.d();
        bNR bNR2 = (bNR)this.ad.b(this.al);
        if (!bNR2.e()) {
            return;
        }
        this.ar = (adS)avo_2.a.a();
        this.ar.a(this);
        float[] fArray = bNR2.c();
        this.ar.b(0.0f, 0.0f, 0.0f);
        this.ar.c(fArray[0], fArray[1], fArray[2]);
        this.ar.a(0.0f, 0.0f, 0.2f);
        this.ar.a(bNR2.d());
        this.ar.a(false);
        aed.a.a(this.ar);
    }

    public boolean e() {
        bNR bNR2 = (bNR)this.ad.b(this.al);
        ece_0 ece_02 = bgg.a.b();
        int n = bNR2.g();
        for (int k = 0; k < n; ++k) {
            brw_1 brw_12 = (brw_1)bNR2.c(k);
            if (brw_12.l() == 0) {
                return true;
            }
            if (!ece_02.e(brw_12.l())) continue;
            return true;
        }
        return false;
    }

    public boolean aG() {
        if (this.aN() == 16) {
            return false;
        }
        return this.ad.e();
    }

    public boolean aH() {
        return this.am > 0L;
    }

    public long aI() {
        return this.am;
    }

    public void b(long l) {
        this.am = l;
    }

    public int aJ() {
        return this.an;
    }

    public void a(int n) {
        this.an = n;
    }

    @Override
    public void onCheckOut() {
        this.al = 0;
        this.ad = null;
        this.ae = false;
        this.ao = false;
        this.am = 0L;
        this.an = 0;
        this.c(false);
        this.a(ai);
        this.a(aej_2.b);
    }

    @Override
    public void onCheckIn() {
        if (this.ap) {
            aof_0.a.b(this);
            this.ap = false;
        }
        this.d();
        this.R();
        this.al = 0;
        this.ad = null;
        this.af = false;
        this.am = 0L;
        this.an = 0;
        dbm_0.a().a(this);
    }

    @Override
    public boolean a(Fz fz) {
        if (fz.b() == fk_1.e) {
            this.ak = bNO.a().a((byte)4, this.al);
            this.i = false;
            this.e(this.ak);
            return true;
        }
        return false;
    }

    @Override
    public void a(ArrayList<Fz> arrayList) {
        for (Fz fz : arrayList) {
            if (fz.b() == fk_1.f) {
                boolean bl = this.ao = !this.ae;
                if (!this.ae) continue;
                this.c(false);
                continue;
            }
            if (fz.b() == fk_1.g) {
                this.b(this.al, false);
                continue;
            }
            Object r2 = abo_0.a(fz.getClass());
            r2.a(this, (Fz)fz);
        }
    }

    public boolean aK() {
        return this.ao;
    }

    public cSS[] aL() {
        if (!this.aU()) {
            return cSS.k;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.a(erl_2.an)) {
            return cSS.k;
        }
        abq_2<cSS> abq_22 = new abq_2<cSS>(ah);
        boolean bl = emp_0.b(bmr_12.N_().a(), emq_0.V);
        boolean bl2 = bmr_12.bf();
        if (bl || bl2) {
            this.ad.a((TStep bNR2) -> {
                if (bNR2.h() == 0 || bNR2.h() == 16 || bNR2.h() == this.al) {
                    return;
                }
                abq_22.add(new cTk(bNR2.a(), this.B, bNR2.h()));
            });
            abq_22.add(new cTk(0, this.B, -1));
            if (bl2) {
                return abq_22.toArray(new cSS[abq_22.size()]);
            }
        }
        if (!bl && bmr_12.di() == bmr_12.dj()) {
            abq_22.add(new cTk(0, this.B, -1));
        }
        bNR bNR3 = (bNR)this.ad.b(this.al);
        int n = bNR3.g();
        for (int k = 0; k < n; ++k) {
            brw_1 brw_12 = (brw_1)bNR3.c(k);
            abq_22.add(new cTl(this, brw_12));
        }
        return abq_22.toArray(new cSS[abq_22.size()]);
    }

    private boolean aU() {
        return this.ad.a(this.al);
    }

    public brw_1 b(int n) {
        return (brw_1)((bNR)this.ad.b(this.al)).b(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(int[] nArray, long l) {
        long l2 = System.nanoTime();
        try {
            String string = this.ad.a((int)this.C, (int)this.D, l);
            if (string != null) {
                this.a(string, true);
                this.a(string);
                this.af = true;
            }
        }
        catch (Exception exception) {
            Y.error((Object)"Erreur de cr\u00e9ation de ressource ", (Throwable)exception);
        }
        finally {
            long l3 = System.nanoTime();
            nArray[0] = (int)((long)nArray[0] - (l3 - l2) / 1000000L);
        }
    }

    public void c() {
        if (aj != null) {
            try {
                aj.returnObject((Object)this);
            }
            catch (Exception exception) {
                Y.error((Object)"Erreur lors du retour d'une resource au pool", (Throwable)exception);
            }
        } else {
            this.onCheckIn();
        }
    }

    private void b(byte by, boolean bl) {
        if (by == 16) {
            return;
        }
        this.c(true);
        if (by == 0) {
            dbm_0.a().a(this);
            this.ak = bNO.a().a((byte)0, this.al);
            this.i = false;
        } else if (bl && by != this.al) {
            this.ak = by > this.al || this.al == 16 ? bNO.a().a((byte)1, by) : bNO.a().a((byte)3, this.al, by);
            this.i = false;
            this.g(bNO.a().a((byte)2, by));
            this.j = true;
        } else {
            this.ak = bNO.a().a((byte)2, by);
            this.i = true;
            this.g(this.ak);
            this.j = true;
        }
        this.e(this.ak);
    }

    public void a(byte by, boolean bl) {
        this.b(by, bl);
        this.al = by;
        this.aM();
        this.aV();
    }

    public void aM() {
        yx_0 yx_02 = yz_0.a((int)((short)this.G()), (int)((short)this.H()));
        if (yx_02 != null) {
            yx_02.a(this.G(), this.H(), this.aG());
        } else {
            Y.warn((Object)("mise \u00e0 jour de l'\u00e9tat d'une ressource en (" + this.G() + ", " + this.H() + ") alors que la map est inconnue/pas charg\u00e9e\t"));
        }
    }

    public boolean a(ahg_0 ahg_02, int n, int[] nArray) {
        if (!this.af) {
            if (nArray[0] <= 0) {
                return false;
            }
            this.a(nArray, YX.a());
        }
        return super.a(ahg_02, n);
    }

    @Override
    public void a(String string, boolean bl) {
        super.a(string, bl);
        this.aV();
    }

    private void aV() {
        this.aT();
        if (this.al == 0 || this.al == 16) {
            return;
        }
        fjz_0 fjz_02 = ((bNR)this.ad.b(this.al)).b();
        if (fjz_02 == null) {
            Y.warn((Object)("resource sans resourceSizeCategory " + this.aW() + " m_evolutionStep=" + this.al));
            return;
        }
        this.a((short)(fjz_02.b() / 10));
        this.h(fjz_02.a());
        if (fjz_02.c()) {
            if (!this.ap) {
                aof_0.a.a(this);
                this.ap = true;
            }
        } else if (this.ap) {
            aof_0.a.b(this);
            this.ap = false;
        }
        if (fjz_0.a(fjz_02)) {
            this.g(ahi_0.d.a());
        } else {
            this.g(ahi_0.l.a());
        }
    }

    public byte aN() {
        return this.al;
    }

    public boolean aO() {
        return this.ae;
    }

    public void a(boolean bl) {
        this.ae = bl;
    }

    public boolean aP() {
        return this.al != 0 && this.al != 16;
    }

    @Override
    public short af() {
        if (this.ad != null) {
            return this.ad.f();
        }
        return super.af();
    }

    String aW() {
        if (this.aL().length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = this.v();
        if (bl) {
            stringBuilder.append("[").append(this.a()).append("] ");
        }
        stringBuilder.append(this.ad.c());
        if (bl) {
            stringBuilder.append(" [").append(this.G()).append(", ").append(this.H()).append(", ").append(this.I()).append("]");
            if (this.ae) {
                stringBuilder.append(" (autoRespawn)");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public azj_2 h() {
        return azf_2.j;
    }

    @Override
    public String g() {
        return this.aW();
    }

    public fjz_0 aQ() {
        bNR bNR2 = (bNR)this.ad.b(this.al);
        return bNR2.b();
    }

    public bNI aR() {
        return this.ad;
    }

    @Override
    public String ab() {
        return bNO.a().a((byte)2, this.aN());
    }

    public void f(float f2) {
        this.aq = f2;
    }

    @Override
    public void b(float[] fArray) {
        fArray[0] = fArray[0] * this.aq;
        fArray[1] = fArray[1] * this.aq;
        fArray[2] = fArray[2] * this.aq;
        super.b(fArray);
    }

    @Override
    public boolean aE() {
        cSS[] cSSArray;
        for (cSS cSS2 : cSSArray = this.aL()) {
            if (!cSS2.c()) continue;
            return super.aE();
        }
        return false;
    }

    @Override
    public aff_1 P_() {
        return this.F;
    }

    @Override
    public int cO() {
        return this.ad.j();
    }

    @Override
    public long T_() {
        throw new UnsupportedOperationException("On ne devrait pas faire appel \u00e0 getInstanceId dans le client");
    }

    static /* synthetic */ Logger aS() {
        return Y;
    }
}

