/*
 * Decompiled with CFR 0.152.
 */
public class aXs
extends aXj {
    private int a;
    private final byte b;
    private long c;

    public aXs(byte by) {
        this.b = by;
    }

    public aXs(int n, byte by) {
        this.a = n;
        this.b = by;
    }

    public aXs(int n, byte by, long l) {
        this.a = n;
        this.b = by;
        this.c = l;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        int n;
        abu_1 abu_12;
        Pt pt = new Pt();
        switch (this.b) {
            case 1: 
            case 2: 
            case 9: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 16: {
                pt.a((byte)3);
                break;
            }
            case 3: 
            case 4: 
            case 5: 
            case 10: {
                pt.a((byte)6);
                break;
            }
            case 15: {
                aXs.d();
                return;
            }
            case 17: {
                aXs.c();
                return;
            }
        }
        if (this.a < 0) {
            abu_12 = azu_0.j().k();
            if (abu_12 == null) {
                return;
            }
            n = ((epq_2)abu_12).fE().n();
        } else {
            n = this.a;
        }
        pt.a((short)302);
        pt.a(n);
        pt.b(this.b);
        pt.a(this.c);
        abu_12 = azu_0.j().K();
        if (abu_12 != null) {
            ((aaw_2)abu_12).c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private static void c() {
        fcu_0[] fcu_0Array = fcu_0.values();
        for (int k = 0; k < fcu_0Array.length; ++k) {
            fcu_0 fcu_02 = fcu_0Array[k];
            aXs.a(fcu_02.toString());
        }
    }

    private static void d() {
        aXs.a("\"\" : show info about nation");
        aXs.a("set nationId : set nation of current character");
        aXs.a("vote info : show info about current vote");
        aXs.a("vote info nationId : same with another nation");
        aXs.a("vote start : launch vote");
        aXs.a("vote start nationId : same with another nation");
        aXs.a("vote end : finish vote");
        aXs.a("vote end nationId : same with another nation");
        aXs.a("cp amount : give amount of citizenship for main's nation");
        aXs.a("cp nationId amount : give amount of citizenship for specified nation");
        aXs.a("al nationId alignementId : change nation alignment");
        aXs.a("(goInPrison | gp) nationId : launch prison feature for nationId");
        aXs.a("(offenseRem | or) nationId : remove outlaw in nationId");
        aXs.a("(offenseAdd | oa) nationId : set outlaw in nationId");
        aXs.a("switchPasseport | sp : Enable or disable passport");
        aXs.a("setRank rankId : Change character rank");
        aXs.a("showRanks : show ranks");
    }
}

