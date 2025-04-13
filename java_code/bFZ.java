/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

public abstract class bFZ
extends pj_0
implements cUM {
    private static final Logger q = Logger.getLogger(bFZ.class);
    protected short x;
    protected boolean y;
    private TI r = TI.a;
    protected boolean z;
    protected boolean A = true;
    protected boolean B;
    protected int C;
    protected boolean D;
    protected boolean E;
    private ezv_1 s = ezv_1.c;
    protected final bgz_1 F = new bga_0(this);
    protected bgf_1 G;
    private String t;
    private ArrayList<aff_1> u;
    protected int H = -1;
    private long v;
    private final fo_1 w = new bga_1(this);
    private final fo_1 J = new bgb_1(this);
    private final fo_1 K = new bgc_1(this);

    public static bFZ a(long l, byte[] byArray) {
        bFZ bFZ2 = (bFZ)bfv_0.b().d(l);
        if (bFZ2 == null) {
            q.error((Object)("Impossible de spawner l'\u00e9l\u00e9ment interactif instanceId=" + l));
            return null;
        }
        if (byArray != null) {
            bFZ2.a_(byArray);
        }
        bFZ2.aI_();
        for (ph_0 ph_02 : bFZ2.av_()) {
            if (!(ph_02 instanceof ahv)) continue;
            ahv ahv2 = (ahv)ph_02;
            ahs.d().a(ahv2);
            ahv2.Q();
            aiI.a(ahv2);
        }
        return bFZ2;
    }

    @Override
    public void f(boolean bl) {
        super.f(bl);
        if (!bl) {
            this.ao();
        }
        for (ph_0 ph_02 : this.av_()) {
            ((bfr_0)ph_02).c(bl);
        }
    }

    @Override
    public boolean P() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return super.P();
        }
        if (!this.c(eud_1.a)) {
            return super.P();
        }
        bvx_2 bvx_22 = bmr_12.cP();
        aff_1 aff_12 = this.P_();
        return super.P() && (bvx_22 == null || !bvx_22.g().c(aff_12.d(), aff_12.e()));
    }

    private void ao() {
        cSN cSN2 = dan.a().c();
        if (cSN2 != null) {
            int n = cSN2.b();
            for (int k = 0; k < n; ++k) {
                cUM cUM2 = cSN2.a(k);
                if (cUM2 != this) continue;
                dan.a().d();
                break;
            }
        }
    }

    @Override
    public int G() {
        return this.e.d();
    }

    @Override
    public int H() {
        return this.e.e();
    }

    @Override
    public short I() {
        return this.e.f();
    }

    public float J() {
        return this.G();
    }

    public float K() {
        return this.H();
    }

    public float L() {
        return this.I();
    }

    @Override
    public List<aff_1> aK_() {
        if (this.u == null) {
            this.aq_();
        }
        return Collections.unmodifiableList(this.u);
    }

    public boolean c(aff_1 aff_12) {
        return this.aK_().contains(aff_12);
    }

    public String al_() {
        return this.t;
    }

    public short as() {
        return this.x;
    }

    public void c(short s2) {
        this.x = s2;
    }

    public int at() {
        return this.C;
    }

    public final TI au() {
        return this.r;
    }

    protected final void a(TI tI) {
        this.r = tI;
    }

    public boolean au_() {
        return this.B;
    }

    public void i(boolean bl) {
        this.B = bl;
    }

    public boolean av() {
        return this.A;
    }

    public void j(boolean bl) {
        this.A = bl;
    }

    public boolean am_() {
        return this.z;
    }

    public void k(boolean bl) {
        this.z = bl;
    }

    public boolean aw() {
        return this.E;
    }

    public void l(boolean bl) {
        this.E = bl;
    }

    public boolean an_() {
        return this.y;
    }

    public void m(boolean bl) {
        this.y = bl;
    }

    public void a(aff_1 aff_12) {
        this.e.g(aff_12);
    }

    @Override
    public boolean a(Tv tv, TF tF) {
        if (!ArrayUtils.contains((Object[])this.w(), (Object)tv)) {
            q.warn((Object)("Tentative de fire de l'action " + tv + " sur l'\u00e9l\u00e9ment interactif " + this + " alors que celle-ci n'est pas g\u00e9r\u00e9e"), (Throwable)new UnsupportedOperationException());
            return false;
        }
        boolean bl = false;
        if (this.s.h()) {
            bl = this.s.a(tv, tF);
        } else if (this.G != null) {
            bl = this.G.b(tv, tF);
        }
        if (!bl) {
            bl = super.a(tv, tF);
        }
        if (bl) {
            bua_0.a.a(new bui_2(this, tv.a()));
        }
        if (tF.a_() == azu_0.j().k().a_()) {
            aln_2.a().c(new byg_0(this.a_(), tv.a()));
        }
        return bl;
    }

    @Override
    public final Tv[] w() {
        if (this.s.h()) {
            return this.s.w();
        }
        if (this.G != null) {
            return this.G.r();
        }
        return this.r();
    }

    public abstract Tv[] r();

    protected void ax() {
        if (!(this instanceof ezz_1)) {
            return;
        }
        ezz_1 ezz_12 = (ezz_1)((Object)this);
        if (ezz_12.ay_() == null) {
            return;
        }
        this.s = new blq_1(ezz_12);
    }

    @Override
    public final void a(short s2) {
        if (s2 == this.g) {
            return;
        }
        super.a(s2);
        this.s.a(s2);
        this.ao_();
    }

    public ezv_1 ay() {
        return this.s;
    }

    protected void ao_() {
        this.aI_();
    }

    @Override
    public final Tv v() {
        return this.s.h() ? this.s.v() : this.ap_();
    }

    protected abstract Tv ap_();

    @Override
    public void b(Tv tv) {
        azu_0.j().k().bv().bD();
        cnG cnG2 = new cnG();
        cnG2.a(tv.a());
        cnG2.a(this.a_());
        azu_0.j().K().c(cnG2);
    }

    @Override
    public cSS[] aI() {
        if (this.s.h()) {
            return ((blq_1)this.s).f();
        }
        if (this.G != null) {
            return this.G.az_();
        }
        return this.az_();
    }

    public cSS[] az_() {
        return cSS.k;
    }

    @Override
    public boolean aJ() {
        return true;
    }

    @Override
    public final Point aK() {
        ace_0 ace_02 = ans_0.D().c();
        afd_1 afd_12 = aht_0.c(ace_02, this.J(), this.K(), this.L() + (float)this.W());
        int n = Hw.b(afd_12.a);
        int n2 = Hw.b(afd_12.b);
        return new Point(n, n2);
    }

    @Override
    public short aL() {
        return 0;
    }

    public byte W() {
        Iterator<ph_0> iterator = this.av_().iterator();
        if (iterator.hasNext()) {
            ph_0 ph_02 = iterator.next();
            return ph_02.c();
        }
        return 4;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.x = 0;
        this.y = false;
        this.r = TI.a;
        this.z = false;
        this.A = true;
        this.B = false;
        this.C = 0;
        this.D = false;
        this.E = false;
        assert (this.s == ezv_1.c);
        this.t = "";
        assert (this.u == null);
        this.H = -1;
        this.v = -1L;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.t = null;
        this.s = ezv_1.c;
        this.u = null;
        this.G = null;
        this.F.g();
        this.v = -1L;
    }

    @Override
    protected final fo_1 U() {
        return this.w;
    }

    @Override
    protected final fo_1 V() {
        return this.J;
    }

    @Override
    protected fo_1 ad() {
        return fo_1.c;
    }

    protected fo_1 aA_() {
        return this.K;
    }

    @Override
    public fo_1[] b_() {
        return new fo_1[]{this.e(), this.U(), this.V(), this.ad(), this.f(), this.g(), this.aA_()};
    }

    public String am() {
        return null;
    }

    public boolean a(biE biE2) {
        return !this.aB_() && this.c(biE2.ap());
    }

    @Override
    public boolean aB_() {
        return this.D;
    }

    public void aq_() {
        if (this.aj()) {
            return;
        }
        ArrayList<Tx> arrayList = Tx.b(this.j);
        this.D = false;
        if (arrayList.contains(Tx.l)) {
            if (this.M()) {
                arrayList.remove(Tx.l);
                if (arrayList.isEmpty()) {
                    q.error((Object)("[Level Design] Element interactif bloquant, et pas de pattern d'activation valide : " + this.e));
                    this.D = true;
                }
            } else if (arrayList.size() == 1) {
                this.D = true;
            }
        }
        aff_1 aff_12 = new aff_1();
        this.u = new ArrayList();
        yz_0.a((short)6, (byte)0, (short)4);
        if (arrayList.contains(Tx.l)) {
            this.u.add(new aff_1(this.G(), this.H(), this.I()));
        }
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            Tx tx = arrayList.get(k);
            if (tx == Tx.l) continue;
            aej_2 aej_22 = aej_2.a((this.F().l + tx.b()) % 8);
            aff_12.c(this.e.d() + aej_22.m, this.e.e() + aej_22.n, this.e.f());
            short s2 = (short)XY.a(aff_12.d());
            short s3 = (short)XY.b(aff_12.e());
            try {
                if (YX.b(s2, s3)) {
                    yz_0.b(s2, s3);
                    short s4 = yz_0.a(aff_12.d(), aff_12.e(), aff_12.f());
                    if (s4 == Short.MIN_VALUE) continue;
                    aff_12.a(s4);
                    this.u.add(new aff_1(aff_12));
                    continue;
                }
                q.error((Object)("On veut charger une cellule qui n'appartient \u00e0 aucune map " + aff_12 + " world=" + YX.a() + " IE=" + this.a_()));
                continue;
            }
            catch (IOException iOException) {
                q.error((Object)("Impossible de charger la map [" + s2 + ", " + s3 + "]"), (Throwable)iOException);
            }
        }
    }

    public void ar_() {
    }

    public void aC_() {
    }

    private void a(yx_0 yx_02, boolean bl) {
        if (this.E()) {
            yx_02.a(this.G(), this.H(), bl);
        } else {
            yx_02.a(this.G(), this.H(), this.I(), bl);
        }
    }

    @Override
    public void aD_() {
        super.aD_();
        this.az();
    }

    public void az() {
        if (!this.M()) {
            return;
        }
        aff_1 aff_12 = this.P_();
        short s2 = (short)XY.a(aff_12.d());
        short s3 = (short)XY.b(aff_12.e());
        try {
            yz_0.b(s2, s3);
        }
        catch (IOException iOException) {
            q.warn((Object)"Probl\u00e8me au chargement de la topologie de la map");
        }
        yx_0 yx_02 = this.h();
        if (yx_02 != null) {
            this.a(yx_02, true);
        } else {
            q.error((Object)"Impossible de marquer bloquant un \u00e9l\u00e9ment sans topologie");
        }
    }

    @Override
    public void aE_() {
        Object object;
        Object object2;
        super.aE_();
        if (this.c(eud_1.a)) {
            object2 = aij_0.a();
            object = this.av_();
            Iterator<ph_0> iterator = object.iterator();
            while (iterator.hasNext()) {
                ph_0 ph_02 = iterator.next();
                if (!(ph_02 instanceof ahv)) continue;
                FreeParticleSystem freeParticleSystem = ((aij_0)object2).a(800030);
                freeParticleSystem.a((ahv)ph_02);
                aik_0.a().b(freeParticleSystem);
            }
        }
        if ((object2 = this.h()) != null && this.M()) {
            this.a((yx_0)object2, false);
        }
        object = ahs.d();
        for (ph_0 ph_02 : this.av_()) {
            if (!(ph_02 instanceof ahv)) continue;
            ((ahs)object).b((ahv)ph_02);
        }
        this.release();
    }

    @Override
    public void g(boolean bl) {
        super.g(bl);
        yx_0 yx_02 = this.h();
        if (this.a && yx_02 != null) {
            int n = this.G();
            int n2 = this.H();
            short s2 = this.I();
            bNK bNK2 = bNT.f().c(n, n2);
            if (bNK2 != null && bNK2.I() == s2 && bNK2.aG()) {
                return;
            }
            cch_1 cch_12 = (cch_1)ccm_1.g().c(n, n2);
            bgd_1 bgd_12 = new bgd_1(n, n2, s2);
            cch_12.b(bgd_12);
            this.a(yx_02, bgd_12.a());
        }
    }

    public int as_() {
        return -1;
    }

    public void b(int n) {
        this.H = n;
    }

    public boolean c(int n) {
        return this.H == n;
    }

    public int aA() {
        return this.H;
    }

    public boolean aF_() {
        return true;
    }

    public bgz_1 aB() {
        return this.F;
    }

    @Override
    public void a(aej_2 aej_22) {
        super.a(aej_22);
        this.u = null;
    }

    protected void c(String string) {
        this.t = string;
    }

    public bgf_1 aG_() {
        throw new UnsupportedOperationException("Il faut implementer cette methode pour rendre l'ie deployable");
    }

    public bgf_1 aH_() {
        return this.G;
    }

    public void e(long l) {
        this.v = l;
    }

    public long aC() {
        return this.v;
    }

    static /* synthetic */ long a(bFZ bFZ2, long l) {
        bFZ2.f = l;
        return bFZ2.f;
    }

    static /* synthetic */ aff_1 a(bFZ bFZ2) {
        return bFZ2.e;
    }

    static /* synthetic */ aff_1 b(bFZ bFZ2) {
        return bFZ2.e;
    }

    static /* synthetic */ aff_1 c(bFZ bFZ2) {
        return bFZ2.e;
    }

    static /* synthetic */ short a(bFZ bFZ2, short s2) {
        bFZ2.g = s2;
        return bFZ2.g;
    }

    static /* synthetic */ boolean a(bFZ bFZ2, boolean bl) {
        bFZ2.h = bl;
        return bFZ2.h;
    }

    static /* synthetic */ short b(bFZ bFZ2, short s2) {
        bFZ2.j = s2;
        return bFZ2.j;
    }

    static /* synthetic */ HashSet d(bFZ bFZ2) {
        return bFZ2.k;
    }

    static /* synthetic */ String a(bFZ bFZ2, String string) {
        bFZ2.l = string;
        return bFZ2.l;
    }

    static /* synthetic */ boolean b(bFZ bFZ2, boolean bl) {
        bFZ2.m = bl;
        return bFZ2.m;
    }

    static /* synthetic */ boolean c(bFZ bFZ2, boolean bl) {
        bFZ2.n = bl;
        return bFZ2.n;
    }
}

