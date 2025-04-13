/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxZ
 */
public class bxz_1
extends eQk {
    public bxz_1(erg_1 erg_12) {
        super(erg_12);
    }

    @Override
    public void a(long l, int n) {
        erl_1 erl_12 = this.a().a(l);
        int n2 = erl_12.c();
        super.a(l, n);
        int n3 = erl_12.c();
        if (n2 == n3) {
            return;
        }
        if (erl_12.a() != azu_0.j().k().a_()) {
            return;
        }
        aUh.b("guild.chatPointsGain", n3 - n2);
    }

    @Override
    public void a(long l, long l2) {
        erl_1 erl_12 = this.a().a(l);
        long l3 = erl_12.d();
        super.a(l, l2);
        if (l2 == l3) {
            return;
        }
        Object t = euw_2.a.d(l);
        if (t == null) {
            return;
        }
        ern_1 ern_12 = this.a().c(l2);
        if (ern_12 == null) {
            return;
        }
        String string = ern_12.b();
        String string2 = bae.h().a("notification.guildRankChangeText", ((epq_2)t).dp(), string);
        dbo_0.a.a(string2, 4);
    }

    @Override
    public void a(long l) {
        super.a(l);
        euw_2.a.a(azu_0.j().k().U_(), bmr_12 -> {
            if (this.a().a(bmr_12.a_()) != null) {
                bmr_12.m(l);
            }
            return true;
        });
    }
}

