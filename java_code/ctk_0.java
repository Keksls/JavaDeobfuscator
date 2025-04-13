/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTK
 */
public class ctk_0
extends cTF {
    public static final int n = 0;
    public static final int o = 1;
    private int p;

    public ctk_0(String string, int n) {
        this.a = string;
        this.m = n;
    }

    public ctk_0() {
    }

    @Override
    public cTF a() {
        return new ctk_0(this.a, this.m);
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!emj_0.a.a(new emh_0[]{bmr_12})) {
            this.p = 1;
            return false;
        }
        return this.d;
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2().a().a(this.d() ? f : h);
        ani_22.a((CharSequence)bae.h().a(this.a, new Object[0])).b();
        if (!this.d()) {
            switch (this.p) {
                case 1: {
                    ani_22.m().a(h).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
                }
            }
        }
        return ani_22.r();
    }

    @Override
    public void o() {
        super.o();
        cwd_0 cwd_02 = cwd_0.d();
        cwd_02.a((bdv_0)this.l);
        cfb_1.a.a(new bpz_2(cwd_02));
    }

    @Override
    public /* synthetic */ cSS v() {
        return this.a();
    }
}

