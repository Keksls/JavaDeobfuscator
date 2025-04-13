/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.io.File;

/*
 * Renamed from auG
 */
public abstract class aug_1 {
    protected final acy_2<aus_1> a = new acy_2();
    protected aus_1 b = null;
    private int c = 0;
    private boolean d = false;
    private String e;
    private String f;
    private long g;

    public void a(String string) {
        this.e = string;
    }

    public void a(String string, String string2) {
        this.d = true;
        this.e = string;
        this.f = string2;
        this.g = this.g();
        this.b = null;
        this.c = 0;
    }

    public void a() {
        this.a(this.e, this.f);
    }

    public void b(String string, String string2) {
        this.d = true;
        this.e = string;
        this.b = null;
        this.c = 0;
    }

    public final String b() {
        return this.e;
    }

    public void a(aui_2 aui_22, Entity entity, ava_1 ava_12) {
        if (!this.d) {
            aui_1.a().e();
        }
    }

    public final void a(int n) {
        if (this.c == n) {
            return;
        }
        this.b = this.a.g(n);
        this.c = n;
        this.c();
    }

    public final boolean b(int n) {
        return this.a.d(n);
    }

    public void c() {
        if (this.b == null) {
            return;
        }
        this.b.a();
    }

    public final boolean d() {
        return this.b == null;
    }

    public void e() {
    }

    private long g() {
        if (this.f == null) {
            return 0L;
        }
        int n = this.f.indexOf("file:");
        if (n == -1) {
            return 0L;
        }
        String string = this.f.substring(n + 5);
        return new File(string).lastModified();
    }

    public final void f() {
        if (this.g() > this.g) {
            this.a();
        }
    }

    protected abstract void a(ava_1 var1);
}

