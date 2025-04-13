/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

public class eAA
implements eov_1<rs_0> {
    private final TIntObjectHashMap<rs_0> a = new TIntObjectHashMap();

    public eAA(Iterable<ru_0> iterable) {
        for (ru_0 ru_02 : iterable) {
            this.a.put((int)ru_02.a(), (Object)eAx.a(ru_02));
        }
    }

    public eAA(ru_0[] ru_0Array) {
        for (ru_0 ru_02 : ru_0Array) {
            this.a.put((int)ru_02.a(), (Object)eAx.a(ru_02));
        }
    }

    @Override
    public void a() {
        TIntObjectIterator tIntObjectIterator = this.a.iterator();
        int n = this.a.size();
        while (n-- > 0) {
            tIntObjectIterator.advance();
            rs_0 rs_02 = (rs_0)tIntObjectIterator.value();
            rs_02.g();
        }
    }

    @Override
    public boolean a(ru_0 ru_02) {
        return ru_02 != null && this.a.contains((int)ru_02.a());
    }

    @Override
    public rs_0 b(ru_0 ru_02) {
        return (rs_0)this.a.get((int)ru_02.a());
    }

    @Override
    public int c(ru_0 ru_02) {
        rs_0 rs_02 = (rs_0)this.a.get((int)ru_02.a());
        if (rs_02 != null) {
            return rs_02.a();
        }
        throw new UnsupportedOperationException("caract\u00e9ristique inexistante : " + ru_02.a());
    }

    @Override
    public int d(ru_0 ru_02) {
        rs_0 rs_02 = (rs_0)this.a.get((int)ru_02.a());
        if (rs_02 != null) {
            return rs_02.c();
        }
        throw new UnsupportedOperationException("caract\u00e9ristique inexistante : " + ru_02.a());
    }

    public void a(rv_0 rv_02) {
        TIntObjectIterator tIntObjectIterator = this.a.iterator();
        int n = this.a.size();
        while (n-- > 0) {
            tIntObjectIterator.advance();
            rs_0 rs_02 = (rs_0)tIntObjectIterator.value();
            rs_02.a(rv_02);
        }
    }

    public void b() {
        if (this.a.isEmpty()) {
            return;
        }
        this.a.forEachValue((TObjectProcedure)new eAB(this));
    }

    public TIntObjectIterator<rs_0> c() {
        return this.a.iterator();
    }

    @Override
    public boolean a(tw_2 tw_22, ru_0 ... ru_0Array) {
        throw new UnsupportedOperationException("On ne peut pas s\u00e9rialiser un characteristic manager d'objet");
    }

    @Override
    public boolean a(tw_2 tw_22) {
        throw new UnsupportedOperationException("On ne peut pas s\u00e9rialiser un characteristic manager d'objet");
    }

    @Override
    public boolean b(tw_2 tw_22) {
        throw new UnsupportedOperationException("On ne peut pas s\u00e9rialiser un characteristic manager d'objet");
    }

    @Override
    public void a(epc_0 epc_02) {
        throw new UnsupportedOperationException("On ne peut pas invoquer le double d'un objet ");
    }
}

