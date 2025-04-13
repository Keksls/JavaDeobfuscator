/*
 * Decompiled with CFR 0.152.
 */
public class bKJ
extends bkp_0 {
    public bKJ(short s2, short s3, bkk_0 bkk_02) {
        super(s2, s3, bkk_02::c);
    }

    @Override
    public bKG aV_() {
        return bKG.b;
    }

    @Override
    public void a(faC faC2) {
        if (!this.a()) {
            this.b(faC2);
            return;
        }
        faC2.a((short)this.a);
        faC2.b((short)this.b);
    }

    @Override
    protected void b(faC faC2) {
        faC2.a((short)-1).b((short)-1);
    }

    @Override
    public String b() {
        short s2;
        short s3 = (short)this.a(0L);
        if (s3 == (s2 = (short)this.b(245L))) {
            return bae.h().a("levelShort.custom", s3);
        }
        return bae.h().a("levelShort.custom", s3 + " - " + s2);
    }
}

