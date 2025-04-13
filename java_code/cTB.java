/*
 * Decompiled with CFR 0.152.
 */
public class cTB
extends cSS {
    public static final String a = "fight.marker";
    private bxf_1 m;
    private aff_1 n;

    @Override
    public cSY n() {
        return cSY.av;
    }

    @Override
    public void o() {
        cyp_0.g().a(this.m.a(), this.n);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public String s() {
        return this.m.c();
    }

    @Override
    public String r() {
        return a;
    }

    @Override
    public cSS v() {
        return new cTB();
    }

    public void a(bxf_1 bxf_12) {
        this.m = bxf_12;
    }

    public void a(aff_1 aff_12) {
        this.n = aff_12;
    }
}

