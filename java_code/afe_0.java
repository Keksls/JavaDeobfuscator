/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from afE
 */
public class afe_0
extends afv
implements afj_0 {
    public static final int[][] aj = new int[][]{{-1, -1}, {-1, 1}, {1, -1}, {0, -1}, {-1, 0}, {0, 1}, {1, 0}, {1, 1}};
    public static final int[][] ak = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    public static final short al = 4;
    public static final short am = 8;
    protected static final float an = 2.0f;
    private static final byte aH = 0;
    private static final byte aI = 1;
    private static final byte aJ = 2;
    private static final boolean aK = false;
    private static final ys_0[] aL = ys_0.b();
    public static boolean ao;
    public static boolean ap;
    protected static final boolean aq = false;
    protected final List<afy_0> ar = new ArrayList<afy_0>(5);
    protected final Set<afy_0> as = new HashSet<afy_0>(5);
    private final afh_0 aM = new afh_0();
    private final afh_0 aN = new afh_0();
    public int[][] at = aj;
    protected short au = (short)4;
    protected apl_1 av;
    protected int aw;
    protected int ax;
    protected int ay;
    protected boolean az;
    protected final TIntHashSet aA = new TIntHashSet();
    protected afg_1 aB;
    protected afr_2 aC;
    protected byte aD = (byte)8;
    protected boolean aE = true;
    private agi aO = agm.a();
    protected afp_0 aF = afX.g();
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private float aS = 1.0f;
    private int aT;

    public afe_0(long l) {
        super(l);
    }

    public afe_0(long l, float f2, float f3, float f4) {
        super(l, f2, f3, f4);
    }

    public afe_0(long l, float f2, float f3) {
        super(l, f2, f3);
    }

    public boolean a(afy_0 afy_02) {
        return this.ar.contains(afy_02);
    }

    public final void b(afy_0 afy_02) {
        if (this.ar.contains(afy_02)) {
            this.as.remove(afy_02);
            return;
        }
        this.ar.add(afy_02);
    }

    public final void c(afy_0 afy_02) {
        if (afy_02 != null) {
            this.as.add(afy_02);
        }
    }

    public final void a(Class<?> clazz) {
        for (afy_0 afy_02 : this.ar) {
            if (!clazz.isAssignableFrom(afy_02.getClass())) continue;
            this.as.add(afy_02);
        }
    }

    public final void aQ() {
        this.as.addAll(this.ar);
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        float[] fArray;
        boolean bl;
        this.aT += n;
        if (this.aB == null) {
            return;
        }
        if ((long)this.aT >= this.aB.c()) {
            this.aR();
            return;
        }
        this.ar.removeAll(this.as);
        this.as.clear();
        if (ao) {
            this.aS();
        }
        float f2 = afe_0.a(this.aB, this.aT);
        afr_2 afr_22 = this.aB.a(this.aT);
        aej_2 aej_22 = this.a(afr_22, this.aC);
        afr_2 afr_23 = this.aB.a(this.aT, aej_22 != null ? aej_22 : this.aC(), this.av);
        float f3 = afr_22.a();
        float f4 = afr_22.b();
        int n2 = Math.round(f3);
        int n3 = Math.round(afr_23.a());
        int n4 = Math.round(f4);
        int n5 = Math.round(afr_23.b());
        int n6 = this.a(n2, n4);
        if (!this.av.b(new int[]{n2, n4})) {
            int[] nArray = this.av.a(this.aw);
            n2 = Math.round(nArray[0]);
            n4 = Math.round(nArray[1]);
        }
        int n7 = this.av.a(n2, n4, this.aw);
        int n8 = this.av.a(n3, n5, this.aw);
        int n9 = this.b(n2, n4, n7);
        int n10 = this.b(n3, n5, n8);
        this.a(n2, n4, n6);
        if (n3 != n2 || n5 != n4) {
            afe_0.a(n2, n4, n9, this.aM);
            afe_0.a(n3, n5, n10, this.aN);
        }
        this.aC = afr_22;
        assert (!Float.isNaN(f3));
        assert (!Float.isNaN(f4));
        if (n2 != this.G() || n4 != this.H() || n9 != this.I()) {
            aiI.a(this);
        }
        if (!(bl = this.c(afr_22, n3, n5, fArray = new float[]{this.E}))) {
            bl = this.d(afr_22, n3, n5, fArray);
        }
        if (!bl) {
            bl = this.a(afr_22, n3, n5, n10, fArray);
        }
        if (!bl) {
            bl = this.a(afr_22, n3, n5, fArray);
        }
        if (!bl) {
            bl = this.b(afr_22, n3, n5, fArray);
        }
        if (!bl && this.av != null) {
            this.aF.a((afj_0)this, (int)(f2 * (float)this.av.a()));
            this.az = false;
        }
        if (aej_22 != null) {
            this.aF.b((afj_0)this, aej_22);
        }
        super.b(f3, f4, fArray[0]);
        this.bx();
    }

    protected final void aR() {
        int n;
        int n2;
        ArrayList<afv> arrayList;
        afr_2 afr_22 = this.aB.b();
        super.b(afr_22.a(), afr_22.b(), afr_22.c());
        if (this.c() != null) {
            this.c().b(this.C, this.D, this.E + (float)this.af());
        }
        if ((arrayList = this.aJ()) != null) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                arrayList.get(n).b(this.C, this.D, this.E);
            }
        }
        this.aB = null;
        this.av = null;
        this.aw = -1;
        this.ax = -1;
        this.ay = -1;
        this.aF.a((afj_0)this, 0);
        this.aF.b(this);
        this.aO.a(this);
        this.az = false;
        this.ar.removeAll(this.as);
        this.as.clear();
        n2 = this.ar.size();
        for (n = 0; n < n2; ++n) {
            this.ar.get(n).pathEnded(this, (int)this.C, (int)this.D, (short)this.E);
        }
        this.ar.removeAll(this.as);
        this.as.clear();
        aiI.a(this);
    }

    protected void aS() {
    }

    private static float a(afg_1 afg_12, int n) {
        long l = afg_12.c();
        return (float)(l - (long)n) / (float)(l - afg_12.d());
    }

    @Nullable
    private aej_2 a(afr_2 afr_22, afr_2 afr_23) {
        float f2 = afr_22.a - afr_23.a;
        float f3 = afr_22.b - afr_23.b;
        if (f2 == 0.0f && f3 == 0.0f) {
            return null;
        }
        if (this.aT() == 8) {
            return afr_2.a(f2, f3);
        }
        return afr_2.b(f2, f3);
    }

    private int b(int n, int n2, int n3) {
        int n4;
        int n5 = this.av.a();
        int n6 = n4 = this.aw == 0 ? 0 : this.aw - 1;
        while (n4 < n5) {
            int[] nArray = this.av.a(n4);
            if (nArray[0] == n && nArray[1] == n2 && Math.abs(n3 - nArray[2]) <= this.aU()) {
                return nArray[2];
            }
            ++n4;
        }
        short s2 = yz_0.b(n, n2, (short)n3);
        if (s2 == Short.MIN_VALUE) {
            return n3;
        }
        return s2;
    }

    private int a(int n, int n2) {
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        for (int k = this.aw; k < this.av.a(); ++k) {
            int[] nArray = this.av.a(k);
            int n5 = (nArray[0] - n) * (nArray[0] - n) + (nArray[1] - n2) * (nArray[1] - n2);
            if (n5 >= n3) continue;
            n3 = n5;
            n4 = k;
        }
        return n4;
    }

    protected void a(int n, int n2, int n3) {
        if (n3 > this.aw) {
            int n4 = this.aw;
            for (int k = this.aw + 1; k < n3; ++k) {
                this.a(this.av.a(k), this.av.a(k - 1));
            }
            this.aw = this.aw != n4 ? this.a(n, n2) : n3;
            if (ap) {
                this.aV();
            }
        }
    }

    private static void a(int n, int n2, int n3, afh_0 afh_02) {
        if (afh_02.a(n, n2, n3)) {
            return;
        }
        afh_02.a();
        yx_0 yx_02 = yz_0.a(n, n2);
        if (yx_02 == null) {
            return;
        }
        int n4 = yx_02.a().a(n, n2, aL, 0);
        if (n4 == 0) {
            return;
        }
        for (int k = 0; k < n4; ++k) {
            DisplayedScreenElement displayedScreenElement;
            ys_0 ys_02 = aL[k];
            if (ys_02.c != n3 || (displayedScreenElement = acs_0.b().c(ys_02.a, ys_02.b, ys_02.c, acV.c)) == null) continue;
            agD agD2 = displayedScreenElement.d().i();
            afh_02.a = agD2.h();
            afh_02.b = afh_02.a != 0 ? (byte)agD2.i() : (byte)0;
            afh_02.b(n, n2, n3);
            break;
        }
        if (afh_02.e == Integer.MAX_VALUE) {
            afh_02.a = 0;
            afh_02.b = 0;
            afh_02.b(n, n2, n3);
        }
    }

    private boolean c(afr_2 afr_22, int n, int n2, float[] fArray) {
        float f2;
        if (!this.aM.b() || !this.aN.b()) {
            return false;
        }
        float f3 = (float)n - afr_22.a();
        float f4 = (float)n2 - afr_22.b();
        float f5 = afq_2.c(f3, f4);
        int n3 = this.aN.c - this.aM.c;
        int n4 = this.aN.d - this.aM.d;
        int n5 = this.aN.e - this.aM.e;
        float f6 = afq_2.c(n3, n4);
        float f7 = f2 = f6 == 0.0f ? 0.0f : Hw.b(1.0f - Hw.k(f5 / f6), 0.0f, 1.0f);
        if (!yz_0.c(this.aM.c, this.aM.d, this.aM.e) || !yz_0.c(this.aN.c, this.aN.d, this.aN.e) || Hw.d(f2, 0.0f) || Math.abs(n5) < 10) {
            return false;
        }
        this.aF.d(this);
        if ((double)f5 == 0.0) {
            fArray[0] = (float)this.aM.e + f2 * (float)n5;
            return true;
        }
        fArray[0] = this.c(f2, 0.5f);
        return true;
    }

    protected boolean a(afr_2 afr_22, int n, int n2, float[] fArray) {
        boolean bl;
        if (!this.aM.b() || !this.aN.b()) {
            return false;
        }
        boolean bl2 = bl = yz_0.e(this.aM.c, this.aM.d, this.aM.e) && this.aM.c == this.aN.c && this.aM.d == this.aN.d;
        if (!(yz_0.d(this.aM.c, this.aM.d, this.aM.e) && yz_0.e(this.aN.c, this.aN.d, this.aN.e) || bl)) {
            return false;
        }
        this.aF.e(this);
        this.az = true;
        return true;
    }

    protected boolean b(afr_2 afr_22, int n, int n2, float[] fArray) {
        if (!this.aM.b() || !this.aN.b()) {
            return false;
        }
        if (!yz_0.e(this.aM.c, this.aM.d, this.aM.e) || !yz_0.d(this.aN.c, this.aN.d, this.aN.e)) {
            return false;
        }
        this.aF.f(this);
        this.az = true;
        return true;
    }

    private boolean d(afr_2 afr_22, int n, int n2, float[] fArray) {
        float f2;
        if (!this.aM.b() || !this.aN.b()) {
            return false;
        }
        if (yz_0.c(this.aM.c, this.aM.d, this.aM.e) && yz_0.c(this.aN.c, this.aN.d, this.aN.e)) {
            return false;
        }
        float f3 = (float)n - afr_22.a();
        float f4 = (float)n2 - afr_22.b();
        float f5 = afq_2.c(f3, f4);
        int n3 = this.aN.c - this.aM.c;
        int n4 = this.aN.d - this.aM.d;
        int n5 = this.aN.e - this.aM.e;
        float f6 = afq_2.c(n3, n4);
        float f7 = f2 = f6 == 0.0f ? 0.0f : Hw.b(1.0f - Hw.k(f5 / f6), 0.0f, 1.0f);
        if ((double)f5 == 0.0) {
            fArray[0] = (float)this.aM.e + f2 * (float)n5;
            return false;
        }
        boolean bl = this.aF.b((afj_0)this, n5);
        byte by = afe_0.a(this.aM, this.aN, 1);
        if (bl && (by == 1 || by == 2)) {
            boolean bl2 = false;
            agb_0 agb_02 = n5 >= 0 ? this.aF.c() : this.aF.b();
            agg_0 agg_02 = agb_02.a(f2);
            switch (agg_02) {
                case a: {
                    break;
                }
                case e: {
                    fArray[0] = this.aN.e;
                    break;
                }
                case b: 
                case c: 
                case d: {
                    bl2 = true;
                    fArray[0] = agb_02.a(this.aM.e, this.aN.e, f2, agg_02);
                }
            }
            if (this.aE && bl2 && by != 2) {
                if (this.ax == -1) {
                    this.ax = this.aw;
                    if (this.c.equals("AnimSaut-Marche") || this.c.equals("AnimSaut-Marche") || this.c.equals("AnimSaut-Marche") || this.c.equals("AnimSaut-Marche")) {
                        this.E();
                    }
                }
                boolean bl3 = Math.abs(this.aM.e - this.aN.e) == 3;
                boolean bl4 = this.aM.e <= this.aN.e;
                this.aF.a(this, n5, agg_02, bl4, bl3);
                if ((double)f2 <= 0.48 && this.aw > this.ax) {
                    this.ax = this.aw;
                    this.E();
                }
                return true;
            }
            return false;
        }
        fArray[0] = this.c(f2, 0.1f);
        return false;
    }

    private boolean a(afr_2 afr_22, int n, int n2, int n3, float[] fArray) {
        float f2 = (float)n - afr_22.a();
        float f3 = (float)n2 - afr_22.b();
        float f4 = afq_2.c(f2, f3);
        int n4 = this.aN.c - this.aM.c;
        int n5 = this.aN.d - this.aM.d;
        float f5 = afq_2.c(n4, n5);
        float f6 = f5 == 0.0f ? 0.0f : Hw.b(1.0f - Hw.k(f4 / f5), 0.0f, 1.0f);
        int n6 = Math.round(afr_22.a());
        int n7 = Math.round(afr_22.b());
        int n8 = Math.round(afr_22.c());
        if (yz_0.a(this.aN.c, this.aN.d, this.aN.e) && Hw.d(f6, 0.0f)) {
            return false;
        }
        if (yz_0.a(n6, n7, n8)) {
            return true;
        }
        if (yz_0.b(n6, n7, n8) && yz_0.a(n, n2, n3)) {
            this.aF.c(this);
            return true;
        }
        return false;
    }

    private void bx() {
        ArrayList<afv> arrayList;
        if (this.c() != null) {
            this.c().b(this.C, this.D, this.E + (float)this.af());
        }
        if ((arrayList = this.aJ()) != null) {
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                arrayList.get(k).b(this.C, this.D, this.E);
            }
        }
    }

    public byte aT() {
        return this.aD;
    }

    public short aU() {
        return this.au;
    }

    protected void aV() {
    }

    private float c(float f2, float f3) {
        afh_0 afh_02 = f2 <= 0.5f ? this.aM : this.aN;
        int n = this.aN.e - this.aM.e;
        if (afh_02.a == 0) {
            if (n == 0 || this.aM.a != this.aN.a) {
                return afh_02.e;
            }
            if (this.aM.a == this.aN.a) {
                float f4 = 0.5f - f2;
                if (Math.abs(f4) > f3) {
                    return afh_02.e;
                }
                return (float)this.aM.e + (f3 - f4) / f3 * 0.5f * (float)n;
            }
        }
        float f5 = this.aM.a == this.aN.a ? f2 : (f2 <= 0.5f ? f2 * 2.0f : f2 * 2.0f - 1.0f);
        return (float)this.aM.e + f5 * (float)n;
    }

    private static byte a(afh_0 afh_02, afh_0 afh_03, int n) {
        int n2 = afh_03.c - afh_02.c;
        int n3 = afh_03.d - afh_02.d;
        byte by = afh_02.b;
        byte by2 = afh_03.b;
        byte by3 = afh_02.a;
        byte by4 = afh_03.a;
        int n4 = afh_03.e - (by4 != 0 ? by2 / 2 : 0) - (afh_02.e - (by3 != 0 ? by / 2 : 0));
        if (n2 == 0 || n3 == 0) {
            if (n2 > 0) {
                if ((by3 & 0xC) == 12 && (by4 & 3) == 3) {
                    return 2;
                }
                byte by5 = (by3 & 4) == 4 ? by : (byte)0;
                byte by6 = (by3 & 8) == 8 ? by : (byte)0;
                byte by7 = by4 == 0 || (by4 & 1) == 1 ? by2 : (byte)0;
                byte by8 = by4 == 0 || (by4 & 2) == 2 ? by2 : (byte)0;
                return Math.abs(by5 - (by8 + n4)) <= Math.abs(n) && Math.abs(by6 - (by7 + n4)) <= Math.abs(n) ? (byte)0 : 1;
            }
            if (n2 < 0) {
                if ((by3 & 3) == 3 && (by4 & 0xC) == 12) {
                    return 2;
                }
                byte by9 = (by3 & 1) == 1 ? by : (byte)0;
                byte by10 = (by3 & 2) == 2 ? by : (byte)0;
                byte by11 = by4 == 0 || (by4 & 8) == 8 ? by2 : (byte)0;
                byte by12 = by4 == 0 || (by4 & 4) == 4 ? by2 : (byte)0;
                return Math.abs(by9 - (by11 + n4)) <= Math.abs(n) && Math.abs(by10 - (by12 + n4)) <= Math.abs(n) ? (byte)0 : 1;
            }
            if (n3 > 0) {
                if ((by3 & 9) == 9 && (by4 & 6) == 6) {
                    return 2;
                }
                byte by13 = (by3 & 1) == 1 ? by : (byte)0;
                byte by14 = (by3 & 8) == 8 ? by : (byte)0;
                byte by15 = by4 == 0 || (by4 & 2) == 2 ? by2 : (byte)0;
                byte by16 = by4 == 0 || (by4 & 4) == 4 ? by2 : (byte)0;
                return Math.abs(by13 - (by15 + n4)) <= Math.abs(n) && Math.abs(by14 - (by16 + n4)) <= Math.abs(n) ? (byte)0 : 1;
            }
            if ((by3 & 6) == 6 && (by4 & 9) == 9) {
                return 2;
            }
            byte by17 = (by3 & 2) == 2 ? by : (byte)0;
            byte by18 = (by3 & 4) == 4 ? by : (byte)0;
            byte by19 = by4 == 0 || (by4 & 1) == 1 ? by2 : (byte)0;
            byte by20 = by4 == 0 || (by4 & 8) == 8 ? by2 : (byte)0;
            return Math.abs(by18 - (by20 + n4)) <= Math.abs(n) && Math.abs(by17 - (by19 + n4)) <= Math.abs(n) ? (byte)0 : 1;
        }
        if (n2 > 0) {
            if (n3 > 0) {
                byte by21 = (by3 & 8) == 8 ? by : (byte)0;
                byte by22 = by4 == 0 || (by4 & 2) == 2 ? by2 : (byte)0;
                return Math.abs(by21 - (by22 + n4)) <= Math.abs(n) ? (byte)0 : 1;
            }
            byte by23 = (by3 & 4) == 4 ? by : (byte)0;
            byte by24 = by4 == 0 || (by4 & 1) == 1 ? by2 : (byte)0;
            return Math.abs(by23 - (by24 + n4)) <= Math.abs(n) ? (byte)0 : 1;
        }
        if (n3 > 0) {
            byte by25 = (by3 & 1) == 1 ? by : (byte)0;
            byte by26 = by4 == 0 || (by4 & 4) == 4 ? by2 : (byte)0;
            return Math.abs(by25 - (by26 + n4)) <= Math.abs(n) ? (byte)0 : 1;
        }
        byte by27 = (by3 & 2) == 2 ? by : (byte)0;
        byte by28 = by4 == 0 || (by4 & 8) == 8 ? by2 : (byte)0;
        return Math.abs(by27 - (by28 + n4)) <= Math.abs(n) ? (byte)0 : 1;
    }

    public void b(short s2) {
        this.au = s2;
    }

    public void b(byte by) {
        this.aD = by;
    }

    public void aW() {
        if (this.av == null) {
            return;
        }
        apl_1 apl_12 = this.av.a(this.aw, this.aw + 2);
        this.a(apl_12, false, true);
    }

    public void a(apl_1 apl_12, boolean bl, boolean bl2) {
        this.a(apl_12, bl, bl2, afm_0.p);
    }

    public void a(apl_1 apl_12, boolean bl, boolean bl2, afm_0 afm_02) {
        this.ax = -1;
        this.ay = -1;
        if (apl_12.a() < 2) {
            return;
        }
        if (apl_12.a() == 2 && apl_12.c()[0] == apl_12.d()[0] && apl_12.c()[1] == apl_12.d()[1]) {
            this.b(0);
            return;
        }
        switch (afm_02) {
            case k: 
            case b: {
                this.aF = afr_0.f();
                break;
            }
            case e: 
            case j: 
            case n: 
            case a: {
                this.aF = afX.g();
                break;
            }
            default: {
                this.b(apl_12.a());
            }
        }
        float f2 = (float)this.aF.a(this) / (this.aS * afc_0.a());
        afd_0[] afd_0Array = new afd_0[apl_12.a()];
        afd_0Array[0] = afd_0.a;
        int n = apl_12.a();
        for (int k = 1; k < n; ++k) {
            afd_0Array[k - 1] = afc_0.a(apl_12.a(k), apl_12.a(k - 1));
        }
        afd_0Array[apl_12.a() - 1] = afd_0Array[apl_12.a() - 2];
        afa_2 afa_22 = new afa_2(0L);
        this.aT = 0;
        ArrayList<Object> arrayList = new ArrayList<int[]>();
        arrayList.add(apl_12.c());
        int n2 = apl_12.a();
        boolean bl3 = false;
        boolean bl4 = true;
        afd_0 afd_02 = afd_0Array[0];
        for (int k = 1; k < n2; ++k) {
            int[] nArray = apl_12.a(k);
            afd_0 afd_03 = afd_0Array[k];
            arrayList.add(nArray);
            if (k == n2 - 1) {
                bl3 = true;
            } else if (afd_03 != afd_02) {
                bl3 = true;
            }
            if (bl3) {
                boolean bl5;
                boolean bl6 = afd_02 == afd_0.f || afd_02 == afd_0.e || afd_02 == afd_0.d;
                boolean bl7 = bl5 = afd_02 == afd_0.c;
                if ((bl6 || bl5) && this.aF.e()) {
                    f2 = n2 - 3 <= k ? (float)UL.b.b() : (float)UL.a.b();
                }
                this.a(new apl_1(arrayList), afa_22, bl4, afd_02, f2);
                arrayList = new ArrayList();
                arrayList.add(nArray);
                bl4 = false;
                bl3 = false;
            }
            afd_02 = afd_03;
        }
        this.aB = afa_22;
        this.aC = new afr_2(this.C, this.D, this.E);
        this.av = apl_12;
        this.aw = 0;
        if (ao) {
            this.aA.forEach((TIntProcedure)new aff_0(this));
            this.aA.clear();
        }
    }

    private void a(apl_1 apl_12, afa_2 afa_22, boolean bl, afd_0 afd_02, float f2) {
        Object object;
        float f3 = afd_02.a();
        if (f3 < 0.0f) {
            f3 = f2;
        }
        Object object2 = apl_12.a((long)((int)f3), true);
        afr_2 afr_22 = new afr_2(this.C, this.D, this.E);
        if (bl && this.aB != null) {
            object = ((ArrayList)object2).get(0);
            ((afe_2)object).a(afr_22);
            ((afe_2)object).b(((afe_2)object).b().e(((afe_2)object).a()));
        }
        if (afd_02.b() && ((ArrayList)object2).size() > 1) {
            object = new ArrayList(((ArrayList)object2).size());
            Iterator<afe_2> iterator = ((ArrayList)object2).iterator();
            while (iterator.hasNext()) {
                afe_2 afe_22 = iterator.next();
                ((ArrayList)object).addAll(afe_22.a(2.0));
            }
            object2 = object;
            afa_22.a(new afh_2((List<afe_2>)object2, this.aT));
        } else {
            int n = this.aF.d();
            if (n >= 0) {
                this.aF.a((afj_0)this, apl_12.b(1));
            }
            afa_22.a(new afd_2((List<afe_2>)object2, this.aT + Math.max(0, n)));
        }
        float f4 = afd_02.c();
        if (f4 > 0.0f) {
            afa_22.a(new afk_1(afa_22.b(), (long)f4, this.aT));
        }
    }

    public void a(boolean bl, afm_0 afm_02) {
        afp_0 afp_02 = afn_0.a().a(afm_02);
        this.a(agh_0.a(bl, this, afp_02, afp_02));
    }

    public void a(boolean bl, afm_0 afm_02, afm_0 afm_03) {
        afp_0 afp_02 = afn_0.a().a(afm_02);
        afp_0 afp_03 = afn_0.a().a(afm_03);
        this.a(agh_0.a(bl, this, afp_02, afp_03));
    }

    @Override
    public void b(float f2, float f3, float f4) {
        if (this.bk().g(this)) {
            apl_1 apl_12;
            if (this.av == null) {
                apl_12 = new apl_1(2);
                apl_12.a(0, (int)this.C, (int)this.D, (short)this.E);
                apl_12.a(1, (int)f2, (int)f3, (short)f4);
            } else {
                apl_12 = new apl_1(3);
                apl_12.a(0, (int)this.C, (int)this.D, (short)this.E);
                apl_12.a(1, this.av.d());
                apl_12.a(2, (int)f2, (int)f3, (short)f4);
            }
            this.a(apl_12, true, false);
            return;
        }
        super.b(f2, f3, f4);
        this.aX();
    }

    public void aX() {
        this.av = null;
        this.aw = -1;
        this.ax = -1;
        this.ay = -1;
        this.aB = null;
        this.ar.clear();
        this.aO.a(this);
        this.aQ = false;
        this.aR = false;
        this.aP = false;
        if (this.aY()) {
            this.aF.a((afj_0)this, 0);
            this.aF.b(this);
        }
    }

    protected boolean aY() {
        return this.aF != null && !this.e();
    }

    @Override
    protected void a(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[]{nArray[0], nArray[1], nArray[2]};
        if (this.av != null) {
            int n = this.av.a();
            boolean bl = false;
            for (int k = 0; k < n; ++k) {
                int[] nArray4 = this.av.a(k);
                if (nArray4[0] != nArray[0] || nArray4[1] != nArray[1]) continue;
                nArray3[2] = nArray4[2];
                bl = true;
                break;
            }
            if (!bl) {
                return;
            }
        }
        if (this.ad != null) {
            afk_0[] afk_0Array;
            for (afk_0 afk_02 : afk_0Array = this.ad.toArray(new afk_0[this.ad.size()])) {
                afk_02.cellPositionChanged(this, nArray3[0], nArray3[1], (short)nArray3[2]);
            }
        }
        if (this.c() != null) {
            this.c().a(nArray3, nArray2);
        }
    }

    @Override
    protected void m() {
        super.m();
        this.ar.clear();
        this.as.clear();
        this.av = null;
        this.aB = null;
    }

    @Override
    public boolean a(float f2, float f3) {
        if (this.ba()) {
            return this.a(f2, f3, 2.0f);
        }
        return super.a(f2, f3);
    }

    @Override
    public agi aZ() {
        return this.aO;
    }

    @Override
    public void a(int n, short s2) {
        super.a(n, s2);
        afv afv2 = this.c();
        if (afv2 != null) {
            afv2.a(n, s2);
        }
    }

    public boolean ba() {
        return this.av != null;
    }

    public final apl_1 bb() {
        return this.av;
    }

    public afg_1 bc() {
        return this.aB;
    }

    @Override
    public void bd() {
        this.aO.b(this);
    }

    public int be() {
        if (this.av != null) {
            return this.av.a(this.aw)[0];
        }
        return (int)this.C;
    }

    public int bf() {
        if (this.av != null) {
            return this.av.a(this.aw)[1];
        }
        return (int)this.D;
    }

    public short bg() {
        if (this.e()) {
            return (short)this.d().L();
        }
        if (this.av != null) {
            return (short)this.av.a(this.aw)[2];
        }
        return (short)this.E;
    }

    @Override
    public String bh() {
        return this.ab();
    }

    @Override
    public int bi() {
        return 5;
    }

    @Override
    public boolean bj() {
        return false;
    }

    @Override
    public final afp_0 bk() {
        return this.aF;
    }

    protected void b(int n) {
        afp_0 afp_02 = this.aO.a(this, n);
        assert (afp_02 != null);
        this.aF = afp_02;
    }

    @Override
    public UL bl() {
        return UL.a;
    }

    @Override
    public int bm() {
        return this.bl().b();
    }

    @Override
    public UL bn() {
        return UL.b;
    }

    @Override
    public int bo() {
        return this.bn().b();
    }

    @Override
    public void a(boolean bl) {
        this.aP = bl;
    }

    @Override
    public void a(agi agi2) {
        assert (this.aO != null);
        this.aO = agi2;
        this.b(0);
    }

    @Override
    public boolean bp() {
        return this.aP;
    }

    @Override
    public void o(boolean bl) {
        this.aQ = bl;
    }

    @Override
    public boolean bq() {
        return this.aQ;
    }

    @Override
    public void p(boolean bl) {
        this.aR = bl;
    }

    @Override
    public boolean br() {
        return this.aR;
    }

    public boolean bs() {
        return yz_0.e(this.be(), this.bf(), (int)this.bg());
    }

    public boolean bt() {
        return this.az;
    }

    public boolean bu() {
        return false;
    }

    public void f(float f2) {
        this.aS = f2;
    }

    public void q(boolean bl) {
        this.aE = bl;
    }
}

