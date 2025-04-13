/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.RenderTree;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class acG
extends acb_0
implements aeh_0 {
    private static final Logger n = Logger.getLogger(acG.class);
    private short I = (short)-1;
    private boolean J = true;
    private ace_0 K;

    private acG(aug_2 aug_22) {
        super(aug_22, null);
        this.a(false);
    }

    public acG() {
        super((aug_2)RenderTree.a.c(), acs_0.a());
        this.a(false);
    }

    private ach_0 N() {
        return (ach_0)this.z;
    }

    @Override
    protected ahm_0 a() {
        return new ach_0(this);
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean d(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean e(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean f(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        return false;
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return false;
    }

    @Override
    public boolean a(FocusEvent focusEvent) {
        return false;
    }

    @Override
    public boolean b(FocusEvent focusEvent) {
        return false;
    }

    @Override
    protected void h() {
    }

    @Override
    public void a(int n) {
        if (!this.c(n)) {
            return;
        }
        this.e(n);
        this.d(true);
        this.b(n);
        this.f.a();
        this.k();
        this.v.clear();
        this.w.clear();
    }

    @Override
    protected void a(Entity entity) {
        this.f.a(entity);
    }

    @Override
    protected void d(int n) {
        throw new UnsupportedOperationException("pas de light sur les map de d\u00e9cor de fond");
    }

    @Override
    public void d(boolean bl) {
        this.g.a(this.z.n());
    }

    @Override
    protected void a(float f2, float f3) {
        this.g.a(this);
    }

    @Override
    public boolean l() {
        return !this.u() || this.g.h();
    }

    public void t() {
        this.a((short)-1, 0.0f, 0.0f, 0.0f);
    }

    public void a(short s2, float f2) {
        this.a(s2, f2, f2, 1.0f);
    }

    public void a(short s2, float f2, float f3) {
        this.a(s2, f2, f2, f3);
    }

    public void a(short s2, float f2, float f3, float f4) {
        this.b(true);
        this.K.b(this);
        this.I = s2;
        if (this.u()) {
            abY abY2 = this.K.b();
            this.N().a(abY2, f2, f3, f4);
            this.g.a(YX.a(s2));
            this.g.a((long)s2);
            this.a(true);
            this.j(true);
            this.K.a(this);
        }
    }

    public void a(oo_0 oo_02) {
        this.J = oo_02.c;
        this.a(oo_02.b, oo_02.d, oo_02.f, oo_02.e);
    }

    public boolean u() {
        return this.I != -1;
    }

    public void a(@NotNull ace_0 ace_02) {
        this.K = ace_02;
    }

    public boolean v() {
        return this.J;
    }

    private void e(int n) {
        if (this.K == null) {
            return;
        }
        abY abY2 = this.K.b();
        this.N().a(abY2, this.J, n);
    }

    @Override
    protected acb_0 a(aug_2 aug_22) {
        return new acG(aug_22);
    }

    @Override
    public void a(ahm_0 ahm_02, ArrayList<aek_0> arrayList) {
        try {
            this.g.a(ahm_02, arrayList);
        }
        catch (Exception exception) {
            n.error((Object)"[Parallax] Error when querying visible objects", (Throwable)exception);
        }
    }
}

