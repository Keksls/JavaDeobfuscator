/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

final class aPd
implements aox_0 {
    private static final Logger a = Logger.getLogger(aPd.class);

    aPd() {
    }

    @Override
    public void a(bwh_0 bwh_02, blx_1 blx_12) {
        blx_12.bv().f(true);
        if (blx_12.bV()) {
            return;
        }
        blx_12.bv().c(true);
    }

    @Override
    public void b(bwh_0 bwh_02, blx_1 blx_12) {
        aoy_0.a(blx_12);
    }

    @Override
    public void a(bwh_0 bwh_02, sr_0 sr_02) {
        aoy_0.a(bwh_02, sr_02);
    }

    @Override
    public void b(bwh_0 bwh_02, sr_0 sr_02) {
        apw_0.a().c(sr_02);
        apw_0.a().a(sr_02);
    }

    @Override
    public void c(bwh_0 bwh_02, sr_0 sr_02) {
        aoy_0.a(sr_02);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public void a(bvw_2 bvw_22) {
        a.error((Object)"[Fight][View] On ne doit pas demander de regles de visualisation pour un combat externe en train d'etre cr\u00e9er");
    }

    @Override
    public void a(bwh_0 bwh_02) {
        aoy_0.g(bwh_02);
        aoy_0.e(bwh_02);
        Collection collection = bwh_02.j();
        for (aoc_2 aoc_22 : collection) {
            if (((blx_1)aoc_22).bV()) {
                ((blx_1)aoc_22).bv().c(false);
                continue;
            }
            aoy_0.a((blx_1)aoc_22);
            ((blx_1)aoc_22).bv().c(((blx_1)aoc_22).Y());
            ((blx_1)aoc_22).bv().c(((epq_2)aoc_22).F());
            ((blx_1)aoc_22).bv().f(true);
        }
        Iterator<Object> iterator = ahs.d().h();
        while (iterator.hasNext()) {
            aoc_2 aoc_22;
            aoc_22 = (ahv)iterator.next();
            if (aoc_22 == null || ((ahv)aoc_22).d() == null) continue;
            ((abu)aoc_22).c(((abu)aoc_22).at() && ((ahv)aoc_22).d().P());
        }
        aoy_0.h(bwh_02);
        if (bwh_02 instanceof bvx_2) {
            ((bvx_2)bwh_02).b(true);
        }
    }
}

