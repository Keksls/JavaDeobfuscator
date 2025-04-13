/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from biq
 */
public class biq_2
implements ajh_1 {
    public static final String a = "quests";
    public static final String b = "achievementIndexText";
    private final ArrayList<biw_2> d = new ArrayList();
    private int e = -1;
    private int f = -1;

    public void a(op_0 op_02) {
        if (op_02.a() == this.e) {
            return;
        }
        this.e = op_02.a();
        this.d.clear();
        int n = op_02.b();
        for (int k = 0; k < n; ++k) {
            this.d.add(biz_2.a.b(cVh.e().j(), op_02.a(k)));
        }
        fis_1.a().a((ajf_1)this, a);
    }

    public void a(int n) {
        if (this.e == -1) {
            return;
        }
        this.f = -1;
        int n2 = this.d.size();
        for (int k = 0; k < n2; ++k) {
            biw_2 biw_22 = this.d.get(k);
            if (biw_22.i() != n) continue;
            this.f = k;
            break;
        }
        fis_1.a().a((ajf_1)this, b);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        if (string.equals(b)) {
            return String.valueOf(this.f + 1);
        }
        return null;
    }
}

