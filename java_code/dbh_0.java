/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

/*
 * Renamed from dbH
 */
class dbh_0
implements aei_1 {
    final aZF b;
    boolean c = false;
    final /* synthetic */ dbA a;

    public dbh_0(dbA dbA2, aZF aZF2) {
        this.a = dbA2;
        this.b = aZF2;
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        int n = keyEvent.getKeyCode();
        if (this.c) {
            return true;
        }
        if (this.b.b() == n && this.b.f() == keyEvent.getModifiersEx() || keyEvent.getKeyCode() == 27) {
            this.a.j();
            return true;
        }
        if (n != 18 && n != 16 && n != 17) {
            any_1 any_12;
            this.c = true;
            long l = Hw.c(n, keyEvent.getModifiersEx());
            if (aZH.a().a(l)) {
                fpm_0.b().a(bae.h().a("notification.reservedKey", new Object[0]), cfn_0.a(7), 3L, 102, 1);
                this.a.j();
                return true;
            }
            aZF aZF2 = aZH.a().c(l);
            any_1 any_13 = any_12 = aZF2 == null ? null : aZF2.e();
            if (any_12 != null) {
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.swapShortcutsKey", new Object[0]), cfn_0.a(7), 2073L, 102, 1);
                fzm_02.a(new dbI(this, any_12, keyEvent));
            } else {
                this.a.a(this.b.e());
                this.a.a(this.b.c(), keyEvent.getKeyCode(), keyEvent.getModifiersEx());
                aZH.a().c();
                this.a.j();
            }
        }
        return true;
    }
}

