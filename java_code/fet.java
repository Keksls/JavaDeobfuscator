/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fet
extends fdg {
    private static final Logger b = Logger.getLogger(fet.class);
    private final int c;

    public fet(faU faU2, int n) {
        super(faU2);
        this.c = n;
    }

    public int e() {
        return this.c;
    }

    @Override
    public void c() {
        faX faX2 = this.a.fE().m();
        if (faX2 == null) {
            return;
        }
        try {
            faX2.m().a(this);
        }
        catch (RuntimeException runtimeException) {
            b.error((Object)"Exception levee", (Throwable)runtimeException);
        }
    }

    @Override
    public fdh_0 d() {
        return fdh_0.p;
    }
}

