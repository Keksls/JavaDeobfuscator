/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpZ
 */
public class bpz_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bpz_2.class);
    private final bzb_2 b = new bzb_2();
    private final cur_0 c;

    public bpz_2(cur_0 cur_02) {
        this.c = cur_02;
    }

    public bzb_2 h() {
        return this.b;
    }

    @Override
    public short ac_() {
        return 25;
    }

    @Override
    public boolean g() {
        bpc_2 bpc_22 = this.d.eE();
        if (bpc_22 != null && bpc_22 != this) {
            return false;
        }
        cct_1 cct_12 = ccs_1.a().a(this.d.T_());
        if (!cct_12.b()) {
            return false;
        }
        long l = this.d.eV().d();
        return l > 0L;
    }

    @Override
    public void a() {
        a.info((Object)"[HAVEN_WORLD] Lancement de l'occupation");
        this.d.a(this);
        azu_0.j().a(this.c);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        a.info((Object)"[HAVEN_WORLD] On cancel l'occupation");
        if (bl2) {
            cpz_0 cpz_02 = new cpz_0();
            cpz_02.a((byte)3);
            cpz_02.a(this.ac_());
            azu_0.j().K().c(cpz_02);
        }
        if (azu_0.j().c(this.c)) {
            azu_0.j().b(this.c);
        }
        cfb_1.a.a((bpz_2)null);
        return true;
    }

    @Override
    public boolean b() {
        a.info((Object)"[HAVEN_WORLD] On fini l'occupation");
        if (azu_0.j().c(this.c)) {
            azu_0.j().b(this.c);
        }
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a((byte)2);
        cpz_02.a(this.ac_());
        azu_0.j().K().c(cpz_02);
        cfb_1.a.a((bpz_2)null);
        return true;
    }

    public cur_0 i() {
        return this.c;
    }
}

