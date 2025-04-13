/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;

class dbI
implements fzp_0 {
    final /* synthetic */ any_1 a;
    final /* synthetic */ KeyEvent b;
    final /* synthetic */ dbh_0 c;

    dbI(dbh_0 dbh_02, any_1 any_12, KeyEvent keyEvent) {
        this.c = dbh_02;
        this.a = any_12;
        this.b = keyEvent;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.c.a.a(this.a);
            this.c.a.a(this.c.b.e());
            this.c.a.a(this.a.g(), this.c.b.b(), this.c.b.f());
            this.c.a.a(this.c.b.c(), this.b.getKeyCode(), this.b.getModifiersEx());
            aZH.a().c();
            this.c.a.j();
        } else {
            this.c.c = false;
        }
    }
}

