/*
 * Decompiled with CFR 0.152.
 */
public final class cmk
extends Pw {
    private final long a;
    private final long b;
    private final long c;
    private final short e;

    public cmk(long l, long l2, long l3, short s2) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.e = s2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13087;
    }

    @Override
    public String toString() {
        return "RemoveItemFromCompanionEquipmentRequestMessage{m_companionId=" + this.a + ", m_itemUid=" + this.b + ", m_destBagId=" + this.c + ", m_destPosition=" + this.e + "}";
    }
}

