/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class bje
extends bjf_0<bjf> {
    private static final Logger a = Logger.getLogger(bje.class);

    @Override
    protected void a(biI biI2, bjf bjf2) {
    }

    @Override
    public void a(biI biI2) {
        for (bjf bjf2 : this.b) {
            this.a(bjf2, bjf2, biI2);
        }
    }

    @Override
    public void a(bjf bjf2, bjf bjf3, biI biI2) {
        if (bjf3.d == null) {
            a.warn((Object)"On essaye de d\u00e9sappliquer un mobile qui n'a pas \u00e9t\u00e9 appliqu\u00e9 correctement");
            return;
        }
        afv afv2 = bjf3.d.aK();
        if (afv2 != null) {
            afv2.e(bjf3.d);
        }
        afz_0.d().a(bjf3.d.a());
        bjf3.d.R();
        bjf3.d = null;
        biI2.b(bjf3.e);
        biI2.c(bjf3.e);
        bjf3.e = null;
    }
}

