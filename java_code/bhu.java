/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.chat.console.command.EmoteCommand;
import java.util.Date;

public class bhu
extends bhx {
    private static final int j = 1000;
    private long k;
    private final boolean l;
    private final apc_2 m;
    private final boolean n;
    private final boolean o;
    private final String[] p;

    bhu(int n, boolean bl, boolean bl2, boolean bl3, String string, String[] stringArray, apc_2 apc_22) {
        super(n, string);
        this.l = bl;
        this.m = apc_22;
        this.n = bl && bl2;
        this.o = bl3;
        this.p = stringArray;
        this.g = true;
    }

    public void a() {
        aZx aZx2 = aul_0.a().b().j();
        if (aZx2.g().contains(this.i)) {
            return;
        }
        aZw aZw2 = new aZw(this.i, "", new EmoteCommand(this.h), false);
        aZw2.a(this.i);
        aZx2.e().a(aZw2);
    }

    public boolean b() {
        return this.l;
    }

    public boolean c() {
        return this.n;
    }

    @Override
    public String e() {
        return bae.h().a(80, (long)this.h, new Object[0]);
    }

    @Override
    public String f() {
        return azs_0.a().r(this.h);
    }

    @Override
    protected boolean g() {
        if (this.m == null) {
            return true;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        return this.m.b(bmr_12, bmr_12.P_(), this, bmr_12.Q_());
    }

    public boolean h() {
        return this.o;
    }

    public apc_2 i() {
        return this.m;
    }

    public void j() {
        long l = new Date().getTime();
        if (this.k != 0L && l - this.k < 1000L) {
            return;
        }
        this.k = l;
        dfv dfv2 = new dfv();
        dfv2.b(this.i);
        add_2.b().a(dfv2);
    }
}

