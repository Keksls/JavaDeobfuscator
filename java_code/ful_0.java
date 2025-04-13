/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.xulor2.component.mesh.GLTextGeometry;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fuL
 */
public abstract class ful_0
extends fvE
implements fqt,
fxz {
    public static final String G = "text";
    private static final double a = 0.001;
    public static final String H = "textWidget";
    private fxD b;
    protected Entity3D I;
    protected boolean J = true;
    protected String K = null;
    private static final afj_1 c = new afj_1();
    private final ArrayList<fuo_0> d = new ArrayList();
    private float e;
    private float f;
    private boolean g = false;
    private boolean h = false;
    public static final int L = 92903173;
    public static final int M = -1249482096;
    public static final int N = 3148879;
    public static final int O = 48371712;
    public static final int P = -919628796;
    public static final int Q = 1307418143;
    public static final int R = -1326227699;
    public static final int S = 400381634;
    public static final int T = -1375815020;
    public static final int U = -1206239059;
    public static final int V = 390232059;
    public static final int W = -1439500848;
    public static final int X = 3556653;
    public static final int Y = -1852365066;
    public static final int Z = 1153931755;
    public static final int aa = -1152148181;
    public static final int ab = 3744723;
    public static final int ac = 1913333550;

    public void a(fuo_0 fuo_02) {
        if (!this.d.contains(fuo_02)) {
            this.d.add(fuo_02);
        }
    }

    public void b(fuo_0 fuo_02) {
        if (this.d.contains(fuo_02)) {
            this.d.remove(fuo_02);
        }
    }

    public boolean a(fxG fxG2) {
        return this.b.a(fxG2);
    }

    public boolean b(fxG fxG2) {
        return this.b.b(fxG2);
    }

    public void j() {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.I.b(0);
        gLTextGeometry.a(-1L);
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        this.m_entity.a(this.I);
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    public fxD getTextBuilder() {
        return this.b;
    }

    protected void setTextBuilder(fxD fxD2) {
        this.b = fxD2;
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.I.b(0);
        gLTextGeometry.a(fxD2);
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.I.b(0);
        gLTextGeometry.a(azj_22);
    }

    @Override
    public azj_2 getModulationColor() {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.I.b(0);
        return gLTextGeometry.f();
    }

    @Override
    public String getText() {
        return this.b.l();
    }

    public boolean isTextReduced() {
        return this.b.x();
    }

    @NotNull
    protected String a(@Nullable Object object) {
        if (object == null) {
            return "";
        }
        if (object instanceof Number) {
            if (object instanceof Double || object instanceof Float) {
                return Oy.d().a(((Number)object).doubleValue());
            }
            return Oy.d().a(((Number)object).longValue());
        }
        return String.valueOf(object);
    }

    @Override
    @Nullable
    public String setText(@Nullable Object object) {
        String string = this.a(object);
        if (this.K != null || !this.b.a(string)) {
            this.K = string;
            this.setNeedsToPreProcess();
        }
        return this.K;
    }

    public void setZoomTween(float f2, int n) {
        this.removeTweensOfType(fuN.class);
        this.addTween(new fuN(Float.valueOf(this.e), Float.valueOf(f2), this, 0, n, fjw_2.b));
    }

    public void setTextImmediate(String string) {
        this.c(string);
        this.g();
    }

    @Override
    public void setBrightenColor(boolean bl) {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.I.b(0);
        gLTextGeometry.a(bl);
    }

    @Override
    public boolean isBrightenColor() {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.I.b(0);
        return gLTextGeometry.c();
    }

    @Override
    public void setDarkenColor(boolean bl) {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.I.b(0);
        gLTextGeometry.b(bl);
    }

    @Override
    public boolean isDarkenColor() {
        GLTextGeometry gLTextGeometry = (GLTextGeometry)this.I.b(0);
        return gLTextGeometry.e();
    }

    @Override
    public void setUseHighContrast(boolean bl) {
        this.b.a(bl);
    }

    @Override
    public boolean isUseHighContrast() {
        return this.b.d();
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equalsIgnoreCase(G)) {
            this.b.a(azj_22);
        }
    }

    @Override
    public boolean isEnableAutoZoomShrink() {
        return this.g;
    }

    @Override
    public void setEnableAutoZoomShrink(boolean bl) {
        this.g = bl;
        this.h = true;
    }

    @Override
    public void setAlign(frs_0 frs_02) {
        if (frs_02.a()) {
            this.setVerticalAlignment(fro_0.a);
        } else if (frs_02.b()) {
            this.setVerticalAlignment(fro_0.b);
        } else {
            this.setVerticalAlignment(fro_0.e);
        }
        if (frs_02.c()) {
            this.setHorizontalAlignment(fro_0.d);
        } else if (frs_02.d()) {
            this.setHorizontalAlignment(fro_0.c);
        } else {
            this.setHorizontalAlignment(fro_0.e);
        }
    }

    @Override
    public void setHorizontalAlignment(fro_0 fro_02) {
        this.b.a(fro_02);
    }

    @Override
    public void setVerticalAlignment(fro_0 fro_02) {
        this.b.b(fro_02);
    }

    @Override
    public void setOrientation(frh_0 frh_02) {
        this.b.a(frh_02);
        this.J = true;
        this.setNeedsToPostProcess();
    }

    @Override
    public frh_0 getOrientation() {
        return this.b.h();
    }

    public boolean isEnableAWTFont() {
        return this.getTextBuilder().k().j();
    }

    public void setEnableAWTFont(boolean bl) {
        this.getTextBuilder().k().c(bl);
    }

    @Override
    public void setMultiline(boolean bl) {
        this.b.d(bl);
    }

    @Override
    public boolean isMultiline() {
        return this.b.t();
    }

    @Override
    public void setMaxLines(int n) {
        this.b.c(n);
    }

    @Override
    public int getMaxLines() {
        return this.b.u();
    }

    @Override
    public void setEnableShrinking(boolean bl) {
        this.b.g(bl);
    }

    @Override
    public boolean isEnableShrinking() {
        return this.b.y();
    }

    @Override
    public void setMinWidth(int n) {
        this.b.b(n);
    }

    @Override
    public int getMinWidth() {
        return this.b.s();
    }

    @Override
    public void setMaxWidth(int n) {
        this.b.a(n);
    }

    @Override
    public int getMaxWidth() {
        return this.b.r();
    }

    @Override
    public void setFont(ayf_2 ayf_22) {
        this.b.a(ayf_22);
    }

    @Override
    public void setSize(int n, int n2) {
        this.setTextWidgetSize(n, n2, false);
    }

    public void setTextWidgetSize(int n, int n2, boolean bl) {
        super.setSize(n, n2);
        fjf_2 fjf_22 = this.m_appearance.getContentSize();
        if (this.g) {
            fjf_2 fjf_23 = this.b.I();
            float f2 = Math.min((float)fjf_22.width / (float)fjf_23.width, (float)fjf_22.height / (float)fjf_23.height);
            if (f2 < 1.0f && (double)Math.abs(this.f - f2) > 0.001) {
                this.f = f2;
                this.setNeedsToPostProcess();
            } else if (f2 >= 1.0f && (double)Math.abs(this.f - 1.0f) > 0.001) {
                this.f = 1.0f;
                this.setNeedsToPostProcess();
            }
        }
        float f3 = this.getAppliedZoom();
        if (bl) {
            this.b.b((int)((float)fjf_22.width / f3));
        }
        this.b.a((int)Math.ceil((float)fjf_22.width / f3), (int)Math.ceil((float)fjf_22.height / f3));
    }

    private float getAppliedZoom() {
        return this.e != 1.0f ? this.e : this.f;
    }

    @Override
    public void setZoom(float f2) {
        this.e = f2;
        if (this.m_containerParent != null) {
            this.m_containerParent.invalidateMinSize();
        }
        this.setNeedsToPostProcess();
    }

    @Override
    public fjf_2 getContentMinSize() {
        fjf_2 fjf_22 = this.b.H();
        fjf_22.b((int)((float)fjf_22.width * this.e));
        fjf_22.a((int)((float)fjf_22.height * this.e));
        return fjf_22;
    }

    @Override
    public void setDisplayCharDelay(long l) {
        this.b.a(l);
    }

    @Override
    public boolean isJustify() {
        return this.b.i();
    }

    @Override
    public void setJustify(boolean bl) {
        this.b.b(bl);
    }

    protected void g() {
        if (this.K != null) {
            this.b.b(this.K);
            this.k();
            this.K = null;
        }
    }

    public void k() {
        ((GLTextGeometry)this.I.b(0)).g();
    }

    @Override
    public void validate() {
        super.validate();
        if (this.b.K()) {
            this.b.V();
        }
        if (this.b.L()) {
            this.b.W();
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.J = true;
        this.setNeedsToPostProcess();
    }

    @Override
    public boolean preProcess(int n) {
        this.g();
        if (this.b.J()) {
            this.b.U();
            this.J = true;
            this.setNeedsToPostProcess();
            if (this.m_containerParent != null) {
                this.m_containerParent.invalidateMinSize();
            }
        }
        return super.preProcess(n);
    }

    @Override
    public boolean middleProcess(int n) {
        boolean bl = super.middleProcess(n);
        if (this.b.K() || this.b.L()) {
            this.invalidate();
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (!this.J) {
            return bl;
        }
        fjf_2 fjf_22 = this.b.E();
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        switch (this.getOrientation()) {
            case a: {
                f2 = this.m_appearance.getLeftInset() + fjf_22.width;
                f3 = this.m_appearance.getBottomInset();
                f4 = 1.5707964f;
                break;
            }
            case c: {
                f2 = this.m_appearance.getLeftInset();
                f3 = this.m_appearance.getBottomInset();
                f4 = 0.0f;
                break;
            }
            case b: {
                f2 = this.m_appearance.getLeftInset();
                f3 = this.m_appearance.getBottomInset() + fjf_22.height;
                f4 = -1.5707964f;
                break;
            }
            case d: {
                f2 = this.m_appearance.getLeftInset();
                f3 = this.m_appearance.getBottomInset() + fjf_22.height;
                f4 = (float)Math.PI;
                break;
            }
            default: {
                assert (false) : "We should never end here";
                break;
            }
        }
        float f5 = this.getAppliedZoom();
        this.I.D().b(0, f5, f5);
        ayx_2 ayx_22 = (ayx_2)this.I.D().c(1);
        ayx_22.a(f2, f3, 0.0f);
        c.a(afr_2.f, f4);
        ayx_22.a(c);
        this.I.D().b(1, ayx_22);
        this.J = false;
        return bl;
    }

    public void l() {
        for (int k = this.d.size() - 1; k >= 0; --k) {
            this.d.get(k).a();
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.b != null) {
            this.b.X();
            this.b = null;
        }
        this.d.clear();
        this.I.a((axt_2)null);
        this.I.b((axt_2)null);
        this.I.u();
        this.I = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        assert (this.I == null);
        this.I = (Entity3D)Entity3D.c.d();
        ayx_2 ayx_22 = new ayx_2();
        ayx_22.b();
        this.I.D().a(ayx_22);
        ayx_22 = new ayx_2();
        ayx_22.b();
        this.I.D().a(ayx_22);
        GLTextGeometry gLTextGeometry = (GLTextGeometry)GLTextGeometry.c.d();
        this.I.a(gLTextGeometry);
        gLTextGeometry.u();
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = false;
        this.h = false;
    }

    @Override
    public void copyElement(fyo fyo2) {
        ful_0 ful_02 = (ful_0)fyo2;
        super.copyElement(ful_02);
        ful_02.c(this.b.l());
        if (this.K != null) {
            ful_02.K = this.K;
        }
        ful_02.setJustify(this.b.i());
        ful_02.setMaxWidth(this.b.r());
        ful_02.setMinWidth(this.b.s());
        ful_02.setEnableShrinking(this.v());
        ful_02.setMultiline(this.s());
        ful_02.setMaxLines(this.getMaxLines());
        ful_02.setOrientation(this.getOrientation());
        ful_02.setUseHighContrast(this.u());
        ful_02.setBrightenColor(this.q());
        ful_02.setDarkenColor(this.r());
        ful_02.setZoom(this.e);
        if (this.h) {
            ful_02.setEnableAutoZoomShrink(this.g);
        }
        ful_02.setEnableAWTFont(this.isEnableAWTFont());
    }

    @Override
    public String toString() {
        return super.toString() + (String)(this.b != null ? " : " + this.getText() : "");
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 92903173) {
            this.setAlign(frs_0.a(string));
        } else if (n == -1249482096) {
            this.setJustify(Co.a(string));
        } else if (n == 3148879) {
            this.setFont(fze2.e(string));
        } else if (n == 1307418143) {
            this.setHorizontalAlignment(fro_0.a(string));
        } else if (n == 48371712) {
            this.setBrightenColor(Co.a(string));
        } else if (n == -919628796) {
            this.setDarkenColor(Co.a(string));
        } else if (n == -1326227699) {
            this.setVerticalAlignment(fro_0.a(string));
        } else if (n == 400381634) {
            this.setMaxWidth(Co.c(string));
        } else if (n == -1375815020) {
            this.setMinWidth(Co.c(string));
        } else if (n == -1206239059) {
            this.setMultiline(Co.a(string));
        } else if (n == 390232059) {
            this.setMaxLines(Co.c(string));
        } else if (n == -1439500848) {
            this.setOrientation(frh_0.a(string));
        } else if (n == 3556653) {
            this.c(fze2.a(string, this.m_elementMap));
        } else if (n == 1153931755) {
            this.setUseHighContrast(Co.a(string));
        } else if (n == -1852365066) {
            this.setEnableShrinking(Co.a(string));
        } else if (n == 3744723) {
            this.setZoom(Co.e(string));
        } else if (n == -1152148181) {
            this.setDisplayCharDelay(Co.f(string));
        } else if (n == 1913333550) {
            this.setEnableAutoZoomShrink(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3556653) {
            this.setText(object);
        } else if (n == 92903173) {
            this.setAlign((frs_0)((Object)object));
        } else if (n == -1249482096) {
            this.setJustify(Co.b(object));
        } else if (n == 3148879) {
            this.setFont((ays_1)object);
        } else if (n == 48371712) {
            this.setBrightenColor(Co.b(object));
        } else if (n == -919628796) {
            this.setDarkenColor(Co.b(object));
        } else if (n == 1307418143) {
            this.setHorizontalAlignment((fro_0)((Object)object));
        } else if (n == -1326227699) {
            this.setVerticalAlignment((fro_0)((Object)object));
        } else if (n == 400381634) {
            this.setMaxWidth(Co.c(object));
        } else if (n == -1375815020) {
            this.setMinWidth(Co.c(object));
        } else if (n == -1206239059) {
            this.setMultiline(Co.b(object));
        } else if (n == 390232059) {
            this.setMaxLines(Co.c(object));
        } else if (n == -1439500848) {
            this.setOrientation((frh_0)((Object)object));
        } else if (n == -1852365066) {
            this.setEnableShrinking(Co.b(object));
        } else if (n == 1153931755) {
            this.setUseHighContrast(Co.b(object));
        } else if (n == 3744723) {
            this.setZoom(Co.e(object));
        } else if (n == -1152148181) {
            this.setDisplayCharDelay(Co.f(object));
        } else if (n == 1913333550) {
            this.setEnableAutoZoomShrink(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

