/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkt
 */
public class bkt_2
extends ezv_2 {
    private final int a;

    public bkt_2(int n, int n2, int n3, int n4) {
        super(n, n2, n3);
        this.a = n4;
    }

    public bkt_2(int n, int n2, int n3) {
        super(n, n2);
        this.a = n3;
    }

    public int a() {
        return this.a;
    }

    @Override
    public String toString() {
        return "ClientAptitudeBonusModel{m_gfxId=" + this.a + "}";
    }
}

