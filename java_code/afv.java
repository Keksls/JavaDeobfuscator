/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class afv
extends abz_0 {
    protected static final Logger ac = Logger.getLogger(afv.class);
    protected final ArrayList<afk_0<afe_0>> ad = new ArrayList(2);
    private afv aj;
    private afv ak;
    private ArrayList<afv> al;
    private afv am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private byte aq;
    public static final byte ae = 0;
    public static final byte af = 1;
    public static final byte ag = 2;
    public static final int ah = 500;
    private static final int ar = 1;
    private static final int as = 1;
    private int at = -1;

    public afv(long l) {
        super(l);
    }

    public afv(long l, float f2, float f3, float f4) {
        super(l, f2, f3, f4);
    }

    public afv(long l, float f2, float f3) {
        super(l, f2, f3);
    }

    public boolean b() {
        return this.ap;
    }

    @Override
    public void a(aej_2 aej_22) {
        if (aej_22 == null) {
            ac.error((Object)"Unable to set a Direction8 to null", (Throwable)new Exception());
            return;
        }
        if (this.W == aej_22) {
            return;
        }
        int n = aej_22.l - this.W.l;
        this.W = aej_22;
        this.X = true;
        if (this.al != null) {
            int n2 = this.al.size();
            for (int k = 0; k < n2; ++k) {
                afv afv2 = this.al.get(k);
                if (!afv2.ao) continue;
                afv2.a(this.W);
            }
        }
    }

    @Override
    public void b(float f2, float f3, float f4) {
        int n = this.G();
        int n2 = this.H();
        short s2 = this.I();
        super.b(f2, f3, f4);
        int n3 = this.G();
        int n4 = this.H();
        if (n3 != n || n4 != n2) {
            this.a(new int[]{this.G(), this.H(), Math.round(this.L())}, new int[]{n, n2, s2});
        }
        if (this.aj != null) {
            this.aj.b(f2, f3, f4 + (float)this.af());
        }
        if (this.al != null) {
            int n5 = this.al.size();
            for (int k = 0; k < n5; ++k) {
                this.al.get(k).b(f2, f3, f4 + (float)this.af());
            }
        }
    }

    protected void a(afv afv2) {
        this.aj = afv2;
    }

    public afv c() {
        return this.aj;
    }

    protected void b(afv afv2) {
        this.ak = afv2;
    }

    public afv d() {
        return this.ak;
    }

    public boolean e() {
        return this.ak != null;
    }

    public boolean aG() {
        return this.aj != null;
    }

    public void c(afv afv2) {
        if (afv2 == this || afv2 == null) {
            return;
        }
        afv2.b(this);
        this.a(afv2);
        afv2.E();
    }

    @Override
    public boolean e(String string) {
        boolean bl = super.e(string);
        if (bl && this.al != null) {
            int n = this.al.size();
            for (int k = 0; k < n; ++k) {
                afv afv2 = this.al.get(k);
                if (!afv2.an) continue;
                afv2.e(string);
            }
        }
        return bl;
    }

    @Override
    public boolean a(acb_0 acb_02) {
        if (!super.a(acb_02)) {
            return false;
        }
        if (this.ak != null) {
            Matrix44 matrix44 = this.ak.an().t();
            if (matrix44 == null) {
                return false;
            }
            this.a(acb_02, matrix44, this.ak);
            this.t().e = this.ak.t().e + 1L;
            this.a(this.ak.aq(), this.ak.ar());
        } else if (this.am != null && this.am.an() != null) {
            Matrix44 matrix44 = this.am.an().u();
            this.a(acb_02, matrix44, this.am);
        }
        return true;
    }

    public afv aH() {
        if (this.aj != null) {
            this.f((String)null);
            this.aj.b((afv)null);
            afv afv2 = this.aj;
            this.a((afv)null);
            afv2.E();
            return afv2;
        }
        return null;
    }

    public afv a(boolean bl, aff_1 aff_12) {
        if (this.aj != null) {
            if (bl) {
                this.f((String)null);
                this.a(aff_12);
            }
            this.aj.b((afv)null);
            afv afv2 = this.aj;
            this.a((afv)null);
            if (bl) {
                afv2.E();
            }
            return afv2;
        }
        return null;
    }

    private void a(aff_1 aff_12) {
        ais_0 ais_02 = new ais_0(this.aj);
        ais_02.c(new afr_2(aff_12.d(), aff_12.e(), aff_12.f()));
        ais_02.a(new afr_2(this.aj.G(), this.aj.H(), this.aj.I() + this.af()));
        ais_02.a(500L);
        ais_02.b(new afr_2(0.0f, 0.0f, 1.0f));
        ais_02.d(new afr_2(0.0f, 0.0f, 1.0f));
        aix_0.a().a(ais_02);
    }

    public void d(afv afv2) {
        this.a(afv2, false, false, true);
    }

    public void a(afv afv2, boolean bl, boolean bl2, boolean bl3) {
        assert (this.am == null) : "A mobile is already linked to this mobile";
        assert (afv2 != null) : "You can't link a null mobile";
        if (this.al == null) {
            this.al = new ArrayList(1);
        }
        this.al.add(afv2);
        afv2.am = this;
        afv2.an = bl;
        afv2.ap = bl2;
        afv2.ao = bl3;
        this.E();
        afv2.E();
        afv2.aN();
    }

    public final void aI() {
        if (this.al == null) {
            return;
        }
        int n = this.al.size();
        for (int k = 0; k < n; ++k) {
            afv afv2 = this.al.get(k);
            afv2.am = null;
            afv2.E();
        }
        this.al.clear();
        this.al = null;
    }

    public final void e(afv afv2) {
        if (this.al == null) {
            return;
        }
        this.al.remove(afv2);
        afv2.am = null;
        afv2.E();
    }

    public ArrayList<afv> aJ() {
        return this.al;
    }

    public afv aK() {
        return this.am;
    }

    public final void a(afk_0<afe_0> afk_02) {
        if (afk_02 != null && !this.ad.contains(afk_02)) {
            this.ad.add(afk_02);
        }
    }

    public final boolean b(afk_0<afe_0> afk_02) {
        return this.ad.contains(afk_02);
    }

    public final boolean c(afk_0<afe_0> afk_02) {
        return afk_02 != null && this.ad.remove(afk_02);
    }

    public final void aL() {
        this.ad.clear();
    }

    protected void a(int[] nArray, int[] nArray2) {
        if (this.ad != null) {
            afk_0[] afk_0Array;
            for (afk_0 afk_02 : afk_0Array = this.ad.toArray(new afk_0[this.ad.size()])) {
                afk_02.cellPositionChanged(this, nArray[0], nArray[1], (short)nArray[2]);
            }
        }
        if (this.c() != null) {
            this.c().a(nArray, nArray2);
        }
    }

    public void a(byte by) {
        this.aq = by;
    }

    public byte aM() {
        return this.aq;
    }

    public void a(int n) {
        this.at = n;
    }

    @Override
    public int az() {
        return this.at;
    }

    private void a(acb_0 acb_02, Matrix44 matrix44, afv afv2) {
        ayw_2 ayw_22 = new ayw_2();
        Matrix44 matrix442 = ayw_22.a();
        matrix442.a(matrix44);
        matrix442.e(afv2.a((ahg_0)acb_02));
        float f2 = afv2.an().p();
        float[] fArray = matrix442.c();
        fArray[0] = fArray[0] / f2;
        fArray[5] = fArray[5] / f2;
        BatchTransformer batchTransformer = this.t().D();
        batchTransformer.b(0, ayw_22);
        matrix442.u();
    }

    @Override
    public void b(float[] fArray) {
        if (this.am != null) {
            this.aN();
        } else {
            super.b(fArray);
            if (this.al != null) {
                int n = this.al.size();
                for (int k = 0; k < n; ++k) {
                    this.al.get(k).aN();
                }
            }
        }
    }

    protected void aN() {
        if (this.am == null) {
            return;
        }
        Material material = this.am.w();
        this.z.d(material.a());
        this.u().a(this.z);
    }

    public void f(afv afv2) {
        atd_2 atd_22 = this.an();
        if (atd_22 == null) {
            return;
        }
        atd_2 atd_23 = afv2.an();
        if (atd_23 == null) {
            return;
        }
        atd_22.a(atd_23);
    }

    public void aO() {
    }

    public void aP() {
    }
}

