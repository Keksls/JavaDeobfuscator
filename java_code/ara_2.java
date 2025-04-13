/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashSet;
import java.util.Vector;
import org.apache.log4j.Logger;

/*
 * Renamed from arA
 */
public class ara_2 {
    private static final Logger a = Logger.getLogger(ara_2.class);
    private Vector<ary_2> b = new Vector();
    private int c = 0;
    private HashSet<String> d = new HashSet();

    public ara_2() {
        this.a("br");
        this.a("BR");
        this.a("hr");
        this.a("HR");
    }

    public void a(String string) {
        this.d.add(string);
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public void a(ary_2 ary_22) {
        arf_2 arf_22;
        arb_1 arb_12 = ary_22.d();
        if (arb_12 instanceof arf_2 && this.d.contains((arf_22 = (arf_2)arb_12).f())) {
            return;
        }
        this.b.add(ary_22);
    }

    public ary_2 b() {
        ary_2 ary_22 = this.b.lastElement();
        this.b.removeElementAt(this.b.size() - 1);
        return ary_22;
    }

    public ary_2 c() {
        if (this.b.size() > 0) {
            return this.b.get(this.b.size() - 1);
        }
        return null;
    }

    public ary_2 b(ary_2 ary_22) {
        arf_2 arf_22 = (arf_2)ary_22.d();
        ary_2 ary_23 = null;
        int n = 0;
        ary_2 ary_24 = null;
        int n2 = 0;
        while ((ary_24 = this.a(n++)) != null) {
            if (ary_24.d() instanceof arf_2) {
                arf_2 arf_23 = (arf_2)ary_24.d();
                if (arf_23.f().equalsIgnoreCase(arf_22.f())) {
                    for (int k = 0; k <= n2; ++k) {
                        ary_23 = this.b();
                    }
                    break;
                }
                ++n2;
                continue;
            }
            a.error((Object)("Invalid TAG.." + ary_24.d()));
        }
        return ary_23;
    }

    public ary_2 a(int n) {
        int n2 = this.b.size() - 1 - n;
        if (n2 < 0) {
            return null;
        }
        return this.b.get(n2);
    }
}

