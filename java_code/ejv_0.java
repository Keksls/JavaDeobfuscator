/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from eJv
 */
public class ejv_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Param standard : toutes les auras", new eFu[0]));
    private long w;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ejv_0 aD() {
        ejv_0 ejv_02 = new ejv_0();
        ejv_02.w = this.w;
        return ejv_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        ArrayList arrayList = new ArrayList();
        for (sd_0 sd_03 : this.f.x_()) {
            if (sd_03.bt_() != efc_0.dq.a() && sd_03.bt_() != efc_0.dr.a()) continue;
            arrayList.add(sd_03);
        }
        for (sd_0 sd_03 : arrayList) {
            sd_03.ah();
        }
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    public void al() {
        super.al();
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

