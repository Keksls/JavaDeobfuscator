/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzA
 */
public class bza_2
extends bzb_1 {
    private static final bla_0 m = new bla_0(0);

    public bza_2(bmr_1 bmr_12, ble_0 ble_02) {
        super(bmr_12, ble_02);
    }

    @Override
    String a() {
        return bae.h().a("build.edit", new Object[0]);
    }

    @Override
    String b() {
        return this.l.e();
    }

    @Override
    List<blb_0> c() {
        if (this.l.f()) {
            return List.of(blc_0.a.a((short)this.l.b().c()));
        }
        return blc_0.a.a(this.k);
    }

    @Override
    blb_0 e() {
        return blc_0.a.a((short)this.l.b().c());
    }

    @Override
    public List<bla_0> f() {
        ArrayList<bla_0> arrayList = new ArrayList<bla_0>(j);
        arrayList.add(m);
        return arrayList;
    }

    @Override
    @Nullable
    bla_0 g() {
        if (this.l.b().d() == 0) {
            return m;
        }
        return super.g();
    }

    @Override
    @Nullable
    String h() {
        if (this.l.c() == 0) {
            return bae.h().a("builds.change.level.tuto.disabled", new Object[0]);
        }
        if (this.l.f()) {
            return bae.h().a("build.cannot.change.permanent.build.level", new Object[0]);
        }
        return null;
    }

    @Override
    public short i() {
        return 16378;
    }

    @Override
    public boolean j() {
        return this.l.c() > 0;
    }
}

