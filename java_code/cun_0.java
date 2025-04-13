/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUN
 */
public class cun_0
implements anv_1 {
    private static final String a = "progress.task.name";
    private static final String b = "progress.subtask.name";
    private static final String c = "progress.value";
    private int d = 1;

    @Override
    public void a(String string, int n) {
        this.d = n;
        fis_1.a().a(a, (Object)string);
        fis_1.a().a(c, 0.0);
    }

    @Override
    public void a() {
    }

    @Override
    public void a(String string) {
        if (string == null) {
            string = bae.h().a("loading", new Object[0]);
        }
        fis_1.a().a(a, (Object)string);
    }

    @Override
    public void b(String string) {
        if (string == null) {
            string = "";
        }
        fis_1.a().a(b, (Object)string);
    }

    @Override
    public void a(int n) {
        if (this.d != 0) {
            fis_1.a().a(c, (double)n / (double)this.d);
        }
    }

    @Override
    public int b() {
        return this.d;
    }

    public void b(int n) {
        this.d = n;
    }
}

