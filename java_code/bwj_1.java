/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TByteHashSet;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bwj
 */
public class bwj_1 {
    protected static final Logger a = Logger.getLogger(bwj_1.class);
    private static final bwj_1 c = new bwj_1();
    protected final TIntObjectHashMap<bwh_0> b = new TIntObjectHashMap();

    public static bwj_1 a() {
        return c;
    }

    public bvx_2 a(int n, int n2, tg_0 tg_02, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2, List<byte[]> list) {
        if (n2 == -1) {
            throw new IllegalArgumentException("fightId = FightConstants.NO_FIGHT_ID - On doit toujours passer l'id du fight sur le client.");
        }
        emr_2 emr_22 = emr_2.a(n);
        bvx_2 bvx_22 = new bvx_2(n2, emr_22, tg_02, tByteHashSet, tByteHashSet2);
        this.a(bvx_22);
        return bvx_22;
    }

    public bvx_2 a(int n, int n2, tg_0 tg_02, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2, byte by) {
        if (n2 == -1) {
            throw new IllegalArgumentException("fightId = FightConstants.NO_FIGHT_ID - On doit toujours passer l'id du fight sur le client.");
        }
        emr_2 emr_22 = emr_2.a(n);
        elp_0 elp_02 = elp_0.a(by);
        bvx_2 bvx_22 = new bvx_2(n2, emr_22, tg_02, tByteHashSet, tByteHashSet2, elp_02);
        this.a(bvx_22);
        return bvx_22;
    }

    private void a(bvx_2 bvx_22) {
        this.a((bwh_0)bvx_22);
        bvx_22.ab();
    }

    public void a(bwh_0 bwh_02) {
        if (this.b.contains(bwh_02.c())) {
            a.error((Object)("On ajoute un fight (class=" + bwh_02.getClass().getSimpleName() + " id=" + bwh_02.c() + ") alors qu'un fight existe d\u00e9j\u00e0 avec cet id (class=" + ((bwh_0)this.b.get(bwh_02.c())).getClass().getSimpleName() + ") : leaks possibles"));
        }
        this.b.put(bwh_02.c(), (Object)bwh_02);
    }

    public void b(bwh_0 bwh_02) {
        if (bwh_02 == null) {
            return;
        }
        this.b.remove(bwh_02.c());
        if (bwh_02 instanceof bvw_2) {
            bvw_2 bvw_22 = (bvw_2)bwh_02;
            bvw_22.n();
        }
    }

    public bwh_0 a(int n) {
        return (bwh_0)this.b.get(n);
    }

    public TIntObjectIterator<bwh_0> b() {
        return this.b.iterator();
    }

    public void c() {
        this.b.clear();
    }

    public void d() {
        bxr_2.a.b();
        TIntObjectIterator<bwh_0> tIntObjectIterator = this.b();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bwh_0 bwh_02 = (bwh_0)tIntObjectIterator.value();
            if (bwh_02 instanceof bvx_2) {
                bwh_02.o();
                tIntObjectIterator = this.b();
            } else {
                tIntObjectIterator.remove();
            }
            baa_0.a().c(bwh_02.c());
        }
    }

    public bwh_0 a(int n, int n2) {
        TIntObjectIterator<bwh_0> tIntObjectIterator = this.b();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bwh_0 bwh_02 = (bwh_0)tIntObjectIterator.value();
            if (!bwh_02.g().c(n, n2)) continue;
            return bwh_02;
        }
        return null;
    }

    public boolean b(int n, int n2) {
        return this.a(n, n2) != null;
    }

    public void b(int n) {
        bwh_0 bwh_02 = (bwh_0)this.b.get(n);
        this.b(bwh_02);
    }
}

