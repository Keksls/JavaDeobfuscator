/*
 * Decompiled with CFR 0.152.
 */
public final class cmh
extends Pw {
    private final long a;
    private final byte b;
    private final long c;

    public cmh(long l, byte by, long l2) {
        this.a = l;
        this.b = by;
        this.c = l2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13025;
    }

    @Override
    public String toString() {
        return "AddItemToCompanionEquipmentRequestMessage{m_companionId=" + this.a + ", m_equipmentPosition=" + this.b + ", m_itemUid=" + this.c + "}";
    }
}

