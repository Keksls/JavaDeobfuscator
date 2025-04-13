/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bLJ
 */
public class blj_1
extends blo_0 {
    private static final Logger m = Logger.getLogger(blj_1.class);
    private static final blj_1 n = new blj_1();
    private static final String o = "bgColor";
    private azj_2 p;

    public fsR a() {
        return (fsR)this.k;
    }

    public void a(fsR fsR2) {
        super.a(fsR2);
        this.w();
    }

    @Override
    protected void x() {
        fwA fwA2;
        Object object;
        Object object2;
        fsR fsR2 = this.a();
        if (fsR2 == null) {
            return;
        }
        fsR2.d();
        if (this.l == null) {
            return;
        }
        if (this.l instanceof bLN) {
            object2 = (bLP)this.l.q();
            object = (bLN)this.l;
            if (object2 instanceof blb_1 && ((blb_1)(fwA2 = (blb_1)object2)).k() == (long)((bLN)object).h()) {
                this.l = object2;
                this.x();
                return;
            }
            if (object2 instanceof bLN && ((bLN)(fwA2 = (bLN)object2)).h() == ((bLN)object).h()) {
                this.l = object2;
                this.x();
                return;
            }
        }
        object2 = this.l.bb_();
        object = object2.iterator();
        while (object.hasNext()) {
            fwA2 = (fwA)object.next();
            fsR2.a(fwA2);
        }
    }

    @Override
    public Object b(String string) {
        if (string.equals(o)) {
            return this.p;
        }
        return super.b(string);
    }

    public static blj_1 D() {
        return n;
    }

    @Override
    public void b() {
        super.b();
        fis_1.a().a("miniMap", this);
        fis_1.a().a("ambienceZone", cco_2.a());
    }

    @Override
    public float g() {
        return ((bvx_0)ans_0.D().h()).c(bWe.f);
    }

    @Override
    public void a(float f2) {
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.f, f2);
        super.a(f2);
    }

    @Override
    public fjh_1 l() {
        return bLs.k;
    }

    @Override
    public void a(bLP bLP2) {
        if (this.s()) {
            this.p = new azf_2(152, 205, 221, 255);
            this.t();
        } else {
            super.a(bLP2);
            cct_1 cct_12 = ccs_1.a().a(this.u());
            if (cct_12 != null) {
                this.p = cct_12.r;
            }
        }
        fis_1.a().a((ajf_1)this, "isMapAvailable", o);
    }

    @Override
    protected void y() {
    }

    public void E() {
        if (this.s()) {
            this.t();
        }
    }

    @Override
    public /* synthetic */ fsS c() {
        return this.a();
    }
}

