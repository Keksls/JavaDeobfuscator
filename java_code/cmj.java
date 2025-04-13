/*
 * Decompiled with CFR 0.152.
 */
public final class cmj
extends Pw {
    private final long a;

    public cmj(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13548;
    }

    @Override
    public String toString() {
        return "ItemizeCompanionRequestMessage{m_companionId=" + this.a + "}";
    }
}

