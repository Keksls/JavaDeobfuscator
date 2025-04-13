/*
 * Decompiled with CFR 0.152.
 */
public class cns
extends Pw {
    private final long a;
    private final String b;

    public cns(String string, eqd_2 eqd_22) {
        this.b = string;
        this.a = eqd_22.e();
    }

    @Override
    public byte[] b() {
        String string = bae.h().a("bestRankName", new Object[0]);
        String string2 = bae.h().a("worstRankName", new Object[0]);
        byte[] byArray = Cz.a(this.b);
        byte[] byArray2 = Cz.a(string);
        byte[] byArray3 = Cz.a(string2);
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a(byArray2.length);
        abx_22.b(byArray2);
        abx_22.a(byArray3.length);
        abx_22.b(byArray3);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13185;
    }

    @Override
    public String toString() {
        return "CreateGuildRequestMessage{m_blazon=" + this.a + ", m_name='" + this.b + "'}";
    }
}

