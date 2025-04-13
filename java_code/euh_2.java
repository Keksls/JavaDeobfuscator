/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eUh
 */
public final class euh_2 {
    private static final Logger a = Logger.getLogger(euh_2.class);
    private final epq_2 b;

    public euh_2(@NotNull epq_2 epq_22) {
        this.b = epq_22;
    }

    public void a(long l) {
        if (!(this.b instanceof flb_0)) {
            a.error((Object)("On ne peut pas ajouter d'xp au h\u00e9ros " + this.b));
            return;
        }
        ((flb_0)((Object)this.b)).j(l);
    }
}

