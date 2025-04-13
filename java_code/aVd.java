/*
 * Decompiled with CFR 0.152.
 */
public class aVd
extends aVf {
    private final int d;
    private final String e;

    public aVd(aup_0 aup_02) {
        super(aup_02);
        this.d = aup_02.a();
        this.e = aup_02.c();
    }

    public aVd(aup_0 aup_02, String string) {
        super(aup_02);
        this.d = -1;
        this.e = "subPipe" + string;
    }

    @Override
    public int b() {
        return this.d;
    }

    @Override
    public String c() {
        return this.e;
    }

    @Override
    public void a(aUm aUm2) {
        aUm aUm3 = this.b(aUm2);
        if (aUm3 != null) {
            super.a(aUm3);
        }
    }

    @Override
    public void a(aUm aUm2, String string) {
        aUm aUm3 = this.b(aUm2);
        super.a(aUm3, string);
    }

    private aUm b(aUm aUm2) {
        aum_0 aum_02 = aul_0.a().e();
        if (!this.c.isEmpty() && aum_02 != null) {
            return aum_02.a(aUm2, this.d());
        }
        return aUm2;
    }
}

