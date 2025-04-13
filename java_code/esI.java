/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class esI
extends esi_0
implements eyk_0 {
    private eps_0 a;
    private boolean b;
    private static final List<aov_1[]> c = new ArrayList<aov_1[]>();

    @Override
    protected List<aov_1[]> i() {
        return c;
    }

    @Override
    public boolean a() {
        return false;
    }

    public esI(ArrayList<aot_2> arrayList) {
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
    public double b(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1.0;
        }
        if (eqq_12.a(this.a)) {
            int n = eqq_12.c(this.a);
            int n2 = eqq_12.d(this.a);
            long l = Hw.c((float)n / (float)n2 * 100.0f);
            return this.e() * l;
        }
        d.error((Object)("Trying to get GetCharacteristicInPct for a character without this charac. Charac=" + this.a + " criterionUser=" + object + " criterionTarget=" + object2 + " criterionContent=" + object3));
        return -1.0;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException("Can't get Long value of a double");
    }

    public eps_0 f() {
        return this.a;
    }

    @Override
    public Enum c() {
        return eyO.d;
    }

    @Override
    public boolean j() {
        return this.b;
    }

    static {
        c.add(esa_0.j);
        c.add(new aov_1[]{aov_1.a, aov_1.a});
    }
}

