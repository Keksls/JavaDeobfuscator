/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVc
 */
public final class evc_2
extends evk_1 {
    private final String a;
    private final byte b;

    public evc_2(int n, int n2, ezy_1 ezy_12, int n3, String string, byte by) {
        super(n, n2, ezy_12, n3);
        this.a = string;
        this.b = by;
    }

    public String a() {
        return this.a;
    }

    public byte d() {
        return this.b;
    }

    public String toString() {
        return "IEEquipableDummyParameter{m_animName='" + this.a + "'}";
    }
}

