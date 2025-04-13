/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTH
 */
public class eth_2 {
    private final int a;
    private final aff_1 b = new aff_1();

    public eth_2(int n, aff_1 aff_12) {
        this.a = n;
        this.b.g(aff_12);
    }

    public int a() {
        return this.a;
    }

    public aff_1 b() {
        return this.b;
    }

    public String toString() {
        return "BuildingIEDefinition{m_templateId=" + this.a + ", m_relativePos=" + this.b + "}";
    }
}

