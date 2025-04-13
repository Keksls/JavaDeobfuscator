/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aYL
extends aXj {
    protected static Logger a = Logger.getLogger(aYL.class);

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        aYL.a(aaw_22);
    }

    private static void a(aaw_2 aaw_22) {
        czw_2 czw_22 = new czw_2();
        czw_22.b(591892L);
        czw_22.a(0L);
        aaw_22.c(czw_22);
    }

    private static void b(aaw_2 aaw_22) {
        czn_1 czn_12 = new czn_1();
        czn_12.a(0L);
        aaw_22.c(czn_12);
    }

    private static void c(aaw_2 aaw_22) {
        czu_2 czu_22 = new czu_2();
        czu_22.a(5L);
        aaw_22.c(czu_22);
    }
}

