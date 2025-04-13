/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

@Criterion(description="Count the summoned entity that are aligned with the user and the target cell", signatures={@Signature(description="Count any summon within that range", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER)}), @Signature(description="Count any summon within that range using the targetType as the reference point", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER), @Parameter(name="targetType", type=VarType.STRING)}), @Signature(description="Count the summon of the corresponding breedId within that range using the targetType as the reference point", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER), @Parameter(name="targetType", type=VarType.STRING), @Parameter(name="breedId", type=VarType.NUMBER)}), @Signature(description="Count the summon of the corresponding breedId owned (or not) by the targetType within that range using the targetType as the reference point", params={@Parameter(name="minRange", type=VarType.NUMBER), @Parameter(name="maxRange", type=VarType.NUMBER), @Parameter(name="targetType", type=VarType.STRING), @Parameter(name="breedId", type=VarType.NUMBER), @Parameter(name="onlyOwnSummon", type=VarType.NUMBER)})})
public final class eyH
extends esi_0 {
    private aoq_1 a = new aox_1(-1L);
    private aoq_1 b = new aox_1(-1L);
    private aoq_1 c = new aox_1(-1L);
    private aov_2 e = new aov_2(false);
    private String f = eyJ.b.a();

    public eyH(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by >= 0) {
            this.a = (aoq_1)arrayList.get(0);
            this.b = (aoq_1)arrayList.get(1);
        }
        if (by >= 1) {
            this.f = ((apd_2)arrayList.get(2)).b();
        }
        if (by >= 2) {
            this.c = (aoq_1)arrayList.get(3);
        }
        if (by >= 3) {
            this.e = (aov_2)arrayList.get(4);
        }
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        long l;
        eqq_1 eqq_12 = erQ.a(this.f, object, object2, object4, object3);
        if (!(eqq_12 instanceof epq_2)) {
            throw new aob_1("Cannot retrieve the criterion user");
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        els_0 els_02 = epq_22.ck();
        if (els_02 == null) {
            throw new aob_1("Cannot retrieve the fight");
        }
        aff_1 aff_12 = erQ.d(true, object, object2, object4, object3);
        if (aff_12 == null) {
            throw new aob_1("Cannot retrieve the target cell position");
        }
        aff_1 aff_13 = epq_22.P_();
        if (!aff_12.i(aff_13) && !aff_12.j(aff_13)) {
            return 0L;
        }
        long l2 = this.a.a(object, object2, object3, object4);
        if (l2 > (l = this.b.a(object, object2, object3, object4)) && l != -1L) {
            throw new aob_1("The minimal range cannot be superior to the maximal range");
        }
        long l3 = this.c.a(object, object2, object3, object4);
        boolean bl = this.e.a(object, object2, object3, object4) == 0;
        List<epq_2> list = this.a(els_02, epq_22.a_(), aff_13, aff_12, l2, l, l3, bl);
        return list.size();
    }

    private List<epq_2> a(els_0<?> els_02, long l, aff_1 aff_12, aff_1 aff_13, long l2, long l3, long l4, boolean bl) {
        return els_02.j().stream().filter(epq_22 -> !epq_22.C_()).filter(epq_22 -> l4 == -1L || (long)epq_22.gO() == l4).filter(epq_22 -> !bl || epq_22.B_() == l).filter(epq_22 -> this.a(aff_12, l2, l3, epq_22.P_())).filter(epq_22 -> this.a(aff_12, epq_22.P_(), aff_13)).collect(Collectors.toList());
    }

    private boolean a(aff_1 aff_12, aff_1 aff_13, aff_1 aff_14) {
        return aff_13.a(aff_12, aff_14) || aff_13.b(aff_12, aff_14);
    }

    private boolean a(aff_1 aff_12, long l, long l2, aff_1 aff_13) {
        if (l == -1L && l2 == -1L) {
            return true;
        }
        int n = aff_13.e(aff_12);
        return (long)n >= l && (long)n <= l;
    }

    @Override
    public Enum c() {
        return eyO.hv;
    }

    @Override
    public boolean a() {
        return true;
    }
}

