/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from arD
 */
public class ard_2
implements ary_2 {
    private arb_1 a = null;
    private ary_2 b = null;
    private List<ary_2> c = null;

    public ard_2(arb_1 arb_12) {
        this.a = arb_12;
    }

    void a(ary_2 ary_22) {
        this.b = ary_22;
        ((ard_2)this.b).b(this);
    }

    private void b(ary_2 ary_22) {
        if (this.c == null) {
            this.c = new ArrayList<ary_2>();
        }
        this.c.add(ary_22);
    }

    @Override
    public List<ary_2> b() {
        return this.c;
    }

    @Override
    public ary_2 c() {
        return null;
    }

    @Override
    public ary_2 a() {
        return this.b;
    }

    @Override
    public arb_1 d() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }
}

