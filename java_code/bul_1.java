/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bul
 */
public class bul_1
extends bue_0 {
    public static final aqr_2 b = new bvk_2(new bvj_2("sp\u00e9cifie l'id du script \u00e0 executer", new aqt_2("id du script", aov_1.b)));
    private int c;

    public bul_1(int n) {
        super(n);
    }

    @Override
    public void a() {
        aks_1.a().a("events/" + Integer.toString(this.c) + ".lua");
    }

    @Override
    protected void a(ArrayList<aot_2> arrayList) {
        int n = arrayList.size();
        if (n != 1) {
            a.error((Object)("Nombre de param\u00e8tres invalides pour une action RunScript id=" + this.b() + " paramCount=" + n));
            return;
        }
        this.c = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
    }

    @Override
    public aqr_2 c_() {
        return b;
    }
}

