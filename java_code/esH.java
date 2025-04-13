/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class esH
extends esi_0
implements eyk_0 {
    private eps_0 a;
    private String b;
    private static final ArrayList<aov_1[]> c = new ArrayList();

    public static eps_0 b(String string) {
        if ("hp".equalsIgnoreCase(string)) {
            return eps_0.b;
        }
        if ("trap".equalsIgnoreCase(string) || "nbtrap".equalsIgnoreCase(string) || "maxtrap".equalsIgnoreCase(string) || "contr\u00f4le".equalsIgnoreCase(string) || "control".equalsIgnoreCase(string)) {
            return eps_0.k;
        }
        if ("mp".equalsIgnoreCase(string) || "pm".equalsIgnoreCase(string)) {
            return eps_0.d;
        }
        if ("wp".equalsIgnoreCase(string) || "pw".equalsIgnoreCase(string)) {
            return eps_0.e;
        }
        if ("ap".equalsIgnoreCase(string) || "pa".equalsIgnoreCase(string)) {
            return eps_0.c;
        }
        if ("summons".equalsIgnoreCase(string) || "nbsummons".equalsIgnoreCase(string) || "commandement".equalsIgnoreCase(string) || "leadership".equalsIgnoreCase(string)) {
            return eps_0.k;
        }
        if ("for".equalsIgnoreCase(string) || "strength".equalsIgnoreCase(string) || "force".equalsIgnoreCase(string)) {
            return eps_0.F;
        }
        if ("agi".equalsIgnoreCase(string)) {
            return eps_0.E;
        }
        if ("int".equalsIgnoreCase(string)) {
            return eps_0.G;
        }
        if ("chan".equalsIgnoreCase(string)) {
            return eps_0.D;
        }
        if ("sag".equalsIgnoreCase(string)) {
            return eps_0.C;
        }
        if ("dmg_earth".equalsIgnoreCase(string)) {
            return eps_0.s;
        }
        if ("dmg_air".equalsIgnoreCase(string)) {
            return eps_0.t;
        }
        if ("dmg_fire".equalsIgnoreCase(string)) {
            return eps_0.q;
        }
        if ("dmg_water".equalsIgnoreCase(string)) {
            return eps_0.r;
        }
        if ("dmg_stasis".equalsIgnoreCase(string)) {
            return eps_0.R;
        }
        if ("dmg_light".equalsIgnoreCase(string)) {
            return eps_0.aj;
        }
        if ("res_earth".equalsIgnoreCase(string)) {
            return eps_0.x;
        }
        if ("res_air".equalsIgnoreCase(string)) {
            return eps_0.y;
        }
        if ("res_fire".equalsIgnoreCase(string)) {
            return eps_0.v;
        }
        if ("res_water".equalsIgnoreCase(string)) {
            return eps_0.w;
        }
        if ("res_stasis".equalsIgnoreCase(string)) {
            return eps_0.S;
        }
        if ("res_light".equalsIgnoreCase(string)) {
            return eps_0.ak;
        }
        if ("init".equalsIgnoreCase(string)) {
            return eps_0.B;
        }
        if ("prosp".equalsIgnoreCase(string)) {
            return eps_0.A;
        }
        if ("chrage".equalsIgnoreCase(string)) {
            return eps_0.J;
        }
        if ("huppermage_resource".equalsIgnoreCase(string) || "bq".equalsIgnoreCase(string)) {
            return eps_0.al;
        }
        if ("sp".equalsIgnoreCase(string)) {
            return eps_0.ax;
        }
        if ("ouginak_resource".equalsIgnoreCase(string)) {
            return eps_0.ar;
        }
        if ("dmg_in_percent".equalsIgnoreCase(string)) {
            return eps_0.p;
        }
        if ("mechanics".equalsIgnoreCase(string)) {
            return eps_0.k;
        }
        if ("virtual_hp".equalsIgnoreCase(string)) {
            return eps_0.T;
        }
        if ("ferocity".equalsIgnoreCase(string)) {
            return eps_0.h;
        }
        if ("fumble_rate".equalsIgnoreCase(string)) {
            return eps_0.i;
        }
        if ("critical_bonus".equalsIgnoreCase(string)) {
            return eps_0.K;
        }
        if ("osa_invocation_knowledge".equalsIgnoreCase(string) || "invocation_knowledge".equalsIgnoreCase(string) || "ik".equalsIgnoreCase(string) || "InvocationKnowledge".equalsIgnoreCase(string)) {
            return eps_0.X;
        }
        if ("armor".equalsIgnoreCase(string) || "armure".equalsIgnoreCase(string)) {
            return eps_0.Y;
        }
        if ("bomb_cooldown".equalsIgnoreCase(string)) {
            return eps_0.M;
        }
        try {
            return eps_0.valueOf(string.toUpperCase());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            d.error((Object)("GetCharacteristic criteria with invalid parameter : " + string + " : unknown characteristic " + illegalArgumentException));
            return null;
        }
    }

    public eps_0 f() {
        return this.a;
    }

    @Override
    protected List<aov_1[]> i() {
        return c;
    }

    @Override
    public boolean a() {
        return true;
    }

    public esH(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = esH.b(((apd_2)arrayList.get(0)).b());
            this.b = "caster";
        }
        if (s2 == 1) {
            this.a = esH.b(((apd_2)arrayList.get(0)).b());
            this.b = ((apd_2)arrayList.get(1)).b();
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        Object object5;
        long l = 0L;
        apq_2 apq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (apq_22 == null) {
            if (this.b.equalsIgnoreCase("target") && object2 instanceof aff_1 && object4 instanceof elm_0) {
                object5 = (elm_0)object4;
                aff_1 aff_12 = (aff_1)object2;
                for (Su su : ((els_0)object5).a(aff_12)) {
                    if (!su.a(this.a)) continue;
                    apq_22 = su;
                    break;
                }
            } else {
                return -1L;
            }
        }
        if (apq_22 instanceof eqq_1) {
            object5 = apq_22;
            if (!object5.a(this.a)) {
                return -1L;
            }
            l = object5.c(this.a);
            return this.e() * l;
        }
        return -1L;
    }

    @Override
    public Enum c() {
        return eyO.c;
    }

    @Override
    public boolean j() {
        return this.b.equalsIgnoreCase("target");
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a};
        c.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.a, aov_1.a};
        c.add(aov_1Array);
    }
}

