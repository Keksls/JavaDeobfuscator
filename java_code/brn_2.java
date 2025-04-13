/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bRn
 */
public class brn_2 {
    private final int a;
    private final int b;
    private final int c;
    private final List<brm_2> d;

    public brn_2(int n, int n2, int n3, List<brm_2> list) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = list;
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

    public List<brm_2> d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof brn_2)) {
            return false;
        }
        brn_2 brn_22 = (brn_2)object;
        if (!brn_22.a(this)) {
            return false;
        }
        if (this.a() != brn_22.a()) {
            return false;
        }
        if (this.b() != brn_22.b()) {
            return false;
        }
        if (this.c() != brn_22.c()) {
            return false;
        }
        List<brm_2> list = this.d();
        List<brm_2> list2 = brn_22.d();
        return !(list == null ? list2 != null : !((Object)list).equals(list2));
    }

    protected boolean a(Object object) {
        return object instanceof brn_2;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.a();
        n2 = n2 * 59 + this.b();
        n2 = n2 * 59 + this.c();
        List<brm_2> list = this.d();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        return n2;
    }

    public String toString() {
        return "GuideCategory(m_id=" + this.a() + ", m_index=" + this.b() + ", m_iconId=" + this.c() + ", m_guides=" + this.d() + ")";
    }
}

