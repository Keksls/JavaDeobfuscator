/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bao
 */
public abstract class bao_0
extends alc_1
implements afy_0 {
    private static final Logger e = Logger.getLogger(bao_0.class);

    protected bao_0(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        adi_2.a().a(this.l);
        this.j();
    }

    @Override
    public boolean a(adt_1 adt_12) {
        e.warn((Object)"le personnage n'est pas encore arriv\u00e9 a destination, le timer termine l'action.");
        return super.a(adt_12);
    }
}

