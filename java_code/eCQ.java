/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntShortIterator
 *  gnu.trove.map.hash.TIntShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntShortIterator;
import gnu.trove.map.hash.TIntShortHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class eCQ {
    private static final Logger c = Logger.getLogger(eCQ.class);
    public static final byte a = 0;
    private final int d;
    private final int e;
    private final short f;
    private final long g;
    private final int h;
    private final apc_2 i;
    private final apc_2 j;
    private final boolean k;
    private final EnumSet<eCP> l;
    protected final TIntShortHashMap b = new TIntShortHashMap();
    private final ArrayList<eCU> m = new ArrayList();
    private final ArrayList<eCT> n = new ArrayList();
    private final float o;
    private final boolean p;
    private final long q;
    private final long r;
    private final int s;

    public eCQ(int n, int n2, short s2, long l, int n3, apc_2 apc_22, apc_2 apc_23, boolean bl, EnumSet<eCP> enumSet, float f2, boolean bl2, long l2, long l3, int n4) {
        this.d = n;
        this.e = n2;
        this.f = s2;
        this.g = l;
        this.h = n3;
        this.i = apc_22;
        this.j = apc_23;
        this.k = bl;
        this.l = enumSet != null ? enumSet : EnumSet.noneOf(eCP.class);
        this.o = f2;
        this.p = bl2;
        this.q = l2;
        this.r = l3;
        this.s = n4;
    }

    public boolean a(epq_2 epq_22) {
        return this.i == null || this.i.b(epq_22, epq_22, this, epq_22.Q_());
    }

    public boolean b(epq_2 epq_22) {
        return this.j == null || this.j.b(epq_22, epq_22, this, epq_22.Q_());
    }

    public boolean a() {
        return this.k;
    }

    public byte b() {
        return 0;
    }

    public void a(eCP eCP2) {
        this.l.add(eCP2);
    }

    public void a(Collection<eCP> collection) {
        this.l.addAll(collection);
    }

    public void b(eCP eCP2) {
        this.l.remove(eCP2);
    }

    public void b(Collection<eCP> collection) {
        this.l.removeAll(collection);
    }

    public boolean c(eCP eCP2) {
        return this.l.contains(eCP2);
    }

    public Iterator<eCP> c() {
        return this.l.iterator();
    }

    public int d() {
        return this.d;
    }

    public short e() {
        return this.f;
    }

    public int f() {
        return this.m.size();
    }

    public long g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public long c(epq_2 epq_22) {
        int n = epq_22.cv().a(eAE.b, this.e, 8);
        double d2 = 1.0 / (double)this.g;
        double d3 = 1.0 + (double)n / 100.0;
        double d4 = d2 * d3;
        return Math.round(1.0 / d4);
    }

    public eCU a(short s2) {
        if (this.m.isEmpty()) {
            return eCU.a;
        }
        double d2 = ecw_0.a(s2, this);
        return this.m.get((int)Math.round(d2));
    }

    public float i() {
        return this.o;
    }

    public long j() {
        return this.r;
    }

    public eCU[] k() {
        return this.m.toArray(new eCU[this.m.size()]);
    }

    public eCU b(short s2) {
        ecw_0 ecw_02 = new ecw_0(s2, this);
        return this.m.get((int)Math.round(ecw_02.a()));
    }

    public TIntShortIterator l() {
        return this.b.iterator();
    }

    public ArrayList<eCT> m() {
        return this.n;
    }

    public apc_2 n() {
        return this.i;
    }

    public short a(int n) {
        return this.b.get(n);
    }

    public boolean b(int n) {
        return this.b.containsKey(n);
    }

    public void a(int n, short s2) {
        this.b.put(n, s2);
    }

    public long o() {
        return this.q;
    }

    public boolean p() {
        return this.p;
    }

    public int q() {
        return this.e;
    }

    public String toString() {
        return "CraftRecipeReference{m_id=" + this.d + ", m_craftId=" + this.e + ", m_requiredLevel=" + this.f + ", m_craftDuration=" + this.g + "}";
    }

    public boolean c(int n) {
        int n2 = this.m.size();
        for (int k = 0; k < n2; ++k) {
            if (this.m.get(k).a() != n) continue;
            return true;
        }
        return false;
    }

    public void b(int n, short s2) {
        eCU eCU2 = new eCU(n, s2);
        if (this.m.contains(eCU2)) {
            c.warn((Object)("Duplication d'item r\u00e9sultant " + n + " sur la recette " + this.d()));
            return;
        }
        this.m.add(eCU2);
    }

    public void a(int[] nArray, short s2, short s3, boolean bl) {
        eCM[] eCMArray = new eCM[nArray.length];
        for (int k = 0; k < eCMArray.length; ++k) {
            eCMArray[k] = eCM.a((byte)nArray[k]);
        }
        eCT eCT2 = new eCT(eCMArray, s2, s3, bl);
        if (this.n.contains(eCT2)) {
            c.warn((Object)("Duplication de slot de mat\u00e9riau " + eCT2 + " sur la recette " + this.d()));
            return;
        }
        this.n.add(eCT2);
    }

    public eCT a(byte by) {
        return this.n.get(by);
    }

    public boolean r() {
        return this.s > 0;
    }
}

