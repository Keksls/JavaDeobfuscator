/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from eHB
 */
public final class ehb_0
extends ehc_0 {
    private static final aqr_2 v = new eFw(new eFv("Params", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ehb_0() {
        this.M();
    }

    public ehb_0 aD() {
        return new ehb_0();
    }

    @Override
    protected int k(sd_0 sd_02) {
        if (this.e == null || !(this.e instanceof app_2)) {
            return 0;
        }
        So so = this.m();
        if (so == null || !(so instanceof efq_0)) {
            return 0;
        }
        efq_0 efq_02 = (efq_0)so;
        elm_0 elm_02 = efq_02.l();
        if (elm_02 == null) {
            return 0;
        }
        Collection collection = elm_02.g(((app_2)((Object)this.e)).Y());
        return Math.max(0, collection.size() - 1);
    }

    @Override
    protected boolean l(sd_0 sd_02) {
        return false;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

