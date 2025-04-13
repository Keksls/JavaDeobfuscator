/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bjP
extends bjf_0<bjq_0> {
    private static final Logger a = Logger.getLogger(bjP.class);

    @Override
    protected void a(biI biI2, bjq_0 bjq_02) {
    }

    @Override
    public void a(biI biI2) {
        bjq_0 bjq_02 = (bjq_0)this.c();
        this.b.clear();
        this.a(bjq_02, bjq_02, biI2);
    }

    @Override
    public void a(bjq_0 bjq_02, bjq_0 bjq_03, biI biI2) {
        if (bjq_03.d == null) {
            a.warn((Object)"On essaye de d\u00e9sappliquer un mobile qui n'a pas \u00e9t\u00e9 appliqu\u00e9 correctement");
            return;
        }
        biI2.e(bjq_03.d);
        afz_0.d().a(bjq_03.d.a());
        bjq_03.d = null;
    }
}

