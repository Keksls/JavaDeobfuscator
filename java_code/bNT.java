/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bNT
extends abt<bNK> {
    private static final Logger f = Logger.getLogger(bNT.class);
    private static final bNT g = new bNT();
    static final int[] h = new int[1];
    protected final TLongObjectHashMap<bNK> d;
    final ArrayList<bNK> e = new ArrayList(8);
    private final boolean i = true;
    private final ArrayList<bNP> j;
    private final ArrayList<bNQ> k;
    private final ArrayList<bNP> l;
    private final ArrayList<bNQ> m;

    public bNT() {
        this.d = new TLongObjectHashMap();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        bNT.h[0] = 2;
        this.c.clear();
        this.d.forEachValue((TObjectProcedure)new bNU(this, acb_02, n));
        int n2 = this.e.size();
        for (int k = 0; k < n2; ++k) {
            this.b(this.e.get(k));
        }
        this.e.clear();
    }

    @Override
    public void a(acb_0 acb_02, float f2, float f3) {
        this.c.clear();
        this.d.forEachValue((TObjectProcedure)new bNV(this, acb_02));
    }

    private void c(bNK bNK2) {
        int n = this.l.size();
        for (int k = 0; k < n; ++k) {
            this.l.get(k).b(bNK2);
        }
    }

    private void d(bNK bNK2) {
        int n = this.m.size();
        for (int k = 0; k < n; ++k) {
            this.m.get(k).a(bNK2);
        }
    }

    public void a(bNK bNK2) {
        long l = Hw.c(bNK2.G(), bNK2.H());
        if (!this.d.containsKey(l)) {
            this.d.put(l, (Object)bNK2);
            ccm_1.g().a(bNK2);
            this.a(bNK2, bNK2.G(), bNK2.H(), (int)bNK2.I());
            bNK2.aM();
            this.c(bNK2);
        } else {
            f.warn((Object)("Impossible d'ajouter une resource en " + bNK2.G() + ":" + bNK2.H() + " car il en existe d\u00e9j\u00e0 une."));
        }
    }

    public void d() {
        TLongObjectIterator tLongObjectIterator = this.d.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bNK bNK2 = (bNK)tLongObjectIterator.value();
            bNK2.R();
            bNK2.c();
        }
        this.d.clear();
        this.c.clear();
        this.l.clear();
        this.l.addAll(this.j);
        this.m.clear();
        this.m.addAll(this.k);
    }

    public bNK c(int n, int n2) {
        return (bNK)this.d.get(Hw.c(n, n2));
    }

    @Override
    public void a(TObjectProcedure<bNK> tObjectProcedure) {
        this.d.forEachValue(tObjectProcedure);
    }

    public void e() {
        f.info((Object)"Supression de toutes les resources du ResourceManager.");
        this.d.forEachValue((TObjectProcedure)new bNW(this));
        if (!this.d.isEmpty()) {
            f.error((Object)("Il reste encore " + this.d.size() + " apr\u00e8s la supression !!!"));
        }
        this.l.clear();
        this.l.addAll(this.j);
        this.m.clear();
        this.m.addAll(this.k);
    }

    public void b(bNK bNK2) {
        if (bNK2 != null) {
            this.d.remove(bNK2.a());
            ccm_1.g().b(bNK2);
            yx_0 yx_02 = yz_0.a((int)((short)bNK2.G()), (int)((short)bNK2.H()));
            if (yx_02 != null) {
                yx_02.a(bNK2.G(), bNK2.H(), false);
            } else {
                f.warn((Object)("retrait d'une ressource en (" + bNK2.G() + ", " + bNK2.H() + ") alors que la map est inconnue/pas charg\u00e9e\t"));
            }
            this.d(bNK2);
            bNK2.c();
        } else {
            f.error((Object)"Impossible de retirer une resource null");
        }
    }

    public void a(long l) {
        bNK bNK2 = (bNK)this.d.get(l);
        if (bNK2 != null) {
            this.b(bNK2);
        } else {
            f.warn((Object)("Impossible de supprimer une resource d'ID " + l + " qui n'existe pas"));
        }
    }

    public boolean d(int n, int n2) {
        return this.d.contains(Hw.c(n, n2));
    }

    public static bNT f() {
        return g;
    }

    public void a(bNP bNP2) {
        if (this.j.contains(bNP2)) {
            return;
        }
        this.j.add(bNP2);
        this.b(bNP2);
    }

    public void a(bNQ bNQ2) {
        if (this.k.contains(bNQ2)) {
            return;
        }
        this.k.add(bNQ2);
        this.b(bNQ2);
    }

    public void b(bNP bNP2) {
        if (!this.l.contains(bNP2)) {
            this.l.add(bNP2);
        }
    }

    public void b(bNQ bNQ2) {
        if (!this.m.contains(bNQ2)) {
            this.m.add(bNQ2);
        }
    }

    public boolean c(bNP bNP2) {
        return this.l.remove(bNP2);
    }

    public boolean c(bNQ bNQ2) {
        return this.m.remove(bNQ2);
    }

    @Override
    protected void a(bNK bNK2, int n, int n2, int n3) {
        super.a(bNK2, n, n2, n3);
        HideFightOccluders.a(bNK2);
    }

    @Override
    public void c() {
        this.d.forEachValue((TObjectProcedure)new bNX(this));
    }

    @NotNull
    public Collection<bNK> a(aNI aNI2) {
        bNK bNK2;
        HashSet<bNK> hashSet = new HashSet<bNK>(this.a(aNI2.d(), aNI2.e()));
        if (aNI2.a() && (bNK2 = (bNK)this.b(aNI2.f(), aNI2.g())) != null) {
            hashSet.add(bNK2);
        }
        return hashSet;
    }

    @Nullable
    public bNK b(aNI aNI2) {
        bNK bNK2 = (bNK)this.b(aNI2.d(), aNI2.e());
        if (bNK2 != null) {
            return bNK2;
        }
        if (!aNI2.a()) {
            return null;
        }
        return (bNK)this.b(aNI2.f(), aNI2.g());
    }

    static /* synthetic */ ArrayList a(bNT bNT2) {
        return bNT2.c;
    }

    static /* synthetic */ void a(bNT bNT2, abz_0 abz_02, acb_0 acb_02) {
        bNT2.a(abz_02, acb_02);
    }

    static /* synthetic */ ArrayList b(bNT bNT2) {
        return bNT2.c;
    }
}

