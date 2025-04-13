/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVI
 */
public class avi_0
extends aXj {
    private final byte a;

    public avi_0(byte by) {
        this.a = by;
    }

    @Override
    public boolean a() {
        return this.a == 1 || this.a == 2 || this.a == 3;
    }

    @Override
    public void b() {
        if (this.a == 3) {
            this.c();
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Cannot access theses commands without being logged in!");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)1);
        pt.a(this.a == 1);
        aaw_22.c(pt);
    }

    private void c() {
        avi_0.a("Syntax: bak <command>");
        avi_0.a("(h) : show help");
        avi_0.a("(lock on|off) : lock or unlock the BAK");
    }
}

