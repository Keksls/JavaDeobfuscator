/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.EnumMap;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from epJ
 */
public abstract class epj_2<TCollect extends ecl_0>
implements epq_1 {
    private static final Logger a = Logger.getLogger(epj_2.class);
    public static final byte b = 6;
    private static final TIntObjectHashMap d = new TIntObjectHashMap();
    protected final epy_0 c;
    private final short e;
    private final int f;
    private final short g;
    private final short h;
    private TIntObjectHashMap<TCollect> i;
    private final int[] j;
    private final int[] k;
    private final short l;
    private final short m;
    private final byte n;
    private final short[] o;
    private final int p;
    private final UL q;
    private final UL r;
    private final int s;
    private final int t;
    private int u = 1;
    private int[] v;
    private int w;

    protected epj_2(short s2, int n, short s3, short s4, EnumMap<eps_0, abo_2<Integer, Float>> enumMap, int[] nArray, int[] nArray2, short[] sArray, short s5, short s6, byte by, int n2, UL uL, UL uL2, int n3, int n4, fjQ fjQ2) {
        this.e = s2;
        this.f = n;
        this.g = s3;
        this.h = s4;
        this.l = s5;
        this.m = s6;
        this.n = by;
        this.c = new epy_0(this.g);
        for (Map.Entry<eps_0, abo_2<Integer, Float>> entry : enumMap.entrySet()) {
            abo_2<Integer, Float> abo_22 = entry.getValue();
            this.c.a(entry.getKey(), abo_22.a(), abo_22.b().floatValue());
        }
        this.k = nArray;
        this.j = nArray2;
        if (sArray.length % 3 == 0) {
            this.o = sArray;
        } else {
            a.error((Object)("INITIALISATION ERROR : the natural states array is not well built (%3 != 0 : all entries are not a stateId/level pair) sur la breed " + s2));
            this.o = null;
        }
        this.p = n2;
        this.q = uL;
        this.r = uL2;
        this.s = n3;
        this.t = n4;
    }

    @Override
    public int a(eps_0 eps_02) {
        return this.c.a((ru_0)eps_02);
    }

    @Override
    public int m() {
        return this.c.a((ru_0)eps_0.l);
    }

    @Override
    public eke_0 n() {
        return null;
    }

    @Override
    public float a(epr_1 epr_12) {
        return 1.0f;
    }

    @Override
    public byte d() {
        return 6;
    }

    @Override
    public int a(int n, eps_0 eps_02) {
        return this.c.a(eps_02, n);
    }

    public void a(TCollect TCollect) {
        if (this.i == null) {
            this.i = new TIntObjectHashMap();
        }
        this.i.put(((ecl_0)TCollect).g(), TCollect);
    }

    @Nullable
    public TCollect c(int n) {
        return (TCollect)(this.i == null ? null : (ecl_0)this.i.get(n));
    }

    public TIntObjectIterator<TCollect> o() {
        return this.i == null ? d.iterator() : this.i.iterator();
    }

    public int[] p() {
        return this.i == null ? ArrayUtils.EMPTY_INT_ARRAY : this.i.keys();
    }

    @Override
    public int[] q() {
        return this.k;
    }

    @Override
    public int[] r() {
        return this.j;
    }

    public boolean a(eoz_1 eoz_12) {
        for (int n : this.k) {
            if (n != eoz_12.b()) continue;
            return true;
        }
        return false;
    }

    public boolean a(erl_2 erl_22) {
        for (int n : this.j) {
            if (n != erl_22.b()) continue;
            return true;
        }
        return false;
    }

    @Override
    public short s() {
        return this.e;
    }

    @Override
    public int t() {
        return this.f;
    }

    public short u() {
        return this.h;
    }

    public short v() {
        return this.g;
    }

    @Override
    public short[] w() {
        return this.o;
    }

    public short x() {
        return this.m;
    }

    public short y() {
        return this.l;
    }

    @Override
    public byte z() {
        return this.n;
    }

    public epy_0 A() {
        return this.c;
    }

    @Override
    public int B() {
        return this.p;
    }

    @Override
    public int C() {
        return this.s;
    }

    @Override
    public int D() {
        return this.t;
    }

    @Override
    public UL E() {
        return this.q;
    }

    @Override
    public UL F() {
        return this.r;
    }

    public int G() {
        return this.u;
    }

    protected void b(int n) {
        this.u = n;
    }

    public int[] H() {
        return this.v;
    }

    public void a(int[] nArray) {
        this.v = nArray;
    }

    public int I() {
        return this.w;
    }

    public void d(int n) {
        this.w = n;
    }

    public String toString() {
        return "AbstractMonsterBreed{m_breedId=" + this.e + ", m_familyId=" + this.f + "} ";
    }
}

