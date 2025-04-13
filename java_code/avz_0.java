/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aVZ
 */
public final class avz_0
extends aXj {
    private static final Logger t = Logger.getLogger(avz_0.class);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    public static final int o = 14;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 17;
    public static final int s = 18;
    private final int u;
    private final String[] v;

    public avz_0(int n, String ... stringArray) {
        this.u = n;
        this.v = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.u) {
            case 0: 
            case 3: 
            case 4: 
            case 6: 
            case 13: 
            case 14: 
            case 15: 
            case 16: {
                return this.v.length == 0;
            }
            case 1: 
            case 2: 
            case 7: 
            case 9: 
            case 12: {
                return this.v.length == 1;
            }
            case 5: 
            case 8: 
            case 18: {
                return this.v.length == 2;
            }
            case 10: {
                return this.v.length == 3;
            }
            case 11: 
            case 17: {
                return this.v.length == 4;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.u) {
                case 0: {
                    avz_0.t();
                    return;
                }
                case 1: {
                    this.s();
                    return;
                }
                case 3: {
                    avz_0.r();
                    return;
                }
                case 4: {
                    this.q();
                    return;
                }
                case 5: {
                    this.p();
                    return;
                }
                case 6: {
                    this.o();
                    return;
                }
                case 7: {
                    this.n();
                    return;
                }
                case 8: {
                    this.m();
                    return;
                }
                case 9: {
                    this.l();
                    return;
                }
                case 10: {
                    this.k();
                    return;
                }
                case 11: {
                    this.j();
                    return;
                }
                case 12: {
                    this.h();
                    return;
                }
                case 18: {
                    this.i();
                    return;
                }
                case 13: {
                    avz_0.f();
                    return;
                }
                case 14: {
                    avz_0.g();
                    return;
                }
                case 15: {
                    avz_0.e();
                    return;
                }
                case 16: {
                    avz_0.d();
                    return;
                }
                case 17: {
                    this.c();
                    return;
                }
            }
        }
        catch (Exception exception) {
            t.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void c() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)474);
        pt.a(Integer.parseInt(this.v[0]));
        pt.a(Integer.parseInt(this.v[1]));
        pt.a(Integer.parseInt(this.v[2]));
        pt.a(Integer.parseInt(this.v[3]));
        aaw_22.c(pt);
    }

    private static void d() {
        bmr_1 bmr_12 = azu_0.j().k();
        eBy.a.a(bmr_12.R());
        cxo_0.k();
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)6);
        pt.a((short)24);
        aaw_22.c(pt);
    }

    private static void e() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)215);
        aaw_22.c(pt);
    }

    private static void f() {
        avz_0.b("[CLIENT] Free companion: " + eBC.a.a());
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((short)288);
        pt.a((byte)2);
        aaw_22.c(pt);
        pt.a((byte)3);
        aaw_22.c(pt);
    }

    private static void g() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)289);
        aaw_22.c(pt);
    }

    private void h() {
        short s2 = Short.parseShort(this.v[0]);
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.b(s2);
        pt.a((byte)2);
        pt.a((short)106);
        aaw_22.c(pt);
    }

    private void i() {
        int n = Integer.parseInt(this.v[0]);
        boolean bl = Boolean.parseBoolean(this.v[1]);
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a(n);
        pt.a(bl);
        pt.a((byte)6);
        pt.a((short)352);
        aaw_22.c(pt);
    }

    private void j() {
        long l = Long.parseLong(this.v[0]);
        long l2 = Long.parseLong(this.v[1]);
        long l3 = Long.parseLong(this.v[2]);
        short s2 = Short.parseShort(this.v[3]);
        cmk cmk2 = new cmk(l, l2, l3, s2);
        azu_0.j().K().c(cmk2);
    }

    private void k() {
        long l = Long.parseLong(this.v[0]);
        byte by = Byte.parseByte(this.v[1]);
        long l2 = Long.parseLong(this.v[2]);
        cmh cmh2 = new cmh(l, by, l2);
        azu_0.j().K().c(cmh2);
    }

    private void l() {
        long l = Long.parseLong(this.v[0]);
        cmf cmf2 = new cmf(l);
        azu_0.j().K().c(cmf2);
    }

    private void m() {
        long l = Long.parseLong(this.v[0]);
        long l2 = Long.parseLong(this.v[1]);
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)419);
        pt.a(l);
        pt.a(l2);
        aaw_22.c(pt);
    }

    private void n() {
        long l = Long.parseLong(this.v[0]);
        cmj cmj2 = new cmj(l);
        azu_0.j().K().c(cmj2);
    }

    private void o() {
        avz_0.a((short)475);
    }

    private void p() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)11);
        long l = Long.parseLong(this.v[0]);
        pt.a(l);
        pt.a(this.v[1]);
        aaw_22.c(pt);
    }

    private void q() {
        avz_0.a((short)110);
    }

    private static void a(short s2) {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a(s2);
        aaw_22.c(pt);
    }

    private static void r() {
        bai_0 bai_02 = azu_0.j().n();
        List<eBt> list = eBo.a.a(bai_02.u());
        if (list == null || list.isEmpty()) {
            avz_0.a("Aucun compagnon");
            return;
        }
        for (eBt eBt2 : list) {
            avz_0.a(eBt2.toString() + "\n");
        }
    }

    private void s() {
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)374);
        int n = Integer.parseInt(this.v[0]);
        pt.a(n);
        aaw_22.c(pt);
    }

    private static void t() {
        avz_0.a("(companion | comp) (help | h) : show help");
        avz_0.a("(companion | comp) (list | l) : show available companions");
        avz_0.a("(companion | comp) (clear | c) : clear companions list");
        avz_0.a("(companion | comp) (add | a) breedId : add companion of given id");
        avz_0.a("(companion | comp) (rename | re) id \"nom\" : rename companion of given id ");
        avz_0.a("(companion | comp) (update | u) : update companion list");
        avz_0.a("(companion | comp) (toItem | ti) id : untie companion of given id");
        avz_0.a("(companion | comp) (addXp | xp) id xpToAdd : add xp to companion of given id");
        avz_0.a("(companion | comp) (addToGroup | atg) id : add companion to group");
        avz_0.a("(companion | comp) (addEquipment | equip) id pos itemUid: add item on companion inventory at specified position");
        avz_0.a("(companion | comp) (removeEquipment | rvequip) id itemUid bagId pos : unequip item of companion and put it on bag position given");
        avz_0.a("(companion | comp) (setFreeCompanion | free) breedId : change default free companion, update free companion cycle reference date");
        avz_0.a("(companion | comp) (setFreeCompanionCycle | sfcc) second minute hour day : change free companion cycle duration");
        avz_0.a("(companion | comp) (showFree | sfree) : show current free companion id");
        avz_0.a("(companion | comp) (nextFree) : finish free companion current time and launch next, update free companion cycle reference date");
        avz_0.a("(companion | comp) (setCompanionToMaxXp | maxxp) : enable or disable companion max xp");
        avz_0.a("(companion | comp) (changeUnlockGroupLimit | groupLimit | gl) : enable or disable max companion number in a group.");
        avz_0.a("(companion | comp) (changeAvailableStatus | cas) breedId <available>: enable or disable this companion for all players (true = available)");
    }
}

