/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bug
 */
public class bug_0
extends bue_0 {
    public static final aqr_2 b = new bvk_2(new bvj_2("", new aqt_2("guideId", aov_1.b)));
    private int c;

    public bug_0(int n) {
        super(n);
    }

    @Override
    public void a() {
        dfc dfc2 = new dfc(19004);
        dfc2.b(this.c);
        add_2.b().a(dfc2);
    }

    @Override
    protected void a(ArrayList<aot_2> arrayList) {
        int n = arrayList.size();
        if (n != 1) {
            a.error((Object)("Wrong parameter count for ClientEventActionLaunchGuide id=" + this.b() + " paramCount=" + n));
            return;
        }
        this.c = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
    }

    @Override
    public aqr_2 c_() {
        return b;
    }
}

