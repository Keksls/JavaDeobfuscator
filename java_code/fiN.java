/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fiN
implements fiP {
    private static final Logger a = Logger.getLogger(fiN.class);

    @Override
    public void a(fiO fiO2, int n) {
        a.info((Object)("Active spell set : " + n + ", " + fiO2));
    }

    @Override
    public void a(fiO fiO2) {
        a.info((Object)("Spells synchronized : " + fiO2));
    }

    @Override
    public void b(fiO fiO2, int n) {
        a.info((Object)("Passive spell set " + n + ", " + fiO2));
    }
}

