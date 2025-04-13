/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fjZ
 */
public enum fjz_0 implements aqk_2
{
    a(0, false, 10, false, 0, 0.0f, "2  [taille <  perso / vent /       / sous   le perso]"),
    b(1, false, 30, true, 3, 1.0471976f, "3  [taille ~= perso / vent / ombre / devant le perso]"),
    c(2, true, 80, true, 5, 1.5707964f, "4  [taille >  perso /      / ombre / devant le perso]"),
    d(3, false, 10, false, 0, 0.0f, "1  [ras du sol      /      /       / sous   le perso]"),
    e(4, false, 10, false, 0, 0.0f, "2b [taille < perso  / vent /       / devant le perso]"),
    f(5, false, 30, true, 3, 1.0471976f, "3b [taille ~= perso /      / ombre / devant le perso]"),
    g(6, true, 80, false, 0, 0.0f, "4b [taille > perso /       /       / devant le perso]");

    private final int h;
    private final boolean i;
    private final int j;
    private final boolean k;
    private final int l;
    private final float m;
    private final String n;

    private fjz_0(int n2, boolean bl, int n3, boolean bl2, int n4, float f2, String string2) {
        this.h = n2;
        this.i = bl;
        this.j = n3;
        this.k = bl2;
        this.l = n4;
        this.m = f2;
        this.n = string2;
    }

    public final boolean a() {
        return this.i;
    }

    public final int b() {
        return this.j;
    }

    public final boolean c() {
        return this.k;
    }

    public final int g() {
        return this.l;
    }

    public final float h() {
        return this.m;
    }

    @Override
    public final String d() {
        return String.valueOf(this.h);
    }

    @Override
    public final String e() {
        return this.n;
    }

    @Override
    public String f() {
        return null;
    }

    public static boolean a(fjz_0 fjz_02) {
        return fjz_02 == d || fjz_02 == a;
    }

    public static boolean b(fjz_0 fjz_02) {
        return fjz_02 == a || fjz_02 == e || fjz_02 == b;
    }
}

