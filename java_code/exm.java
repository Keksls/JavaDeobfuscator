/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;

@Criterion(description="Return true if the user is in a Nation Jail", signatures={@Signature})
public final class exm
extends esf {
    public exm() {
    }

    public exm(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            faX faX2 = (faX)tIntObjectIterator.value();
            if ((long)faX2.n() != ((epq_2)eqq_12).T_()) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.hq;
    }
}

