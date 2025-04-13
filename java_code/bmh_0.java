/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bMH
 */
public class bmh_0
extends bLP {
    private static final Logger a = Logger.getLogger(bmh_0.class);
    private static int b = 0;
    private long c;
    private boolean d = false;

    public bmh_0() {
        super(b++, null, null, null);
    }

    public long h() {
        return this.c;
    }

    @Override
    public void a(long l) {
        this.c = l;
    }

    @Override
    public short aY_() {
        if (!this.d) {
            this.a(ccs_1.a().a((long)this.c).s);
            this.d = true;
        }
        return super.aY_();
    }

    @Override
    public azj_2 aX_() {
        List<fwB> list = this.i();
        if (list.isEmpty()) {
            return bmi_0.d;
        }
        fwB fwB2 = list.get(0);
        return fwB2.aX_();
    }

    @Override
    public void a(blo_0 blo_02) {
        throw new UnsupportedOperationException("On ne devrait pas charger depuis cette zone");
    }

    @Override
    public boolean e() {
        cct_1 cct_12 = (cct_1)((fjw_0)fjw_0.e()).c(this.c);
        return cct_12 != null && cct_12.t;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void b(blo_0 blo_02) {
    }
}

