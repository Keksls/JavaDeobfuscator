/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBH
 */
public final class abh_2 {
    private int a;
    private long b;

    public abh_2() {
    }

    public abh_2(int n, long l) {
        this.a = n;
        this.b = l;
    }

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public long b() {
        return this.b;
    }

    public void a(long l) {
        this.b = l;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof abh_2)) {
            return false;
        }
        abh_2 abh_22 = (abh_2)object;
        return this.a == abh_22.a && this.b == abh_22.b;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + (int)(this.b ^ this.b >>> 32);
        return n;
    }

    public String toString() {
        return "IntLongPair{m_first=" + this.a + ", m_second=" + this.b + "}";
    }
}

