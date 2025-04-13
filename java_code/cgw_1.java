/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgW
 */
final class cgw_1
implements adx_1<csk_0> {
    private static final Logger a = Logger.getLogger(cgw_1.class);

    cgw_1() {
    }

    @Override
    public boolean a(csk_0 csk_02) {
        long l = csk_02.b();
        eet_0 eet_02 = eeu_0.a(csk_02.c());
        Object t = euw_2.a.d(l);
        if (t == null) {
            return false;
        }
        if (!((epq_2)t).dP().isPresent()) {
            return false;
        }
        fkU fkU2 = ((epq_2)t).dP().get();
        fkU2.a(eet_02);
        btg.a.e();
        return false;
    }

    @Override
    public int a() {
        return 13753;
    }
}

