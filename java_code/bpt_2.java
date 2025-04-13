/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpT
 */
public final class bpt_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bpt_2.class);
    private boolean b;
    private final afb_0 c = (afe_02, apl_12) -> this.b();

    @Override
    public boolean g() {
        if (this.d.eE() != null && this.d.eE().ac_() == 30) {
            return false;
        }
        if (this.d.ab_() || this.d.ak()) {
            a.warn((Object)("Player " + this.d + " is dead of on fight so he can't use an EnchantmentMachine"));
            return false;
        }
        return true;
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        return this.c_(bl2);
    }

    @Override
    public void a() {
        cyq_0.a.a(true);
        if (!azu_0.j().c(cyq_0.a)) {
            azu_0.j().a(cyq_0.a);
            this.b = true;
        } else {
            this.b = false;
        }
        azu_0.j().k().bv().a(this.c);
    }

    @Override
    public boolean b() {
        return this.c_(true);
    }

    @Override
    public boolean c_(boolean bl) {
        azu_0.j().k().bv().b(this.c);
        cyq_0.a.a(false);
        if (this.b && azu_0.j().c(cyq_0.a)) {
            azu_0.j().b(cyq_0.a);
        }
        if (bl) {
            cpz_0 cpz_02 = new cpz_0();
            cpz_02.a((byte)2);
            cpz_02.a((short)30);
            azu_0.j().K().c(cpz_02);
        }
        return true;
    }

    @Override
    public short ac_() {
        return 30;
    }
}

