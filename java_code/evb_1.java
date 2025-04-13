/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from eVB
 */
public class evb_1 {
    private final int a;
    private final int b;
    private final int c;
    private final List<evz_1> d;
    private final List<evz_1> e;
    private final short f;

    public static evc_1 a() {
        return new evc_1();
    }

    public evb_1(int n, int n2, int n3, List<evz_1> list, List<evz_1> list2, short s2) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = list;
        this.e = list2;
        this.f = s2;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public List<evz_1> e() {
        return this.d;
    }

    public List<evz_1> f() {
        return this.e;
    }

    public short g() {
        return this.f;
    }

    public String toString() {
        return "SteleRewardTier(m_id=" + this.b() + ", m_requiredDifficulty=" + this.c() + ", m_freeRewardsCount=" + this.d() + ", m_staticRewards=" + this.e() + ", m_dynamicRewards=" + this.f() + ", m_dynamicRewardsCount=" + this.g() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof evb_1)) {
            return false;
        }
        evb_1 evb_12 = (evb_1)object;
        if (!evb_12.a(this)) {
            return false;
        }
        if (this.b() != evb_12.b()) {
            return false;
        }
        if (this.c() != evb_12.c()) {
            return false;
        }
        if (this.d() != evb_12.d()) {
            return false;
        }
        if (this.g() != evb_12.g()) {
            return false;
        }
        List<evz_1> list = this.e();
        List<evz_1> list2 = evb_12.e();
        if (list == null ? list2 != null : !((Object)list).equals(list2)) {
            return false;
        }
        List<evz_1> list3 = this.f();
        List<evz_1> list4 = evb_12.f();
        return !(list3 == null ? list4 != null : !((Object)list3).equals(list4));
    }

    protected boolean a(Object object) {
        return object instanceof evb_1;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.b();
        n2 = n2 * 59 + this.c();
        n2 = n2 * 59 + this.d();
        n2 = n2 * 59 + this.g();
        List<evz_1> list = this.e();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        List<evz_1> list2 = this.f();
        n2 = n2 * 59 + (list2 == null ? 43 : ((Object)list2).hashCode());
        return n2;
    }
}

