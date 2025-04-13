/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.commons.pool.ObjectPool
 */
import gnu.trove.set.hash.TIntHashSet;
import org.apache.commons.pool.ObjectPool;

public class bNG
extends bNK
implements eah_0 {
    private static final ObjectPool ag = new abm_1(new bNH());

    bNG() {
    }

    public static bNK a(int n, int n2, short s2, int n3, byte by, boolean bl, boolean bl2, long l, int n4) {
        bNG bNG2;
        try {
            bNG2 = (bNG)ag.borrowObject();
        }
        catch (Exception exception) {
            Y.error((Object)"Erreur lors de l'extraction d'une monsterResource du pool", (Throwable)exception);
            bNG2 = new bNG();
        }
        if (!bNG2.c(n, n2, s2, n3, by, bl, bl2, l, n4)) {
            return null;
        }
        return bNG2;
    }

    @Override
    public void c() {
        if (ag != null) {
            try {
                ag.returnObject((Object)this);
            }
            catch (Exception exception) {
                Y.error((Object)"Erreur lors du retour d'une resource au pool", (Throwable)exception);
            }
        } else {
            this.onCheckIn();
        }
    }

    @Override
    public TIntHashSet d() {
        TIntHashSet tIntHashSet = new TIntHashSet();
        tIntHashSet.addAll(((bNF)this.ad).b());
        return tIntHashSet;
    }
}

