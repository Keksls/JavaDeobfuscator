/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Yo
 */
public class yo_0
implements abo_1 {
    private int a = 0;
    private String b = "<undefined>";
    private String c = "<undefined>";
    private boolean d = false;

    @Override
    public void onCheckOut() {
        this.a = 0;
        this.b = "<undefined>";
        this.c = "<undefined>";
        this.d = false;
    }

    @Override
    public void onCheckIn() {
    }

    public boolean a() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
        this.a = this.b.hashCode();
    }

    public String d() {
        return this.c;
    }

    public void b(String string) {
        this.c = string;
    }
}

