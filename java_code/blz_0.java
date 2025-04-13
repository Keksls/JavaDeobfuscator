/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from bLZ
 */
public class blz_0
implements Uo {
    private final bmr_1 a;
    private final Collection<bMa> b = new ArrayList<bMa>();

    public blz_0(bmr_1 bmr_12) {
        this.a = bmr_12;
    }

    @Override
    public void a(Uk uk) {
        ul_0 ul_02 = uk.b();
        if (ul_02 == ul_0.a || ul_02 == ul_0.b) {
            ffz ffz2 = (ffz)((Object)((um_0)uk).c());
            if (!ffz2.aQ_()) {
                return;
            }
            exh_2 exh_22 = this.a.cG().a(ffz2.a());
            ffu_0 ffu_02 = ffz2.f();
            bMa bMa2 = new bMa(this.a, exh_22);
            this.b.add(bMa2);
            ffu_02.a(bMa2);
        } else if (ul_02 == ul_0.c || ul_02 == ul_0.d) {
            ffz ffz3 = (ffz)((Object)((um_0)uk).c());
            if (!ffz3.aQ_()) {
                return;
            }
            ffu_0 ffu_03 = ffz3.f();
            Iterator<bMa> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                if (!ffu_03.b(iterator.next())) continue;
                iterator.remove();
            }
        }
    }
}

