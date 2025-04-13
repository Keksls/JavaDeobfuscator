/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from buh
 */
public class buh_1
extends bue_0 {
    public static final aqr_2 b = new bvk_2(new bvj_2("", new aqt_2("iconName", aov_1.a), new aqt_2("titleTranslationKey", aov_1.a), new aqt_2("textTranslationKey", aov_1.a)), new bvj_2("En pr\u00e9cisant le type (tuto sinon)", new aqt_2("iconName", aov_1.a), new aqt_2("titleTranslationKey", aov_1.a), new aqt_2("textTranslationKey", aov_1.a), new aqt_2("type", aov_1.b)));
    private String c;
    private String d;
    private String e;
    private int f;

    public buh_1(int n) {
        super(n);
    }

    @Override
    public void a() {
        dhf_0 dhf_02 = new dhf_0(this.c, this.d, this.e, this.f, this.b());
        add_2.b().a(dhf_02);
    }

    @Override
    protected void a(ArrayList<aot_2> arrayList) {
        int n;
        int n2 = arrayList.size();
        if (n2 != 3) {
            a.error((Object)("Nombre de param\u00e8tres invalide pour une action de type ClientEventActionLaunchTutorial id=" + this.b() + " paramCount=" + n2));
            return;
        }
        int n3 = 0;
        String string = ((apd_2)arrayList.get(n3++)).b();
        String string2 = bae.h().a(((apd_2)arrayList.get(n3++)).b(), new Object[0]);
        String string3 = ((apd_2)arrayList.get(n3++)).b();
        if (n2 == n3) {
            n = 0;
        } else {
            try {
                n = (int)((aoq_1)arrayList.get(n3)).a(null, null, null, null);
                ++n3;
            }
            catch (ClassCastException classCastException) {
                n = 0;
            }
        }
        String string4 = bae.h().a(string3, new Object[0]);
        this.e = string;
        this.c = string2;
        this.d = string4;
        this.f = n;
    }

    @Override
    public aqr_2 c_() {
        return b;
    }

    public String d() {
        return this.c;
    }
}

