/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBN
 */
public final class abn_2 {
    private long a;
    private int b;

    public abn_2() {
    }

    public abn_2(long l, int n) {
        this.a = l;
        this.b = n;
    }

    public long a() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof abn_2)) {
            return false;
        }
        abn_2 abn_22 = (abn_2)object;
        return this.a == abn_22.a && this.b == abn_22.b;
    }

    public int hashCode() {
        int n = (int)(this.a ^ this.a >>> 32);
        n = 31 * n + this.b;
        return n;
    }

    public String toString() {
        return "LongIntPair{m_first=" + this.a + ", m_second=" + this.b + "}";
    }
}

