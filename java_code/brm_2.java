/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.List;
import javax.annotation.Nullable;

/*
 * Renamed from bRm
 */
public class brm_2 {
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;
    @Nullable
    private final apc_2 e;
    @Nullable
    private final apc_2 f;
    private final List<bro_2> g;

    public brm_2(int n, int n2, int n3, boolean bl, @Nullable apc_2 apc_22, @Nullable apc_2 apc_23, List<bro_2> list) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = bl;
        this.e = apc_22;
        this.f = apc_23;
        this.g = list;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    @Nullable
    public apc_2 e() {
        return this.e;
    }

    @Nullable
    public apc_2 f() {
        return this.f;
    }

    public List<bro_2> g() {
        return this.g;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof brm_2)) {
            return false;
        }
        brm_2 brm_22 = (brm_2)object;
        if (!brm_22.a(this)) {
            return false;
        }
        if (this.a() != brm_22.a()) {
            return false;
        }
        if (this.b() != brm_22.b()) {
            return false;
        }
        if (this.c() != brm_22.c()) {
            return false;
        }
        if (this.d() != brm_22.d()) {
            return false;
        }
        apc_2 apc_22 = this.e();
        apc_2 apc_23 = brm_22.e();
        if (apc_22 == null ? apc_23 != null : !apc_22.equals(apc_23)) {
            return false;
        }
        apc_2 apc_24 = this.f();
        apc_2 apc_25 = brm_22.f();
        if (apc_24 == null ? apc_25 != null : !apc_24.equals(apc_25)) {
            return false;
        }
        List<bro_2> list = this.g();
        List<bro_2> list2 = brm_22.g();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    protected boolean a(Object object) {
        return object instanceof brm_2;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.a();
        n2 = n2 * 59 + this.b();
        n2 = n2 * 59 + this.c();
        n2 = n2 * 59 + (this.d() ? 79 : 97);
        apc_2 apc_22 = this.e();
        n2 = n2 * 59 + (apc_22 == null ? 43 : apc_22.hashCode());
        apc_2 apc_23 = this.f();
        n2 = n2 * 59 + (apc_23 == null ? 43 : apc_23.hashCode());
        List<bro_2> list = this.g();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }

    public String toString() {
        return "Guide(m_id=" + this.a() + ", m_index=" + this.b() + ", m_categoryId=" + this.c() + ", m_forcedDisplay=" + this.d() + ", m_popupCriterion=" + this.e() + ", m_visibleCriterion=" + this.f() + ", m_guideElements=" + this.g() + ")";
    }
}

