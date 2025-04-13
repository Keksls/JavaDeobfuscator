/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cjX
 */
public class cjx_2
implements adx_1<cvn_2> {
    private static final Logger a = Logger.getLogger(cjx_2.class);

    @Override
    public boolean a(cvn_2 cvn_22) {
        cyt_0.a().c(false);
        if (cjz_2.a(cvn_22.c())) {
            return false;
        }
        ArrayList<bjs_1> arrayList = new ArrayList<bjs_1>();
        cvn_22.b().e().b().forEach(oH2 -> {
            Optional<bjs_1> optional = bjr_1.a(oH2);
            if (optional.isPresent()) {
                arrayList.add(optional.get());
            } else {
                a.error((Object)("[PVP INVENTORY] There is an unknown item in the pvp inventory of player " + azu_0.j().k().U_() + " with reference=" + oH2.e() + " and quantity " + oH2.g()));
            }
        });
        bju_1.d.a((List<bjs_1>)arrayList);
        return false;
    }

    @Override
    public int a() {
        return 12568;
    }
}

