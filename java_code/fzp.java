/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import org.apache.log4j.Logger;

public class fzp
implements fzl_0 {
    private static final Logger a = Logger.getLogger(fzp.class);
    private fsS b;
    private fvE c;
    private fsk_0 d;
    private boolean e;
    private fjg_1 f;
    private EntitySprite g;
    private int h;
    private int i;

    public fzp(fsS fsS2) {
        this.b = fsS2;
    }

    @Override
    public void a(int n, int n2, fvE fvE2) {
        if (!(this.e || n >= this.h - 20 && n <= this.h + 20 && n2 >= this.i - 20 && n2 <= this.i + 20)) {
            fqv fqv2 = new fqv();
            fqv2.onCheckOut();
            fqv2.setPixmap(new ayo_2(this.g.d()));
            this.d = new fsk_0();
            this.d.onCheckOut();
            this.d.add(fqv2);
            this.d.setSize(this.g.p(), this.g.q());
            this.d.setNonBlocking(true);
            this.d.setLayoutData(null);
            this.b.a((Object)this.f);
            fta_0.getInstance().getLayeredContainer().a(this.d, 30000);
            this.e = true;
        }
        if (this.e && this.d != null) {
            this.d.setPosition(n - this.d.getWidth() / 2, n2 - this.d.getHeight() / 2);
            if (fvE2 != this.c) {
                if (this.c != null) {
                    this.b.a(null, this.f);
                    this.c = null;
                }
                if (fvE2 != null) {
                    this.c = fvE2;
                    this.b.b(null, this.f);
                }
            }
        }
    }

    @Override
    public void b(int n, int n2, fvE fvE2) {
        if (this.e) {
            abo_1 abo_12;
            fsv_0 fsv_02 = null;
            if (fvE2 != null && (fsv_02 = fvE2 instanceof fsv_0 ? (fsv_0)fvE2 : (fsv_0)fvE2.getParentOfType(fsS.class)) == null) {
                if (!(fvE2 instanceof ftj_0)) {
                    abo_12 = fvE2.getParentOfType(ftj_0.class);
                    if (abo_12 instanceof ftj_0) {
                        fsv_02 = ((ftj_0)abo_12).getDragNDropable();
                    }
                } else {
                    fsv_02 = ((ftj_0)fvE2).getDragNDropable();
                }
            }
            if (fsv_02 != null && fsv_02.isDropValid(this.b, this.f)) {
                fsv_02.a(fsv_02, this.f, -1);
            } else {
                abo_12 = fcx_1.a(fta_0.getInstance().getCurrentAWTMouseEvent(), (fsv_0)this.b, (Object)this.f);
                this.b.dispatchEvent((fzs)abo_12);
            }
        }
        this.a();
    }

    @Override
    public void a() {
        if (this.d != null) {
            this.d.destroySelfFromParent();
            this.d = null;
        }
        this.f = null;
        this.g = null;
        this.c = null;
    }

    @Override
    public boolean b() {
        boolean bl = this.e;
        this.a();
        this.b = null;
        return bl;
    }

    @Override
    public Object c() {
        return null;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean a(fvE fvE2, int n, int n2) {
        if (fvE2 == null) {
            return false;
        }
        if (fvE2 == this.b || fvE2.hasInParentHierarchy(this.b)) {
            fjg_1 fjg_12 = this.b.getOverItem();
            return this.b.isDragEnabled() && fjg_12 != null && fjg_12.o() && (!fjg_12.n() || !fjg_12.p());
        }
        return false;
    }

    @Override
    public void a(int n, int n2) {
        this.h = n;
        this.i = n2;
        this.f = this.b.getOverItem();
        this.g = this.b.getOverMesh();
        this.e = false;
        this.c = null;
    }
}

