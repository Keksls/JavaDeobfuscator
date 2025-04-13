/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.EnumSet;

/*
 * Renamed from fhc
 */
public class fhc_0 {
    private final int a;
    private final int b;
    private final ArrayList<fhh> c = new ArrayList();
    private final EnumSet<fhi> d = EnumSet.noneOf(fhi.class);

    public fhc_0(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public void a(fhh fhh2) {
        this.c.add(fhh2);
    }

    public void a(fhi fhi2) {
        this.d.add(fhi2);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public ArrayList<fhh> c() {
        return this.c;
    }

    public EnumSet<fhi> d() {
        return this.d;
    }

    public String toString() {
        return "BattlegroundData{m_id=" + this.a + ", m_territoryId=" + this.b + ", m_scenarios=" + this.c + ", m_levels=" + this.d + "}";
    }
}

