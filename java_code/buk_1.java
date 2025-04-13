/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from buk
 */
public class buk_1
extends bue_0 {
    public static final aqr_2 b = new bvk_2(new bvj_2("sp\u00e9cifie l'id de la qu\u00eate \u00e0 activer", new aqt_2("id de la qu\u00eate", aov_1.b)));
    private int c;

    public buk_1(int n) {
        super(n);
    }

    @Override
    public void a() {
        bhr_1 bhr_12 = azu_0.j().k().eK();
        if (bhr_12.m(this.c)) {
            bhr_12.x(this.c);
        }
    }

    @Override
    protected void a(ArrayList<aot_2> arrayList) {
        int n = arrayList.size();
        if (n != 1) {
            a.error((Object)("Nombre de param\u00e8tres invalides pour une action ClientEventActionRequestQuestActivation id=" + this.b() + " paramCount=" + n));
            return;
        }
        this.c = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
    }

    @Override
    public aqr_2 c_() {
        return b;
    }
}

