/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzz
 */
public class bzz_2
extends bzy_2 {
    private final bmr_1 k;

    public bzz_2(bmr_1 bmr_12) {
        this.k = bmr_12;
    }

    @Override
    String a() {
        return bae.h().a("build.create", new Object[0]);
    }

    @Override
    String b() {
        return cZI.d(this.k.dx().h());
    }

    @Override
    List<blb_0> c() {
        return blc_0.a.a(this.k);
    }

    @Override
    blb_0 e() {
        if (this.k.dx().h() == -1) {
            return blc_0.a.a();
        }
        return blc_0.a.a(this.k.dr());
    }

    @Override
    @Nullable
    bla_0 g() {
        return null;
    }

    @Override
    @Nullable
    String h() {
        return null;
    }

    @Override
    public short i() {
        return 17431;
    }
}

