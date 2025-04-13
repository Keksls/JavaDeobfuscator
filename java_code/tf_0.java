/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from Tf
 */
public class tf_0
implements uw_0 {
    private final ArrayList<aff_1> a = new ArrayList();

    public void a(aff_1[] aff_1Array) {
        Collections.addAll(this.a, aff_1Array);
    }

    @Override
    public void a(int n, int n2, short s2) {
    }

    @Override
    public boolean a(int n, int n2) {
        for (int k = 0; k < this.a.size(); ++k) {
            aff_1 aff_12 = this.a.get(k);
            if (aff_12.d() != n || aff_12.e() != n2) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a() {
    }

    @Override
    public int b() {
        return this.a.size();
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public ArrayList<aff_1> b(int n, int n2, short s2) {
        return this.a;
    }
}

