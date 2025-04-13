/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ciT
 */
final class cit_1
implements chc_1<ctz_2, bvw_2> {
    private static final Logger a = Logger.getLogger(cit_1.class);
    private long b;

    cit_1() {
    }

    @Override
    public boolean a(ctz_2 ctz_22) {
        int n = ctz_22.b();
        a.info((Object)("Erreur de creation de combat " + n));
        this.b = ctz_22.c();
        String string = this.b(n);
        aul_0.a().b(string);
        return false;
    }

    private String b(int n) {
        String string;
        if (n == 0) {
            string = bae.h().a("fight.hero.join.generic.error", new Object[0]);
        } else {
            bQG.a();
            string = bQG.b(n, new Object[0]);
        }
        String string2 = string;
        Object t = euw_2.a.d(this.b);
        if (t == null) {
            a.error((Object)("Heros inconnu " + this.b));
            return string2;
        }
        return bae.h().a("fight.hero.join.error", ((epq_2)t).dp(), string2);
    }

    @Override
    public void a(bvw_2 bvw_22) {
    }

    @Override
    public int a() {
        return 13262;
    }

    @Override
    public void a(int n) {
    }
}

