/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from arB
 */
public class arb_2 {
    private static final Logger a = Logger.getLogger(arb_2.class);
    private arh_2 b = null;
    private arz_2 c = null;

    public arb_2(arh_2 arh_22, arz_2 arz_22) {
        this.b = arh_22;
        this.c = arz_22;
    }

    public arb_2(arh_2 arh_22) {
        this.b = arh_22;
        this.c = new arc_2(this);
    }

    public List<ary_2> a() {
        ArrayList<ary_2> arrayList = new ArrayList<ary_2>();
        try {
            ara_2 ara_22 = new ara_2();
            arm_2 arm_22 = new arm_2(this.b);
            arb_1 arb_12 = null;
            ard_2 ard_22 = null;
            while (arm_22.c() && (arb_12 = arm_22.b()) != null) {
                ard_22 = new ard_2(arb_12);
                if (arb_12 instanceof arf_2) {
                    if (this.c != null && !this.c.a(arb_12)) continue;
                    arf_2 arf_22 = (arf_2)arb_12;
                    if (arf_22.h()) {
                        ara_22.b(ard_22);
                        continue;
                    }
                    if (ara_22.c() == null) {
                        arrayList.add(ard_22);
                    } else {
                        ary_2 ary_22 = ara_22.c();
                        ard_22.a(ary_22);
                    }
                    if (arf_22.h()) continue;
                    if (this.c != null) {
                        if (!this.c.a(arb_12)) continue;
                        ara_22.a(ard_22);
                        continue;
                    }
                    ara_22.a(ard_22);
                    continue;
                }
                if (!(arb_12 instanceof arg_2)) continue;
                if (ara_22.c() == null) {
                    a.error((Object)"Invalid source ..");
                    continue;
                }
                ard_22.a(ara_22.c());
            }
        }
        catch (Exception exception) {
            throw new aqz_2("Cannot build DOM tree, " + exception.getMessage());
        }
        return arrayList;
    }

    public static void a(List<ary_2> list) {
        if (list != null) {
            for (ary_2 ary_22 : list) {
                System.out.println("NODE >" + ary_22.d());
                arb_2.a(ary_22.b());
            }
        }
    }
}

