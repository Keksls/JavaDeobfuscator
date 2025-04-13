/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class eBw
implements eBu {
    private static final Logger b = Logger.getLogger(eBw.class);
    public static final eBw a = new eBw();

    private eBw() {
    }

    @Override
    public void a(eBt eBt2, long l) {
        b.info((Object)("Compagnon " + eBt2.b() + ", nouvelle valeur de l'xp " + eBt2.c()));
    }

    @Override
    public void c(eBt eBt2) {
        b.info((Object)("Compagnon " + eBt2.b() + ", nouveau nom " + eBt2.e()));
    }

    @Override
    public void d(eBt eBt2) {
        b.info((Object)("Compagnon " + eBt2.b() + ", nouvel id "));
    }

    @Override
    public void e(eBt eBt2) {
    }

    @Override
    public void f(eBt eBt2) {
    }

    @Override
    public void g(eBt eBt2) {
    }
}

