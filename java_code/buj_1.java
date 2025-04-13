/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from buj
 */
public class buj_1
extends bue_0 {
    public static final aqr_2 b = new bvk_2(new bvj_2("", new aqt_2("text", aov_1.a)), new bvj_2("avec for\u00e7age", new aqt_2("text", aov_1.a), new aqt_2("forced", aov_1.c)));
    private String c;
    private boolean d;
    private long e;
    private bly_0 f;

    public buj_1(int n) {
        super(n);
    }

    @Override
    public void a() {
        ddB.a().a(bae.h().a(this.c, new Object[0]), this.d, this.e, this.f);
    }

    @Override
    protected void a(ArrayList<aot_2> arrayList) {
        this.f = bly_0.a;
        this.d = false;
        this.e = 0L;
        int n = arrayList.size();
        if (n < 1 || n > 4) {
            a.error((Object)("Nombre de param\u00e8tres invalide pour une action de type PetText id=" + this.b() + " paramCount=" + n));
            return;
        }
        this.c = ((apd_2)arrayList.get(0)).b();
        if (n > 1) {
            this.d = ((aov_2)arrayList.get(1)).a(null, null, null, null) == 0;
        }
    }

    @Override
    public aqr_2 c_() {
        return b;
    }
}

