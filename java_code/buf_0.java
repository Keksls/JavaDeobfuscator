/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from buf
 */
final class buf_0
extends bue_0 {
    public static final aqr_2 b = new bvk_2(new bvj_2("event \u00e0 modifier", new aqt_2("id", aov_1.b), new aqt_2("activ\u00e9/d\u00e9sactiv\u00e9 (true/false)", aov_1.c)));
    private int c;
    private boolean d;

    buf_0(int n) {
        super(n);
    }

    @Override
    public void a() {
        btZ btZ2 = bua_0.a.a(this.c);
        if (btZ2 == null) {
            a.error((Object)("Evenement d'id inconnnu " + this.c));
            return;
        }
        btZ2.a(this.d);
        buc_0.a(btZ2);
    }

    @Override
    protected void a(ArrayList<aot_2> arrayList) {
        this.c = 0;
        int n = arrayList.size();
        if (n != 2) {
            a.error((Object)("Nombre de param\u00e8tres invalide pour une action de type PetText id=" + this.b() + " paramCount=" + n));
            return;
        }
        this.c = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        this.d = ((aov_2)arrayList.get(1)).a(null, null, null, null) == 0;
    }

    @Override
    public aqr_2 c_() {
        return b;
    }
}

