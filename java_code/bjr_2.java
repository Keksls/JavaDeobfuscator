/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongLongHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongLongHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJr
 */
public class bjr_2
extends big_1
implements bjs_2 {
    private static final Logger a = Logger.getLogger(bjr_2.class);
    private final Map<Integer, Long> g = new HashMap<Integer, Long>();

    public bjr_2(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        api_2 api_22 = new api_2();
        for (String string : stringArray) {
            aoz_1 aoz_12 = api_22.b(string);
            TLongLongHashMap tLongLongHashMap = aoz_12.a(null, null, null, null);
            tLongLongHashMap.forEachEntry((l, l2) -> {
                this.g.put((int)l, l2);
                return true;
            });
        }
    }

    @Override
    public boolean a(@Nullable bmr_1 bmr_12, @Nullable ezr_0<?> ezr_02) {
        return ezr_02 != null && bgo_1.a(ezr_02.n());
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().n().u(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Integer n : this.g.keySet()) {
            if (!bgo_1.a((int)n)) continue;
            arrayList.add(n);
        }
        if (arrayList.size() == this.g.size()) {
            aUh.a("error.furniture.alreadyKnown", new Object[0]);
            return false;
        }
        if (arrayList.isEmpty()) {
            this.a(exk_22.a());
        } else {
            this.a(exk_22, arrayList);
        }
        return true;
    }

    private void a(exk_2 exk_22, List<Integer> list) {
        String string2 = bgo_1.a(list);
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("error.furniture.partially.known", string2), cfn_0.a(0), 25L, 102, 1);
        fzm_02.a((int n, String string) -> {
            if (n == 8) {
                this.a(exk_22.a());
            }
        });
    }

    @Override
    public void c() {
    }

    public Map<Integer, Long> g() {
        return this.g;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.R;
    }
}

