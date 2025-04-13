/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bqd
 */
public class bqd_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bqd_2.class);
    private ans_1 b;

    @Override
    public short ac_() {
        return 33;
    }

    @Override
    public boolean g() {
        if (this.d == null || this.d.ab_() || this.d.ak()) {
            a.warn((Object)("[PvpChangeState] Player " + this.d + " is dead or on fight so he can't use a PvpChangeState"));
            return false;
        }
        if (this.d.eE() != null) {
            a.warn((Object)("[PvpChangeState] Player " + this.d + " has already an occupation so he can't use an PvpChangeState"));
            return false;
        }
        return true;
    }

    @Override
    public void a() {
        if (this.d == null) {
            return;
        }
        this.d.a(this);
        fpm_0.b().a("pvpActivationDialog", cfi_0.a("pvpActivationDialog"), fyd_0.b);
        cdw_0.n().c(600206L);
        this.b = string -> {
            if (!"pvpActivationDialog".equals(string)) {
                return;
            }
            this.b();
            fpm_0.b().b(this.b);
            this.b = null;
        };
        fpm_0.b().a(this.b);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        this.a((byte)3, bl2);
        return true;
    }

    @Override
    public boolean b() {
        this.a((byte)2, true);
        return true;
    }

    private void a(byte by, boolean bl) {
        fpm_0.b().o("pvpActivationDialog");
        if (!bl) {
            return;
        }
        cpz_0 cpz_02 = new cpz_0();
        cpz_02.a(by);
        cpz_02.a((short)33);
        azu_0.j().K().c(cpz_02);
    }
}

