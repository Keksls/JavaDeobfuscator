/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from esz
 */
@Criterion(description="Return the territory id where the fights take place in the current battleground instance", signatures={@Signature(description="Return the territory id as an integer")})
public final class esz_0
extends esi_0 {
    @Override
    public boolean a() {
        return true;
    }

    public esz_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object4, object3);
        long l = 0L;
        if (epq_22 != null) {
            l = epq_22.T_();
        } else if (object4 instanceof Vt) {
            l = ((Vt)object4).a();
        }
        if (l == 0L) {
            throw new aob_1("Impossible d'evaluer le critere GetBattlegroundTerritoryId");
        }
        Collection<fhc_0> collection = fhd_0.a.a();
        for (fhc_0 fhc_02 : collection) {
            ArrayList<fhh> arrayList = fhc_02.c();
            for (fhh fhh2 : arrayList) {
                if ((long)fhh2.c() != l) continue;
                return fhh2.f();
            }
        }
        return 0L;
    }

    @Override
    public Enum c() {
        return eyO.hl;
    }
}

