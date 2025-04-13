/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.List;
import org.apache.log4j.Logger;

final class bcX
implements adx_1<csk> {
    private static final Logger a = Logger.getLogger(bcX.class);

    bcX() {
    }

    @Override
    public boolean a(csk csk2) {
        a.info((Object)"Mise \u00e0 jour de la liste des compagnons");
        List<eBt> list = csk2.b();
        bai_0 bai_02 = azu_0.j().n();
        long l = bai_02.u();
        if (csk2.c()) {
            TLongObjectHashMap<eBt> tLongObjectHashMap = eBo.a.b(l);
            eBo.a.d(l);
            for (eBt eBt2 : list) {
                a.info((Object)("Companion dans le message : " + eBt2));
                eBo.a.a(l, eBt2);
                tLongObjectHashMap.remove(eBt2.b());
            }
            if (!tLongObjectHashMap.isEmpty()) {
                for (eBt eBt2 : tLongObjectHashMap.valueCollection()) {
                    bdb.a.a(eBt2);
                }
            }
        } else {
            for (eBt eBt3 : list) {
                eBo.a.a(l, eBt3);
            }
        }
        if (azu_0.j().c(cxq_0.a)) {
            cxq_0.a.g();
            cxq_0.a.i();
            cxq_0.a.f();
        }
        if (cZI.A()) {
            cZI.a().a(list);
        }
        a.info((Object)("Liste des companions : " + eBo.a.a(l)));
        return false;
    }

    @Override
    public int a() {
        return 12632;
    }
}

