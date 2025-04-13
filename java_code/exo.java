/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class exo
extends esf {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();
    private final int b;
    private final int f;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exo(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        this.f = (int)((aoq_1)arrayList.get(1)).a(null, null, null, null);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ece_0 ece_02 = erQ.d(object, object2, object3, object4);
        return ece_02.d(this.b, this.f) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.ge;
    }

    public String toString() {
        return "IsKnownRecipe{m_craftId=" + this.b + ", m_recipeId=" + this.f + "}";
    }

    static {
        a.add(new aov_1[]{aov_1.b, aov_1.b});
    }
}

