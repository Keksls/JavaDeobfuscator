/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from blF
 */
public class blf_2
extends blk_1 {
    private static final Logger j = Logger.getLogger(blf_2.class);
    private final blg_2 k;
    private boolean l = true;

    public blf_2(blg_2 blg_22) {
        this.k = blg_22;
    }

    public int h() {
        return this.k.b();
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        if (string.equals("item")) {
            return eyo_1.g().d(this.k.c());
        }
        if (string.equals("quantity")) {
            return this.k.d();
        }
        if (string.equals("xp")) {
            if (this.k.g() <= 0) {
                return null;
            }
            return fla_0.a(this.k.g());
        }
        if (string.equals("boosterXp")) {
            if (this.k.g() <= 0) {
                return null;
            }
            return fla_0.b(this.k.g());
        }
        if (string.equals("kama")) {
            return bae.h().a("kama.gain", this.k.a());
        }
        if (string.equals("xpIconUrl")) {
            return this.f();
        }
        if (string.equals("rankDescription")) {
            return bae.h().a("challenge.reward.rank." + this.k.f(), new Object[0]);
        }
        return null;
    }

    @Override
    protected ezr_0 a() {
        return eyo_1.g().d(this.k.c());
    }

    @Override
    protected int b() {
        return this.k.d();
    }

    @Override
    protected int c() {
        return this.k.g();
    }

    @Override
    protected int e() {
        return this.k.a();
    }

    @Override
    protected String f() {
        try {
            return String.format(azs_0.a().a("rewardTypeIconsPath"), bhn_1.f.b());
        }
        catch (gm_0 gm_02) {
            j.warn((Object)gm_02.getMessage(), (Throwable)gm_02);
            return null;
        }
    }

    @Override
    protected String g() {
        return bae.h().a("challenge.reward.rank." + this.k.f(), new Object[0]);
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public boolean i() {
        return this.l;
    }

    public boolean j() {
        return this.k.e();
    }
}

