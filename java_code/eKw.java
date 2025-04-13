/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.apache.log4j.Logger;

public final class eKw {
    private static final Logger a = Logger.getLogger(eKw.class);
    private final ejh_0 b;

    public eKw() {
        this.b = null;
    }

    public eKw(ejh_0 ejh_02) {
        this.b = ejh_02;
    }

    public List<List<Su>> a(efh_0 efh_02, apq_2 apq_22, So<efh_0> so, int n, int n2, short s2) {
        Iterable<Su> iterable;
        if (so == null) {
            a.error((Object)"On ne peut pas determiner les cibles sans contexte");
            return Collections.emptyList();
        }
        HashMap<Long, Su> hashMap = new HashMap<Long, Su>();
        ArrayList<Su> arrayList = new ArrayList<Su>();
        for (aqd_1 object2 : efh_02.u().h()) {
            iterable = apr_2.a().a(apq_22, so.c(), object2, n, n2, s2, efh_02.k());
            for (Su su : iterable) {
                if (!this.a(efh_02, su, apq_22) || this.a(hashMap, su)) continue;
                hashMap.put(su.a_(), su);
                arrayList.add(su);
            }
        }
        this.a(arrayList, efh_02, n, n2, s2);
        byte by = efh_02.D();
        List<Su> list = this.a(arrayList, by);
        iterable = new ArrayList<Su>();
        ((ArrayList)iterable).add(list);
        return iterable;
    }

    private void a(List<Su> list, efh_0 efh_02, int n, int n2, short s2) {
        Comparator<Su> comparator = eKz.a(efh_02, n, n2, s2);
        if (comparator == null) {
            return;
        }
        list.sort(comparator);
    }

    private boolean a(HashMap<Long, Su> hashMap, Su su) {
        return hashMap.containsKey(su.a_());
    }

    private boolean a(efh_0 efh_02, Su su, apq_2 apq_22) {
        if (!(su instanceof erc_2)) {
            return true;
        }
        if (apq_22 == su) {
            return true;
        }
        apt_2<Su> apt_22 = efh_02.k();
        boolean bl = apt_22 != null && apt_22.a(8192L);
        erc_2 erc_22 = (erc_2)((Object)su);
        if (bl) {
            return true;
        }
        return !erc_22.hh();
    }

    private List<Su> a(List<Su> list, byte by) {
        if (by <= 0) {
            return list;
        }
        if (list.size() > by) {
            return list.subList(0, by);
        }
        return list;
    }
}

