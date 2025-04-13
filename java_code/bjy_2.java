/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.EnumMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bJy
 */
public final class bjy_2
implements asa_2<asu_2, bjw_1> {
    private static final Logger b = Logger.getLogger(bjy_2.class);
    private final eyo_1 c = eyo_1.g();

    public bjw_1 b(asu_2 asu_22) {
        assert (asu_22 != null);
        asm_0 asm_02 = (asm_0)asu_22;
        bjw_1 bjw_12 = bjy_2.a(asm_02);
        this.c.a(bjw_12);
        return bjw_12;
    }

    private static bjw_1 a(asm_0 asm_02) {
        EnumMap<exz_1, apc_2> enumMap = bjy_2.b(asm_02);
        bjw_1 bjw_12 = bhw_0.a(asm_02, enumMap);
        bjy_2.c(asm_02, bjw_12);
        bjy_2.a(asm_02, bjw_12);
        bjy_2.b(asm_02, bjw_12);
        return bjw_12;
    }

    private static void a(asm_0 asm_02, ezr_0<bhg_0> ezr_02) {
        int n = asm_02.c();
        for (aSn aSn2 : asm_02.G()) {
            eyx_1 eyx_12 = eyx_1.a(aSn2.b());
            big_1 big_12 = bie_1.a(aSn2.a(), eyx_12);
            if (big_12 != null) {
                apc_2 apc_22 = null;
                try {
                    apc_22 = eyS.c(aSn2.g());
                }
                catch (Exception exception) {
                    b.error((Object)("Erreur de compilation du crit\u00e8rre sur l'action id=" + aSn2.b() + " de l'item id=" + n), (Throwable)exception);
                }
                big_12.a(aSn2.h());
                big_12.a(apc_22);
                big_12.b(aSn2.c());
                big_12.c(aSn2.d());
                big_12.d(aSn2.e());
                big_12.e(eyx_12.a());
                big_12.a(aSn2.f());
                ezr_02.a(big_12);
                ezr_02.e(true);
                if (!(big_12 instanceof bjr_2)) continue;
                bjy_2.a((bjr_2)big_12);
                continue;
            }
            b.error((Object)("Chargement d'une action d'un type inconnu sur un item actionId=" + aSn2.b() + " referenceItemId=" + ezr_02.n()));
        }
    }

    private static void a(bjr_2 bjr_22) {
        bjr_22.g().forEach((n, l) -> eum_1.a().a((int)n, (long)l));
    }

    private static void b(asm_0 asm_02, ezr_0<bhg_0> ezr_02) {
        ate_0 ate_02 = new ate_0();
        for (int n : asm_02.F()) {
            try {
                if (!asw_2.a().a(n, ate_02)) continue;
                efh_0 efh_02 = bgh_0.a().c(n);
                if (efh_02 != null) {
                    ezr_02.a(efh_02);
                    continue;
                }
                b.error((Object)("Probl\u00e8me de chargement du ReferenceItem " + asm_02.c()));
            }
            catch (Exception exception) {
                b.error((Object)("Exception au chargement de l'effet " + n), (Throwable)exception);
            }
        }
    }

    private static void c(asm_0 asm_02, ezr_0<bhg_0> ezr_02) {
        int n = asm_02.c();
        for (int n2 : asm_02.x()) {
            ext_1 ext_12 = ext_1.a(n2);
            if (ext_12 == null) {
                b.error((Object)("Impossible de trouver la propri\u00e9t\u00e9 " + n2 + " d\u00e9finie pour l'item " + n));
                continue;
            }
            ezr_02.a(ext_12);
        }
    }

    private static EnumMap<exz_1, apc_2> b(asm_0 asm_02) {
        int n = asm_02.c();
        EnumMap<exz_1, apc_2> enumMap = new EnumMap<exz_1, apc_2>(exz_1.class);
        String[] stringArray = asm_02.i();
        if (stringArray != null) {
            int n2 = stringArray.length / 2;
            for (int k = 0; k < n2; ++k) {
                apc_2 apc_22;
                exz_1 exz_12;
                String string = stringArray[2 * k];
                String string2 = stringArray[2 * k + 1];
                try {
                    exz_12 = exz_1.valueOf(string);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    b.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration d'une action : type d'action inconnu : '" + string + "' Item : " + n), (Throwable)illegalArgumentException);
                    continue;
                }
                try {
                    apc_22 = eyS.c(string2);
                }
                catch (Exception exception) {
                    b.error((Object)("Erreur lors de la compilation du crit\u00e8re sur l'action " + exz_12 + " de l'item " + n), (Throwable)exception);
                    continue;
                }
                enumMap.put(exz_12, apc_22);
            }
        }
        return enumMap;
    }

    @Override
    public /* synthetic */ Object a(asu_2 asu_22) {
        return this.b(asu_22);
    }
}

