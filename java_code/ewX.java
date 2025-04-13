/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ewX
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewX(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by != 0) {
            e.error((Object)("Param\u00e9trage de crit\u00e8re inconnu : " + this));
            return;
        }
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object4, object3);
        if (epq_22 == null) {
            throw new aob_1("User null");
        }
        long l = this.b.a(object, object2, object3, object4);
        Object ItemSet = epq_22.cj().b((short)l);
        exq_2 exq_22 = epq_22.R_();
        boolean bl = true;
        if (exq_22 != null) {
            Iterator iterator = ((exo_2)ItemSet).iterator();
            while (iterator.hasNext()) {
                if (exq_22.b(((ezr_0)iterator.next()).n())) continue;
                bl = false;
                break;
            }
        } else {
            eyz_0 eyz_02 = epq_22.cG();
            eyt_0 eyt_02 = epq_22.dC();
            if (eyz_02 != null && eyt_02 != null) {
                Iterator iterator = ((exo_2)ItemSet).iterator();
                while (iterator.hasNext()) {
                    if (eyz_02.a(eyt_02, ((ezr_0)iterator.next()).n()) != null) continue;
                    bl = false;
                    break;
                }
            } else {
                bl = false;
            }
        }
        return bl ? 0 : 1;
    }

    @Override
    public Enum c() {
        return eyO.cP;
    }

    static {
        a.add(new aov_1[]{aov_1.b});
    }
}

