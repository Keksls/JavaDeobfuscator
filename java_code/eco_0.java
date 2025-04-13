/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eCo
 */
public class eco_0 {
    private static final Logger d = Logger.getLogger(eco_0.class);
    private static final double e = 10.0;
    public static final byte a = 0;
    public static final float b = 0.6666667f;
    private final int f;
    private final int g;
    private final short h;
    private final long i;
    private final int j;
    private final int k;
    private final apc_2 l;
    private final apc_2 m;
    private final boolean n;
    private final EnumSet<ecp_0> o;
    protected final Map<Integer, Cm<Short, Short>> c = new HashMap<Integer, Cm<Short, Short>>();
    private final ecs_0 p;
    private final int[] q;

    public eco_0(int n, int n2, short s2, long l, int n3, apc_2 apc_22, apc_2 apc_23, boolean bl, EnumSet<ecp_0> enumSet, ecs_0 ecs_02, int n4, int[] nArray) {
        this.f = n;
        this.g = n2;
        this.h = s2;
        this.i = l;
        this.j = n3;
        this.l = apc_22;
        this.m = apc_23;
        this.n = bl;
        this.o = enumSet != null ? enumSet : EnumSet.noneOf(ecp_0.class);
        this.p = ecs_02;
        this.q = nArray;
        this.k = n4;
    }

    public boolean a(epq_2 epq_22) {
        return this.l == null || this.l.b(epq_22, epq_22, this, epq_22.Q_());
    }

    public boolean b(epq_2 epq_22) {
        return this.m == null || this.m.b(epq_22, epq_22, this, epq_22.Q_());
    }

    public boolean a() {
        return this.n;
    }

    public boolean c(epq_2 epq_22) {
        return this.b(epq_22) && (!this.a() || this.a(epq_22));
    }

    public boolean a(ece_0 ece_02) {
        return this.c(ecp_0.a) && !ece_02.a(this);
    }

    public byte b() {
        return 0;
    }

    public void a(ecp_0 ecp_02) {
        this.o.add(ecp_02);
    }

    public void a(Collection<ecp_0> collection) {
        this.o.addAll(collection);
    }

    public void b(ecp_0 ecp_02) {
        this.o.remove(ecp_02);
    }

    public void b(Collection<ecp_0> collection) {
        this.o.removeAll(collection);
    }

    public boolean c(ecp_0 ecp_02) {
        return this.o.contains(ecp_02);
    }

    public Iterator<ecp_0> c() {
        return this.o.iterator();
    }

    public int[] d() {
        return this.q;
    }

    public int e() {
        return this.f;
    }

    public short f() {
        return this.h;
    }

    @NotNull
    public ebx_0 g() {
        return ebx_0.a(this.f());
    }

    public boolean h() {
        ecs_0 ecs_02 = this.k();
        if (ecs_02 == null || ecs_02 == ecs_0.a) {
            return false;
        }
        int n = ecs_02.a();
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            return false;
        }
        return ((ezr_0)r2).F().n();
    }

    public long i() {
        return this.i;
    }

    public int j() {
        return this.j;
    }

    public long d(epq_2 epq_22) {
        int n = epq_22.cv().a(eAE.b, this.g, 8);
        double d2 = 1.0 / (double)this.i;
        double d3 = 1.0 + (double)n / 100.0;
        double d4 = d2 * d3;
        return Math.round(1.0 / d4);
    }

    public double a(short s2) {
        double d2 = Hw.b((double)(this.h - s2), 0.0, 10.0);
        double d3 = d2 / 10.0;
        return 1.0 - d3;
    }

    public long a(short s2, emh_0 emh_02) {
        return ecu_0.a(s2, this.h, ecn_0.a.a(this.g), this.j, emh_02);
    }

    public long a(emh_0 emh_02) {
        ect_0 ect_02 = ecn_0.a.a(this.g);
        int n = (int)((float)this.j * 0.6666667f);
        return ecu_0.a(this.h, this.h, ect_02, n, emh_02);
    }

    public ecs_0 k() {
        return this.p;
    }

    public Iterator<Map.Entry<Integer, Cm<Short, Short>>> l() {
        return this.c.entrySet().iterator();
    }

    public apc_2 m() {
        return this.l;
    }

    public boolean a(int n) {
        return this.c.containsKey(n);
    }

    public void a(int n, short s2, short s3) {
        this.c.put(n, new Cm<Short, Short>(s2, s3));
    }

    public String toString() {
        return "CraftRecipe{m_id=" + this.f + ", m_craftId=" + this.g + ", m_requiredLevel=" + this.h + ", m_craftDuration=" + this.i + "}";
    }

    public boolean n() {
        return this.k > 0;
    }

    public int o() {
        return this.k;
    }

    public int p() {
        return this.g;
    }

    public ect_0 q() {
        return ecn_0.a.a(this.g);
    }

    public Map<Integer, Cm<Short, Short>> r() {
        return this.c;
    }
}

