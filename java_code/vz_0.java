/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from Vz
 */
public class vz_0 {
    private final vd_0 a;
    private final So<?> b;

    public vd_0 a() {
        return this.a;
    }

    public vz_0(So so, vd_0 vd_02) {
        if (so == null || vd_02 == null) {
            throw new IllegalArgumentException("aucun argument du constructeur de " + this.getClass().getSimpleName() + " ne doit \u00eatre null");
        }
        this.b = so;
        this.a = vd_02;
    }

    public sr_0 a(long l) {
        ss_0 ss_02 = this.b.g();
        return ss_02 == null ? null : ss_02.a(l);
    }

    public sd_0 b(long l) {
        if (this.b.f() == null) {
            return null;
        }
        Iterator<Su> iterator = this.b.c().k();
        while (iterator.hasNext()) {
            sd_0 sd_02;
            Su su = iterator.next();
            if (su.x_() == null || (sd_02 = su.x_().g_(l)) == null) continue;
            return sd_02;
        }
        return null;
    }
}

