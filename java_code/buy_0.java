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
 * Renamed from bUy
 */
public class buy_0
extends fcl_0 {
    private static final Logger a = Logger.getLogger(buy_0.class);

    public buy_0(faX faX2) {
        super(faX2);
        this.a(bVt.a);
    }

    @Override
    protected faU a(long l) {
        return bzf_1.a(l);
    }

    @Override
    public void a(@NotNull faU faU2) {
        this.f(faU2);
    }

    @Override
    public void b(long l) {
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            a.error((Object)("[NATION] On demande l'ajout du character d'id " + l + " \u00e0 la nation " + this.g() + " mais il n'y a aucun personnage avec cet id"));
            return;
        }
        this.f(blx_12);
    }
}

