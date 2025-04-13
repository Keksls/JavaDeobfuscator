/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Rectangle;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.font.TextHitInfo;
import java.awt.im.InputMethodRequests;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fuG
 */
public class fug_0
extends frB
implements fxy,
InputMethodListener,
InputMethodRequests {
    public static final String TAG = "TextEditor";
    public static final String f = "ghostText";
    public static final String g = "focus";
    public static final String h = "ghostText";
    public static final String i = "default";
    protected String j;
    protected String k;
    protected fwn<String, ?> l;
    protected boolean m = false;
    protected boolean n;
    protected boolean o = true;
    protected boolean p = false;
    protected azj_2 q = fxD.a;
    protected azj_2 r = null;
    protected fqj s = null;
    protected fqj t = null;
    protected fqj u = null;
    @NotNull
    private final List<fxG> ae = new ArrayList<fxG>();
    private final fxG af = (string, string2) -> {
        if (this.n && !Objects.equals(string2, this.k)) {
            this.d(false);
        }
        this.A();
        if (this.m != this.n) {
            this.h();
        }
        if (!this.ae.isEmpty()) {
            String string3 = this.m ? "" : string;
            String string4 = this.n ? "" : string2;
            this.ae.forEach(fxG2 -> fxG2.onTextChanged(string3, string4));
        }
        this.m = this.n;
    };
    public static final int v = 1249389695;
    public static final int w = 381878489;
    public static final int x = 73055982;
    public static final int y = 1216985755;
    public static final int z = -336545092;
    public static final int A = 1602416228;
    public static final int B = 1453943993;
    public static final int C = -1784789924;
    public static final int D = 534924003;
    public static final int E = 105252970;
    public static final int F = "listFilter".hashCode();

    @Override
    public fqh_0 getAppearance() {
        if (this.m_appearance instanceof fqh_0) {
            return (fqh_0)this.m_appearance;
        }
        if (this.m_appearance != null) {
            m_logger.warn((Object)String.format("Unexpected appearance type for %s (Expected : %s, current : %s)", this.getClass(), fqh_0.class, this.m_appearance.getClass()));
            return null;
        }
        return null;
    }

    @Override
    public boolean mustReuseCurrentAppearanceDuringParsing() {
        return false;
    }

    @Override
    public boolean setAppearanceOnAdd() {
        return false;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqj) {
            if (fyb_02 instanceof fqc_0) {
                fqj fqj2;
                fqc_0 fqc_02 = (fqc_0)fyb_02;
                switch (fqc_02.getIdentifier()) {
                    case "ghostText": {
                        fqj2 = this.t;
                        this.t = fqc_02;
                        break;
                    }
                    case "focus": {
                        fqj2 = this.u;
                        this.u = fqc_02;
                        break;
                    }
                    default: {
                        fqj2 = this.s;
                        this.s = fqc_02;
                    }
                }
                this.a(fqj2, fqc_02);
            } else if (fyb_02 instanceof fqh_0) {
                fqj fqj3 = this.s;
                this.s = (fqh_0)fyb_02;
                this.a(fqj3, this.s);
            }
        }
        super.add(fyb_02);
    }

    protected void a(@Nullable fqj fqj2, @NotNull fqj fqj3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a(false, (fqj fqj4) -> {
            if (fqj4 != fqj3) {
                return false;
            }
            boolean bl = this.getAppearance() == fqj2;
            atomicBoolean.set(bl);
            return bl;
        });
        if (fqj2 != null && fqj2 != fqj3 && !atomicBoolean.get()) {
            this.destroy(fqj2);
        }
    }

    @Override
    public void a(String string) {
        if (string == null) {
            string = "";
        }
        if (this.K != null) {
            this.K = this.K + string;
        } else {
            if (this.j == null) {
                this.j = "";
            }
            this.j = this.j + string;
        }
        this.setNeedsToPreProcess();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    @Nullable
    public String setText(@Nullable Object object) {
        return this.a(() -> {
            String string = super.setText(object);
            if (object == null && !this.o || this.o() && !Objects.equals(string, this.k)) {
                this.n = false;
            }
            if (this.p && object == null && this.o() && fyc_0.a().b() != this) {
                this.n = true;
                this.C();
            }
            this.j = null;
            return string;
        });
    }

    @Override
    public void setTextImmediate(String string) {
        this.a(() -> super.setTextImmediate(string));
    }

    @Override
    public void setSelectable(boolean bl) {
        super.setSelectable(true);
    }

    @Override
    public int getMaxCharacters() {
        return this.getTextBuilder().k().f();
    }

    @Override
    public void setMaxCharacters(int n) {
        this.getTextBuilder().k().b(n);
    }

    @Override
    public String getRestrict() {
        return this.getTextBuilder().k().h();
    }

    @Override
    public void setRestrict(String string) {
        this.getTextBuilder().k().e(string);
    }

    @Override
    public boolean isUnicodeRestrict() {
        return this.getTextBuilder().k().k();
    }

    @Override
    public void setUnicodeRestrict(boolean bl) {
        this.getTextBuilder().k().a(bl);
    }

    @Override
    public boolean isPassword() {
        return this.getTextBuilder().k().i();
    }

    @Override
    public void setPassword(boolean bl) {
        this.getTextBuilder().k().b(bl);
    }

    @Override
    public boolean isAutoHorizontalScrolled() {
        return this.getTextBuilder().j();
    }

    @Override
    public void setAutoHorizontalScrolled(boolean bl) {
        this.getTextBuilder().c(bl);
    }

    @Override
    public void setEditable(boolean bl) {
        this.getTextBuilder().f(bl);
    }

    @Override
    public boolean isEditable() {
        return this.getTextBuilder().w();
    }

    @Override
    public String getText() {
        if (this.n) {
            return "";
        }
        return super.getText();
    }

    @Override
    public String getGhostText() {
        return this.k;
    }

    public void d() {
        if (this.o()) {
            this.e();
        } else {
            this.setTextImmediate("");
        }
    }

    public void e() {
        this.a(true);
    }

    public void a(boolean bl) {
        if (!this.o()) {
            return;
        }
        this.n = true;
        if (bl) {
            this.setTextImmediate(this.k);
        } else {
            this.A();
        }
    }

    @Override
    public void setGhostText(@Nullable Object object) {
        this.k = this.a(object);
        this.e();
    }

    @Override
    public fwn<String, ?> getListFilter() {
        return this.l;
    }

    @Override
    public void setListFilter(fwn<String, ?> fwn2) {
        this.l = fwn2;
        if (fwn2 == null) {
            return;
        }
        this.l.b(this.getTextBuilder().b().getText());
    }

    @Override
    public boolean isDisplayGhostTextOnFocusLost() {
        return this.o;
    }

    @Override
    public void setDisplayGhostTextOnFocusLost(boolean bl) {
        this.o = bl;
    }

    @Override
    public boolean isReplaceNullByGhostText() {
        return this.p;
    }

    @Override
    public void setReplaceNullByGhostText(boolean bl) {
        this.p = bl;
    }

    @Override
    public boolean preProcess(int n) {
        this.f();
        return super.preProcess(n);
    }

    protected void f() {
        if (this.j != null) {
            this.getTextBuilder().c(this.j);
            this.j = null;
        }
    }

    @Override
    protected void g() {
        if (this.isGhostTextVisible() && Objects.equals(this.K, this.k)) {
            String string = this.getRestrict();
            this.setRestrict(null);
            super.g();
            this.setRestrict(string);
        } else {
            super.g();
        }
        if (fyc_0.a().b() == this) {
            this.x();
        }
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
        this.setFocusable(true);
    }

    @Override
    public void onCheckIn() {
        fvE fvE2 = fyc_0.a().b();
        if (fvE2 == this) {
            this.y();
        }
        super.onCheckIn();
        this.ae.clear();
        this.l = null;
        this.q = null;
        this.r = null;
        if (this.s != null) {
            this.s.destroySelfFromParent();
            this.s = null;
        }
        if (this.t != null) {
            this.t.destroySelfFromParent();
            this.t = null;
        }
        if (this.u != null) {
            this.u.destroySelfFromParent();
            this.u = null;
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fqh_0 fqh_02 = fqh_0.checkOut();
        fqh_02.setWidget(this);
        this.add(fqh_02);
        this.setTextBuilder(new fxD(new fxN()));
        this.getTextBuilder().a(this);
        this.getTextBuilder().a(this.af);
        this.getTextBuilder().f(true);
        this.setSelectable(true);
        this.setAutoHorizontalScrolled(true);
        fxj_0 fxj_02 = new fxj_0(this);
        this.I.a(fxj_02);
        this.I.b(fxj_02);
        this.setColor(fxD.a, "text");
        this.setColor(null, "ghostText");
    }

    private void x() {
        fxP fxP2 = this.getTextBuilder().k();
        if (fxP2.l()) {
            this.getTextBuilder().n();
        }
        if (!fxP2.w()) {
            if (this.isSelectOnFocus()) {
                this.a();
            } else {
                fxQ fxQ2 = fxP2.n();
                this.getTextBuilder().b(fxQ2, fxQ2.f());
                this.getTextBuilder().o();
            }
        }
    }

    @Override
    protected void a(fcz_1 fcz_12) {
        super.a(fcz_12);
        if (fcz_12.j() && this.getTextBuilder().w()) {
            this.x();
            this.B();
            this.b(true);
            this.z();
        } else {
            if (this.o) {
                this.C();
            }
            this.b(false);
            this.y();
        }
    }

    private void y() {
        try {
            fpm_0.b().i().f().getInputContext().setCompositionEnabled(false);
        }
        catch (Exception exception) {
            // empty catch block
        }
        fpm_0.b().i().f().removeInputMethodListener(this);
        if (fpm_0.b().i().f().c() == this) {
            fpm_0.b().i().f().a((InputMethodRequests)null);
        }
    }

    private void z() {
        fpm_0.b().i().f().a(this);
        fpm_0.b().i().f().addInputMethodListener(this);
        try {
            fpm_0.b().i().f().getInputContext().setCompositionEnabled(true);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    protected boolean a(fcd_2 fcd_22) {
        if (!(fcd_22.r() || fcd_22.s() || fcd_22.u() || fcd_22.q() || Character.isIdentifierIgnorable(fcd_22.j()) || fcd_22.j() == '\uffff')) {
            fta_0.getInstance().setKeyEventConsumed(true);
        }
        return super.a(fcd_22);
    }

    @Override
    protected boolean b(fcd_2 fcd_22) {
        if (super.b(fcd_22)) {
            switch (fcd_22.k()) {
                case 127: {
                    fta_0.getInstance().setKeyEventConsumed(true);
                    return false;
                }
                case 86: {
                    if (!fcd_22.q()) break;
                    Optional<String> optional = ca_0.a();
                    if (optional.isPresent() && !optional.get().isEmpty()) {
                        this.getTextBuilder().d(optional.get());
                    }
                    fta_0.getInstance().setKeyEventConsumed(true);
                    return false;
                }
                case 88: {
                    if (!fcd_22.q()) break;
                    if (!this.getTextBuilder().k().i()) {
                        this.c();
                        this.getTextBuilder().d("");
                    }
                    fta_0.getInstance().setKeyEventConsumed(true);
                    return false;
                }
                case 65: {
                    if (!fcd_22.q()) break;
                    this.a();
                    fta_0.getInstance().setKeyEventConsumed(true);
                    return false;
                }
            }
        }
        if (!(fcd_22.r() || fcd_22.s() || fcd_22.u() || fcd_22.q() || Character.isIdentifierIgnorable(fcd_22.j()) || fcd_22.j() == '\uffff')) {
            fta_0.getInstance().setKeyEventConsumed(true);
        }
        return true;
    }

    @Override
    protected boolean c(fcd_2 fcd_22) {
        if (!super.c(fcd_22)) {
            return !fcd_22.b('V') && !fcd_22.b('X');
        }
        if (this.getTextBuilder().w()) {
            switch (fcd_22.j()) {
                case '\b': {
                    this.getTextBuilder().O();
                    return false;
                }
                case '\u007f': {
                    this.getTextBuilder().P();
                    fta_0.getInstance().setKeyEventConsumed(true);
                    return false;
                }
                case '\t': {
                    return false;
                }
                case '\n': {
                    if (!this.s()) break;
                }
                default: {
                    this.getTextBuilder().d(String.valueOf(fcd_22.j()));
                    return false;
                }
            }
        }
        return true;
    }

    private void A() {
        if (this.l == null) {
            return;
        }
        this.l.b(this.getText());
    }

    public boolean isGhostTextVisible() {
        return this.n;
    }

    private void B() {
        this.d(true);
    }

    private void d(boolean bl) {
        if (!this.o() || !this.n) {
            return;
        }
        if (bl) {
            this.setTextImmediate("");
        }
        this.n = false;
    }

    private void C() {
        this.e(true);
    }

    private void e(boolean bl) {
        if (this.t()) {
            return;
        }
        this.a(bl);
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equalsIgnoreCase("text")) {
            if (this.q == azj_22) {
                return;
            }
            this.q = azj_22;
            this.i();
        } else if (string.equalsIgnoreCase("ghostText")) {
            if (this.r == azj_22) {
                return;
            }
            this.r = azj_22;
            this.i();
        }
    }

    public void a(@NotNull Runnable runnable) {
        this.a(() -> {
            runnable.run();
            return true;
        });
    }

    public <T> T a(@NotNull Supplier<T> supplier) {
        boolean bl = this.isGhostTextVisible();
        T t = supplier.get();
        if (bl != this.isGhostTextVisible()) {
            this.h();
        }
        return t;
    }

    public void h() {
        this.b(false);
    }

    public void b(boolean bl) {
        this.i();
        this.c(bl);
    }

    public void i() {
        fxD fxD2 = this.getTextBuilder();
        if (this.isGhostTextVisible() && this.r != null) {
            fxD2.a(this.r);
        } else {
            fxD2.a(this.q);
        }
    }

    public void c(boolean bl) {
        this.a(bl, (fqj fqj2) -> false);
    }

    public void a(boolean bl, @NotNull Function<fqj, Boolean> function) {
        if (this.isGhostTextVisible() && this.t != null) {
            this.setAppearance(this.t, function.apply(this.t));
        } else if (bl && this.u != null) {
            this.setAppearance(this.u, function.apply(this.u));
        } else if (this.s != null) {
            this.setAppearance(this.s, function.apply(this.s));
        } else {
            m_logger.warn((Object)"Why main appearance are null ? This is not possible in nominal case...");
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fug_0 fug_02 = (fug_0)fyo2;
        super.copyElement(fug_02);
        fug_02.setMaxCharacters(this.getMaxCharacters());
        fug_02.setPassword(this.m());
        fug_02.setAutoHorizontalScrolled(this.bv_());
        fug_02.setRestrict(this.getRestrict());
        fug_02.setUnicodeRestrict(this.p());
        if (this.j != null) {
            fug_02.j = this.j;
        }
        if (this.k != null) {
            fug_02.b(this.getGhostText());
        }
        fug_02.setDisplayGhostTextOnFocusLost(this.isDisplayGhostTextOnFocusLost());
        fug_02.setReplaceNullByGhostText(this.isReplaceNullByGhostText());
        fug_02.setColor(this.q, null);
        fug_02.setColor(this.r, "ghostText");
        fug_02.s = this.s != null ? (fqh_0)this.s.cloneElementStructure() : null;
        fug_02.t = this.t != null ? (fqh_0)this.t.cloneElementStructure() : null;
        fug_02.u = this.u != null ? (fqh_0)this.u.cloneElementStructure() : null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 1249389695) {
            this.setAutoHorizontalScrolled(Co.a(string));
        } else if (n == 73055982 || n == 381878489) {
            this.setMaxCharacters(Co.c(string));
        } else if (n == 1216985755) {
            this.setPassword(Co.a(string));
        } else if (n == -336545092) {
            this.setRestrict(fze2.a(string, this.m_elementMap));
        } else if (n == 1602416228) {
            this.setEditable(Co.a(string));
        } else if (n == -1784789924) {
            this.b(fze2.a(string, this.m_elementMap));
        } else if (n == 1453943993) {
            this.setUnicodeRestrict(Co.a(string));
        } else if (n == 534924003) {
            this.setDisplayGhostTextOnFocusLost(Co.a(string));
        } else if (n == 105252970) {
            this.setReplaceNullByGhostText(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1249389695) {
            this.setAutoHorizontalScrolled(Co.b(object));
        } else if (n == 73055982 || n == 381878489) {
            this.setMaxCharacters(Co.c(object));
        } else if (n == 1216985755) {
            this.setPassword(Co.b(object));
        } else if (n == -336545092) {
            this.setRestrict((String)object);
        } else if (n == 1602416228) {
            this.setEditable(Co.b(object));
        } else if (n == -1784789924) {
            this.setGhostText(object);
        } else if (n == F) {
            this.setListFilter((fwn)object);
        } else if (n == 1453943993) {
            this.setUnicodeRestrict(Co.b(object));
        } else if (n == 534924003) {
            this.setDisplayGhostTextOnFocusLost(Co.b(object));
        } else if (n == 105252970) {
            this.setReplaceNullByGhostText(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public boolean appendXMLAttribute(int n, String string, fze fze2) {
        if (n != 3556653) {
            return super.appendXMLAttribute(n, string, fze2);
        }
        this.a(fze2.a(string, this.m_elementMap));
        return true;
    }

    @Override
    public boolean appendPropertyAttribute(int n, Object object) {
        if (n != 3556653) {
            return super.appendPropertyAttribute(n, object);
        }
        this.a(String.valueOf(object));
        return true;
    }

    @Override
    public void inputMethodTextChanged(InputMethodEvent inputMethodEvent) {
        int n = inputMethodEvent.getCommittedCharacterCount();
        AttributedCharacterIterator attributedCharacterIterator = inputMethodEvent.getText();
        if (attributedCharacterIterator == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = attributedCharacterIterator.first();
        while (n-- > 0) {
            stringBuilder.append(c2);
            c2 = attributedCharacterIterator.next();
        }
        if (stringBuilder.length() > 0) {
            this.getTextBuilder().d(stringBuilder.toString());
            return;
        }
        while (c2 != '\uffff') {
            stringBuilder.append(c2);
            c2 = attributedCharacterIterator.next();
        }
        this.getTextBuilder().d(stringBuilder.toString());
        for (int k = 0; k < stringBuilder.length(); ++k) {
            this.getTextBuilder().R();
        }
    }

    @Override
    public void caretPositionChanged(InputMethodEvent inputMethodEvent) {
    }

    @Override
    public Rectangle getTextLocation(TextHitInfo textHitInfo) {
        int n = fpm_0.b().i().v().getX();
        int n2 = fpm_0.b().i().v().getY();
        int n3 = fpm_0.b().i().v().getHeight() - this.getScreenY();
        fxP fxP2 = this.getTextBuilder().k();
        int n4 = fxP2.a(0, fxP2.u());
        return new Rectangle(n + this.getScreenX() + n4, n2 + n3, this.getWidth(), -this.getHeight() / 2);
    }

    @Override
    @Nullable
    public TextHitInfo getLocationOffset(int n, int n2) {
        int n3 = this.getTextBuilder().k().q();
        return TextHitInfo.afterOffset(n3);
    }

    @Override
    public int getInsertPositionOffset() {
        return 0;
    }

    @Override
    @Nullable
    public AttributedCharacterIterator getCommittedText(int n, int n2, AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    @Override
    public int getCommittedTextLength() {
        return 0;
    }

    @Override
    @Nullable
    public AttributedCharacterIterator cancelLatestCommittedText(AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    @Override
    @Nullable
    public AttributedCharacterIterator getSelectedText(AttributedCharacterIterator.Attribute[] attributeArray) {
        return null;
    }

    @Override
    public boolean a(fxG fxG2) {
        if (this.ae.contains(fxG2)) {
            return false;
        }
        return this.ae.add(fxG2);
    }

    @Override
    public boolean b(fxG fxG2) {
        if (!this.ae.contains(fxG2)) {
            return false;
        }
        return this.ae.remove(fxG2);
    }
}

