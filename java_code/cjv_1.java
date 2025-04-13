/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cjV
 */
public class cjv_1
implements adx_1<cvl_2> {
    private static final Logger a = Logger.getLogger(cjv_1.class);

    @Override
    public boolean a(cvl_2 cvl_22) {
        cyt_0.a().c(false);
        if (cjz_2.a(cvl_22.b())) {
            return false;
        }
        bmr_1 bmr_12 = Optional.ofNullable(bzf_1.a()).orElse(azu_0.j().k());
        ArrayList<bjs_1> arrayList = new ArrayList<bjs_1>(cvl_22.c().d());
        cvl_22.c().b().forEach(oH2 -> {
            Optional<bjs_1> optional = bjr_1.a(oH2);
            if (optional.isPresent()) {
                arrayList.add(optional.get());
            } else {
                a.error((Object)("[PVP INVENTORY] There is an unknown item in the pvp inventory of player " + bmr_12.U_() + " with reference=" + oH2.e() + " and quantity " + oH2.g()));
            }
        });
        bju_1.d.a((Collection<bjs_1>)arrayList);
        return false;
    }

    @Override
    public int a() {
        return 13102;
    }
}

