/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eLM
 */
public abstract class elm_0<F extends epq_2>
extends eml_1<F>
implements We {
    protected static final emc_2 c = new emc_2();
    public static final boolean f = false;
    protected Sq g = c;
    public static final byte h = 0;
    public static final byte i = 1;
    public static final byte j = 2;
    public static final byte k = 3;
    protected elp_0 l;
    private final TLongObjectHashMap<Su> a = new TLongObjectHashMap();
    private final emg_2 b = new emg_2(this);
    private final emz_1 d = new emz_1(this);
    private final emy_1 e = new emy_1(this);
    protected byte m;
    protected eke_0 n;

    private boolean a(epq_2 epq_22, epq_2 epq_23) {
        return this.x(epq_22) != this.x(epq_23);
    }

    public boolean z() {
        return this.l == elp_0.e;
    }

    public Sq R() {
        return this.g;
    }

    @Override
    public void c(aff_1 aff_12) {
    }

    public aff_1 S() {
        return null;
    }

    public Sy T() {
        return null;
    }

    public int a(ezm_0 ezm_02) {
        return 0;
    }

    public int a(eZj eZj2, ezm_0 ezm_02, boolean bl, boolean bl2) {
        return 0;
    }

    public void a(Su su) {
    }

    public void a(ekk_0 ekk_02) {
        if (!(ekk_02 instanceof erc_2)) {
            return;
        }
        erc_2 erc_22 = (erc_2)((Object)ekk_02);
        boolean bl = erc_22.hh();
        if (!bl) {
            return;
        }
        if (erc_22.hf() != null) {
            erc_22.hf().ap();
        }
    }

    public Sx U() {
        return null;
    }

    public void a(ezm_0 ezm_02, int n, short s2) {
    }

    public boolean a(int n, Su su, Su su2, aff_1 aff_12, efi_0 efi_02) {
        return false;
    }

    @Override
    public boolean j(long l) {
        return this.a.contains(l);
    }

    @Override
    public void k(long l) {
        this.a.remove(l);
    }

    @Override
    public Su l(long l) {
        return (Su)this.a.get(l);
    }

    @Override
    public Iterator<Su> V() {
        Object[] objectArray = new Su[this.a.size()];
        this.a.values(objectArray);
        return new aby_1<Object>(objectArray, false);
    }

    public void b(Su su) {
        this.a.put(su.a_(), (Object)su);
    }

    public int W() {
        return this.a.size();
    }

    public boolean X() {
        return this.B.k();
    }

    public boolean Y() {
        return this.B.l();
    }

    protected elm_0(int n, emr_2 emr_22, tg_0 tg_02) {
        super(n, emr_22, tg_02);
        this.l = elp_0.d;
    }

    public void a(F f2, aej_2 aej_22) {
        ((epq_2)f2).a(aej_22);
    }

    @Override
    public eof_2 O() {
        return this.x;
    }

    @Override
    public elp_0 e() {
        return this.l;
    }

    public void a(elp_0 elp_02) {
        this.l = elp_02;
    }

    public void Z() {
        this.O().b();
        this.ac();
    }

    private void b() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        TIntHashSet tIntHashSet = this.b((TIntObjectHashMap<List<efh_0>>)tIntObjectHashMap);
        this.a((TIntObjectHashMap<List<efh_0>>)tIntObjectHashMap, tIntHashSet);
        this.a((TIntObjectHashMap<List<efh_0>>)tIntObjectHashMap);
    }

    private void a(TIntObjectHashMap<List<efh_0>> tIntObjectHashMap) {
        tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new eln_0(this));
    }

    private void a(TIntObjectHashMap<List<efh_0>> tIntObjectHashMap, TIntHashSet tIntHashSet) {
        Collection collection = this.ao();
        for (epq_2 epq_22 : collection) {
            efh_0 efh_02;
            epq_1 epq_12;
            byte by = epq_22.Y();
            if (tIntHashSet.contains((int)by) || !((epq_12 = epq_22.Z_()) instanceof epj_2) || (efh_02 = eox_2.a.c(((epj_2)epq_12).I())) == null) continue;
            ArrayList<efh_0> arrayList = (ArrayList<efh_0>)tIntObjectHashMap.get((int)by);
            if (arrayList == null) {
                arrayList = new ArrayList<efh_0>();
                tIntObjectHashMap.put((int)by, arrayList);
            }
            arrayList.add(efh_02);
        }
    }

    private TIntHashSet b(TIntObjectHashMap<List<efh_0>> tIntObjectHashMap) {
        TIntHashSet tIntHashSet = new TIntHashSet();
        Collection collection = this.an();
        for (epq_2 epq_22 : collection) {
            byte by = epq_22.Y();
            List list = (List)tIntObjectHashMap.get((int)by);
            if (list != null) continue;
            tIntObjectHashMap.put((int)by, new ArrayList<efh_0>(eox_2.a.b()));
            tIntHashSet.add((int)by);
        }
        return tIntHashSet;
    }

    public boolean b(int n) {
        this.l = elp_0.b;
        this.a(n);
        return true;
    }

    public boolean aa() {
        this.l = elp_0.c;
        this.b();
        this.E();
        this.O().t();
        this.O().K();
        return true;
    }

    @Override
    public boolean m(long l) {
        Object f2 = this.n(l);
        if (f2 != null) {
            ((epq_2)f2).aA();
        }
        return super.m(l);
    }

    @Override
    public boolean l(F f2) {
        boolean bl = super.l(f2);
        if (bl) {
            this.K(f2);
        }
        return bl;
    }

    @Override
    public void g(F f2) {
        if (!((epq_2)f2).a(eoz_1.bh)) {
            this.O().B(((epq_2)f2).a_());
        }
        super.g(f2);
    }

    @Override
    public boolean m(F f2) {
        boolean bl = super.m(f2);
        if (bl) {
            this.J(f2);
        }
        ((epq_2)f2).gL();
        return bl;
    }

    public fir_0 a(epq_2 epq_22, exk_2 exk_22, fio_0 fio_02, aff_1 aff_12) {
        return this.e.a(epq_22, exk_22, fio_02, aff_12);
    }

    public fir_0 a(epq_2 epq_22, exk_2 exk_22, aff_1 aff_12, boolean bl) {
        return this.d.a(epq_22, exk_22, aff_12, bl);
    }

    public fir_0 a(epq_2 epq_22, fio_0 fio_02, aff_1 aff_12, boolean bl) {
        return this.b.a(epq_22, fio_02, aff_12, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fir_0 b(epq_2 epq_22, @NotNull fio_0<?> fio_02, aff_1 aff_12, boolean bl) {
        fir_0 fir_02;
        this.b.a();
        try {
            fir_02 = this.b.a(epq_22, fio_02, aff_12, bl);
        }
        catch (Exception exception) {
            p.error((Object)("Failed to process cast validity for spell " + fio_02.w() + " by fighter " + epq_22), (Throwable)exception);
            fir_0 fir_03 = fir_0.z;
            return fir_03;
        }
        finally {
            this.b.b();
        }
        return fir_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fir_0 a(epq_2 epq_22, fio_0 fio_02, aff_1 aff_12, boolean bl, elz_0 elz_02) {
        fir_0 fir_02;
        this.b.a(elz_02);
        try {
            fir_02 = this.b.a(epq_22, fio_02, aff_12, bl);
        }
        catch (Exception exception) {
            p.error((Object)"Exception levee", (Throwable)exception);
            fir_0 fir_03 = fir_0.z;
            return fir_03;
        }
        finally {
            this.b.a(new elz_0());
        }
        return fir_02;
    }

    public abstract Si<efh_0> B();

    @Override
    public void ab() {
        super.ab();
        efq_0 efq_02 = new efq_0(this, this.B());
        efq_02.a(this.p());
        this.z = efq_02;
    }

    private boolean p() {
        Collection collection = this.ao();
        for (epq_2 epq_22 : collection) {
            if (epq_22.gO() != 4378) continue;
            return true;
        }
        return false;
    }

    @Override
    public void n(F f2) {
        ArrayList<sr_0> arrayList = new ArrayList<sr_0>();
        for (sr_0 sr_02 : this.A.f()) {
            if (sr_02.w() != ele_0.a.a() || sr_02.v() != f2 || ((ekn_0)sr_02).au()) continue;
            arrayList.add(sr_02);
        }
        for (sr_0 sr_02 : arrayList) {
            this.A.b(sr_02);
        }
    }

    public void ac() {
        this.O().s();
        this.y.a(true, true);
    }

    protected abstract void a(int var1);

    public abstract void D();

    public void E() {
        this.O().s();
        if (!this.A.d(this.n)) {
            this.A.a(this.n);
        }
    }

    @Override
    public void o() {
        this.l = elp_0.e;
        super.o();
    }

    @Override
    public void F() {
        super.F();
    }

    @Override
    public void f(F f2) {
        ((epq_2)f2).gl();
        switch (this.l) {
            case b: 
            case f: 
            case d: {
                int n = this.V(f2);
                if (!((epq_2)f2).a(eoz_1.bh)) {
                    this.O().a(((epq_2)f2).a_(), true, this.W(f2));
                }
                if (this.l != elp_0.b) break;
                this.O().s();
                break;
            }
            case c: {
                if (((epq_2)f2).a(eoz_1.bh)) break;
                int n = this.V(f2);
                this.O().a(((epq_2)f2).a_(), true, this.W(f2));
            }
        }
        super.f(f2);
    }

    private int V(F f2) {
        vw_0 vw_02 = ((epq_2)f2).fD();
        if (vw_02 == null) {
            return 1;
        }
        return vw_02.b();
    }

    private vw_0 W(F f2) {
        vw_0 vw_02 = ((epq_2)f2).fD();
        if (vw_02 != null) {
            return vw_02;
        }
        vw_0 vw_03 = new vw_0(this.V(f2), Vx.c);
        eof_2 eof_22 = this.O();
        if (eof_22.p()) {
            vw_03.a(eof_22.q());
        }
        return vw_03;
    }

    @Override
    public void e(F f2) {
        eJL eJL2 = ((epq_2)f2).dR();
        for (epq_2 epq_22 : this.am()) {
            if (epq_22.dR() != null) {
                epq_22.dR().a((Su)f2, true, true, true);
            }
            if (eJL2 == null) continue;
            eJL2.a(epq_22, true, true, false);
        }
        if (((epq_2)f2).hg()) {
            ((epq_2)f2).ap();
        }
        if (this.i() != null) {
            this.i().b((Su)f2);
        }
    }

    @Override
    public void d(@NotNull F f2) {
        if (((epq_2)f2).a(eoz_1.E)) {
            ((epq_2)f2).a_(eps_0.c).o();
        }
        if (((epq_2)f2).a(eoz_1.H)) {
            ((epq_2)f2).a_(eps_0.d).o();
        }
        ((epq_2)f2).gh().a();
        super.d(f2);
    }

    @Override
    public void c(@NotNull F f2) {
        if (((epq_2)f2).a(eoz_1.E)) {
            ((epq_2)f2).a_(eps_0.c).o();
        } else {
            ((epq_2)f2).a_(eps_0.c).n();
        }
        ((epq_2)f2).a_(eps_0.d).n();
        if (((epq_2)f2).a(eoz_1.H)) {
            ((epq_2)f2).a_(eps_0.d).o();
        }
        super.c(f2);
    }

    @Override
    public void I() {
        this.y.a(false, true);
    }

    @Override
    public void a(vu_0 vu_02) {
        this.D();
    }

    @Override
    public void a(Wc wc) {
        this.F();
    }

    @Override
    public void a(Wb wb) {
        this.M();
    }

    @Override
    public void a(vt_0 vt_02) {
        this.s(vt_02.a());
    }

    @Override
    public void a(vv_0 vv_02) {
        this.t(vv_02.a());
    }

    @Override
    public void a(vr_0 vr_02) {
        this.u(vr_02.a());
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(VY vY) {
        sd_0 sd_02 = vY.g();
        vY.h();
        if (sd_02 != null) {
            sd_02.ad();
        }
    }

    @Override
    public void a(VZ vZ) {
        sd_0 sd_02 = vZ.g();
        if (sd_02 != null) {
            sd_02.ah();
        }
    }

    @Override
    public void a(vq_0 vq_02) {
        vq_02.g().a((apq_2)this.n(vq_02.h()));
    }

    public short a(short s2, byte by) {
        Collection collection = by != -1 ? this.w.b(enw_2.c(), enw_2.a(enw_2.a((byte)1), enw_2.a((byte)2)), enw_2.b(by)) : this.w.b(enw_2.c(), enw_2.a(enw_2.a((byte)1), enw_2.a((byte)2)));
        short s3 = 0;
        if (s2 == -1) {
            return (short)collection.size();
        }
        for (epq_2 epq_22 : collection) {
            if (epq_22.gO() != s2) continue;
            s3 = (short)(s3 + 1);
        }
        return s3;
    }

    public eke_0 ad() {
        return this.n;
    }

    public void a(eke_0 eke_02) {
        this.n = eke_02;
    }

    public abstract void b(F var1);

    public void a(efi_0 efi_02, epq_2 epq_22) {
        if (efi_02 != null) {
            this.a(efi_02.be_(), epq_22);
        }
    }

    public void a(short s2, epq_2 epq_22) {
        if (epq_22 == null) {
            return;
        }
        byte by = epq_22.Y();
        for (epq_2 epq_23 : this.w.b(enw_2.c(), enw_2.a(enw_2.b(by)))) {
            epq_23.a(epq_22, s2);
        }
    }

    public void a(ejh_0 ejh_02) {
        if (ejh_02.f() != null && ((efh_0)ejh_02.f()).h() != 2) {
            return;
        }
        if (ejh_02.k() != null) {
            short s2 = ((efi_0)ejh_02.k()).be_();
            short s3 = ((efi_0)ejh_02.k()).z_();
            short s4 = ((efi_0)ejh_02.k()).A_();
            Su su = ejh_02.h();
            if (((efi_0)ejh_02.k()).G_() == 3) {
                su = ((sr_0)ejh_02.k()).v();
            }
            Su su2 = ejh_02.i();
            if (su != null && su2 != null && su instanceof epq_2 && su2 instanceof epq_2) {
                epq_2 epq_22 = (epq_2)su;
                boolean bl = false;
                if (this.a(epq_22, (epq_2)su2)) {
                    if (s4 == 0) {
                        bl = true;
                    }
                } else if (s3 == 0) {
                    bl = true;
                }
                eot_1 eot_12 = (eot_1)((Object)su2);
                eot_1 eot_13 = (eot_1)((Object)su);
                if (!bl) {
                    if (eot_12 != eot_13) {
                        eot_12.a(eot_13, s2);
                    }
                } else {
                    for (epq_2 epq_23 : this.am()) {
                        if (!this.a(epq_22, epq_23)) continue;
                        epq_23.b(eot_13, (short)(s2 * 10));
                    }
                }
            }
        }
    }

    protected abstract void a(ti_0 var1);

    @Override
    protected void ae() {
        if (this.n != null) {
            this.A.b(this.n);
            this.A.c(this.n);
            this.n.z();
            this.n = null;
        }
        super.ae();
    }

    @Override
    public /* synthetic */ va_0 P() {
        return this.O();
    }
}

