/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bpE
 */
public class bpe_2
extends bpc_2 {
    private static final Logger a = Logger.getLogger(bpe_2.class);
    private final bfu_0 b;

    public bpe_2(bfu_0 bfu_02) {
        this.b = bfu_02;
    }

    @Override
    public short ac_() {
        return 31;
    }

    @Override
    public boolean g() {
        if (this.d == null || this.d.ab_() || this.d.ak()) {
            a.warn((Object)("[Account Chest] Player " + this.d + " is dead or on fight so he can't use an AccountChest"));
            return false;
        }
        if (this.d.eE() != null) {
            a.warn((Object)("[Account Chest] Player " + this.d + " has already an occupation so he can't use an AccountChest"));
            return false;
        }
        return !azu_0.j().c(cVg.b);
    }

    @Override
    public void a() {
        if (this.d == null) {
            return;
        }
        this.d.a(this);
        if (!azu_0.j().c(cVg.b)) {
            azu_0.j().a(cVg.b);
        }
        azu_0.j().a(ced_0.a);
    }

    @Override
    public boolean a(boolean bl, boolean bl2) {
        if (bl2) {
            this.b.a(Tv.n, azu_0.j().k());
        }
        return true;
    }

    @Override
    public boolean b() {
        if (azu_0.j().c(cVg.b)) {
            azu_0.j().b(cVg.b);
        }
        azu_0.j().b(ced_0.a);
        return true;
    }
}

