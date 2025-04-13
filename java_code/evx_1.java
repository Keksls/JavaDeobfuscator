/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVx
 */
public class evx_1 {
    private final int a;
    private final int b;
    private final int c;

    public evx_1(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
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

    public String toString() {
        return "SteleDifficulty(m_id=" + this.a() + ", m_weight=" + this.b() + ", m_stateId=" + this.c() + ")";
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof evx_1)) {
            return false;
        }
        evx_1 evx_12 = (evx_1)object;
        if (!evx_12.a(this)) {
            return false;
        }
        return this.a() == evx_12.a();
    }

    protected boolean a(Object object) {
        return object instanceof evx_1;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.a();
        return n2;
    }
}

