/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVz
 */
public class evz_1 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public static eva_1 a() {
        return new eva_1();
    }

    public evz_1(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
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

    public int e() {
        return this.d;
    }

    public String toString() {
        return "SteleReward(m_id=" + this.b() + ", m_itemId=" + this.c() + ", m_quantity=" + this.d() + ", m_order=" + this.e() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof evz_1)) {
            return false;
        }
        evz_1 evz_12 = (evz_1)object;
        if (!evz_12.a(this)) {
            return false;
        }
        if (this.b() != evz_12.b()) {
            return false;
        }
        if (this.c() != evz_12.c()) {
            return false;
        }
        if (this.d() != evz_12.d()) {
            return false;
        }
        return this.e() == evz_12.e();
    }

    protected boolean a(Object object) {
        return object instanceof evz_1;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.b();
        n2 = n2 * 59 + this.c();
        n2 = n2 * 59 + this.d();
        n2 = n2 * 59 + this.e();
        return n2;
    }
}

