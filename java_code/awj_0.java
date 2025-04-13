/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aWJ
 */
public class awj_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final int e;
    private final Object[] f;

    public awj_0(int n, Object ... objectArray) {
        this.e = n;
        this.f = (Object[])objectArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.e) {
            case 0: 
            case 1: 
            case 2: {
                return this.f.length == 0;
            }
            case 3: {
                return this.f.length == 2 && this.f[0] instanceof Long && this.f[1] instanceof String;
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
        switch (this.e) {
            case 0: {
                awj_0.c();
                break;
            }
            case 1: {
                awj_0.a(aaw_22);
                break;
            }
            case 2: {
                awj_0.b(aaw_22);
                break;
            }
            case 3: {
                awj_0.a(aaw_22, (Long)this.f[0], (String)this.f[1]);
            }
        }
    }

    private static void c() {
        awj_0.a("Syntax: havenBag | hb <command>");
        awj_0.a("(help | h) : show help");
        awj_0.a("(feeInfo | fi) : show information about craft fee of current haven bag. Outside of haven bag, craft fee of current player are displayed instead");
        awj_0.a("(listItems | li) : list interactive items in the player haven bag");
        awj_0.a("(copyInteractiveItem | ci) uid \"target\" : copy the item with \"uid\" as id to the target haven bag");
    }

    private static void a(aaw_2 aaw_22) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        bsx_2 bsx_22 = bmr_12.di();
        bnh_1 bnh_12 = bsx_22 == null ? bmr_12 : bsx_22.r();
        ece_0 ece_02 = bnh_12.eX();
        boolean bl = ece_02.f();
        awj_0.a("Craftsman: " + bnh_12.dp());
        if (ece_02.e()) {
            awj_0.a("Craftsman expects fees from his guild members.");
        } else {
            awj_0.a("Free for guild.");
        }
        for (ebx_0 ebx_02 : ebx_0.values()) {
            @Nullable ebz_0 ebz_02 = ece_02.c().get((Object)ebx_02);
            String string = String.format("Step %s to %s:", ebx_02.a(), ebx_02.c());
            if (ebz_02 != null) {
                String string2 = String.format("for equipments %s kamas", ebz_02.c());
                String string3 = String.format("for components %s kamas", ebz_02.d());
                awj_0.a(String.format("%s %s and %s", string, string2, string3));
                continue;
            }
            awj_0.a(String.format("%s no fees defined%s", string, bl ? " (But prices of last step applies)" : ""));
        }
        awj_0.a("Overridden Fees:");
        for (Map.Entry entry : ece_02.d().entrySet()) {
            awj_0.a(String.format("Recipe: %s for %s kamas", entry.getKey(), entry.getValue()));
        }
    }

    private static void b(aaw_2 aaw_22) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            awj_0.a("Can't find player character");
            return;
        }
        bsx_2 bsx_22 = bmr_12.dj();
        if (bsx_22 == null) {
            awj_0.a("Can't find player haven bag");
            return;
        }
        for (ffq ffq2 : bsx_22.A()) {
            awj_0.a(ffq2.toString());
        }
    }

    private static void a(aaw_2 aaw_22, long l, String string) {
        Pt pt = new Pt();
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            awj_0.a("Can't find player character");
            return;
        }
        pt.a((byte)3);
        pt.a((short)126);
        pt.a(bmr_12.a_());
        pt.a(l);
        pt.a(string);
        aaw_22.c(pt);
    }
}

