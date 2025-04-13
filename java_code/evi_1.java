/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVi
 */
public class evi_1
extends evk_1 {
    public static final short a = 3;
    public static final short b = 2;
    public static final short c = 1;
    private final long e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final long l;
    private final apc_2 m;

    public evi_1(int n, int n2, long l, int n3, int n4, int n5, boolean bl, int n6, boolean bl2, long l2, apc_2 apc_22, ezy_1 ezy_12, int n7) {
        super(n, n2, ezy_12, n7);
        this.e = l;
        this.f = n3;
        this.g = n4;
        this.h = n5;
        this.i = bl;
        this.j = n6;
        this.k = bl2;
        this.l = l2;
        this.m = apc_22;
    }

    public apc_2 a() {
        return this.m;
    }

    public long d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.f() > 0;
    }

    public int j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    public long l() {
        return this.l;
    }

    public String toString() {
        return "IELootChestParameter{m_coolDown=" + this.e + ", m_cost=" + this.f + ", m_itemIdCost=" + this.g + ", m_itemQuantityCost=" + this.h + ", m_consumeItem=" + this.i + ", m_nbActivation=" + this.j + ", m_distributionDuration=" + this.l + ", m_criterion=" + this.m + "}";
    }
}

