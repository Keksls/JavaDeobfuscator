/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzB
 */
public class bzb_1
extends bzy_2 {
    protected final bmr_1 k;
    protected final ble_0 l;
    private final int m;

    public bzb_1(bmr_1 bmr_12, ble_0 ble_02) {
        this.k = bmr_12;
        this.l = ble_02;
        this.m = ezp_1.a((epq_2)this.k, this.l.c());
    }

    @Override
    String a() {
        return bae.h().a("build.save.as", new Object[0]);
    }

    @Override
    String b() {
        return bae.h().a("build.copy.name", this.l.e());
    }

    @Override
    List<blb_0> c() {
        return blc_0.a.a(this.k, this.m);
    }

    @Override
    blb_0 e() {
        if (this.l.b().c() == -1) {
            return blc_0.a.a();
        }
        if (this.m <= this.l.b().c()) {
            return blc_0.a.a((short)this.l.b().c());
        }
        List<blb_0> list = this.c();
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return list.get(1);
    }

    @Override
    @Nullable
    bla_0 g() {
        if (this.l.b().d() < 1) {
            return null;
        }
        return (bla_0)j.get(this.l.b().d() - 1);
    }

    @Override
    @Nullable
    String h() {
        return bae.h().a("build.save.as.level.popup", new Object[0]);
    }

    @Override
    public short i() {
        return 18631;
    }
}

