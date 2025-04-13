/*
 * Decompiled with CFR 0.152.
 */
public class bUE
implements ajh_1 {
    public static final String a = "score";
    public static final String b = "rankDescription";
    public static final String d = "rankLongDescription";
    public static final String e = "color";
    private final int f;
    private int g;

    public bUE(int n) {
        this.f = n;
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public void a(int n) {
        this.g = n;
        fis_1.a().a((ajf_1)this, a, b, d, e);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            try {
                return new ani_2().d(this.g).a((CharSequence)" ").i().a(bac.a(9), -1, -1, null).r();
            }
            catch (gm_0 gm_02) {
                return this.g;
            }
        }
        if (string.equals(d)) {
            if (this.f == 0) {
                return bae.h().a("map.territories.noNation", new Object[0]);
            }
            ani_2 ani_22 = new ani_2();
            String string2 = bae.h().a("nation.short." + this.f, new Object[0]);
            ani_22.a().a((CharSequence)bae.h().a("citizen.score.with.nation", new Object[0])).b().d(this.g).a((CharSequence)" (").a((CharSequence)string2).a(')').m();
            ani_22.a().a((CharSequence)this.f()).b();
            return ani_22.r();
        }
        if (string.equals(b)) {
            if (this.f == 0) {
                return bae.h().a("map.territories.noNation", new Object[0]);
            }
            return this.f();
        }
        if (string.equals(e)) {
            fbm_0 fbm_02;
            float f2 = this.c();
            float f3 = Math.abs(f2);
            fbm_0 fbm_03 = this.e();
            azf_2 azf_22 = azf_2.a(fbm_03.c());
            fbm_0 fbm_04 = fbm_02 = f2 > 0.0f ? fbo_0.a().b(fbm_03) : fbo_0.a().a(fbm_03);
            if (fbm_02 == null) {
                fbm_02 = fbm_03;
            }
            azf_2 azf_23 = azf_2.a(fbm_02.c());
            return String.valueOf(Hw.a(azf_22.q(), azf_23.q(), f3)) + "," + Hw.a(azf_22.r(), azf_23.r(), f3) + "," + Hw.a(azf_22.s(), azf_23.s(), f3);
        }
        return null;
    }

    private float c() {
        int n = this.b();
        float f2 = 0.0f;
        fbm_0 fbm_02 = this.e();
        if (n > 0) {
            f2 = (float)n / (float)fbm_02.b();
        } else if (n < 0) {
            fbm_0 fbm_03 = fbo_0.a().a(fbm_02);
            f2 = -((float)n / (float)(fbm_03 == null ? fbm_02.b() : fbm_03.b()));
        }
        return f2;
    }

    private fbm_0 e() {
        return fbo_0.a().a(this.b());
    }

    private String f() {
        return bae.h().a(fbo_0.a().a(this.g).a(), new Object[0]);
    }
}

