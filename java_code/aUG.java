/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

public final class aUG {
    private aUG() {
    }

    public static void a(String string) {
        if (StringUtils.isEmpty((CharSequence)string)) {
            return;
        }
        aUK aUK2 = aUG.c(string);
        aUG.a(aUK2);
    }

    @Nullable
    private static aUK c(String string) {
        aUK aUK2 = aUL.a().e().a(string);
        if (aUK2 == null && (aUK2 = aUL.a().a(string)) == null) {
            aUK2 = new aUK(-1L, string, string);
        }
        return aUK2;
    }

    public static void a(aUK aUK2) {
        if (aUK2 == null) {
            return;
        }
        if (aUL.a().e().d(aUK2) != null) {
            String string = bae.h().a("contactList.error.alreadyInFriendList", aUK2.j());
            aul_0.a().b(string);
            return;
        }
        if (aUL.a().e().c() >= 100) {
            fpm_0.b().a(bae.h().a("notification.groupLimitReached", new Object[0]), cfn_0.a(1), 513L, 102, 1);
            return;
        }
        if (aUL.a().f().d(aUK2) != null) {
            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("contactList.question.friendToIgnored", new Object[0]), cfn_0.a(0), 25L, 102, 1);
            fzm_02.a(new auh_0(aUK2));
        } else {
            PE pE = new PE();
            pE.a(aUK2.j());
            azu_0.j().K().c(pE);
        }
    }

    public static void b(String string) {
        if (StringUtils.isEmpty((CharSequence)string)) {
            return;
        }
        aUK aUK2 = aUG.c(string);
        aUG.b(aUK2);
    }

    public static void b(aUK aUK2) {
        if (aUK2 == null) {
            return;
        }
        if (aUL.a().f().d(aUK2) != null) {
            String string = bae.h().a("contactList.error.alreadyInIgnoreList", aUK2.j());
            aul_0.a().b(string);
            return;
        }
        if (aUL.a().f().c() >= 100) {
            fpm_0.b().a(bae.h().a("notification.groupLimitReached", new Object[0]), cfn_0.a(1), 515L, 102, 1);
            return;
        }
        if (aUL.a().e().d(aUK2) != null) {
            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("contactList.question.ignoredToFriend", new Object[0]), cfn_0.a(0), 25L, 102, 1);
            fzm_02.a(new aui_0(aUK2));
        } else {
            PF pF = new PF();
            pF.a(aUK2.j());
            azu_0.j().K().c(pF);
        }
    }
}

