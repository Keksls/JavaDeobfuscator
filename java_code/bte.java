/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class bte {
    private bte() {
    }

    @NotNull
    public static String a(fao_0 fao_02, int n) {
        fam_0 fam_02 = fao_02.cB();
        ani_2 ani_22 = new ani_2();
        if (fam_02.h(n)) {
            far far2 = fam_02.d(n);
            ani_22.a((CharSequence)bae.h().a("dungeon.unlockDate", new Object[0])).a((CharSequence)bae.h().c(far2.f()));
        } else if (fam_02.f(n)) {
            wu_0 wu_02 = fam_02.i(n);
            ani_22.a((CharSequence)bae.h().a("dungeon.lockedUntil", new Object[0])).a((CharSequence)bae.h().c(wu_02));
        } else if (fam_02.j(n) != 0) {
            far far3 = fam_02.d(n);
            int n2 = far3.c() - fam_02.j(n);
            wu_0 wu_03 = fam_02.i(n);
            String string = bae.h().c(wu_03);
            ani_22.a((CharSequence)bae.h().a("dungeon.remainingTriesBefore", n2, string));
        }
        if (fam_02.c(-1) && !fam_0.a(n)) {
            bte.a(fam_02, ani_22);
        }
        return ani_22.r();
    }

    private static void a(fam_0 fam_02, ani_2 ani_22) {
        int n = -1;
        if (fam_02.f(-1)) {
            if (ani_22.q() != 0) {
                ani_22.m();
            }
            ani_22.a((CharSequence)bae.h().a("dungeon.daily.locked", new Object[0]));
        } else if (fam_02.j(-1) != 0) {
            far far2 = fam_02.d(-1);
            int n2 = far2.c() - fam_02.j(-1);
            if (ani_22.q() != 0) {
                ani_22.m();
            }
            ani_22.a((CharSequence)bae.h().a("dungeon.daily.remainingTries", n2));
        } else {
            int n3 = 3;
            if (ani_22.q() != 0) {
                ani_22.m();
            }
            ani_22.a((CharSequence)bae.h().a("dungeon.daily.remainingTries", 3));
        }
    }
}

