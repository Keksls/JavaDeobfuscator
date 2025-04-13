/*
 * Decompiled with CFR 0.152.
 */
public class aVe
extends aVd {
    public aVe(aup_0 aup_02) {
        super(aup_02);
    }

    @Override
    public void a(aUm aUm2) {
        this.b(aUm2);
        super.a(aUm2);
    }

    @Override
    public void a(aUm aUm2, String string) {
        this.b(aUm2);
        super.a(aUm2, string);
    }

    private void b(aUm aUm2) {
        String string = aUm2.d();
        if (this.b(string) == null) {
            this.a(string);
        }
    }

    @Override
    public void a(String string) {
        aVd aVd2 = new aVd(this.a(), string);
        this.a(string, aVd2);
    }
}

