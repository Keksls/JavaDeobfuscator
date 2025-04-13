/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cEn
 */
public class cen_1
extends cev_1 {
    public static final byte a = 6;
    private final ArrayList<ceo_1> b = new ArrayList(2);

    public void a(ceo_1 ceo_12) {
        this.b.add(ceo_12);
    }

    public ArrayList<ceo_1> a() {
        return this.b;
    }

    @Override
    public boolean c() {
        for (int k = this.b.size() - 1; k >= 0; --k) {
            if (this.b.get(k).g()) continue;
            return false;
        }
        return true;
    }

    @Override
    public byte d() {
        return 6;
    }

    @Override
    public void a(arf_1 arf_12) {
        int n = arf_12.a();
        for (int k = 0; k < n; ++k) {
            this.b.add(cec_2.a(arf_12));
        }
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a((byte)this.b.size());
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            cec_2.a(gk_02, this.b.get(k));
        }
    }

    @Override
    public String e() {
        StringBuilder stringBuilder = new StringBuilder("{");
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            if (k > 0) {
                stringBuilder.append(" ET ");
            }
            stringBuilder.append(this.b.get(k).toString());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public ceo_1 f() {
        cen_1 cen_12 = new cen_1();
        cen_12.a(this.h());
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            cen_12.a(this.b.get(k).f());
        }
        return cen_12;
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.f();
    }
}

