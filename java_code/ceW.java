/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ceW
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ceW.class);
    public static final ceW b = new ceW();

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 22783: {
                cbj_0 cbj_02 = (cbj_0)adt_12;
                long l = System.currentTimeMillis() - cbj_02.n();
                wc_0.p().a(cbj_02.b() + l);
                wc_0.p().b(1000L);
                wc_0.p().run();
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

