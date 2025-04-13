/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpV
 */
public final class bpv_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bpv_2.class);
    private final bdh_0 b;

    public bpv_2(bdh_0 bdh_02) {
        this.b = bdh_02;
    }

    @Override
    public boolean g() {
        if (this.d.eE() != null && this.d.eE().ac_() == 32) {
            return false;
        }
        if (this.d.ab_() || this.d.ak()) {
            a.warn((Object)("Player " + this.d + " is dead or on fight so he can't use an haven world resources collector"));
            return false;
        }
        return true;
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        if (bl2) {
            this.b.a(Tv.n, azu_0.j().k());
        }
        return this.b();
    }

    @Override
    public void a() {
        this.d.a(this);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public short ac_() {
        return 32;
    }
}

