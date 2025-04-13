/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SL
 */
final class sl_0 {
    private final int b;
    private final long c;
    private final long d;
    final /* synthetic */ SK a;

    sl_0(SK sK, int n, long l, long l2) {
        this.a = sK;
        this.b = n;
        this.c = l;
        this.d = l2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof sl_0)) {
            return false;
        }
        sl_0 sl_02 = (sl_0)object;
        if (this.c != sl_02.c) {
            return false;
        }
        if (this.b != sl_02.b) {
            return false;
        }
        return this.d == sl_02.d;
    }

    public int hashCode() {
        int n = this.b;
        n = 31 * n + (int)(this.c ^ this.c >>> 32);
        n = 31 * n + (int)(this.d ^ this.d >>> 32);
        return n;
    }

    public String toString() {
        return "IntLongLong{m_effectId=" + this.b + ", m_casterId=" + this.c + ", m_targetId=" + this.d + "}";
    }
}

