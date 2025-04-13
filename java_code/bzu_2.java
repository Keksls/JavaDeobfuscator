/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

/*
 * Renamed from bzu
 */
public class bzu_2
implements aei_1 {
    public static final bzu_2 a = new bzu_2();

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (!bzu_2.a()) {
            return false;
        }
        boolean bl = this.f(keyEvent);
        boolean bl2 = this.g(keyEvent);
        boolean bl3 = this.h(keyEvent);
        if (bl && !bl2 && !bl3 && keyEvent.getKeyCode() == 83) {
            add_2.b().a(new dfc(16954));
        } else if (bl && bl2 && !bl3 && keyEvent.getKeyCode() == 83) {
            add_2.b().a(new dfc(17445));
        } else if (bl && !bl2 && !bl3 && keyEvent.getKeyCode() == 90) {
            add_2.b().a(new dfc(17329));
        }
        return false;
    }

    private static boolean a() {
        String string = cff_0.b().d();
        if (!"heroBuildDialog".equals(string)) {
            return false;
        }
        fvE fvE2 = fyc_0.a().b();
        if (fvE2 == null) {
            return true;
        }
        fvk_0 fvk_02 = fvE2.getParentOfType(fvk_0.class);
        if (fvk_02 == null) {
            return true;
        }
        return "heroBuildWindow".equals(fvk_02.getId());
    }
}

