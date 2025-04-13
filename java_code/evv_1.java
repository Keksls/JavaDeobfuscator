/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eVv
 */
public class evv_1
extends evk_1 {
    private final boolean a;
    private final evy_1 b;
    private final evy_1 c;
    private final List<evx_1> e;
    private final List<evz_1> f;
    private final List<evb_1> g;
    @Nullable
    private final apc_2 h;

    public evv_1(int n, int n2, ezy_1 ezy_12, int n3, boolean bl, evy_1 evy_12, evy_1 evy_13, List<evx_1> list, List<evz_1> list2, List<evb_1> list3, @Nullable apc_2 apc_22) {
        super(n, n2, ezy_12, n3);
        this.a = bl;
        this.b = evy_12;
        this.c = evy_13;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = apc_22;
        list3.sort(Comparator.comparingInt(evb_1::c).thenComparingInt(evb_1::b));
    }

    public static evw_1 a() {
        return new evw_1();
    }

    public boolean d() {
        return this.a;
    }

    public evy_1 e() {
        return this.b;
    }

    public evy_1 f() {
        return this.c;
    }

    public List<evx_1> g() {
        return this.e;
    }

    public List<evz_1> h() {
        return this.f;
    }

    public List<evb_1> i() {
        return this.g;
    }

    @Nullable
    public apc_2 j() {
        return this.h;
    }

    public String toString() {
        return "IESteleParameter(m_randomizedRewards=" + this.d() + ", m_activationPrice=" + this.e() + ", m_additionalPrice=" + this.f() + ", m_difficulties=" + this.g() + ", m_rewardPool=" + this.h() + ", m_rewardTiers=" + this.i() + ", m_activationCriterion=" + this.j() + ")";
    }
}

