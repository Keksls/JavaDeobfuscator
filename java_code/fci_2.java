/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fCI
 */
public class fci_2
extends fcb_2 {
    private static final Logger i = Logger.getLogger(fci_2.class);
    private int j;
    private int k;
    private int r;
    private int s;
    private static final ObjectPool t = new abm_1(new fcj_2());

    public static fci_2 a(fck_2 fck_22, fyb_0 fyb_02, frd_0 frd_02, fjg_1 fjg_12, EntitySprite entitySprite) {
        fci_2 fci_22;
        try {
            fci_22 = (fci_2)t.borrowObject();
            fci_22.a = t;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fci_22 = new fci_2();
            fci_22.onCheckOut();
        }
        fci_22.e(fck_22.o);
        fci_22.f(fck_22.p);
        fci_22.b(fck_22.l);
        fci_22.c(fck_22.m);
        fci_22.d(fck_22.n);
        fci_22.b(fck_22.g());
        fci_22.c(fyb_02);
        fci_22.a(frd_02);
        fci_22.a(fjg_12);
        fci_22.a(entitySprite);
        return fci_22;
    }

    public int k() {
        return this.j;
    }

    public int l() {
        return this.k;
    }

    public int m() {
        return this.r;
    }

    public int n() {
        return this.s;
    }

    public fjg_1 o() {
        return (fjg_1)this.j();
    }

    private void a(EntitySprite entitySprite) {
        this.j = (int)entitySprite.r();
        this.k = (int)entitySprite.s();
        this.r = entitySprite.p();
        this.s = entitySprite.q();
    }
}

