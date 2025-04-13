/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpH
 */
public class bph_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bph_2.class);
    private final bdr_0 b;

    public bph_2(bdr_0 bdr_02) {
        this.b = bdr_02;
    }

    @Override
    public short ac_() {
        return 23;
    }

    @Override
    public boolean g() {
        bpc_2 bpc_22 = this.d.eE();
        return bpc_22 == null || bpc_22 == this;
    }

    @Override
    public void a() {
        a.info((Object)"[STORAGE_BOX] Lancement de l'occupation");
        this.d.a(this);
        azu_0.j().a(cfx_1.a);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        a.info((Object)"[STORAGE_BOX] On cancel l'occupation");
        if (bl2) {
            this.b.a(Tv.n, azu_0.j().k());
        }
        if (azu_0.j().c(ddi_0.d())) {
            azu_0.j().b(ddi_0.d());
        }
        azu_0.j().b(cfx_1.a);
        azu_0.j().b(bqb_0.a);
        return true;
    }

    @Override
    public boolean b() {
        a.info((Object)"[STORAGE_BOX] On fini l'occupation");
        if (azu_0.j().c(ddi_0.d())) {
            azu_0.j().b(ddi_0.d());
        }
        azu_0.j().b(cfx_1.a);
        azu_0.j().b(bqb_0.a);
        return true;
    }

    public static eru_1 a(ki ki2) {
        erw_1 erw_12 = erw_1.a(ki2.c());
        if (erw_12 == null) {
            return null;
        }
        eru_1 eru_12 = new eru_1(erw_12);
        eru_12.a(ki2);
        return eru_12;
    }
}

