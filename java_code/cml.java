/*
 * Decompiled with CFR 0.152.
 */
public final class cml
extends Pw {
    private final long a;
    private final String b;

    public cml(long l, String string) {
        this.a = l;
        this.b = string;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        byte[] byArray = Cz.a(this.b);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12556;
    }

    @Override
    public String toString() {
        return "RenameCompanionRequestMessage{m_companionId=" + this.a + ", m_name='" + this.b + "'}";
    }
}

