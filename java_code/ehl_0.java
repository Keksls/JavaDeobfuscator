/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

/*
 * Renamed from eHL
 */
public final class ehl_0
extends ehn_0 {
    private static final aqr_2 w = new eFw(new eFv("Pas de params", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return w;
    }

    @Override
    public ehn_0 aD() {
        ehl_0 ehl_02 = new ehl_0();
        ehl_02.v = this.v;
        return ehl_02;
    }

    public ehl_0() {
    }

    public ehl_0(int n) {
        super(n);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        super.b(sd_02, bl);
        se_0 se_02 = this.f.x_();
        if (this.f == null || se_02 == null) {
            this.ba();
            return;
        }
        HashSet<eja_0> hashSet = new HashSet<eja_0>();
        for (sd_0 sd_03 : se_02) {
            eja_0 eja_02;
            if (!(sd_03 instanceof eja_0) || !(eja_02 = (eja_0)sd_03).aR()) continue;
            hashSet.add(eja_02);
        }
        for (eja_0 eja_03 : hashSet) {
            eja_03.ah();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

