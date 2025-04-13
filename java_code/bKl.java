/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

public class bKl
implements aei_1 {
    public static final bKl a = new bKl();

    @Override
    public boolean b(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 10) {
            return false;
        }
        if (keyEvent.getKeyCode() == 17 || keyEvent.getKeyCode() == 16 || keyEvent.getKeyCode() == 18 || this.f(keyEvent) || this.g(keyEvent) || this.h(keyEvent)) {
            return false;
        }
        if (!bKl.a()) {
            return false;
        }
        if (daw.k()) {
            add_2.b().a(new dfc(19079));
            return true;
        }
        if (daw.m()) {
            add_2.b().a(new dfc(19376));
            return true;
        }
        return false;
    }

    private static boolean a() {
        String string = cff_0.b().d();
        if (!"marketDialog".equals(string) && !"inventoryDialog".equals(string)) {
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
        return "marketWindow".equals(fvk_02.getId());
    }
}

