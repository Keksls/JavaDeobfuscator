/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ezN
 */
public class ezn_1 {
    private static final Logger b = Logger.getLogger(ezn_1.class);
    public static final int a = -1;

    public int a(long l, String string, int n, boolean bl) {
        return this.a(l, string, n, null, bl);
    }

    public int a(long l, String string, int n, @Nullable Integer n2, boolean bl) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("[Build][Creation] Unknown character of id " + l));
            return -1;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            b.error((Object)("[Build][Creation] Player is in fight " + l));
            return -1;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        eZb eZb2 = ((epq_2)t).dB();
        fiR fiR2 = ((epq_2)t).dw();
        ezy_2 ezy_22 = ((epq_2)t).dA();
        if (ezm_12 == null || eZb2 == null || fiR2 == null || ezy_22 == null) {
            b.error((Object)("[Build][Creation] One sheet set not found for player " + l + " : " + (ezm_12 == null ? "builds, " : "") + (eZb2 == null ? "equipments, " : "") + (fiR2 == null ? "spells, " : "") + (ezy_22 == null ? "aptitudes" : "")));
            return -1;
        }
        if (ezi_1.a(n) == null) {
            b.error((Object)("[Build][Creation] Invalid level " + n + " for player " + l));
            return -1;
        }
        if (n > 0 && n > ((epq_2)t).dt()) {
            b.error((Object)("[Build][Creation] Level " + n + " is too high for player " + l + " (real level=" + ((epq_2)t).dt() + ")"));
            return -1;
        }
        if (ezm_12.c() >= ezp_1.a()) {
            b.error((Object)("[Build][Creation] Player has reached maximum number of non-permanent builds (" + ezp_1.a() + "): " + l));
            return -1;
        }
        int n3 = ezm_12.b();
        if (eZb2.a((byte)n3) != null || fiR2.b(n3) != null || ezy_22.c(n3)) {
            b.error((Object)("[Build][Creation] The build index " + n3 + " for player " + l + " is already used by equipments or spells or aptitudes. This is really strange and must be investigated quickly."));
            return -1;
        }
        ezj_1 ezj_12 = n2 != null ? new ezj_1(string, n, n3, n2, bl) : new ezj_1(string, n, n3, bl);
        ezm_12.a(ezj_12);
        eZb2.a(n3, n);
        fiR2.a(n3, n);
        ezy_22.a(n3, n);
        return n3;
    }

    public boolean a(long l, int n) {
        return this.a(l, n, true);
    }

    public boolean a(long l, int n, boolean bl) {
        if (!this.b(l, n, bl)) {
            return false;
        }
        Object t = euw_2.a.d(l);
        ezm_1 ezm_12 = ((epq_2)t).dx();
        ezm_12.b(n);
        if (t instanceof eeg_0) {
            ((eeg_0)t).cC().a(ezm_12);
        }
        return true;
    }

    public boolean b(long l, int n) {
        return this.b(l, n, true);
    }

    public boolean b(long l, int n, boolean bl) {
        if (!this.c(l, n)) {
            return false;
        }
        Object t = euw_2.a.d(l);
        return ezn_1.a(t, ((epq_2)t).dx().a(n).c(), bl);
    }

    public static boolean a(@Nullable epq_2 epq_22, int n, boolean bl) {
        if (epq_22 == null) {
            return false;
        }
        els_0 els_02 = epq_22.ck();
        if (els_02 != null && els_02.e() != elp_0.d && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            return false;
        }
        if (els_02 != null && els_02.af_().w() && n > 0) {
            return false;
        }
        return !bl || eei_0.a(n, epq_22);
    }

    public boolean c(long l, int n) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown , characterId id=" + l));
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            b.error((Object)("Can't set active build, build sheet not found : characterId id=" + l + ", sheetIndex = " + n));
            return false;
        }
        return true;
    }

    public boolean a(long l, int n, int n2) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown , characterId id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            b.error((Object)("Setting active spelldeck error : player in fight, player id=" + l));
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            b.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        if (((epq_2)t).dw() != null && !((epq_2)t).dw().a(n2)) {
            b.error((Object)("No deck at index " + n2 + ", character id=" + l));
            return false;
        }
        if (ezm_12.e() == n) {
            ((eeg_0)t).cC().d(ezj_12);
        }
        return true;
    }

    public boolean b(long l, int n, int n2) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            b.error((Object)("Setting active aptitude sheet error : player in fight, player id=" + l));
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            b.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        Object t2 = ((epq_2)t).dA().a(n2);
        if (t2 == null) {
            b.error((Object)("No sheet at index " + n2 + ", character id=" + l));
            return false;
        }
        if (ezm_12.e() == n) {
            ((eeg_0)t).cC().e(ezj_12);
        }
        return true;
    }

    public boolean c(long l, int n, int n2) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            b.error((Object)("Setting active aptitude sheet error : player in fight, player id=" + l));
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            b.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        eyz_0 eyz_02 = ((epq_2)t).dB().a((byte)n2);
        if (eyz_02 == null) {
            b.error((Object)("No sheet at index " + n2 + ", character id=" + l));
            return false;
        }
        if (ezm_12.e() != n) {
            return true;
        }
        if (t instanceof eeg_0) {
            ((eeg_0)t).cC().c(ezj_12);
        }
        return true;
    }

    public boolean d(long l, int n, int n2) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            b.error((Object)("Setting active aptitude sheet error : player in fight, player id=" + l));
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            b.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        ezj_12.b(n2);
        return true;
    }

    @Deprecated
    public boolean e(long l, int n, int n2) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown , characterId id=" + l));
            return false;
        }
        if (n == 0) {
            b.error((Object)("Setting build sheet level error : this is the forced real level sheet, player id=" + l));
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            b.error((Object)("Setting build sheet level error : player in fight, player id=" + l));
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            b.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        if (els_02 != null && els_02.af_().w() && n2 > 0) {
            b.error((Object)("Setting build sheet level error, player in Pvp fight - can't use downscaled sheet : characterId id=" + l + ", sheetIndex = " + n));
        }
        if (ezi_1.a(n2) == null) {
            b.error((Object)"Setting build sheet level error : level not allowed");
            return false;
        }
        int n3 = ezm_12.e();
        if (n3 == n && !eei_0.a(n2, t)) {
            b.error((Object)("Setting build sheet level error : downscaled level too high in current instance, id=" + l));
            return false;
        }
        if (n2 > ((epq_2)t).dt()) {
            b.error((Object)("Setting build sheet level error : downscaled level too high for the player, id=" + l));
            return false;
        }
        ezj_12.a(n2);
        if (t instanceof eeg_0) {
            ((eeg_0)t).cC().b(ezj_12);
        }
        return true;
    }

    public boolean d(long l, int n) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("[Build][Deletion] Unknown character of id " + l));
            return false;
        }
        if (!ezn_1.a(t, n)) {
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        eZb eZb2 = ((epq_2)t).dB();
        fiR fiR2 = ((epq_2)t).dw();
        ezy_2 ezy_22 = ((epq_2)t).dA();
        int n2 = ezm_12.e();
        if (n == n2 && !this.a(((epq_2)t).a_(), 0)) {
            return false;
        }
        ezm_12.c(n);
        eZb2.a(n);
        fiR2.c(n);
        ezy_22.b(n);
        return true;
    }

    public static boolean a(@NotNull epq_2 epq_22, int n) {
        if (n == 0) {
            return false;
        }
        fjv_0 fjv_02 = ((fjw_0)fjw_0.e()).c(epq_22.T_());
        if (fjv_02 == null || fjv_02.c() || fjv_02.a()) {
            return false;
        }
        els_0 els_02 = epq_22.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            return false;
        }
        ezm_1 ezm_12 = epq_22.dx();
        eZb eZb2 = epq_22.dB();
        fiR fiR2 = epq_22.dw();
        ezy_2 ezy_22 = epq_22.dA();
        if (ezm_12 == null || eZb2 == null || fiR2 == null || ezy_22 == null) {
            b.error((Object)("[Build][Deletion] One sheet set not found for player " + epq_22.a_() + " : " + (ezm_12 == null ? "builds, " : "") + (eZb2 == null ? "equipments, " : "") + (fiR2 == null ? "spells, " : "") + (ezy_22 == null ? "aptitudes" : "")));
            return false;
        }
        if (ezm_12.g() < 2) {
            return false;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            return false;
        }
        return !ezj_12.f();
    }

    public void e(long l, int n) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown , characterId id=" + l));
            return;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null && els_02.e() != elp_0.b && els_02.e() != elp_0.e) {
            b.error((Object)("Cleaning build sheet error : player in fight, player id=" + l));
            return;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            b.error((Object)("BuildSheet not found : player id=" + l));
            return;
        }
        int n2 = ezj_12.e();
        int n3 = ezj_12.e();
        int n4 = ezj_12.e();
        int n5 = ezj_12.c();
        ezy_2 ezy_22 = ((epq_2)t).dA();
        if (ezy_22 == null) {
            b.error((Object)("AptitudeSheetSet not found : player id=" + l));
            return;
        }
        Object t2 = ezy_22.a(n2);
        if (t2 == null) {
            this.b(l, n, -1);
        } else if (n5 > 0) {
            short s2 = ((ezx_2)t2).e();
            n5 = Hw.a(n5, (int)s2, new int[0]);
        }
        fiR fiR2 = ((epq_2)t).dw();
        if (fiR2 == null) {
            b.error((Object)("SpellDeckSet not found : player id=" + l));
            return;
        }
        fiO fiO2 = fiR2.b(n3);
        if (fiO2 == null) {
            this.a(l, n, -1);
        } else if (n5 > 0) {
            int n6 = fiO2.b();
            n5 = Hw.a(n5, n6, new int[0]);
        }
        eZb eZb2 = ((epq_2)t).dB();
        if (eZb2 == null) {
            b.error((Object)("EquipmentSheetSet not found : player id=" + l));
            return;
        }
        eyz_0 eyz_02 = eZb2.a((byte)n4);
        if (eyz_02 == null) {
            this.c(l, n, -1);
        } else if (n5 > 0) {
            short s3 = eyz_02.c();
            n5 = Hw.a(n5, (int)s3, new int[0]);
        }
        if (ezj_12.c() != n5) {
            this.e(l, n, n5);
        }
    }

    @Contract(value="_, null, _ -> false")
    public boolean a(long l, @Nullable ezj_1 ezj_12, @NotNull String string) {
        if (ezj_12 == null) {
            return false;
        }
        String string2 = ezj_12.b();
        if (string.equals(string2)) {
            return false;
        }
        if (string.length() > 20) {
            return false;
        }
        ezj_12.a(string);
        return true;
    }

    public boolean f(long l, int n, int n2) {
        if (n == n2) {
            return false;
        }
        if (n < 1 || n2 < 1) {
            return false;
        }
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown , characterId id=" + l));
            return false;
        }
        fjv_0 fjv_02 = ((fjw_0)fjw_0.e()).c(((epq_2)t).T_());
        if (fjv_02 == null || fjv_02.c() || fjv_02.a()) {
            return false;
        }
        els_0 els_02 = t.ck();
        if (els_02 != null) {
            b.warn((Object)"Swap build in fight is prohibited");
            return false;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return false;
        }
        ezj_1 ezj_12 = ezm_12.a(n);
        if (ezj_12 == null) {
            b.error((Object)("Unknown Sheet, index " + n + ", character id=" + l));
            return false;
        }
        ezj_1 ezj_13 = ezm_12.a(n2);
        if (ezj_13 == null) {
            b.error((Object)("Unknown Sheet, index " + n2 + ", character id=" + l));
            return false;
        }
        ezm_12.a(n2, ezj_12);
        ezm_12.a(n, ezj_13);
        ezj_12.c(n2);
        ezj_13.c(n);
        if (ezm_12.e() == n) {
            ezm_12.b(n2);
        } else if (ezm_12.e() == n2) {
            ezm_12.b(n);
        }
        if (ezm_12.f() == n) {
            ezm_12.d(n2);
        } else if (ezm_12.f() == n2) {
            ezm_12.d(n);
        }
        return true;
    }

    public void a(long l) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown , characterId id=" + l));
            return;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return;
        }
        ezm_12.d(ezm_12.e());
    }

    public void b(long l) {
        Object t = euw_2.a.d(l);
        if (t == null) {
            b.error((Object)("Character unknown , characterId id=" + l));
            return;
        }
        ezm_1 ezm_12 = ((epq_2)t).dx();
        if (ezm_12 == null) {
            b.error((Object)("BuildSheetSet not found : player id=" + l));
            return;
        }
        int n = ezm_12.f();
        if (n == -2) {
            b.error((Object)"Trying to restore a previous build but there is no registered previous build");
            return;
        }
        this.a(l, n);
        ezm_12.d(-2);
    }

    @NotNull
    @Contract(pure=true)
    public static String a(@NotNull String string) {
        String string2 = Cz.q(string);
        if (string2.length() > 20) {
            return string2.substring(0, 20);
        }
        return string2;
    }
}

