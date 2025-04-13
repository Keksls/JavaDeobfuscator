/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Th
 */
public class th_0
implements uw_0 {
    private final ArrayList<aff_1> b = new ArrayList();

    public void a(aff_1[] aff_1Array) {
        for (int k = 0; k < aff_1Array.length; ++k) {
            aff_1 aff_12 = aff_1Array[k];
            if (this.b.contains(aff_12)) continue;
            this.b.add(aff_12);
        }
    }

    @Override
    public void a(int n, int n2, short s2) {
        assert (false) : "This shape uses a custom filling method";
    }

    @Override
    public boolean a(int n, int n2) {
        assert (false) : "This shape uses a custom filling method";
        return false;
    }

    @Override
    public void a() {
        assert (false) : "This shape uses a custom filling method";
    }

    @Override
    public int b() {
        return this.b.size();
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public ArrayList<aff_1> b(int n, int n2, short s2) {
        return this.b;
    }
}

