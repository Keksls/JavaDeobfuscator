/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cLj
extends cLm<fkw> {
    private static final Logger b = Logger.getLogger(cLj.class);
    private final short c;

    public cLj(fkw fkw2, short s2) {
        super(fkw2);
        this.c = s2;
    }

    @Override
    public cLn a() {
        return cLn.a;
    }

    @Override
    public void a(fkj_0 fkj_02) {
        fkj_02.a(((fkw)this.a).e(), ((fkw)this.a).g(), ((fkw)this.a).h());
    }

    @Override
    public void a(cks_2 cks_22) {
        etn_2 etn_22 = eti_2.a.d(this.c);
        if (etn_22 != null) {
            cks_22.a(etn_22, ((fkw)this.a).e(), ((fkw)this.a).g());
            cks_22.b();
        }
    }

    public short b() {
        return this.c;
    }

    @Override
    public void b(cks_2 cks_22) {
    }
}

