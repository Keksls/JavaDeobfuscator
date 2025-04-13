/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpJ
 */
public class bpj_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bpj_2.class);
    private final bfu_0 b;

    public bpj_2(bfu_0 bfu_02) {
        this.b = bfu_02;
    }

    @Override
    public short ac_() {
        return 21;
    }

    @Override
    public boolean g() {
        bsx_2 bsx_22 = this.d.di();
        if (bsx_22 == null) {
            return false;
        }
        if (bsx_22.q() != this.d.a_()) {
            return false;
        }
        bpc_2 bpc_22 = this.d.eE();
        return bpc_22 == null || bpc_22 == this;
    }

    @Override
    public void a() {
        a.info((Object)"[STORAGE_BOX] Lancement de l'occupation");
        this.d.a(this);
        azu_0.j().a(bqb_0.a);
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
        azu_0.j().b(bqb_0.a);
        return true;
    }

    @Override
    public boolean b() {
        a.info((Object)"[STORAGE_BOX] On fini l'occupation");
        if (azu_0.j().c(ddi_0.d())) {
            azu_0.j().b(ddi_0.d());
        }
        azu_0.j().b(bqb_0.a);
        return true;
    }

    public fiv_0 a(zj_1 zj_12) {
        fiv_0 fiv_02 = this.b.Z().a(zj_12.a);
        fiv_02.b(zj_12);
        return fiv_02;
    }

    public fiv_0 a(evq_1 evq_12) {
        return this.b.Z().a(new evq_1(evq_12.a(), evq_12.b(), evq_12.c()));
    }
}

