/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cjs
 */
final class cjs_2
implements adx_1<cuk_1> {
    private static final Logger a = Logger.getLogger(cjs_2.class);

    cjs_2() {
    }

    @Override
    public boolean a(cuk_1 cuk_12) {
        enX enX2 = enX.a(cuk_12.b());
        if (enX2 != enX.a) {
            a.error((Object)("[H\u00e9ros] Impossible d'ajouter un H\u00e9ros : errorId " + enX2.a()));
            aUh.a("error.cantAddHero" + enX2.a(), new Object[0]);
            cxq_0.a.f();
        }
        brd_0.k.b(true);
        dbA.h();
        return false;
    }

    @Override
    public int a() {
        return 13192;
    }
}

