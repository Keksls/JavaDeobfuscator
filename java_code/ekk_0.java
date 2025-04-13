/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eKK
 */
public abstract class ekk_0
extends sr_0<efh_0, elb_0>
implements aqs_2,
efi_0,
eqq_1 {
    public static final short z = 1;
    public static final short A = 1;
    public static final short B = 1;
    protected BitSet C;
    protected Set<rx_0> D;
    protected short E;
    protected eig_0 F;
    private boolean w = true;
    private byte x = (byte)-1;
    protected epq_2 G;
    protected se_0 H;

    protected ekk_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
        this.a(n, fArray2);
    }

    private void a(int n, float[] fArray) {
        if (!this.c_().a(fArray == null ? 0 : fArray.length)) {
            a.error((Object)("Wrong number of parameters for effectArea " + n + " : " + (fArray == null ? 0 : fArray.length)));
        }
    }

    protected ekk_0() {
    }

    public ekk_0 b(elb_0 elb_02) {
        ekk_0 ekk_02 = (ekk_0)super.a(elb_02);
        ekk_02.C = this.C;
        ekk_02.w = this.w;
        if (this.D != null) {
            ekk_02.D = new HashSet<rx_0>(this.D);
        }
        if (elb_02 != null) {
            ekk_02.E = elb_02.h();
            ekk_02.a(elb_02.j());
        } else {
            ekk_02.E = this.E;
        }
        return ekk_02;
    }

    @Override
    public void d(Su su) {
        super.d(su);
        if (su != null && su.J_() == 20) {
            this.x = ((epq_2)su).Y();
        }
    }

    public abstract void ar();

    @Override
    public boolean a(@Nullable sd_0 sd_02, apq_2 apq_22) {
        if (apq_22 instanceof app_2 && this.a(eld_0.b) && this.x == ((app_2)apq_22).Y()) {
            return false;
        }
        return super.a(sd_02, apq_22);
    }

    @Override
    public boolean a(int n, apq_2 apq_22) {
        if (apq_22 instanceof app_2 && this.a(eld_0.b) && this.x == ((app_2)apq_22).Y()) {
            return false;
        }
        return super.a(n, apq_22);
    }

    @Override
    public byte J_() {
        return 2;
    }

    public rs_0 av() {
        return null;
    }

    @Override
    public rs_0 b(ru_0 ru_02) {
        return null;
    }

    public eAA aw() {
        return null;
    }

    @Override
    public boolean a(ru_0 ru_02) {
        return false;
    }

    protected void az() {
        if (this.l == null) {
            return;
        }
        this.ay();
        this.au();
        this.as();
    }

    private void as() {
        this.a(eps_0.ag, this.l);
        this.a(eps_0.af, this.l);
        this.a(eps_0.ad, this.l);
        this.a(eps_0.ae, this.l);
    }

    private void au() {
        for (efa_0 efa_02 : efa_0.values()) {
            eps_0 eps_02 = efa_02.c();
            if (!this.l.a(eps_02) || !this.a(eps_02)) continue;
            rs_0 rs_02 = this.b(eps_02);
            rs_02.g();
            rs_02.c(this.l.c(eps_02));
        }
    }

    private void ay() {
        if (!this.a(eps_0.p)) {
            return;
        }
        rs_0 rs_02 = this.b(eps_0.p);
        rs_02.g();
        if (this.l.a(eps_0.p)) {
            rs_02.c(this.l.c(eps_0.p));
        }
    }

    @Override
    public void a(Su su) {
        this.a(10014, null, (apq_2)su);
        super.a(su);
    }

    @Override
    public final boolean ac() {
        return this.ax() && !this.a(eld_0.k);
    }

    protected boolean ax() {
        return super.ac();
    }

    @Override
    public boolean D() {
        if (this.o == null) {
            return false;
        }
        if (this.o.length != 4) {
            return false;
        }
        return this.o[0] + (float)this.c() * this.o[1] > 0.0f || this.o[2] + (float)this.c() * this.o[3] > 0.0f;
    }

    @Override
    public boolean a(rx_0 rx_02) {
        return this.D != null && this.D.contains(rx_02);
    }

    @Override
    public byte b(rx_0 rx_02) {
        if (this.D == null) {
            return 0;
        }
        return (byte)(this.D.contains(rx_02) ? 1 : 0);
    }

    @Override
    public void c(rx_0 rx_02) {
        if (rx_02 == null) {
            return;
        }
        if (this.D == null) {
            this.D = new HashSet<rx_0>();
        }
        this.D.add(rx_02);
    }

    @Override
    public void a(int ... nArray) {
        if (nArray == null) {
            return;
        }
        for (int k = 0; k < nArray.length; ++k) {
            int n = nArray[k];
            eld_0 eld_02 = eld_0.a(n);
            this.c(eld_02);
        }
    }

    @Override
    public se_0 x_() {
        if (this.a(eld_0.m)) {
            if (this.H == null) {
                this.H = new eJL(this);
            }
            return this.H;
        }
        return super.x_();
    }

    @Override
    public boolean y_() {
        return this.a(eld_0.m) || super.y_();
    }

    @Override
    public void d(rx_0 rx_02) {
        this.e(rx_02);
    }

    @Override
    public void e(rx_0 rx_02) {
        if (this.D == null) {
            return;
        }
        this.D.remove(rx_02);
    }

    @Override
    public void a(rx_0 rx_02, byte by) {
        if (rx_02.a() != 4) {
            return;
        }
        if (by > 0) {
            this.c(rx_02);
        }
    }

    @Override
    public short c() {
        return this.E;
    }

    @Override
    public boolean C() {
        return this.m < 0;
    }

    @Override
    public void f(apq_2 apq_22) {
        if (this.j != null && this.j.d() != null) {
            va_0 va_02 = this.j.d();
            int n = (int)(this.o[0] + (float)this.c() * this.o[1]);
            int n2 = (int)(this.o[2] + (float)this.c() * this.o[3]);
            vx_0 vx_02 = vx_0.a((short)n).a(n2 > 0);
            va_02.a(new vq_0(this, apq_22.a_()), vx_02.a((short)1));
        }
    }

    @Override
    public void g(apq_2 apq_22) {
        List<apq_2> list = this.d(apq_22);
        if (list != null && !list.isEmpty()) {
            for (apq_2 apq_23 : list) {
                if (apq_23 != null && apq_23 instanceof Su && ((Su)apq_23).x_() != null) {
                    ((Su)apq_23).x_().a(this, true, true);
                }
                this.i(apq_23);
            }
        } else {
            if (this.j == null) {
                return;
            }
            apk_1<Su> apk_12 = this.j.c();
            if (apk_12 == null) {
                return;
            }
            Iterator<Su> iterator = apk_12.k();
            while (iterator.hasNext()) {
                Su su;
                Su su2 = iterator.next();
                if (!(su2 instanceof Su) || (su = su2).x_() == null) continue;
                su.x_().a(this, true);
            }
        }
    }

    @Override
    public boolean a(BitSet bitSet, apq_2 apq_22) {
        if (bitSet == null) {
            return false;
        }
        if (this.c.intersects(bitSet)) {
            return true;
        }
        if (this.d.intersects(bitSet)) {
            return true;
        }
        return this.C.intersects(bitSet);
    }

    @Override
    public void a(BitSet bitSet, @Nullable sd_0 sd_02, apq_2 apq_22) {
        super.a(bitSet, sd_02, apq_22);
        if (this.C != null && this.C.intersects(bitSet)) {
            this.aB();
        }
    }

    private void aB() {
        se_0 se_02 = this.F.A();
        if (se_02 != null) {
            se_02.b(this.F);
        } else {
            this.j.g().b(this);
        }
    }

    @Override
    public void U() {
        super.U();
        if (this.F == null) {
            return;
        }
        se_0 se_02 = this.F.A();
        if (se_02 != null) {
            se_02.b(this.F);
        }
    }

    @Override
    public void n() {
        if (this.j instanceof eFr) {
            ((eFr)this.j).a(this);
        }
        super.n();
    }

    @Override
    public short be_() {
        return 1;
    }

    @Override
    public short z_() {
        return 1;
    }

    @Override
    public short A_() {
        return 1;
    }

    @Override
    public void a(BitSet bitSet) {
        this.C = bitSet;
    }

    @Override
    public void a(eig_0 eig_02) {
        this.F = eig_02;
    }

    @Override
    public boolean an() {
        return true;
    }

    public void g(boolean bl) {
        this.w = bl;
    }

    @Override
    public boolean al() {
        return this.w;
    }

    public void e(boolean bl) {
    }

    @Override
    public byte Y() {
        return this.x;
    }

    @Override
    public void b(byte by) {
        this.x = by;
    }

    @Override
    public epq_1 Z_() {
        return epn_2.b;
    }

    @Override
    public long B_() {
        if (this.l != null) {
            return this.l.a_();
        }
        return 0L;
    }

    @Override
    public boolean C_() {
        return false;
    }

    @Override
    public int d(ru_0 ru_02) {
        if (this.a(ru_02)) {
            return this.b(ru_02).c();
        }
        return 0;
    }

    @Override
    public boolean f(rx_0 rx_02) {
        return false;
    }

    @Override
    public boolean d_(long l) {
        fie_0 fie_02 = this.b(l);
        return fie_02 != null;
    }

    @Override
    public int e_(long l) {
        if (this.x_() == null) {
            return -1;
        }
        for (sd_0 sd_02 : this.x_()) {
            if (sd_02.bt_() != efc_0.b.a() || (long)((eja_0)sd_02).aF().p() != l) continue;
            return ((eja_0)sd_02).aF().c();
        }
        return -1;
    }

    @Override
    public boolean a_(long l, long l2) {
        fie_0 fie_02 = this.b(l);
        if (fie_02 == null) {
            return false;
        }
        return l2 == (long)fie_02.c();
    }

    private fie_0 b(long l) {
        if (this.x_() == null) {
            return null;
        }
        for (sd_0 sd_02 : this.x_()) {
            fie_0 fie_02;
            if (sd_02.bt_() != efc_0.b.a() || (long)(fie_02 = ((eja_0)sd_02).aF()).p() != l) continue;
            return fie_02;
        }
        return null;
    }

    @Override
    public boolean a(long l, long l2, eqq_1 eqq_12) {
        if (this.x_() == null) {
            return false;
        }
        if (eqq_12 == null) {
            return false;
        }
        for (sd_0 sd_02 : this.x_()) {
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
        if (this.x_() == null) {
            return false;
        }
        if (eqq_12 == null) {
            return false;
        }
        for (sd_0 sd_02 : this.x_()) {
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
        if (this.x_() == null) {
            return false;
        }
        if (eqq_12 == null) {
            return false;
        }
        for (sd_0 sd_02 : this.x_()) {
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
        if (this.x_() == null) {
            return false;
        }
        if (eqq_12 == null) {
            return false;
        }
        for (sd_0 sd_02 : this.x_()) {
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
    public boolean b(long l, long l2) {
        fie_0 fie_02 = this.b(l);
        if (fie_02 == null) {
            return false;
        }
        return l2 <= (long)fie_02.c();
    }

    @Override
    public boolean a(eqr_1 eqr_12) {
        return eqr_1.e.a(eqr_12);
    }

    public void a(ru_0 ru_02, Su su) {
        if (this.a(ru_02) && su.a(ru_02)) {
            rs_0 rs_02 = this.b(ru_02);
            rs_02.g();
            rs_02.c(su.c(ru_02));
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.x = (byte)-1;
        this.F = null;
        this.D = null;
        this.G = null;
        if (this.H != null) {
            this.H.c();
        }
        this.H = null;
    }

    public String ap() {
        return this.toString();
    }

    @Override
    public boolean ak() {
        return true;
    }

    @Override
    public int D_() {
        return 0;
    }

    @Override
    public int c_(int n) {
        return 0;
    }

    @Override
    public boolean E_() {
        return false;
    }

    protected Su aA() {
        if (this.a(eld_0.f) && this.l != null) {
            return this.l;
        }
        return this;
    }

    @Override
    public void a(epq_2 epq_22) {
        this.G = epq_22;
    }

    public abstract byte[] I_();

    public abstract void b(ByteBuffer var1);

    @Override
    public /* synthetic */ sr_0 a(st_0 st_02) {
        return this.b((elb_0)st_02);
    }
}

