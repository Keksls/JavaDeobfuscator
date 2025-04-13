/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLDrawable
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.google.common.collect.Lists;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLDrawable;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;

public class fyX
extends azy_2
implements ano_1 {
    private static final Logger b = Logger.getLogger(fyX.class);
    private static final float c = 15.0f;
    private fdn_2 d;
    private fta_0 e;
    private final Collection<anp_1> f = new ArrayList<anp_1>();
    private final List<fyY> g = new ArrayList<fyY>();
    private int h;
    private int i;
    private static final ayv_2 j = new ayx_2();
    private static final int[] k = new int[]{0, 1, 2, 3};
    private static final boolean l = false;
    private static final int m = 5;
    private static final long n = 3000000L;
    public static int a;
    private static long o;
    private static boolean p;

    public fyX() {
        this.a(fpm_0.b());
    }

    @Override
    public void a(anp_1 anp_12) {
        if (!this.f.contains(anp_12)) {
            this.f.add(anp_12);
        }
    }

    @Override
    public void b(anp_1 anp_12) {
        if (this.f.contains(anp_12)) {
            this.f.remove(anp_12);
        }
    }

    public void a(fyY fyY2) {
        if (!this.g.contains(fyY2)) {
            this.g.add(fyY2);
        }
    }

    public void b(fyY fyY2) {
        if (this.g.contains(fyY2)) {
            this.g.remove(fyY2);
        }
    }

    @Override
    public void a(int n, int n2) {
        fjt_1 fjt_12;
        super.a(n, n2);
        int n3 = (int)((float)n / this.F);
        int n4 = (int)((float)n2 / this.F);
        int n5 = n3 - this.h;
        int n6 = n4 - this.i;
        this.h = n3;
        this.i = n4;
        if (this.d != null) {
            this.d.a(this.h, this.i);
        }
        if (this.e != null) {
            this.e.setSize(this.h, this.i);
        }
        if ((fjt_12 = fpm_0.b().d()) != null) {
            fjt_12.d();
        }
        this.b(n5, n6);
    }

    @Override
    public void j(float f2) {
        super.j(f2);
        if (this.e != null) {
            this.a(this.e.getEntity());
        }
    }

    public void a(float f2, int n) {
        this.G = f2 + fyX.a(n);
        this.a(this.C.getSurfaceWidth(), this.C.getSurfaceHeight());
    }

    public static float a(float f2) {
        return f2 / 15.0f;
    }

    public fta_0 a() {
        return this.e;
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
        try {
            super.a(gLAutoDrawable);
            ((Component)gLAutoDrawable).setFocusTraversalKeysEnabled(false);
            this.d = fdn_2.a();
            this.d.a(this.h, this.i);
            this.d.a((GLDrawable)gLAutoDrawable);
            fya_0 fya_02 = fpm_0.b().h();
            fyy_0 fyy_02 = fya_02.a("masterRootContainer");
            this.e = fta_0.getInstance();
            this.e.onCheckOut();
            this.e.setSize(this.h, this.i);
            this.e.setElementMap(fyy_02);
            this.e.getEntity().D().b(0, this.F, this.F);
            this.d();
        }
        catch (Throwable throwable) {
            b.error((Object)"Exception during XulorScene init", throwable);
        }
    }

    private void a(GL2 gL2) {
        avx_2 avx_22 = auj_1.a.a();
        axr_2 axr_22 = axr_2.a();
        avx_22.i.a(0);
        axr_22.a(true);
        axr_22.a(axn_2.e, axn_2.f);
        axr_22.a(1.0f);
        axr_22.a(gL2, axp_2.b, Matrix44.b);
        axr_22.a(gL2, axp_2.a, Matrix44.b);
        aad_2 aad_22 = this.D();
        axr_22.a(gL2, aad_22);
        j.b();
        float f2 = (float)(this.e.getWidth() - aad_22.c()) / 2.0f;
        float f3 = (float)(this.e.getHeight() - aad_22.d()) / 2.0f - (float)this.e.getHeight();
        j.a(f2, f3, 0.0f);
        avx_22.b(j.a());
        axr_2.a().e();
    }

    @Override
    public void b(GL2 gL2) {
        if (!auc_1.a().b()) {
            return;
        }
        this.a(gL2);
        avx_2 avx_22 = auj_1.a.a();
        try {
            if (this.e != null && this.e.getVisible()) {
                this.e.getEntity().c(avx_22);
            }
            int n = this.g.size();
            for (int k = 0; k < n; ++k) {
                this.g.get(k).a(avx_22, this.d);
            }
        }
        catch (Throwable throwable) {
            b.error((Object)"Exception during XulorScene display", throwable);
        }
    }

    public static boolean b() {
        return true;
    }

    public static void c() {
    }

    @Override
    public void a(int n) {
        aui_1.a().a(0);
        if (!auc_1.a().b()) {
            return;
        }
        if (this.e != null && !this.e.getVisible()) {
            return;
        }
        try {
            super.a(n);
            this.d(n);
            if (this.e == null) {
                return;
            }
            if (fyi_0.a().d()) {
                fyi_0.a().b();
            }
            fyi_0.a().e();
            fyP.a().a(n);
            fdq_2.a.a(n);
        }
        catch (Throwable throwable) {
            b.error((Object)"Exception during XulorScene process", throwable);
        }
    }

    public void a(Entity entity) {
        entity.D().b(0, this.F, this.F);
    }

    public void a(azt_1 azt_12) {
        azt_12.c((int)((float)azt_12.d() * this.F));
        azt_12.d((int)((float)azt_12.e() * this.F));
        azt_12.b((int)((float)azt_12.c() * this.F));
        azt_12.a((int)((float)azt_12.b() * this.F));
    }

    public int b(int n) {
        return (int)((float)n / this.F);
    }

    public int c(int n) {
        return (int)((float)n / this.F);
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        return this.e != null && this.e.getVisible() && this.e.a(keyEvent);
    }

    @Override
    public boolean c(KeyEvent keyEvent) {
        return this.e != null && this.e.getVisible() && this.e.b(keyEvent);
    }

    @Override
    public boolean a(KeyEvent keyEvent) {
        return this.e != null && this.e.getVisible() && this.e.c(keyEvent);
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
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
        if (!this.e(mouseEvent.getButton())) {
            return false;
        }
        if (this.e != null && this.e.getVisible()) {
            MouseEvent mouseEvent2 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), this.b(mouseEvent.getX()), this.c(mouseEvent.getY()), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
            return this.e.a(mouseEvent2);
        }
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        if (this.e != null && this.e.getVisible()) {
            MouseEvent mouseEvent2 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), this.b(mouseEvent.getX()), this.c(mouseEvent.getY()), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
            return this.e.a(mouseEvent2);
        }
        return false;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        if (!this.e(mouseEvent.getButton())) {
            return false;
        }
        if (this.e != null && this.e.getVisible()) {
            MouseEvent mouseEvent2 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), this.b(mouseEvent.getX()), this.c(mouseEvent.getY()), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
            return this.e.b(mouseEvent2);
        }
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        if (!this.e(mouseEvent.getButton())) {
            return false;
        }
        if (this.e != null && this.e.getVisible()) {
            MouseEvent mouseEvent2 = new MouseEvent(mouseEvent.getComponent(), mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiersEx(), this.b(mouseEvent.getX()), this.c(mouseEvent.getY()), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger(), mouseEvent.getButton());
            return this.e.c(mouseEvent2);
        }
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        if (this.e != null && this.e.getVisible()) {
            MouseWheelEvent mouseWheelEvent2 = new MouseWheelEvent(mouseWheelEvent.getComponent(), mouseWheelEvent.getID(), mouseWheelEvent.getWhen(), mouseWheelEvent.getModifiersEx(), this.b(mouseWheelEvent.getX()), this.c(mouseWheelEvent.getY()), mouseWheelEvent.getClickCount(), mouseWheelEvent.isPopupTrigger(), mouseWheelEvent.getScrollType(), mouseWheelEvent.getScrollAmount(), mouseWheelEvent.getWheelRotation());
            return this.e.a(mouseWheelEvent2);
        }
        return false;
    }

    private boolean e(int n) {
        for (int n2 : k) {
            if (n != n2) continue;
            return true;
        }
        return false;
    }

    protected void d() {
        ArrayList arrayList = Lists.newArrayList(this.f);
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            ((anp_1)arrayList.get(k)).a(this);
        }
    }

    protected void d(int n) {
        ArrayList arrayList = Lists.newArrayList(this.f);
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            ((anp_1)arrayList.get(k)).a(this, n);
        }
    }

    protected void b(int n, int n2) {
        ArrayList arrayList = Lists.newArrayList(this.f);
        int n3 = arrayList.size();
        for (int k = 0; k < n3; ++k) {
            ((anp_1)arrayList.get(k)).a(this, n, n2);
        }
    }

    @Override
    public boolean a(FocusEvent focusEvent) {
        fyc_0.a().a(true);
        return false;
    }

    @Override
    public boolean b(FocusEvent focusEvent) {
        fyc_0.a().a(false);
        fpm_0.b().f().d();
        fta_0.getInstance().setMovePointMode(false);
        return false;
    }
}

