/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bJP
 */
public class bjp_1 {
    private static final TLongObjectHashMap<ezq_0> a = new TLongObjectHashMap();

    public static void a(TLongObjectHashMap<eZR> tLongObjectHashMap) {
        bjp_1.a(tLongObjectHashMap, true);
    }

    public static void a(TLongObjectHashMap<eZR> tLongObjectHashMap, boolean bl) {
        a.clear();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        block5: while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            eZR eZR2 = (eZR)tLongObjectIterator.value();
            bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), l);
            switch (eZR2.e()) {
                case 0: {
                    eZR eZR3 = (ezq_0)eZR2;
                    a.put(l, (Object)eZR3);
                    continue block5;
                }
                case 1: {
                    bha_0.a(bmr_12, l, bl);
                    continue block5;
                }
                case 2: {
                    eZR eZR3 = (ezu_0)eZR2;
                    bjp_1.a((epq_2)bmr_12, l, (ezu_0)eZR3, bl);
                    continue block5;
                }
            }
        }
        tLongObjectIterator = a.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bmr_1 bmr_13 = (bmr_1)euu_2.b(azu_0.j().k().U_(), ((ezq_0)tLongObjectIterator.value()).c());
            if (bmr_13 == null) continue;
            bjp_1.a((epq_2)bmr_13, tLongObjectIterator.key(), (ezq_0)tLongObjectIterator.value(), bl);
        }
        a.clear();
    }

    private static void a(epq_2 epq_22, long l, ezu_0 ezu_02, boolean bl) {
        exk_2 exk_22 = epq_22.dS().i(l);
        short s2 = (short)(ezu_02.a() - exk_22.e());
        epq_22.dS().a(l, s2);
        if (bl && s2 > 0 && !ezu_02.b()) {
            bjy_1.a(exk_22, s2, epq_22);
        } else if (bl && s2 < 0 && !ezu_02.b()) {
            bjy_1.a(exk_22, Math.abs(s2));
        }
    }

    private static void a(epq_2 epq_22, long l, ezq_0 ezq_02, boolean bl) {
        bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(ezq_02.a());
        exk_2 exk_22 = new exk_2(l);
        exk_22.b(bjw_12);
        exk_22.a(ezq_02.b());
        exk_22.a(ezq_02.g());
        exk_22.a(ezq_02.h());
        exk_22.a(ezq_02.i());
        exk_22.a(ezq_02.j());
        exk_22.a(ezq_02.n());
        exk_22.a(ezq_02.k());
        exk_22.a(ezq_02.l());
        exk_22.a(ezq_02.m());
        epq_22.dS().d(ezq_02.c()).c(exk_22, ezq_02.d());
        if (!ezq_02.f() && bl) {
            bjy_1.a(exk_22, exk_22.e(), epq_22);
        }
    }
}

