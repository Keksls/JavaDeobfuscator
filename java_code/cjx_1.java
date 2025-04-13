/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cjx
 */
public class cjx_1
implements adx_1<coy> {
    @Override
    public boolean a(coy coy2) {
        fzw_0.a.a("marketSellViewLock", true);
        if (coy2.g().c()) {
            bQG.a(coy2.h(), new Object[0]);
            return false;
        }
        bky_0.a().i();
        if (daw.k()) {
            exk_2 exk_22 = cjx_1.b();
            bky_0.a().a(exk_22);
        } else {
            bky_0.a().a((exk_2)null);
        }
        return false;
    }

    @Nullable
    private static exk_2 b() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return null;
        }
        bkr_0 bkr_02 = bky_0.a().x();
        if (bkr_02.f() == null) {
            return null;
        }
        ArrayList<exk_2> arrayList = bmr_12.da().g(bkr_02.f().aT_());
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(Comparator.comparingInt(exk_2::e).reversed());
        return arrayList.get(0);
    }

    @Override
    public int a() {
        return 13628;
    }
}

