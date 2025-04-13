/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from euk
 */
public class euk_0
extends esi_0 {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();
    private aoq_1 b;

    @Override
    protected List<aov_1[]> i() {
        return Collections.unmodifiableList(a);
    }

    @Override
    public boolean a() {
        return true;
    }

    public euk_0(List<aot_2> list) {
        this.a(list);
        if (list.size() == 1) {
            this.b = (aoq_1)list.get(0);
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        int n = (int)this.b.a(object, object2, object3, object4);
        TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            faX faX2 = (faX)tIntObjectIterator.value();
            feo_0 feo_02 = faX2.E();
            fem_0 fem_02 = feo_02.b(n);
            if (fem_02 == null) continue;
            return this.e() * (long)faX2.c();
        }
        throw new aob_1("protecteur non trouv\u00e9 dans le NationManager : protectorId=" + n);
    }

    @Override
    public Enum c() {
        return eyO.dT;
    }

    public String toString() {
        return "GetProtectorNationId{m_protectorId=" + this.b + "}";
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

