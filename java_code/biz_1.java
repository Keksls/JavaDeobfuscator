/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIZ
 */
public class biz_1
extends big_1 {
    private static final Logger a = Logger.getLogger(biz_1.class);
    private int g;

    public biz_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        this.g = Integer.parseInt(stringArray[0]);
    }

    @Override
    public boolean b(exk_2 exk_22) {
        if (!super.b(exk_22)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bhr_1 bhr_12 = bmr_12.eK();
        return !bhr_12.d(this.g) || bhr_12.e(this.g);
    }

    @Override
    public String a() {
        return bae.h().a("item.action.resetAchievement", bae.h().a(62, (long)this.g, new Object[0]));
    }

    @Override
    public boolean a(exk_2 exk_22) {
        this.a(exk_22.a());
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.t;
    }
}

