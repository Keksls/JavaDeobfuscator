/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public abstract class fdg {
    private static final Logger b = Logger.getLogger(fdg.class);
    protected final faU a;

    protected fdg(faU faU2) {
        this.a = faU2;
    }

    public faU a() {
        return this.a;
    }

    public List<fde> b() {
        epq_2 epq_22 = (epq_2)this.a;
        faX faX2 = epq_22.fH();
        return faX2.m().b(this);
    }

    public void c() {
        epq_2 epq_22 = (epq_2)this.a;
        faX faX2 = epq_22.fH();
        if (faX2 == null) {
            return;
        }
        try {
            faX2.m().a(this);
        }
        catch (Exception exception) {
            b.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public abstract fdh_0 d();
}

