/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from apm
 */
public abstract class apm_2
implements apy_1 {
    protected final String a;
    protected final aon_1 b;
    protected int c;
    protected final boolean d;
    protected final ArrayList<aom_2> e;

    public apm_2(String string) {
        this.a = string;
        this.b = aon_1.c;
        this.e = new ArrayList();
        this.d = true;
    }

    @Override
    public aon_1 a() {
        return this.b;
    }

    @Override
    public void a(int n) {
        this.c = n;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.a;
    }

    public void a(aom_2 aom_22) {
        this.e.add(aom_22);
    }

    public ArrayList<aom_2> d() {
        return this.e;
    }

    @Override
    public boolean e() {
        if (this.e.size() != 0) {
            for (aom_2 aom_22 : this.e) {
                if (aom_22.a() || !aom_22.i()) continue;
                return true;
            }
        }
        return this.d;
    }

    public abstract Object a(Object var1, Object var2, Object var3, Object var4);

    public apy_1 f() {
        return this;
    }
}

