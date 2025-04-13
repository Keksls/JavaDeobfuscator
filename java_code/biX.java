/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class biX {
    private static final Logger c = Logger.getLogger(biX.class);
    public final String a;
    public final boolean b;

    public biX(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    public boolean a(biX biX2) {
        return this.b == biX2.b && Cz.a(this.a, biX2.a, false);
    }

    public void a(blx_1 blx_12) {
        bpb_1 bpb_12 = bpc_1.a().a(Co.h(this.a));
        if (bpb_12 == null) {
            c.error((Object)("breed inconnu " + this.a));
            return;
        }
        bpl_1.a(bpb_12.j(), blx_12);
        bpl_1.c(bpb_12.j(), blx_12);
        bpl_1.b(bpb_12.j(), blx_12);
    }
}

