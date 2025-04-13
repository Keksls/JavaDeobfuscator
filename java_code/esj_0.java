/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from esJ
 */
public class esj_0
extends esi_0
implements eyk_0 {
    private eps_0 a;
    private boolean b;
    private static final ArrayList<aov_1[]> c = new ArrayList();

    public eps_0 f() {
        return this.a;
    }

    @Override
    protected List<aov_1[]> i() {
        return c;
    }

    @Override
    public boolean a() {
        return true;
    }

    public esj_0(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = esH.b(((apd_2)arrayList.get(0)).b());
        }
        if (s2 == 1) {
            this.a = esH.b(((apd_2)arrayList.get(0)).b());
            this.b = ((apd_2)arrayList.get(1)).b().equalsIgnoreCase("target");
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        long l = 0L;
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        if (eqq_12.a(this.a)) {
            l = eqq_12.d(this.a);
            return super.e() * l;
        }
        d.error((Object)("Trying to get GetCharacteristicMax for a character without this charac. Charac=" + this.a + " criterionUser=" + object + " criterionTarget=" + object2 + " criterionContent=" + object3));
        return -1L;
    }

    @Override
    public Enum c() {
        return eyO.aM;
    }

    @Override
    public boolean j() {
        return this.b;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a};
        c.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.a, aov_1.a};
        c.add(aov_1Array);
    }
}

