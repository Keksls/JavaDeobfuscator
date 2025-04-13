/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from biB
 */
public class bib_1
extends bil_2 {
    private final int k;

    public bib_1(int n) {
        this.k = n;
    }

    @Override
    protected String a() {
        return bae.h().a(141, (long)this.k, new Object[0]);
    }

    @Override
    protected long b() {
        return -1L;
    }

    @Override
    protected boolean c() {
        return bxr_2.a.b(this.k) == eos_1.b;
    }

    @Override
    protected boolean f() {
        return bxr_2.a.b(this.k) == eos_1.c;
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected boolean g() {
        return false;
    }

    @Override
    protected boolean h() {
        return false;
    }

    public void j() {
        fis_1.a().a((ajf_1)this, "isCompleted", "isFailed");
    }

    public String toString() {
        return "FightChallengeGoalView{m_challengeId=" + this.k + "}";
    }
}

