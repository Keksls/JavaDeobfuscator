/*
 * Decompiled with CFR 0.152.
 */
public final class cCF
implements adx_1<crV> {
    @Override
    public boolean a(crV crV2) {
        long l = crV2.b();
        Object t = euw_2.a.d(l);
        if (t == null) {
            return false;
        }
        int n = crV2.c();
        int n2 = crV2.d();
        ezj_1 ezj_12 = ((epq_2)t).dx().a(n);
        String string = ezj_12.b();
        String string2 = bae.h().a("buildSheet.set.notification.text", ((epq_2)t).dp(), string, n2);
        String string3 = bae.h().a("buildSheet.set.notification.title", new Object[0]);
        add_2.b().a(new dhc(string3, string2, blr_1.a));
        return false;
    }

    @Override
    public int a() {
        return 12242;
    }
}

