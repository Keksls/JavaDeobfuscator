/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aVw
extends aXj {
    private final byte a;
    private final String b;
    private int[] c = new int[1];

    public aVw(byte by, String string) {
        this.a = by;
        this.b = string;
        this.c[0] = -1;
    }

    public aVw(byte by, String string, int n) {
        this.a = by;
        this.b = string;
        this.c[0] = n;
    }

    public aVw(byte by, int n) {
        this.a = by;
        this.b = null;
        this.c[0] = n;
    }

    public aVw(byte by, List<Integer> list) {
        this.a = by;
        this.b = null;
        this.c = Cn.a(list.toArray(new Integer[list.size()]));
    }

    public aVw(byte by) {
        this.a = by;
        this.b = null;
        this.c[0] = -1;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        if (this.a == 14) {
            aVw.d();
            return;
        }
        Pt pt = new Pt();
        pt.a((short)300);
        pt.a((byte)3);
        pt.b(this.a);
        switch (this.a) {
            case 2: {
                pt.a(this.b);
                pt.a(this.c[0]);
                break;
            }
            case 1: {
                pt.a(this.b);
                break;
            }
            case 3: {
                this.a(pt);
                break;
            }
            case 4: {
                this.a(pt);
                break;
            }
            case 9: {
                this.a(pt);
                break;
            }
            case 5: {
                this.a(pt);
                break;
            }
            case 10: {
                this.a(pt);
                break;
            }
            case 11: {
                this.a(pt);
                break;
            }
            case 12: {
                pt.a(this.c[0]);
                break;
            }
            case 13: {
                this.c();
                return;
            }
            case 7: 
            case 8: {
                break;
            }
            default: {
                throw new UnsupportedOperationException("La commande " + this.a + " n'est pas support\u00e9e");
            }
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private void c() {
        int n = this.c[0];
        bhj_1 bhj_12 = bhp_1.a.a(n);
        if (bhj_12 == null) {
            aVo.a().d("Unknown achievement id = " + n);
            return;
        }
        aVw.a("Objective list for : " + bae.h().a(62, (long)n, new Object[0]) + " (id = " + n + ")");
        ArrayList<bhx_2> arrayList = bhj_12.r();
        for (int k = 0; k < arrayList.size(); ++k) {
            bhx_2 bhx_22 = arrayList.get(k);
            aVw.a(bhx_22.c() + " : " + bae.h().a(64, (long)bhx_22.c(), new Object[0]));
        }
    }

    private void a(Pt pt) {
        pt.a(this.c.length);
        for (int k = 0; k < this.c.length; ++k) {
            pt.a(this.c[k]);
        }
    }

    private static void d() {
        aVw.a("(help | h) : display command help");
        aVw.a("(reset | ar) id id id... : Reset the given achievements (main character and heroes)");
        aVw.a("(reset all | ara)  : Reset ALL achievements (main character and heroes)");
        aVw.a("(disable | ad) id id id... : Force disable the list of achievement (main character and heroes)");
        aVw.a("(complete) id id id... : Complete the given achievements (main character and heroes)");
        aVw.a("(completeObjective | co) id id id... : Complete the given objectives (main character and heroes)");
        aVw.a("(resetObjective | ro) id id id... : Complete the given achievements (main character and heroes)");
        aVw.a("(state | as)  id id id... : Gives the completion state of the given achievement (main character and heroes)");
        aVw.a("(criterion | ac)  id : Show the visibility and activation criteria of the given achievement");
        aVw.a("(getObjectivesIds | goi) id : Show the objectives id of the given achievement");
        aVw.a("(var get) &lt;name&gt; : Show the value of the variable for the current character");
        aVw.a("(var set) &lt;name&gt; &lt;value&gt; : Set the value to the given variable for the current character and heroes");
        aVw.a("(filldatabase | filldb) :  Fill the database with all achievements variables value and complete all objectives");
    }

    public String toString() {
        return "AchievementCommand{m_cmd=" + this.a + ", m_varName='" + this.b + "', m_value=" + Arrays.toString(this.c) + "}";
    }
}

