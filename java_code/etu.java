/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Criterion(description="Count the number of fighters in zone with the specified fight property", signatures={@Signature(description="With range min and range max", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER), @Parameter(name="targetType", type=VarType.STRING), @Parameter(name="propertyId", type=VarType.NUMBER)})})
public class etu
extends esi_0 {
    private aoq_1 a;
    private aoq_1 b;
    private final long c;
    private String e;

    public etu(List<aot_2> list) {
        this.a(list);
        this.b = (aoq_1)list.get(0);
        this.a = (aoq_1)list.get(1);
        this.e = ((apd_2)list.get(2)).b();
        this.c = ((aoq_1)list.get(3)).a(null, null, null, null);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        aff_1 aff_12;
        if (object4 == null) {
            throw new aob_1("Pas de contexte...");
        }
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        eoz_1 eoz_12 = eoz_1.a((int)this.c);
        if (eoz_12 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la fight property " + this.c);
        }
        eqq_1 eqq_12 = erQ.a(this.e, object, object2, object4, object3);
        aff_1 aff_13 = "target".equals(this.e) && object2 instanceof aff_1 ? (aff_1)object2 : (aff_12 = eqq_12 != null ? eqq_12.P_() : null);
        if (aff_12 == null) {
            return 0L;
        }
        Collection<? extends Su> collection = this.a(elm_02);
        long l = this.a.a(object, object2, object3, object4);
        long l2 = this.b.a(object, object2, object3, object4);
        long l3 = 0L;
        for (Su su : collection) {
            if (su.a(eoz_1.P) || !su.a(eoz_12)) continue;
            int n = aob_2.c((aoc_2)su, aff_12);
            if (l >= 0L && ((long)n > l || (long)n < l2)) continue;
            ++l3;
        }
        return this.e() * l3;
    }

    protected Collection<? extends Su> a(elm_0<?> elm_02) {
        Object object2;
        if (elm_02 == null) {
            return Collections.emptyList();
        }
        Collection collection = elm_02.am();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object2 : collection) {
            if (((epq_2)object2).a(eoz_1.P)) continue;
            arrayList.add(object2);
        }
        Collection<sr_0> collection2 = elm_02.i().f();
        object2 = collection2.iterator();
        while (object2.hasNext()) {
            sr_0 sr_02 = (sr_0)object2.next();
            eJL eJL2 = (eJL)sr_02.x_();
            if (eJL2 == null || sr_02.a(eoz_1.P)) continue;
            arrayList.add(sr_02);
        }
        return arrayList;
    }

    public long f() {
        return this.c;
    }

    public long j() {
        return this.a == null ? -1L : this.a.a(null, null, null, null);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.ho;
    }
}

