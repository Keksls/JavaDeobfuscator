/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ezv
 */
public class ezv_2 {
    private final int a;
    private final int b;
    private final int c;

    public ezv_2(int n, int n2) {
        this.a = n;
        this.b = n2;
        this.c = 0;
    }

    public ezv_2(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
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

    public String toString() {
        return "AptitudeBonusModel{m_id=" + this.a + ", m_effectId=" + this.b + "}";
    }
}

