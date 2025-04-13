/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpX
 */
public class bpx_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bpx_2.class);
    private final bbs_1 b;

    public bpx_2(bbs_1 bbs_12) {
        this.b = bbs_12;
    }

    @Override
    public short ac_() {
        return 22;
    }

    @Override
    public boolean g() {
        bpc_2 bpc_22 = this.d.eE();
        return bpc_22 == null || bpc_22 == this;
    }

    @Override
    public void a() {
        a.info((Object)"[COIN_MACHINE] Lancement de l'occupation");
        this.d.a(this);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        a.info((Object)"[COIN_MACHINE] On cancel l'occupation");
        if (bl2) {
            this.b.a(Tv.p, azu_0.j().k());
        }
        return this.b();
    }

    @Override
    public boolean b() {
        a.info((Object)"[COIN_MACHINE] On fini l'occupation");
        return true;
    }
}

