/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHC
 */
public abstract class ehc_0
extends eJC {
    private static final int v = 12;
    private int w = 1;
    private boolean x = false;

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.ba();
        for (int k = 0; k < this.w; ++k) {
            this.a((ejh_0)sd_02);
            if (this.x && this.aG() > 0) break;
        }
    }

    @Override
    public final void j(sd_0 sd_02) {
        super.j(sd_02);
        this.w = Math.min(12, this.k(sd_02));
        this.x = this.l(sd_02);
    }

    protected abstract int k(sd_0 var1);

    protected abstract boolean l(sd_0 var1);

    @Override
    public void z() {
        super.z();
        this.w = 1;
    }

    @Override
    protected boolean aE() {
        return false;
    }
}

