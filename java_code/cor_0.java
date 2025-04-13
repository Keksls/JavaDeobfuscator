/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cor
 */
public final class cor_0
extends Pw {
    private final long a;
    private final byte b;

    public cor_0(long l, byte by) {
        this.a = l;
        this.b = by;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13897;
    }

    @Override
    public String toString() {
        return "EquipmentSheetRemoveSheetMessage{m_characterId=" + this.a + ", m_index=" + this.b + "}";
    }
}

