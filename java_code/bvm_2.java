/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bvm
 */
public class bvm_2
implements Uo {
    private static final Logger b = Logger.getLogger(bvm_2.class);
    public static final bvm_2 a = new bvm_2();

    private bvm_2() {
    }

    @Override
    public void a(Uk uk) {
        switch (uk.b()) {
            case e: {
                um_0 um_02 = (um_0)uk;
                if (um_02.e() <= 0) {
                    return;
                }
            }
            case a: 
            case b: {
                um_0 um_02 = (um_0)uk;
                ts_0 ts_02 = um_02.c();
                if (!(ts_02 instanceof exk_2)) {
                    b.error((Object)("Ce listener ne doit \u00eatre utilis\u00e9 que pour des \u00e9v\u00e9nements d'Item et non de " + ts_02.getClass()), (Throwable)new UnsupportedOperationException());
                    return;
                }
                bua_0.a.a(new buj_2(((exk_2)ts_02).T()));
            }
        }
    }
}

