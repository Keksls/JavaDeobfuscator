/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fKP
 */
public class fkp_2 {
    private static final fkp_2 a = new fkp_2();
    private final ArrayList<fko_2> b = new ArrayList();

    public static fkp_2 a() {
        return a;
    }

    private fkp_2() {
    }

    public void a(fko_2 fko_22) {
        this.b.add(fko_22);
    }

    public void a(fyw_0 fyw_02) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).a(fyw_02);
        }
    }
}

