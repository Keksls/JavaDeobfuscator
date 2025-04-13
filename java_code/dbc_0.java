/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbc
 */
public class dbc_0
implements aUu {
    private final String a;
    private final long b;
    private final String c;

    protected dbc_0(String string, long l, String string2) {
        this.b = l;
        this.a = string;
        this.c = string2;
    }

    @Override
    public void a(aUv aUv2) {
        int n = aUxx.a().u();
        wu_0 wu_02 = wn_0.a.a();
        String string = "[" + wu_02.k() + ":" + wu_02.l() + "] ";
        ani_2 ani_22 = new ani_2();
        ani_22.i();
        ani_22.a(aup_0.d.d());
        ani_22.a((CharSequence)string);
        ani_22.a().g();
        ani_22.c("characterName_" + this.b);
        ani_22.a((CharSequence)this.c);
        ani_22.h().b();
        ani_22.a((CharSequence)bae.h().a("colon", new Object[0])).a((CharSequence)this.a);
        ani_22.j();
        aUm aUm2 = new aUm(ani_22.r());
        aUm2.a(aup_0.d);
        aUm2.a(n);
        aul_0.a().a(aUm2);
    }
}

