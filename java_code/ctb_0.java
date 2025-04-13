/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTb
 */
public class ctb_0
extends cTF {
    public ctb_0(String string, int n) {
        this.a = string;
        this.m = n;
    }

    public ctb_0() {
    }

    @Override
    public cTF a() {
        return new ctb_0(this.a, this.m);
    }

    @Override
    public boolean d() {
        return this.d;
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2().a().a(this.d() ? f : h);
        ani_22.a((CharSequence)bae.h().a(this.a, new Object[0])).b();
        return ani_22.r();
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.a();
    }
}

