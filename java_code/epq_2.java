/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Shorts
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongShortIterator
 *  gnu.trove.map.hash.TLongShortHashMap
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.primitives.Shorts;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongShortIterator;
import gnu.trove.map.hash.TLongShortHashMap;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from epq
 */
public abstract class epq_2
implements ry_0,
Tt,
abu_1,
elw_0,
emh_1,
eot_1,
eqq_1,
erb_2,
erc_2,
faU,
fhp_0,
fha,
fkV {
    private static final boolean a = false;
    public static final eps_0[] c = new eps_0[]{eps_0.b, eps_0.c, eps_0.d, eps_0.e, eps_0.al, eps_0.ax, eps_0.ar, eps_0.B, eps_0.q, eps_0.r, eps_0.s, eps_0.t, eps_0.u, eps_0.v, eps_0.w, eps_0.x, eps_0.y, eps_0.f, eps_0.g, eps_0.Y};
    public static final eps_0[] cH = new eps_0[]{eps_0.C, eps_0.A, eps_0.j, eps_0.h, eps_0.i, eps_0.o, eps_0.k, eps_0.m, eps_0.p, eps_0.q, eps_0.r, eps_0.s, eps_0.t, eps_0.Y};
    public static final eps_0[] cI = new eps_0[]{eps_0.b, eps_0.c, eps_0.d, eps_0.e, eps_0.al, eps_0.ax, eps_0.ar, eps_0.B, eps_0.u, eps_0.v, eps_0.w, eps_0.x, eps_0.y, eps_0.f, eps_0.g, eps_0.m, eps_0.p, eps_0.q, eps_0.r, eps_0.s, eps_0.t, eps_0.h, eps_0.i, eps_0.o, eps_0.Y, eps_0.au, eps_0.av, eps_0.M, eps_0.aw, eps_0.N, eps_0.O, eps_0.T, eps_0.U};
    private static final int b = 5;
    protected static final Logger cJ = Logger.getLogger(epq_2.class);
    protected boolean cK = true;
    private String d;
    protected final Collection<eql_2> cL = new ArrayList<eql_2>();
    protected boolean cM;
    protected long cN;
    protected long cO;
    protected byte cP = (byte)-1;
    protected String cQ;
    protected long cR;
    protected byte cS;
    protected aej_2 cT = aej_2.h;
    protected boolean cU;
    protected eov_1<epa_1> cV;
    private eqi_2<? extends epq_2> e = eqi_2.e;
    protected final eJG cW = new eJG(this, 3);
    protected final eJG cX = new eJG(this, 4);
    protected epq_1 cY = epn_2.b;
    protected final aff_1 cZ = new aff_1();
    private eJL f;
    eri_2<eoz_1> g;
    eri_2<erl_2> h;
    private aej_2 i;
    private boolean j;
    private final faV k;
    private final eqt_1 l = new eqt_1(this);
    private epq_2 m;
    private final List<ema_0> n = new ArrayList<ema_0>();
    private final List<ema_0> o = new ArrayList<ema_0>();
    private final eqw_1 p = new eqw_1();
    protected boolean da;
    private fji q;
    private int r;
    protected int db = -1;
    protected erc_2 dc;
    protected erb_2 dd;
    private epf_2 s;
    private byte t = 0;
    private TLongShortHashMap u;

    protected epq_2() {
        this.k = this.au();
    }

    public void a(eqy_1 eqy_12) {
        this.e.a(eqy_12);
    }

    public eqy_1 fC() {
        return this.e.g();
    }

    public void a(vw_0 vw_02) {
        this.e.a(vw_02);
    }

    public vw_0 fD() {
        return this.e.o();
    }

    public abstract long f(long var1);

    public abstract eph_2 T();

    public abstract Collection<? extends epq_2> am();

    public abstract epq_2 d(long var1);

    public abstract eyo_1 av();

    public abstract exp_1 cj();

    public abstract long cq();

    public abstract eqm_2 cr();

    public abstract void co();

    public abstract boolean cp();

    protected abstract faV au();

    @Override
    @NotNull
    public faV fE() {
        return this.k;
    }

    @Override
    public long fc() {
        return 0L;
    }

    public boolean a(ema_0 ema_02) {
        return !this.n.contains(ema_02) && this.n.add(ema_02);
    }

    public boolean b(ema_0 ema_02) {
        return this.o.add(ema_02);
    }

    private void y() {
        this.n.removeAll(this.o);
        this.o.clear();
    }

    private void z() {
        for (int k = 0; k < this.n.size(); ++k) {
            try {
                this.n.get(k).a(this);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                cJ.error((Object)("[Character] No listener at index " + k + " to notify fight join: " + this), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                cJ.error((Object)("[Character] An error occurred while notifying listener " + this.n.get(k).getClass().getSimpleName() + " of fight join: " + this), (Throwable)exception);
            }
        }
        this.y();
    }

    private void A() {
        for (int k = 0; k < this.n.size(); ++k) {
            try {
                this.n.get(k).b(this);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                cJ.error((Object)("[Character] No listener at index " + k + " to notify fight leave: " + this), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                cJ.error((Object)("[Character] An error occurred while notifying listener " + this.n.get(k).getClass().getSimpleName() + " of fight leave: " + this), (Throwable)exception);
            }
        }
        this.y();
    }

    protected void fF() {
        for (int k = 0; k < this.n.size(); ++k) {
            try {
                this.n.get(k).c(this);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                cJ.error((Object)("[Character] No listener at index " + k + " to notify fight won: " + this), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                cJ.error((Object)("[Character] An error occurred while notifying listener " + this.n.get(k).getClass().getSimpleName() + " of fight won: " + this), (Throwable)exception);
            }
        }
        this.y();
    }

    protected void fG() {
        for (int k = 0; k < this.n.size(); ++k) {
            try {
                this.n.get(k).d(this);
                continue;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                cJ.error((Object)("[Character] No listener at index " + k + " to notify fight lost: " + this), (Throwable)indexOutOfBoundsException);
                continue;
            }
            catch (Exception exception) {
                cJ.error((Object)("[Character] An error occurred while notifying listener " + this.n.get(k).getClass().getSimpleName() + " of fight lost: " + this), (Throwable)exception);
            }
        }
        this.y();
    }

    public faX fH() {
        return fbc_0.a.a(this.bN());
    }

    public int fI() {
        faX faX2 = this.fH();
        return faX2 == null ? -1 : faX2.c();
    }

    protected void fJ() {
        epa_1 epa_12;
        epa_1 epa_13;
        epa_1 epa_14;
        epa_1 epa_15;
        epa_1 epa_16;
        epa_1 epa_17;
        epa_1 epa_18;
        epa_1 epa_19;
        epa_1 epa_110;
        epa_1 epa_111;
        eov_1<epa_1> eov_12 = this.cV;
        if (!(eov_12 instanceof epc_0)) {
            cJ.error((Object)"Les NPCs ont des caract\u00e9ristiques paresseuses. Les proc\u00e9dures doivent \u00eatre ajout\u00e9es sur la breed.");
            return;
        }
        epc_0 epc_02 = (epc_0)eov_12;
        epa_1 epa_112 = epc_02.e(eps_0.E);
        if (epa_112 != null) {
            epa_112.a(new epj_0(epc_02, eps_0.t, 1.0f, 0));
        }
        if ((epa_111 = epc_02.e(eps_0.F)) != null) {
            epa_111.a(new epj_0(epc_02, eps_0.s, 1.0f, 0));
        }
        if ((epa_110 = epc_02.e(eps_0.G)) != null) {
            epa_110.a(new epj_0(epc_02, eps_0.q, 1.0f, 0));
        }
        if ((epa_19 = epc_02.e(eps_0.D)) != null) {
            epa_19.a(new epj_0(epc_02, eps_0.r, 1.0f, 0));
        }
        if ((epa_18 = epc_02.e(eps_0.r)) != null) {
            epa_18.a(new epr_0(epc_02, this));
            epa_18.a(new epp_0(epc_02, this));
        }
        if ((epa_17 = epc_02.e(eps_0.q)) != null) {
            epa_17.a(new epr_0(epc_02, this));
            epa_17.a(new epp_0(epc_02, this));
        }
        if ((epa_16 = epc_02.e(eps_0.s)) != null) {
            epa_16.a(new epr_0(epc_02, this));
            epa_16.a(new epp_0(epc_02, this));
        }
        if ((epa_15 = epc_02.e(eps_0.t)) != null) {
            epa_15.a(new epr_0(epc_02, this));
            epa_15.a(new epp_0(epc_02, this));
        }
        if ((epa_14 = epc_02.e(eps_0.Z)) != null) {
            epa_14.a(new epr_0(epc_02, this));
        }
        if ((epa_13 = epc_02.e(eps_0.ai)) != null) {
            epa_13.a(new epp_0(epc_02, this));
        }
        if ((epa_12 = epc_02.e(eps_0.e)) != null) {
            epa_12.a(new epq_0(epc_02));
        }
        if (this.ak()) {
            this.fK();
        }
    }

    public void fK() {
        if (this.Z_() != epn_2.m) {
            return;
        }
        epa_1 epa_12 = this.cV.b(eps_0.b);
        epa_1 epa_13 = this.cV.b(eps_0.T);
        epa_1 epa_14 = this.cV.b(eps_0.J);
        if (epa_14 == null) {
            return;
        }
        epo_0 epo_02 = new epo_0((epc_0)this.cV, 0.8f);
        if (epa_12 != null) {
            epa_12.a(epo_02);
        }
        if (epa_13 != null) {
            epa_13.a(epo_02);
        }
    }

    public abstract void a(int var1);

    public abstract long e(long var1);

    public abstract epq_2 b(long var1, aff_1 var3, short var4, eqy_1 var5, vw_0 var6, boolean var7, eri_2<eoz_1> var8);

    public boolean fL() {
        return false;
    }

    public void ay() {
        this.cK = false;
        this.d = null;
        this.cN = 0L;
        this.cO = 0L;
        this.cP = this.ct();
        this.cR = 0L;
        this.cS = 0;
        this.cQ = "<undefined>";
        this.cY = this.cs();
        this.cT = aej_2.h;
        this.cL.clear();
        this.dd = null;
        this.dc = null;
        this.k.b();
        this.e = eqi_2.e;
    }

    public void x() {
        this.r = 0;
        this.cU = false;
        this.u = null;
        this.cL.clear();
        this.cT = aej_2.h;
        this.cN = 0L;
        this.j = false;
        this.cM = false;
        this.i = null;
        this.cO = -1L;
        if (enp_2.a.d(ens_2.bk)) {
            this.cQ = "<undefined trunk>";
        } else {
            this.cZ.c(-32000, -32000, (short)-1);
            this.cQ = "<undefined>";
        }
        if (this.f != null) {
            this.f.c();
            this.f = null;
        }
        this.p.a();
        this.cS = (byte)-1;
        this.cP = (byte)-1;
        this.h = null;
        if (this.dd != null) {
            this.dd.ap();
        }
        this.dd = null;
        if (this.dc != null) {
            this.dc.at();
        }
        this.dc = null;
        this.gL();
        this.cK = true;
        this.k.b();
        this.s = null;
        this.t = 0;
        this.u = null;
        this.r = 0;
        this.da = false;
        this.e = eqi_2.e;
        if (this.q != null) {
            this.q.b();
            this.q = null;
        }
    }

    @Override
    public void cx() {
        this.x();
    }

    protected abstract epq_1 cs();

    protected abstract byte ct();

    public boolean fM() {
        return this.cK;
    }

    public String fN() {
        return this.d;
    }

    @Override
    public void a(els_0 els_02) {
        els_02.a(this);
        if (this.cP == 5) {
            this.hv().c(false);
        }
        this.cM = true;
        this.z();
    }

    @Override
    public void az() {
        this.cM = false;
        this.dc = null;
        this.dd = null;
        if (this.B()) {
            this.a(this.cW);
        }
        this.A();
        this.e = eqi_2.e;
    }

    private boolean B() {
        return !this.fO();
    }

    protected boolean fO() {
        els_0 els_02 = this.ck();
        return els_02 == null || els_02.E(this);
    }

    protected final void a(So so) {
        this.a(so, null);
    }

    protected final void a(So so, List<eja_0> list) {
        this.a(so, list, true);
    }

    protected void a(So so, List<eja_0> list, boolean bl) {
        try {
            if (list == null) {
                list = this.d(so);
            }
            int n = this.a_(eps_0.b).b();
            eri_2<eoz_1> eri_22 = this.g;
            if (eri_22 != null) {
                eri_22.b();
            }
            if (bl) {
                this.dR().a(true);
                try {
                    this.dR().a();
                }
                catch (Exception exception) {
                    cJ.error((Object)("[Character] Error while clearing running effect manager of " + this), (Throwable)exception);
                }
                this.dR().a(false);
            }
            this.a((eqi_2)((Object)new epa_0()));
            if (!this.C_()) {
                this.co();
            }
            this.b(so);
            this.a((eqi_2)((Object)list));
            this.o(Math.min(n, this.a_(eps_0.b).c()));
        }
        catch (Exception exception) {
            cJ.error((Object)("Exception levee lors du rechargment d'un perso " + this), (Throwable)exception);
        }
    }

    public void o(int n) {
        this.a_(eps_0.b).b(n);
    }

    public int fP() {
        return this.a_(eps_0.b).a();
    }

    public abstract void aA();

    protected static <C extends epq_2> void a(els_0<C> els_02, C c2) {
        if (els_02 == null) {
            return;
        }
        els_02.D(c2);
    }

    public void a(long l, long l2) {
        if (this.ck() == null) {
            return;
        }
        this.ck().a(l, l2);
    }

    @Override
    public void a(byte by) {
        this.e.a(by);
    }

    @Override
    public byte Z() {
        return this.e.j();
    }

    @Override
    public boolean aa() {
        return true;
    }

    @Override
    public boolean ab() {
        return true;
    }

    @Override
    public boolean ac() {
        return !this.a(eoz_1.r) && (this.a(eoz_1.g) || !this.a(eoz_1.f)) && !this.a(eoz_1.aa);
    }

    public long dJ() {
        return 0L;
    }

    @Override
    public aff_1 P_() {
        return this.cZ != null ? new aff_1(this.cZ) : null;
    }

    public aff_1 fQ() {
        long l = euv_2.a.b(this.U_());
        Object t = euw_2.a.d(l);
        return t == null ? null : new aff_1(((epq_2)t).cZ);
    }

    @Override
    public void a(int n, int n2, short s2) {
        assert (s2 >= -512 && s2 <= 511) : "Altitude of the position is out of bounds : " + s2;
        tg_0 tg_02 = this.C();
        if (tg_02 != null && !this.hh() && tg_02.c(this.e.j())) {
            tg_02.a(this, n, n2);
        }
        this.cZ.c(n, n2, s2);
        if (this.cN != -1L && !this.fR()) {
            cJ.error((Object)("Position invalide pour un BasicCharacterInfo : " + this.cZ + " worldId=" + this.cR));
        }
        if (this.dc != null) {
            this.dc.a(n, n2, s2);
            this.dc.hE();
        }
    }

    @Override
    public void a(aff_1 aff_12) {
        this.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    private tg_0 C() {
        els_0 els_02 = this.ck();
        if (els_02 == null) {
            return null;
        }
        return els_02.g();
    }

    protected boolean fR() {
        return true;
    }

    @Override
    public void b(int n, int n2, short s2) {
        throw new UnsupportedOperationException("Not implemented - this method must be overloaded");
    }

    @Nullable
    public fgy_0 aa_() {
        return null;
    }

    @Override
    public boolean a(ru_0 ru_02) {
        return this.cV != null && this.cV.a(ru_02);
    }

    public eaz_0<? extends epq_2> cZ() {
        return null;
    }

    public epa_1 a_(ru_0 ru_02) {
        return this.cV.b(ru_02);
    }

    @Override
    public int c(ru_0 ru_02) {
        return this.cV == null ? 0 : this.cV.c(ru_02);
    }

    @Override
    public int d(ru_0 ru_02) {
        return this.cV.d(ru_02);
    }

    @Override
    public int fS() {
        return this.c(eps_0.g);
    }

    @Override
    public int fT() {
        return this.c(eps_0.f);
    }

    @Override
    public boolean fU() {
        return !this.a(eoz_1.o);
    }

    @Override
    public void a(aej_2 aej_22) {
        int n = aej_22.l - this.cT.l;
        this.cT = aej_22;
        if (this.dc != null) {
            this.dc.a(this.dc.F().b(n));
        }
    }

    @Override
    public void b(aej_2 aej_22) {
        this.i = aej_22;
    }

    @Override
    public aej_2 j() {
        return this.i == null ? this.cT : this.i;
    }

    @Override
    public byte W() {
        if (this.cY != null) {
            return this.cY.d();
        }
        return 6;
    }

    @Override
    public boolean an() {
        return !this.a(eoz_1.P);
    }

    @Override
    public byte X() {
        if (this.cY != null) {
            return this.cY.z();
        }
        return 0;
    }

    @Override
    public short fV() {
        return 4;
    }

    @Override
    public boolean a(rx_0 rx_02) {
        switch (rx_02.a()) {
            case 1: {
                if (this.g == null) break;
                return ((rt_0)this.g).a((eoz_1)rx_02);
            }
            case 0: {
                if (this.h == null) break;
                return ((rt_0)this.h).a((erl_2)rx_02);
            }
        }
        return false;
    }

    @Override
    public boolean f(rx_0 rx_02) {
        return this.a(rx_02);
    }

    public boolean fW() {
        return this.a(eoz_1.f) || this.a(eoz_1.r);
    }

    @Override
    public byte b(rx_0 rx_02) {
        switch (rx_02.a()) {
            case 1: {
                if (this.g == null) break;
                return this.g.b((eoz_1)rx_02);
            }
            case 0: {
                if (this.h == null) break;
                return this.h.b((erl_2)rx_02);
            }
        }
        return 0;
    }

    @Override
    public void a(rx_0 rx_02, byte by) {
        switch (rx_02.a()) {
            case 1: {
                if (this.g != null) {
                    this.g.c((eoz_1)rx_02);
                }
                if (this.g == null) break;
                this.g.a((eoz_1)rx_02, by);
                break;
            }
            case 0: {
                if (this.h == null) {
                    this.h = eri_2.a((byte)0, this);
                }
                if (this.h == null) break;
                this.h.a((erl_2)rx_02, by);
            }
        }
    }

    @Override
    public void c(rx_0 rx_02) {
        switch (rx_02.a()) {
            case 1: {
                if (this.g == null) break;
                this.g.c((eoz_1)rx_02);
                break;
            }
            case 0: {
                if (this.h == null) {
                    this.h = eri_2.a((byte)0, this);
                }
                if (this.h == null) break;
                this.h.c((erl_2)rx_02);
            }
        }
    }

    @Override
    public void d(rx_0 rx_02) {
        if (rx_02 == null) {
            return;
        }
        switch (rx_02.a()) {
            case 1: {
                if (this.g == null) break;
                this.g.d((eoz_1)rx_02);
                break;
            }
            case 0: {
                if (this.h == null) break;
                this.h.d((erl_2)rx_02);
                if (!this.h.d()) break;
                this.h = null;
            }
        }
    }

    @Override
    public void e(rx_0 rx_02) {
        switch (rx_02.a()) {
            case 1: {
                if (this.dR() != null) {
                    this.dR().a((eoz_1)rx_02);
                }
                if (this.g == null) break;
                this.g.e((eoz_1)rx_02);
                break;
            }
            case 0: {
                if (this.h == null) break;
                this.h.e((erl_2)rx_02);
                if (!this.h.d()) break;
                this.h = null;
            }
        }
    }

    @Override
    public void a(rx_0 rx_02, rz_0 rz_02) {
    }

    @Override
    public boolean a(BitSet bitSet, sd_0 sd_02, byte by) {
        return this.dR() != null && this.dR().a(bitSet, sd_02, by);
    }

    @Override
    public boolean F_() {
        return true;
    }

    @Override
    public void a(Su su) {
    }

    @Override
    public void b(Su su) {
    }

    @Override
    public void c(Su su) {
    }

    @Override
    public boolean m() {
        els_0 els_02 = this.ck();
        if (els_02 != null && !els_02.af_().s() && els_02.as() < 2) {
            return false;
        }
        return this.ak() && this.a_(eps_0.b).j() && !this.ab_() && !this.ha();
    }

    @Override
    public boolean l() {
        return this.ak() && this.a_(eps_0.b).a() > 0 && this.e.a();
    }

    @Override
    public boolean ax_() {
        return this.ak() && (this.a_(eps_0.l).j() || this.ck() != null && this.ck().r(this.Y()).isEmpty()) && this.ha() && this.a_(eps_0.b).a() <= 0;
    }

    @Override
    public boolean p() {
        return this.ak() && this.ck() != null && this.ck().G(this);
    }

    @Override
    public boolean t() {
        return this.ak() && this.ck() != null && this.ck().H(this);
    }

    @Override
    public boolean o() {
        return this.ak() && this.ck() != null && this.ck().F(this);
    }

    @Override
    public void n() {
        this.e.a(true);
    }

    @Override
    public void q() {
        this.e.a(false);
    }

    public void t(boolean bl) {
        this.e.d(bl);
    }

    public boolean fX() {
        return this.e.e();
    }

    @Override
    public void s() {
        if (this.D()) {
            return;
        }
        if (!this.a(eoz_1.m) && !this.e.k()) {
            this.a_(true);
        }
    }

    private boolean D() {
        els_0 els_02;
        if (this.dd != null) {
            this.dd.ap();
        }
        if ((els_02 = this.ck()) == null) {
            return true;
        }
        Collection collection = els_02.j();
        for (epq_2 epq_22 : collection) {
            this.dR().c(epq_22);
        }
        return false;
    }

    @Override
    public boolean u() {
        return !this.j;
    }

    @Override
    public void a(boolean bl) {
        this.j = bl;
    }

    @Override
    public byte[] fY() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aL();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] fZ() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aN();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] ga() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aO();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gb() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aP();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void d(byte[] byArray) {
        this.gL();
        this.gl();
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            eqm_22.a(byArray);
        } else {
            cJ.error((Object)"Impossible de d\u00e9s\u00e9rialioser les donn\u00e9es binaire du fighter : pas de s\u00e9rialiseur d\u00e9fini.");
        }
    }

    @Override
    public byte[] i() {
        return this.dR().b(false);
    }

    public byte[] u(boolean bl) {
        return this.dR().b(bl);
    }

    @Override
    public void a(byte[] byArray) {
        this.dR().a(byArray, this.ge());
    }

    @Override
    public byte Y() {
        if (this.ck() == null) {
            return -1;
        }
        return this.ck().x(this);
    }

    @Override
    public void b(byte by) {
        if (this.ck() == null) {
            return;
        }
        this.ck().b(this, by);
    }

    @Override
    public So<efh_0> Q_() {
        eJG eJG2 = this.ge();
        if (eJG2 == null || eJG2.h() == 0) {
            eJG2 = this.cW;
        }
        return eJG2;
    }

    public eJG gc() {
        return this.cX;
    }

    public boolean a(int n, aff_1 aff_12, boolean bl) {
        return true;
    }

    public void b(byte[] byArray) {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            eqm_22.a(byArray);
        } else {
            cJ.error((Object)"Impossible de d\u00e9coder les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        }
    }

    @Override
    public short I() {
        return this.cZ.f();
    }

    public void f(short s2) {
        this.cZ.a(s2);
        if (this.dc != null) {
            this.dc.a(this.cZ.d(), this.cZ.e(), s2);
        }
    }

    public exh_1 dS() {
        return null;
    }

    public String gd() {
        return this.dp();
    }

    public final So<efh_0> ge() {
        return this.cM && this.ck() != null ? this.aw() : this.ax();
    }

    @Nullable
    public exq_2 R_() {
        return null;
    }

    public eyz_0 cG() {
        return null;
    }

    public eyz_0 d(int n) {
        return null;
    }

    @Nullable
    public fig a(fid fid2, byte by) {
        return null;
    }

    public fib a(byte by, short s2, fio_0 fio_02) {
        return null;
    }

    public void a(byte by, short s2, fib fib2) {
    }

    public So<efh_0> aw() {
        if (this.ck() != null) {
            return this.ck().h();
        }
        return null;
    }

    public String gf() {
        return null;
    }

    public short fd() {
        return this.dr();
    }

    @Override
    public short dr() {
        return 0;
    }

    @Override
    public short dt() {
        return this.dr();
    }

    public abstract float cu();

    @Override
    public String dp() {
        return this.cQ != null ? this.cQ : "UNDEFINED";
    }

    @Override
    public final aff_1 gg() {
        return this.cZ;
    }

    public fiz<? extends fio_0> aZ() {
        return null;
    }

    public Iterable<? extends fio_0> Y_() {
        return null;
    }

    public fia_0 gh() {
        return this.e.m();
    }

    @Override
    public int D_() {
        return this.c_(epn_2.b.s());
    }

    @Override
    public int c_(int n) {
        int n2 = 0;
        if (this.ck() != null) {
            for (Object f2 : this.ck().j()) {
                epq_2 epq_22;
                elw_0 elw_02 = (elw_0)f2;
                if (!(elw_02 instanceof epq_2) || !(epq_22 = (epq_2)elw_02).C_() || epq_22.ab_() || epq_22.ci() != this || epq_22 == this || epq_22.f(eoz_1.aW) || n != epn_2.b.s() && epq_22.gO() != n) continue;
                ++n2;
            }
        } else {
            for (epq_2 epq_23 : this.am()) {
                if (!epq_23.C_() || epq_23.hv().c() || n != epn_2.b.s() && (epq_23.gO() != n || epq_23.f(eoz_1.aW))) continue;
                ++n2;
            }
        }
        return n2;
    }

    public int bQ() {
        int n = 0;
        if (this.ck() != null) {
            for (Object f2 : this.ck().j()) {
                epq_2 epq_22;
                elw_0 elw_02 = (elw_0)f2;
                if (!(elw_02 instanceof epq_2) || !(epq_22 = (epq_2)elw_02).C_() || epq_22.hv().c() || epq_22.ci() != this || epq_22.f(eoz_1.aW)) continue;
                n += ((epj_2)epq_22.Z_()).u();
            }
        } else {
            for (epq_2 epq_23 : this.am()) {
                if (!epq_23.C_() || epq_23.hv().c() || epq_23.f(eoz_1.aW)) continue;
                n += ((epj_2)epq_23.Z_()).u();
            }
        }
        return n;
    }

    public int gi() {
        erp_2 erp_22 = this.dQ();
        if (erp_22 == null) {
            return 0;
        }
        eqy_1 eqy_12 = erp_22.a();
        if (eqy_12 == null) {
            return 0;
        }
        return eqy_12.j();
    }

    public epq_2 gj() {
        epq_2 epq_22;
        epq_2 epq_23 = this;
        els_0 els_02 = this.ck();
        int n = 0;
        do {
            epq_23 = epq_2.c(els_02, epq_23);
            epq_22 = epq_2.c(els_02, epq_23);
            if (++n <= 10) continue;
            cJ.error((Object)("On est en train de tourner pour trouver le root Controller, il doit y avoir une boucle, breed : " + this.gO()));
            return epq_23;
        } while (epq_23 != epq_22);
        return epq_23;
    }

    public So<efh_0> ax() {
        return null;
    }

    @Override
    public int G() {
        return this.cZ.d();
    }

    @Override
    public int H() {
        return this.cZ.e();
    }

    @Override
    public float J() {
        return this.G();
    }

    @Override
    public float K() {
        return this.H();
    }

    @Override
    public float L() {
        return this.I();
    }

    protected void cE() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            new epx_2(this, eqm_22.d());
            new epy_2(this, eqm_22.c());
            new epz_2(this, eqm_22.b());
            new eps_2(this, eqm_22.e());
            new epb_2(this, eqm_22.f());
            new epa_2(this, eqm_22.g());
            new epu_2(this, eqm_22.h());
            new epv_2(this, eqm_22.i());
            new epr_2(this, eqm_22.j());
            new epc_2(this, eqm_22.l());
            new epw_2(this, eqm_22.m());
            new ept_2(this, eqm_22.n());
            new epe_2(this, eqm_22.o());
        } else {
            cJ.error((Object)"Pas de s\u00e9rialiseur \u00e0 initialiser : le personnage ne sera pas s\u00e9rialisable !");
        }
    }

    public boolean gk() {
        return this.e.d();
    }

    @Override
    public boolean C_() {
        return this.e.h();
    }

    @Override
    public boolean E_() {
        return this.e.i();
    }

    public boolean S_() {
        return this.C_() || this.a(erl_2.J);
    }

    public void gl() {
        if (this.g == null) {
            this.g = eri_2.a((byte)1, this);
        }
    }

    public void a(eql_2 eql_22) {
        if (!this.cL.contains(eql_22)) {
            this.cL.add(eql_22);
        }
    }

    public void bI() {
        this.l.a();
    }

    public void gm() {
        this.b(this.a_(eps_0.c));
        this.b(this.a_(eps_0.d));
        this.b(this.a_(eps_0.e));
    }

    private void b(rs_0 rs_02) {
        if (rs_02 != null) {
            rs_02.n();
        }
    }

    public void b(So so, boolean bl) {
        ezu_1 ezu_12 = this.db();
        if (ezu_12 == null) {
            return;
        }
        if (!ezu_12.a(this)) {
            return;
        }
        this.dR().a(36, true, false);
        if (bl) {
            this.a_(eps_0.b).y();
        }
        ezu_12.a((Integer n, Short s2) -> {
            Object t = ezh_2.a.a((int)n);
            if (t == null) {
                return;
            }
            int n2 = ((ezv_2)t).c();
            efh_0 efh_02 = (efh_0)ezg_2.a.a(n2);
            if (efh_02 == null) {
                return;
            }
            ezf_1 ezf_12 = new ezf_1((ezv_2)t, (short)s2);
            epq_2 epq_22 = this;
            efh_02.a(ezf_12, epq_22, so, efc_0.a(), epq_22.G(), epq_22.H(), epq_22.I(), epq_22, null, false);
        });
        if (bl) {
            this.a_(eps_0.b).z();
        }
    }

    public void gn() {
        this.dR().g(19);
    }

    public Collection<flm_0> dG() {
        return null;
    }

    public final String go() {
        Object object = "";
        for (sd_0 sd_02 : this.dR().a(18)) {
            object = (String)object + sd_02.getClass().getSimpleName() + " zoneBuffId=" + sd_02.k().aS_() + "\n";
        }
        return object;
    }

    public void v(boolean bl) {
        this.dR().g(18);
        Collection<flm_0> collection = this.dG();
        if (collection != null) {
            if (bl) {
                this.a_(eps_0.b).y();
            }
            for (flm_0 flm_02 : collection) {
                for (efh_0 efh_02 : flm_02.a()) {
                    if (efh_02.h() != 0) continue;
                    efh_02.a(flm_02.a(), this, this.cW, efc_0.a(), this.G(), this.H(), this.I(), this, null, false);
                }
            }
            if (bl) {
                this.a_(eps_0.b).z();
            }
        }
    }

    public void a(int n, faV faV2, fbm_0 fbm_02, int n2, int n3) {
        if (faV2.n() != n) {
            return;
        }
        fbm_0 fbm_03 = fbo_0.a().a(n2);
        if (fbm_03 == fbm_02) {
            return;
        }
        if (this.ak()) {
            return;
        }
        if (fbm_02.a(fbs_0.f) && !fbm_03.a(fbs_0.f)) {
            this.gn();
        }
        if (fbm_03.a(fbs_0.f) && !fbm_02.a(fbs_0.f)) {
            this.a(this.Q_(), true);
        }
    }

    public void a(So so, boolean bl) {
        if (this.cP != 0 && this.cP != 5) {
            return;
        }
        eja_0 eja_02 = this.dR().i(5355);
        if (eja_02 != null) {
            eja_02.i(true);
        }
        this.dR().h(5355);
        if (this.k == null) {
            return;
        }
        if (this.k.n() == -1) {
            return;
        }
        if (this.k.n() == 0) {
            return;
        }
        if (!this.a(fbs_0.f)) {
            return;
        }
        faX faX2 = this.k.m();
        feo_0 feo_02 = faX2.E();
        if (feo_02 == null) {
            return;
        }
        if (bl) {
            this.a_(eps_0.b).y();
        }
        short s2 = 0;
        TIntObjectIterator<fem_0> tIntObjectIterator = feo_02.a();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fem_0 fem_02 = (fem_0)tIntObjectIterator.value();
            int n = fem_02.g();
            int n2 = fem_02.h();
            fgk_0 fgk_02 = fgk_0.a(n, n2);
            s2 = (short)(s2 + Shorts.saturatedCast((long)fgk_02.b()));
        }
        if (eex_0.i.contains((Comparable)Short.valueOf(s2))) {
            this.a((short)5357, s2, so);
        }
        if (bl) {
            this.a_(eps_0.b).z();
        }
    }

    public void w(boolean bl) {
        this.a(this.Q_(), bl);
    }

    public void o(boolean bl) {
    }

    public void p(boolean bl) {
    }

    public void dd() {
    }

    protected void a(epq_1 epq_12, So so, boolean bl) {
    }

    private boolean a(fbs_0 fbs_02) {
        faX faX2 = this.k.m();
        int n = this.k.c(faX2.c());
        return fbo_0.a().a(n).a(fbs_02);
    }

    public ezu_1 db() {
        return null;
    }

    public ezu_1 f(int n) {
        return null;
    }

    public void gp() {
        this.cN = -1L;
        this.cO = -1L;
        this.cQ = "";
        this.cL.clear();
        this.cS = 0;
        this.cT = aej_2.h;
    }

    public byte[] gq() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aK();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gr() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aV();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gs() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aE();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gt() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aJ();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gu() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aW();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gv() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aR();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gw() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aS();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gx() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aT();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gy() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aU();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gz() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aF();
        }
        cJ.error((Object)"Failed to serialize cosmetics: no serializer");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gA() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aG();
        }
        cJ.error((Object)"Failed to serialize cosmetics: no serializer");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gB() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aX();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] x(boolean bl) {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.a(bl);
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gC() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            String string = null;
            if (this.fL()) {
                string = this.dp();
                this.c("[STAFF] " + string);
            }
            byte[] byArray = eqm_22.aH();
            if (this.fL()) {
                this.c(string);
            }
            return byArray;
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gD() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            String string = null;
            if (this.fL()) {
                string = this.dp();
                this.c("[STAFF] " + string);
            }
            byte[] byArray = eqm_22.aI();
            if (this.fL()) {
                this.c(string);
            }
            return byArray;
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gE() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.bd();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gF() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.be();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gG() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.bf();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gH() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.bg();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gI() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.bh();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gJ() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.aQ();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public byte[] gK() {
        eqm_2 eqm_22 = this.cr();
        if (eqm_22 != null) {
            return eqm_22.bj();
        }
        cJ.error((Object)"Impossible de s\u00e9rialiser les donn\u00e9es binaire du personnage : pas de s\u00e9rialiseur d\u00e9fini.");
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    public void b(int n, Object object) {
    }

    public void c(int n, Object object) {
    }

    public void y(boolean bl) {
        this.e.c(bl);
    }

    public void e(String string) {
    }

    public void c(int n) {
        this.r = n;
    }

    public void p(int n) {
        this.db = n;
    }

    public int X_() {
        return this.r;
    }

    public void k(int n) {
    }

    public void a_(short s2) {
        throw new UnsupportedOperationException("Only monsters can set level");
    }

    public void a(int n, int n2, Object object) {
    }

    public void z(boolean bl) {
        this.e.e(bl);
    }

    public void d(exk_2 exk_22) {
        this.l.a(exk_22);
    }

    public void a(eyz_0 eyz_02) {
        this.l.a(eyz_02);
    }

    public void a(exk_2 exk_22, exo_2 exo_22) {
        this.l.a(exk_22, exo_22);
    }

    public void gL() {
        this.g = null;
        this.j = false;
        this.hz();
    }

    public void gM() {
        this.cL.clear();
    }

    protected void gN() {
        for (eps_1 eps_12 : ept_1.a().b()) {
            byte by = eps_12.a();
            int n = eps_12.a(this.dr());
            eps_0 eps_02 = eps_0.a(by);
            if (eps_02 == null || !this.a(eps_02)) continue;
            this.a_(eps_02).j(n);
        }
    }

    public void a(byte by, aff_1 aff_12, boolean bl, fio_0 fio_02) {
    }

    @Override
    public epq_1 Z_() {
        return this.cY;
    }

    @Override
    public short gO() {
        if (this.cY != null) {
            return this.cY.s();
        }
        return -1;
    }

    public eov_1<epa_1> gP() {
        return this.cV;
    }

    @Override
    public aej_2 F() {
        return this.cT;
    }

    @Nullable
    public eri_2<eoz_1> gQ() {
        return this.g;
    }

    @Override
    public long a_() {
        return this.cN;
    }

    @Override
    public byte J_() {
        return 20;
    }

    public long T_() {
        return this.cR;
    }

    public boolean gR() {
        return eoe_0.j.contains(this.cR);
    }

    public int gS() {
        return 0;
    }

    @Nullable
    protected aff_1 gT() {
        return null;
    }

    public void k(long l) {
        this.cR = l;
    }

    protected void d(aff_1 aff_12) {
    }

    protected long gU() {
        return -1L;
    }

    @Override
    public long U_() {
        return this.cO;
    }

    @Override
    @Nullable
    public uo_0 k() {
        if (this.a(eoz_1.U)) {
            return null;
        }
        uo_0 uo_02 = this.e.f();
        if (uo_02 == null) {
            return null;
        }
        uo_02.a(this.G(), this.H(), this.I(), this.cT);
        return uo_02;
    }

    @Nullable
    public un_0 a(apv_2 apv_22) {
        uo_0 uo_02 = this.k();
        if (uo_02 == null) {
            return null;
        }
        return uo_02.a(apv_22.G(), apv_22.H(), apv_22.I());
    }

    public eJL dR() {
        this.gW();
        return this.f;
    }

    @Override
    public boolean y_() {
        return true;
    }

    public boolean gV() {
        return this.f != null;
    }

    public void gW() {
        if (this.f == null) {
            this.f = new eJL(this);
        }
    }

    @Override
    public byte gX() {
        return this.cS;
    }

    @Override
    public byte gY() {
        return this.cP;
    }

    @Nullable
    public eri_2<erl_2> gZ() {
        return this.h;
    }

    public void a_(boolean bl) {
        if (this.ab_() != bl) {
            this.e.b(bl);
            this.eP();
        }
    }

    public boolean ab_() {
        return this.e.c() || this.fl() != null && this.fl().ac_() == 4 || this.f(erl_2.o);
    }

    public boolean ha() {
        return this.e.b();
    }

    public void A(boolean bl) {
        this.e.a(bl);
    }

    protected void eP() {
    }

    public boolean hb() {
        return this.cU;
    }

    public void c(epq_1 epq_12) {
        this.cY = epq_12;
    }

    @Override
    public void a(long l) {
        this.cN = l;
    }

    public void B(boolean bl) {
        this.cU = bl;
    }

    protected void n(long l) {
    }

    public void c(String string) {
        this.cQ = string;
    }

    public void C(boolean bl) {
        this.cM = bl;
    }

    public void o(long l) {
        this.cO = l;
    }

    public void g(byte by) {
        this.cS = by;
    }

    public void h(byte by) {
        this.cP = by;
    }

    public void a(epq_2 epq_22) {
        if (epq_22 == null) {
            return;
        }
        this.m = epq_22;
    }

    public void hc() {
        this.m = null;
    }

    public epq_2 hd() {
        return this.m;
    }

    @Override
    public erc_2 he() {
        return this.dc;
    }

    @Override
    public erb_2 hf() {
        return this.dd;
    }

    @Override
    public boolean hg() {
        return this.dc != null;
    }

    @Override
    public boolean hh() {
        return this.dd != null;
    }

    @Override
    public boolean hi() {
        return !this.a(eoz_1.az);
    }

    @Override
    public boolean b(erb_2 erb_22) {
        return !this.hg() && !this.hh();
    }

    @Override
    public boolean b(erc_2 erc_22) {
        if (erc_22 == null) {
            return false;
        }
        if (this.hg()) {
            return false;
        }
        if (this.hh()) {
            return false;
        }
        if (erc_22 == this) {
            return false;
        }
        if (!erc_22.b(this)) {
            return false;
        }
        if (erc_22.I() <= this.I() + this.W() / 2) {
            return true;
        }
        return erc_22.I() >= this.I() - this.W() / 2;
    }

    @Override
    public boolean a(erc_2 erc_22) {
        if (!this.b(erc_22)) {
            return false;
        }
        if (erc_22 == null) {
            return false;
        }
        aff_1 aff_12 = this.P_();
        this.dc = erc_22;
        erc_22.a(this);
        erc_22.a(aff_12.d(), aff_12.e(), aff_12.f());
        erc_22.hE();
        return true;
    }

    @Override
    public void a(erb_2 erb_22) {
        this.dd = erb_22;
        tg_0 tg_02 = this.C();
        if (tg_02 != null) {
            tg_02.a(this, false);
        }
    }

    @Override
    public void at() {
        this.dd = null;
        tg_0 tg_02 = this.C();
        if (tg_02 != null) {
            tg_02.a(this, true);
        }
    }

    @Override
    public boolean c(aff_1 aff_12) {
        if (this.dc != null) {
            if (!this.cZ.equals(aff_12) && !this.a(eoz_1.Y)) {
                aej_2 aej_22 = new afs_2(aff_12.d() - this.cZ.d(), aff_12.e() - this.cZ.e(), 0).h();
                this.a(aej_22);
            }
            this.dc.a(aff_12.d(), aff_12.e(), aff_12.f());
            this.dc.at();
            this.dc = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(aff_1 aff_12) {
        return this.c(aff_12);
    }

    @Override
    public void ap() {
        if (this.dc != null) {
            aff_1 aff_12 = this.P_();
            this.c(aff_12);
        }
    }

    public void b_(boolean bl) {
        this.dR().g(25);
        if (this.aZ() == null) {
            return;
        }
        if (this.ak() && this.ck() != null && !this.ck().af_().D()) {
            return;
        }
        List<Long> list = enp_2.a.h(ens_2.aI);
        if (this.cP == 0) {
            fiR fiR2 = this.dw();
            if (fiR2 == null) {
                cJ.error((Object)("Deck set unknown , playerId=" + this.cN));
                return;
            }
            ezm_1 ezm_12 = this.dx();
            fiO fiO2 = fiR2.b(ezm_12.d().e());
            if (fiO2 == null) {
                cJ.error((Object)("Active Deck unknown , playerId=" + this.cN));
                return;
            }
            ArrayList<Integer> arrayList = fiO2.f();
            if (bl) {
                this.a_(eps_0.b).y();
            }
            for (Integer n : arrayList) {
                if (n == null || n == 0 || list.contains(n.longValue())) continue;
                fio_0 fio_02 = (fio_0)this.aZ().c(n);
                if (fio_02 == null) {
                    return;
                }
                int n2 = fiT.a(n, fiO2, this);
                if (n2 == fio_02.c()) {
                    this.a((eqi_2)((Object)fio_02));
                    continue;
                }
                fio_0 fio_03 = (fio_0)fio_02.aP_();
                fio_03.c((short)n2);
                this.a((eqi_2)((Object)fio_03));
            }
            if (bl) {
                this.a_(eps_0.b).z();
            }
        } else {
            if (bl) {
                this.a_(eps_0.b).y();
            }
            this.b(list);
            if (bl) {
                this.a_(eps_0.b).z();
            }
        }
    }

    private void b(List<Long> list) {
        for (fio_0 fio_02 : this.aZ()) {
            if (fio_02 == null || list.contains(fio_02.w())) continue;
            this.a((eqi_2)((Object)fio_02));
        }
    }

    private void a(fio_0<fin_0> fio_02) {
        if (fio_02 == null) {
            return;
        }
        fin_0 fin_02 = fio_02.r();
        if (fio_02.c() <= 0 && !fin_02.x()) {
            return;
        }
        if (fin_02.w()) {
            for (efh_0 efh_02 : fio_02) {
                efh_02.a(fio_02, this, this.Q_(), efc_0.a(), this.G(), this.H(), this.I(), this, null, false);
            }
        }
    }

    public final void b(So so) {
        this.ht();
        try {
            this.a(this.Z_(), so, false);
            this.b(so, false);
            this.b_(false);
            this.v(false);
            this.a(so, false);
            this.o(false);
            this.p(false);
            this.bI();
            this.dd();
            this.eS();
        }
        finally {
            this.hu();
        }
    }

    public void eS() {
    }

    public void c(So so) {
        epa_1 epa_12 = this.a_(eps_0.b);
        int n = epa_12.b();
        this.b(so);
        this.o(Math.min(n, epa_12.c()));
    }

    protected final void hj() {
        this.dR().a((Su)this, this.ge());
        this.b(this.cW);
    }

    protected final List<eja_0> d(So so) {
        List<eja_0> list = this.dR().n();
        Iterator<eja_0> iterator = list.iterator();
        ArrayList<eja_0> arrayList = new ArrayList<eja_0>();
        while (iterator.hasNext()) {
            eja_0 eja_02 = iterator.next();
            if (!eja_02.aF().s()) continue;
            eja_0 eja_03 = eja_02.b(so);
            arrayList.add(eja_03);
        }
        return arrayList;
    }

    protected void a(List<eja_0> list) {
        for (eja_0 eja_02 : list) {
            sd_0.bs_();
            eja_0 eja_03 = eja_02;
            eja_03.j(true);
            eja_03.a(this);
            eja_03.b(this);
            eja_03.C();
            eja_03.c(this);
            eja_03.q();
        }
    }

    @Deprecated
    public void a(short s2, short s3, int n, efh_0 efh_02) {
        this.a(s2, s3, n, efh_02, false);
    }

    @Deprecated
    public void a(short s2, short s3, int n, efh_0 efh_02, boolean bl) {
        So so = this.ck() != null ? this.ck().h() : this.ax();
        efj_0 efj_02 = new efj_0();
        sd_0.bs_();
        eGm eGm2 = eGm.a(so, this, s2, s3, false);
        eGm2.a(this);
        eGm2.h(bl);
        efj_02.a(n).a((long)eGm2.bt_());
        eGm2.a(efj_02.a());
        eGm2.a(efh_02);
        eGm2.a(null, false);
    }

    public void g(short s2) {
        this.a(s2, (short)0, this.ax());
    }

    public void b(short s2, short s3) {
        this.a(s2, s3, this.ax());
    }

    public void a(short s2, short s3, So so) {
        fie_0 fie_02 = fih_0.a().a(s2);
        fie_0 fie_03 = fie_02.c(s3);
        ArrayList<efh_0> arrayList = fie_02.e(s3);
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            efh_0 efh_02 = arrayList.get(k);
            efh_02.a(fie_03, this, so, efc_0.a(), this.G(), this.H(), this.I(), this, null, false);
        }
    }

    public void h(short s2) {
        this.dR().h(s2);
    }

    public int en() {
        return 0;
    }

    public int fg() {
        return 0;
    }

    public Collection<Integer> fh() {
        return Collections.emptyList();
    }

    public int fi() {
        return 0;
    }

    public boolean W_() {
        return true;
    }

    public short eO() {
        return 0;
    }

    public void q(int n) {
        if (n == 0) {
            return;
        }
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            return;
        }
        exk_2 exk_22 = exk_2.a(r2);
        for (efh_0 efh_02 : exk_22) {
            efh_02.a(exk_22, this, this.Q_(), efc_0.a(), this.G(), this.H(), this.I(), this, null, false);
        }
    }

    public long b(eqy_1 eqy_12) {
        return this.bQ() + eqy_12.j();
    }

    public long hk() {
        return this.bQ() + this.gi();
    }

    public void hl() {
    }

    @Override
    public boolean a_(long l, long l2) {
        for (sd_0 sd_02 : this.dR()) {
            if (sd_02.bt_() != efc_0.b.a() || (long)((eja_0)sd_02).aF().p() != l) continue;
            return l2 == (long)((eja_0)sd_02).aF().c();
        }
        return false;
    }

    @Override
    public boolean b(long l, long l2) {
        for (sd_0 sd_02 : this.dR()) {
            if (sd_02.bt_() != efc_0.b.a() || (long)((eja_0)sd_02).aF().p() != l) continue;
            return l2 <= (long)((eja_0)sd_02).aF().c();
        }
        return false;
    }

    @Override
    public boolean a(long l, long l2, eqq_1 eqq_12) {
        if (this.dR() == null) {
            return false;
        }
        if (eqq_12 == null) {
            return false;
        }
        for (sd_0 sd_02 : this.dR()) {
            fie_0 fie_02;
            if (sd_02.bt_() != efc_0.b.a() || (long)(fie_02 = ((eja_0)sd_02).aF()).p() != l) continue;
            if ((long)fie_02.c() != l2) {
                return false;
            }
            if (sd_02.h() == null) {
                return false;
            }
            return sd_02.h().a_() == eqq_12.a_();
        }
        return false;
    }

    @Override
    public boolean a(long l, eqq_1 eqq_12) {
        if (this.dR() == null) {
            return false;
        }
        if (eqq_12 == null) {
            return false;
        }
        for (sd_0 sd_02 : this.dR()) {
            fie_0 fie_02;
            if (sd_02.bt_() != efc_0.b.a() || (long)(fie_02 = ((eja_0)sd_02).aF()).p() != l) continue;
            if (sd_02.h() == null) {
                return false;
            }
            return sd_02.h().a_() == eqq_12.a_();
        }
        return false;
    }

    @Override
    public boolean b(long l, long l2, eqq_1 eqq_12) {
        if (this.dR() == null) {
            return false;
        }
        if (eqq_12 == null) {
            return false;
        }
        for (sd_0 sd_02 : this.dR()) {
            fie_0 fie_02;
            if (sd_02.bt_() != efc_0.b.a() || (long)(fie_02 = ((eja_0)sd_02).aF()).p() != l) continue;
            if ((long)fie_02.c() != l2) {
                return false;
            }
            if (sd_02.h() == null) {
                return false;
            }
            if (!(sd_02.h() instanceof elw_0)) {
                return false;
            }
            return ((elw_0)sd_02.h()).ck().d(sd_02.h().a_()) == eqq_12.Y();
        }
        return false;
    }

    @Override
    public boolean b(long l, eqq_1 eqq_12) {
        if (this.dR() == null) {
            return false;
        }
        if (eqq_12 == null) {
            return false;
        }
        for (sd_0 sd_02 : this.dR()) {
            fie_0 fie_02;
            if (sd_02.bt_() != efc_0.b.a() || (long)(fie_02 = ((eja_0)sd_02).aF()).p() != l) continue;
            if (sd_02.h() == null) {
                return false;
            }
            if (!(sd_02.h() instanceof elw_0)) {
                return false;
            }
            return ((elw_0)sd_02.h()).ck().d(sd_02.h().a_()) == eqq_12.Y();
        }
        return false;
    }

    @Override
    public boolean d_(long l) {
        for (sd_0 sd_02 : this.dR()) {
            if (sd_02.bt_() != efc_0.b.a() || (long)((eja_0)sd_02).aF().p() != l) continue;
            return true;
        }
        return false;
    }

    @Override
    public int e_(long l) {
        for (sd_0 sd_02 : this.dR()) {
            if (sd_02.bt_() != efc_0.b.a() || (long)((eja_0)sd_02).aF().p() != l) continue;
            return ((eja_0)sd_02).aF().c();
        }
        return -1;
    }

    public boolean r(int n) {
        return this.t(n) != null;
    }

    public boolean s(int n) {
        return this.u(n) != null;
    }

    public sd_0 t(int n) {
        for (sd_0 sd_02 : this.dR()) {
            if (sd_02.bt_() != n) continue;
            return sd_02;
        }
        return null;
    }

    public sd_0 u(int n) {
        for (sd_0 sd_02 : this.dR()) {
            if (sd_02.o() != n) continue;
            return sd_02;
        }
        return null;
    }

    public boolean hm() {
        return this.e.k();
    }

    public void D(boolean bl) {
        this.e.g(bl);
    }

    public void a(zt_2 zt_22) {
    }

    public byte hn() {
        return this.cl() == null ? this.Y() : this.cl().Y();
    }

    public void E(boolean bl) {
        this.e.i(bl);
    }

    public boolean ho() {
        return this.e.n();
    }

    public void V_() {
        int n = this.c(eps_0.e);
        int n2 = this.d(eps_0.e);
        int n3 = this.c(eps_0.c);
        int n4 = this.d(eps_0.c);
        int n5 = this.c(eps_0.d);
        int n6 = this.d(eps_0.d);
        this.co();
        int n7 = this.d(eps_0.e);
        int n8 = n7 - n2;
        int n9 = this.d(eps_0.c);
        int n10 = n9 - n4;
        int n11 = this.d(eps_0.d);
        int n12 = n11 - n6;
        this.a_(eps_0.e).b(n + n8);
        this.a_(eps_0.c).b(n3 + n10);
        this.a_(eps_0.d).b(n5 + n12);
    }

    public void F(boolean bl) {
        this.e.f(bl);
    }

    protected void b(epq_2 epq_22) {
        erp_2 erp_22 = epq_22.dQ();
        if (erp_22 == null) {
            return;
        }
        erp_22.b(this.cN);
    }

    public void v(int n) {
        if (this.cP != 0 && this.cP != 5 && !this.f(erl_2.be)) {
            return;
        }
        els_0 els_02 = this.ck();
        if (!this.ak() || els_02 != null && els_02.e() != elp_0.c) {
            return;
        }
        int n2 = this.d(eps_0.b);
        if (this.a(eps_0.z)) {
            epa_1 epa_12 = this.a_(eps_0.z);
            float f2 = (float)n / (float)n2;
            float f3 = f2 / 5.0f * 1000.0f;
            epa_12.b((int)((float)epa_12.a() + f3));
        }
    }

    public float hp() {
        if (this.a(eps_0.z)) {
            return (float)this.a_(eps_0.z).a() / 10.0f;
        }
        return 0.0f;
    }

    public int w(int n) {
        return n - xh_0.a((float)n * this.hp() / 100.0f);
    }

    protected void hq() {
        this.d(this.Z_());
    }

    protected void d(epq_1 epq_12) {
        if (epq_12.q().length <= 0) {
            return;
        }
        eri_2<eoz_1> eri_22 = this.gQ();
        if (eri_22 == null) {
            cJ.error((Object)"manager de propri\u00e9t\u00e9 de combat null au chargement des donn\u00e9es de combat");
            return;
        }
        for (int n : epq_12.q()) {
            eoz_1 eoz_12 = eoz_1.a(n);
            if (eoz_12 != null) {
                eri_22.e(eoz_12);
                eri_22.c(eoz_12);
                continue;
            }
            cJ.error((Object)("id d'une propri\u00e9t\u00e9 de base incorrect :" + n));
        }
    }

    @Nullable
    public fiR dw() {
        return null;
    }

    public ezy_2 dA() {
        return null;
    }

    public void a(ezy_2 ezy_22) {
    }

    public ezm_1 dx() {
        return null;
    }

    public ezj_1 dy() {
        return null;
    }

    public void a(ezm_1 ezm_12) {
    }

    public eZb dB() {
        return null;
    }

    public eyt_0 dC() {
        return null;
    }

    public fiz<? extends fio_0> hr() {
        return null;
    }

    public long R() {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public eqw_1 hs() {
        return this.p;
    }

    public boolean a(int n, short s2) {
        return false;
    }

    public void bi() {
    }

    public void x(int n) {
    }

    public void b(int n, epd_2 epd_22) {
        this.a(n, epd_22);
    }

    protected void a(int n, epd_2 epd_22) {
    }

    public void y(int n) {
        this.bk();
    }

    public void bk() {
    }

    public boolean bl() {
        return false;
    }

    public void ht() {
        if (this.t == 0) {
            assert (this.s == null);
            this.s = new epf_2();
        }
        this.t = (byte)(this.t + 1);
        if (this.t > 100) {
            cJ.warn((Object)"Il doit y avoir un pobl\u00e8me....", (Throwable)new Exception());
        }
    }

    public void a(String string, Runnable runnable) {
        if (this.s == null) {
            runnable.run();
        } else {
            this.s.a(string, runnable);
        }
    }

    public void hu() {
        this.t = (byte)(this.t - 1);
        if (this.t == 0) {
            this.s.a();
            this.s = null;
        }
    }

    protected void dk() {
    }

    protected <F extends eqi_2<C>, C extends epq_2> void a(F f2) {
        this.e = f2;
    }

    public <F extends eqi_2<C>, C extends epq_2> F hv() {
        return (F)this.e;
    }

    protected void bK() {
    }

    public void d(int n, boolean bl) {
        this.a(n, (HashMap<String, Object>)null, bl);
    }

    public void a(int n, @Nullable HashMap<String, Object> hashMap, boolean bl) {
    }

    @Override
    public long hw() {
        return this.cN;
    }

    @Override
    @Nullable
    public TLongShortHashMap hx() {
        return this.u;
    }

    public epq_2 hy() {
        return null;
    }

    @Override
    public void a(eot_1 eot_12, short s2) {
        if (this.u == null) {
            this.u = new TLongShortHashMap();
        }
        short s3 = this.u.get(eot_12.hw());
        s3 = (short)(s3 + s2);
        this.u.put(eot_12.hw(), s3);
    }

    @Override
    public void b(eot_1 eot_12, short s2) {
        if (this.u != null) {
            short s3 = this.u.get(eot_12.hw());
            s3 = (short)(s3 - s2);
            this.u.put(eot_12.hw(), s3);
        }
    }

    @Override
    public void c(eot_1 eot_12, short s2) {
        if (this.u == null) {
            this.u = new TLongShortHashMap();
        }
        this.u.put(eot_12.hw(), s2);
    }

    @Override
    public void a(eot_1 eot_12) {
        if (this.u != null) {
            this.u.remove(eot_12.hw());
        }
    }

    @Override
    public void hz() {
        this.u = null;
    }

    @Override
    public String hA() {
        if (this.ck() != null) {
            Object object = this.dp();
            if (((String)object).length() == 0) {
                object = "id(" + this.cN + ") breed(" + (Serializable)(this.Z_() != null ? Short.valueOf(this.Z_().s()) : "unknown") + ")";
            }
            String string = "AggroList for " + (String)object + ":\n";
            if (this.u != null) {
                TLongShortIterator tLongShortIterator = this.u.iterator();
                while (tLongShortIterator.hasNext()) {
                    tLongShortIterator.advance();
                    long l = tLongShortIterator.key();
                    els_0 els_02 = this.ck();
                    Object f2 = els_02.n(l);
                    Object object2 = null;
                    if (f2 != null && (object2 = ((epq_2)f2).dp()) != null && ((String)object2).isEmpty()) {
                        object2 = "id(" + ((epq_2)f2).cN + ") breed(" + (Serializable)(((epq_2)f2).Z_() != null ? Short.valueOf(((epq_2)f2).Z_().s()) : "unknown") + ")";
                    }
                    string = string + (String)object2 + " : " + tLongShortIterator.value() + "\n";
                }
            }
            return string;
        }
        return this.dp() + " not in Fight";
    }

    public void b(sd_0 sd_02) {
    }

    public int eQ() {
        return this.cY.E().b();
    }

    public int eR() {
        return this.cY.F().b();
    }

    @NotNull
    public abstract eAG cv();

    @Nullable
    public ead_0 fl() {
        return null;
    }

    public short hB() {
        ead_0 ead_02 = this.fl();
        return ead_02 == null ? (short)-1 : (short)ead_02.ac_();
    }

    public void a(ead_0 ead_02) {
    }

    public boolean a(boolean bl, boolean bl2) {
        return true;
    }

    public boolean dN() {
        return this.r(true);
    }

    public boolean r(boolean bl) {
        return true;
    }

    public void eF() {
    }

    public abstract void cw();

    public abstract int bN();

    public abstract int bO();

    public boolean cX() {
        return euv_2.a.b(this.U_(), this.a_()) || this.da;
    }

    public void q(boolean bl) {
        this.da = bl;
    }

    public abstract void a(int var1, Object var2);

    protected static <C extends epq_2> C b(els_0<C> els_02, C c2) {
        if (els_02 == null) {
            return c2;
        }
        C c3 = els_02.A(c2);
        return c3 == null ? c2 : c3;
    }

    protected static <C extends epq_2> C c(els_0<C> els_02, C c2) {
        if (els_02 == null) {
            return c2;
        }
        C c3 = els_02.B(c2);
        return c3 == null ? c2 : c3;
    }

    public abstract epq_2 ci();

    @Override
    public long B_() {
        epq_2 epq_22 = this.ci();
        if (epq_22 == null) {
            return 0L;
        }
        return epq_22.cN;
    }

    @Nullable
    public erp_2 dQ() {
        return null;
    }

    public erp_2 hC() {
        return null;
    }

    public void j(int n) {
    }

    public void G(boolean bl) {
        this.e.h(bl);
    }

    public void hD() {
    }

    @Nullable
    public fiO dz() {
        return null;
    }

    public void Q() {
        els_0 els_02 = this.ck();
        if (els_02 == null) {
            return;
        }
        els_02.t(this);
        els_02.e(this);
        els_02.K(this);
        els_02.u(this);
        els_02.D(this);
        this.D();
        els_02.J(this);
        els_02.w(this);
        els_02.L(this);
    }

    public boolean a(Xd xd) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public eJG cK() {
        return this.cW;
    }

    @Override
    public Optional<fkU> dP() {
        return Optional.empty();
    }

    @Override
    public void hE() {
    }

    @Override
    public boolean a(eqr_1 eqr_12) {
        return eqr_1.a.a(eqr_12);
    }

    public epc_0 hF() {
        return null;
    }

    @Override
    public double z(int n) {
        int n2 = this.cv().a(eAE.f, n, 2);
        return (float)n2 / 100.0f;
    }

    public Collection<eql_2> hG() {
        return this.cL;
    }

    public eep_0 fk() {
        return null;
    }

    public long hH() {
        return 0L;
    }

    public boolean hI() {
        return this.q != null;
    }

    public fji hJ() {
        return this.q;
    }

    public void a(fji fji2) {
        this.q = fji2;
    }

    public String toString() {
        return "BasicCharacterInfo{m_id=" + this.cN + ", m_ownerId=" + this.cO + ", m_name='" + this.cQ + "'}";
    }

    public boolean hK() {
        long l = enp_2.a.c(ens_2.bS);
        if (l != 0L && wc_0.p().a().b(wt_0.b(l))) {
            return true;
        }
        return era_1.e.matcher(this.cQ).find() || this.cQ.matches(".*\\d+.*");
    }

    @Override
    public /* synthetic */ se_0 x_() {
        return this.dR();
    }

    @Override
    public /* synthetic */ rs_0 b(ru_0 ru_02) {
        return this.a_(ru_02);
    }
}

