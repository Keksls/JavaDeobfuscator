/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBE
 */
public final class abe_2 {
    private int a;
    private int b;

    public abe_2() {
    }

    public abe_2(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public int b() {
        return this.b;
    }

    public void b(int n) {
        this.b = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof abe_2)) {
            return false;
        }
        abe_2 abe_22 = (abe_2)object;
        return this.a == abe_22.a && this.b == abe_22.b;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.b;
        return n;
    }

    public String toString() {
        return "IntIntPair{m_first=" + this.a + ", m_second=" + this.b + "}";
    }
}

