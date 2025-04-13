/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.map.hash.TIntShortHashMap;

/*
 * Renamed from aXt
 */
public final class axt_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    private final int h;
    private final String[] i;

    public axt_0(int n, String ... stringArray) {
        this.h = n;
        this.i = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.h) {
            case 0: 
            case 1: 
            case 2: 
            case 5: 
            case 6: {
                return this.i.length == 0;
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
            switch (this.h) {
                case 0: {
                    axt_0.d();
                    break;
                }
                case 1: {
                    axt_0.c();
                    break;
                }
                case 2: {
                    axt_0.d(aaw_22);
                    break;
                }
                case 3: {
                    this.c(aaw_22);
                    break;
                }
                case 4: {
                    this.b(aaw_22);
                    break;
                }
                case 5: {
                    axt_0.a(aaw_22);
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me d'une commande" + exception);
        }
    }

    private static void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)47);
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        cll_1 cll_12 = new cll_1();
        int n = Integer.parseInt(this.i[0]);
        short s2 = Short.parseShort(this.i[1]);
        TIntShortHashMap tIntShortHashMap = new TIntShortHashMap();
        tIntShortHashMap.put(n, s2);
        cll_12.a(tIntShortHashMap);
        aaw_22.c(cll_12);
    }

    private void c(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)35);
        pt.a(Integer.parseInt(this.i[0]));
        pt.b(Short.parseShort(this.i[1]));
        aaw_22.c(pt);
    }

    private static void d(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)326);
        aaw_22.c(pt);
    }

    private static void c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            axt_0.a("No info, please select a character");
            return;
        }
        ezu_1 ezu_12 = bmr_12.db();
        axt_0.a(ezu_12.toString());
    }

    private static void d() {
        axt_0.a("('aptitude'|'apt') ('help'|'h') : display command help");
        axt_0.a("('aptitude'|'apt') ('show'|'s') : display client personnals aptitude bonuses");
        axt_0.a("('aptitude'|'apt') ('showServerInfo'|'ssi') : display server personnals aptitude bonuses");
        axt_0.a("('aptitude'|'apt') ('setLevel'|'sl') bonusId level : set the level of the aptitude bonus");
        axt_0.a("('aptitude'|'apt') ('addLevelLegit'|'all') bonusId level : add level to the aptitude bonus with limit check");
        axt_0.a("('aptitude'|'apt') ('restat') : reset all aptitudes");
        axt_0.a("('aptitude'|'apt') ('addOldAptitudeLevel' | 'aoal') aptitudeId level : Add level to an old aptitude");
    }
}

