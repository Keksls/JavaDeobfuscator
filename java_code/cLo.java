/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cLo
extends cLm<fkr_0> {
    private static final Logger b = Logger.getLogger(cLo.class);
    private final short c;
    private final short d;

    public cLo(fkr_0 fkr_02, short s2, short s3) {
        super(fkr_02);
        this.c = s2;
        this.d = s3;
    }

    @Override
    public cLn a() {
        return cLn.c;
    }

    @Override
    public void a(fkj_0 fkj_02) {
        fkj_02.a(((fkr_0)this.a).e());
    }

    @Override
    public void a(cks_2 cks_22) {
        cks_22.a(this.a);
        esy_2 esy_22 = ((fkr_0)this.a).e();
        cks_22.a(new cdj_1(esy_22.c(), esy_22.d(), esy_22.e(), this.c, this.d));
    }

    @Override
    public void b(cks_2 cks_22) {
        esy_2 esy_22 = ((fkr_0)this.a).e();
        cks_22.a(new cdj_1(esy_22.c(), esy_22.d(), esy_22.e(), esy_22.h(), esy_22.i()));
    }
}

