/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHR
 */
public class ehr_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Zones", new eFu("Zone a retirer (-1 pour tout retirer)", eFx.b), new eFu("Zone a poser (infinie) (-1 pour ne rien poser)", eFx.b)), new eFv("Zones", new eFu("Zone a retirer", eFx.b), new eFu("Zone a poser (-1 pour ne rien poser)", eFx.b), new eFu("Dur\u00e9e (0=dur\u00e9e de l'effet, 1=infinie(defaut))", eFx.c)));
    private static final int w = -1;
    private int x;
    private int y;
    private boolean z;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ehr_0() {
        this.M();
    }

    public ehr_0 aE() {
        return new ehr_0();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        if (((efh_0)this.c).F() < 1) {
            return;
        }
        this.x = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        this.y = ((efh_0)this.c).F() < 2 ? -1 : ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        this.z = ((efh_0)this.c).F() < 3 ? true : ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        Object object;
        Object object2;
        if (!this.D()) {
            return;
        }
        if (this.h == null) {
            return;
        }
        sr_0 sr_02 = null;
        if (this.f == null || !(this.f instanceof sr_0)) {
            object2 = this.h.g().f();
            object = object2.iterator();
            while (object.hasNext()) {
                sr_0 sr_03 = object.next();
                if (this.a(sr_03) || !sr_03.c(this.g)) continue;
                sr_02 = sr_03;
                break;
            }
            this.f = sr_02;
        } else {
            sr_02 = (sr_0)this.f;
            if (this.a(sr_02)) {
                sr_02 = null;
            }
        }
        if (sr_02 == null) {
            this.ba();
            return;
        }
        if (!sr_02.R()) {
            this.ba();
            return;
        }
        this.c(sd_02, bl);
        object2 = sr_02.v();
        this.h.g().b(sr_02);
        if (this.y == -1) {
            return;
        }
        object = eig_0.a(this.h, this.g, this.y);
        ((sd_0)object).a((Su)object2);
        ((eig_0)object).e(this.z);
        ((eig_0)object).a((short)1);
        ((sd_0)object).a((efh_0)this.c);
        ((sd_0)object).a((efi_0)this.k());
        ((sd_0)object).a(this);
        ((ejh_0)object).ad();
        if (object2 != null) {
            object2.x_().a((sd_0)object);
        }
    }

    protected boolean a(sr_0 sr_02) {
        return this.x != -1 && sr_02.A() != (long)this.x;
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public void z() {
        this.x = 0;
        this.y = 0;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aE();
    }
}

