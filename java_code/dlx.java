/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;

public class dlx
implements adv_1 {
    private static final dlx a = new dlx();
    private final LinkedList<dlw> b = new LinkedList();
    private dlj c = null;

    private dlx() {
    }

    public static dlx a() {
        return a;
    }

    public void a(dlw dlw2) {
        for (dlw dlw3 : this.b) {
            if (dlw3.f().a().a()) continue;
            this.b.remove(dlw3);
        }
        if (this.c == null) {
            this.c = dlw2.f().a();
            this.c.a(dlw2);
        } else if (this.c.a()) {
            dlj dlj2 = dlw2.f().a();
            if (dlj2.a()) {
                this.b.addLast(dlw2);
            }
        } else {
            this.c.a(this.c.b() != dlw2.f());
            this.c = dlw2.f().a();
            this.c.a(dlw2);
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (this.c != null) {
            if (!this.b.isEmpty()) {
                dlw dlw2 = this.b.removeFirst();
                this.c.a(this.c.b() != dlw2.f());
                this.c = dlw2.f().a();
                this.c.a(dlw2);
            } else {
                this.c.a(true);
                this.c = null;
            }
        }
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

