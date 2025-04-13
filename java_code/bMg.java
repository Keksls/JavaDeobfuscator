/*
 * Decompiled with CFR 0.152.
 */
public class bMg
extends biE {
    private final ffu_0 aJ;
    private final biI aK;

    public bMg(ffu_0 ffu_02) {
        super(abd_1.c());
        this.aJ = ffu_02;
        this.aK = null;
    }

    public bMg(ffu_0 ffu_02, biI biI2) {
        super(abd_1.c());
        this.aJ = ffu_02;
        this.aK = biI2;
    }

    @Override
    public void a(Uk uk) {
    }

    @Override
    public String g() {
        return this.aJ.b();
    }

    @Override
    public boolean bj() {
        return this.aK != null && this.aK.bj();
    }

    @Override
    public boolean at() {
        if (this.aJ.a().k()) {
            return false;
        }
        if (this.aK == null) {
            return true;
        }
        boolean bl = this.aK.at() && this.aK.az() <= 0;
        return super.at() && bl;
    }

    @Override
    public int bo() {
        return this.aK.bk().a(this.aK);
    }

    @Override
    public int bm() {
        return this.aK.bk().a(this.aK);
    }

    @Override
    protected apl_1 a(bsx_2 bsx_22, apl_1 apl_12) {
        return bsx_22.a(this.aK.bI(), apl_12);
    }

    @Override
    public boolean aE() {
        return false;
    }

    public String toString() {
        return "PetActor{m_pet=" + this.aJ + ", m_playerActor=" + (this.aK == null ? null : this.aK.bI()) + "}";
    }

    public void a(fgf fgf2) {
        if (fgf2 != null) {
            fgf2.a(new bMh(this));
            this.E();
        }
    }
}

