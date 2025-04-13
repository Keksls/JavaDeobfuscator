/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eVw
 */
public class evw_1 {
    private int a;
    private int b;
    private ezy_1 c;
    private int d;
    private boolean e;
    private evy_1 f;
    private evy_1 g;
    private List<evx_1> h;
    private List<evz_1> i;
    private List<evb_1> j;
    private apc_2 k;

    evw_1() {
    }

    public evw_1 a(int n) {
        this.a = n;
        return this;
    }

    public evw_1 b(int n) {
        this.b = n;
        return this;
    }

    public evw_1 a(ezy_1 ezy_12) {
        this.c = ezy_12;
        return this;
    }

    public evw_1 c(int n) {
        this.d = n;
        return this;
    }

    public evw_1 a(boolean bl) {
        this.e = bl;
        return this;
    }

    public evw_1 a(evy_1 evy_12) {
        this.f = evy_12;
        return this;
    }

    public evw_1 b(evy_1 evy_12) {
        this.g = evy_12;
        return this;
    }

    public evw_1 a(List<evx_1> list) {
        this.h = list;
        return this;
    }

    public evw_1 b(List<evz_1> list) {
        this.i = list;
        return this;
    }

    public evw_1 c(List<evb_1> list) {
        this.j = list;
        return this;
    }

    public evw_1 a(@Nullable apc_2 apc_22) {
        this.k = apc_22;
        return this;
    }

    public evv_1 a() {
        return new evv_1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public String toString() {
        return "IESteleParameter.IESteleParameterBuilder(paramId=" + this.a + ", visualId=" + this.b + ", chaosCategory=" + this.c + ", chaosCollectorId=" + this.d + ", randomizedRewards=" + this.e + ", activationPrice=" + this.f + ", additionalPrice=" + this.g + ", difficulties=" + this.h + ", rewardPool=" + this.i + ", rewardTiers=" + this.j + ", activationCriterion=" + this.k + ")";
    }
}

